package model.dao;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import model.FilmHall;
import model.Movie;
import model.Session;

public class SessionDAO {
    
    private Connection conn;
    
    public SessionDAO() {
        conn = DB.getConnection();
    }
    
    public String insert(Session obj) {
        PreparedStatement st = null;
        String message = "";
        if (findSession(obj) == null) {
            try {
                st = conn.prepareStatement("INSERT INTO session (lyrics, movie_idMovie, filmHall_idFilmHall, data, beginingHour, finishHour) values (?,?,?,?,?,?)");
                st.setBoolean(1, obj.isLyrics());
                st.setInt(2, obj.getMovie().getId());
                st.setInt(3, obj.getFilmHall().getId());
                Date date = new java.sql.Date(obj.getDate().getTime());
                st.setDate(4, date);
                Time time = new java.sql.Time(obj.getBeginingHour().getTime());
                st.setTime(5, time);
                time = new java.sql.Time(obj.getFinishHour().getTime());
                st.setTime(6, time);
                
                int rowsAffected = st.executeUpdate();
                if (rowsAffected > 0){
                    message = "Sessão adicionada";
                } else {
                    message = "Falha ao adicionar o sessão";
                    throw new DbException("Unexpected error! No rows Affected");                
                } 

            } catch (SQLException e){
                throw new DbException(e.getMessage());
            } finally {
                DB.closeStatement(st);
            }
            return message;
        } else {
            System.out.println("retornei nulo");
            return null;
        }        
    }
    
    public String update(Session obj){
        PreparedStatement st = null;
        String message = "";
        try {
            st = conn.prepareStatement("UPDATE session SET lyrics = ?, movie_idMovie = ?, filmHall_idFilmHall = ?, data = ?, beginingHour = ?, finishHour = ? WHERE idSession = ?");
            st.setBoolean(1, obj.isLyrics());
            st.setInt(2, obj.getMovie().getId());
            st.setInt(3, obj.getFilmHall().getId());
            Date date = new java.sql.Date(obj.getDate().getTime());
            st.setDate(4, date);
            Time time = new java.sql.Time(obj.getBeginingHour().getTime());
            st.setTime(5, time);
            time = new java.sql.Time(obj.getFinishHour().getTime());
            st.setTime(6, time);
            st.setInt(7, obj.getId());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Sessão atualizada no banco";
            } else {
                message = "Falha ao atualizar sessão";
                throw new DbException("Unexpected error! No rows Affected");
            } 

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            return message;
        }
    }
    
    public void insertChairs(int id) {
        PreparedStatement st = null;
        try {
            for (int i = 1; i <= 108; i++) {
                st = conn.prepareStatement("insert into session_has_chair (session_idSession, chair_idChair, chairStatus) values (?,?,?)");
                st.setInt(1, id);
                st.setInt(2, i);
                st.setInt(3, 0);
            
                st.executeUpdate();
            }
            
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
    
    public void deleteChairs(int id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("delete from session_has_chair where session_idSession = ?");
            st.setInt(1, id); 

            st.executeUpdate();            
            
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
    
    public Session findSession(Session session) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT session.* FROM session WHERE session.movie_idMovie = ? and data = ? and beginingHour = ?");
            st.setInt(1, session.getMovie().getId());
            Date date = new java.sql.Date(session.getDate().getTime());
            st.setDate(2, date);
            Time time = new java.sql.Time(session.getBeginingHour().getTime());
            st.setTime(3, time);
            rs = st.executeQuery();
            while (rs.next()){
                Session s = new Session();
                s.setBeginingHour(rs.getTime("beginingHour"));
                s.setDate(rs.getDate("data"));
                s.setFilmHall(findHallById(rs.getInt("filmHall_idFilmHall")));
                s.setFinishHour(rs.getTime("finishHour"));
                s.setId(rs.getInt("idSession"));
                s.setLyrics(rs.getBoolean("lyrics"));
                MovieDAO dm = new MovieDAO();
                s.setMovie(dm.findById(rs.getInt("movie_idMovie")));
                return s;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public List<Session> findSessions (Movie movie, FilmHall filmHall) {
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        List<Session> sessions = new ArrayList<>();        
        try {
            stmt = conn.prepareStatement("SELECT * FROM session where movie_idMovie = ? and filmHall_idFilmHall = ?");
            stmt.setInt(1, movie.getId());
            stmt.setInt(2, filmHall.getId());
            rs = stmt.executeQuery();
            while (rs.next()) {
                Session s = new Session();
                s.setBeginingHour(rs.getTime("beginingHour"));
                s.setDate(rs.getDate("data"));
                s.setFilmHall(findHallById(rs.getInt("filmHall_idFilmHall")));
                s.setFinishHour(rs.getTime("finishHour"));
                s.setId(rs.getInt("idSession"));
                s.setLyrics(rs.getBoolean("lyrics"));
                MovieDAO dm = new MovieDAO();
                s.setMovie(dm.findById(rs.getInt("movie_idMovie")));
                sessions.add(s);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return sessions;
    }
    
    public List<Movie> pickAllMovies() {
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        List<Movie> movies = new ArrayList<>();        
        try {
            stmt = conn.prepareStatement("SELECT * FROM movie");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Movie movie = new Movie();
                movie.setName(rs.getString("name"));
                movie.setId(rs.getInt("idMovie"));
                movies.add(movie);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return movies;
    }
    
    public List<FilmHall> pickAllHalls() {
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        List<FilmHall> films = new ArrayList<>();        
        try {
            stmt = conn.prepareStatement("SELECT * FROM filmhall");
            rs = stmt.executeQuery();
            while (rs.next()) {
                FilmHall film = new FilmHall();
                film.setId(rs.getInt("idFilmHall"));
                film.setName(rs.getString("name"));
                films.add(film);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return films;
    }
    
    public List<FilmHall> pickAllHallsByMovie(Movie movie) {
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        List<FilmHall> halls = new ArrayList<>();        
        try {
            stmt = conn.prepareStatement("select filmhall.name, filmhall.idFilmHall from filmhall inner join session on idFilmHall = filmHall_idFilmHall inner join movie on idMovie = movie_idMovie where idMovie = ? group by filmhall.name");
            stmt.setInt(1, movie.getId());
            rs = stmt.executeQuery();
            while (rs.next()) {
                FilmHall film = new FilmHall();
                film.setId(rs.getInt("idFilmHall"));
                film.setName(rs.getString("name"));
                halls.add(film);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return halls;
    }
    
    
    public FilmHall findHallById(int id){
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT filmHall.* FROM filmHall WHERE filmHall.idFilmHall = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                FilmHall hall = new FilmHall();
                hall.setId(rs.getInt("idFilmHall"));
                hall.setName(rs.getString("name"));
                return hall;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public Session findSessionById(int id){
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT session.* FROM session WHERE session.idSession = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                Session s = new Session();
                s.setBeginingHour(rs.getTime("beginingHour"));
                s.setDate(rs.getDate("data"));
                s.setFilmHall(findHallById(rs.getInt("filmHall_idFilmHall")));
                s.setFinishHour(rs.getTime("finishHour"));
                s.setId(rs.getInt("idSession"));
                s.setLyrics(rs.getBoolean("lyrics"));
                MovieDAO dm = new MovieDAO();
                s.setMovie(dm.findById(rs.getInt("movie_idMovie")));
                return s;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public String deleteById(int id) {
        PreparedStatement st = null;
        String message = "";
        try {
            st = conn.prepareStatement("DELETE FROM session WHERE idSession = ?");
            
            st.setInt(1, id);
            st.executeUpdate();
            message = "Sessão deletada com succeso";
        } catch (SQLException e){
            message = "Falha ao deletar a sessão";
            throw new DbException(e.getMessage());
        } finally {   
            DB.closeStatement(st);
            return message;
        }
    }
    
}
