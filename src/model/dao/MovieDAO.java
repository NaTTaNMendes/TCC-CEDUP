package model.dao;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Director;
import model.Gender;
import model.Movie;

public class MovieDAO {
    
    private Connection conn;
    
    public MovieDAO() {
        conn = DB.getConnection();
    }
    
    public String insert(Movie obj) {
        PreparedStatement st = null;
        String message = "";
        if (findByName(obj.getName()) == null) {
            try {
            st = conn.prepareStatement("INSERT INTO movie (name, duration, Cocind, synopsis, director_idDirector, gender_idGender) values (?,?,?,?,?,?)");
            st.setString(1, obj.getName());
            st.setInt(2, obj.getDuration());
            st.setInt(3, obj.getCocind());
            st.setString(4, obj.getSynopsis());
            st.setInt(5, obj.getDirector().getId());
            st.setInt(6, obj.getGender().getId());
   
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Filme adicionado";
            } else {
                message = "Falha ao adicionar filme";
                throw new DbException("Unexpected error! No rows Affected");                
            }

            } catch (SQLException e){
                throw new DbException(e.getMessage());
            } finally {
                DB.closeStatement(st);
                return message;
            }
        } else {
            return message;
        }        
    }
    
    public Movie findByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT movie.* FROM movie WHERE movie.name = ?");
            st.setString(1, name);
            
            rs = st.executeQuery();
            if (rs.next()){
                Movie movie = new Movie();
                movie.setId(rs.getInt("idMovie"));
                movie.setCocind(rs.getInt("Cocind"));
                movie.setDuration(rs.getInt("duration"));
                movie.setName(rs.getString("name"));
                movie.setSynopsis(rs.getString("synopsis"));
                movie.setGender(findGenderById(rs.getInt("gender_idGender")));
                movie.setDirector(findDirectorById(rs.getInt("director_idDirector")));
                return movie;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public Movie findById(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT movie.* FROM movie WHERE movie.idMovie = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                Movie movie = new Movie();
                movie.setId(rs.getInt("idMovie"));
                movie.setCocind(rs.getInt("Cocind"));
                movie.setDuration(rs.getInt("duration"));
                movie.setName(rs.getString("name"));
                movie.setSynopsis(rs.getString("synopsis"));
                movie.setGender(findGenderById(rs.getInt("gender_idGender")));
                movie.setDirector(findDirectorById(rs.getInt("director_idDirector")));
                return movie;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public String deleteById(Integer id) {
        PreparedStatement st = null;
        String message = "";
        try {
            st = conn.prepareStatement("DELETE FROM movie WHERE idMovie = ?");
            
            st.setInt(1, id);
            st.executeUpdate();
            message = "Filme deletado com succeso";
        } catch (SQLException e){
            message = "Falha ao deletar filme";
            throw new DbException(e.getMessage());
        } finally {   
            DB.closeStatement(st);
            return message;
        }
    }
    
    public String update(Movie obj) {
        PreparedStatement st = null;
        String message = "";
        try {
            st = conn.prepareStatement("UPDATE movie SET name = ?, duration = ?, Cocind = ?, synopsis = ?, director_idDirector = ?, gender_idGender = ? where idMovie = ?");
            st.setString(1, obj.getName());
            st.setInt(2, obj.getDuration());
            st.setInt(3, obj.getCocind());
            st.setString(4, obj.getSynopsis());
            st.setInt(5, obj.getDirector().getId());
            st.setInt(6, obj.getGender().getId());
            st.setInt(7, obj.getId());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Filme atualizado no banco";
            } else {
                message = "Falha ao atualizar filme";
                throw new DbException("Unexpected error! No rows Affected");
            } 

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            return message;
        }
    }

    public Director findDirectorById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT director.* FROM director WHERE idDirector = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                Director director = new Director();
                director.setId(rs.getInt("idDirector"));
                director.setName(rs.getString("name"));
                return director;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public Director findDirectorByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT director.* FROM director WHERE name = ?");
            st.setString(1, name);
            
            rs = st.executeQuery();
            if (rs.next()){
                Director director = new Director();
                director.setId(rs.getInt("idDirector"));
                director.setName(rs.getString("name"));
                return director;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public Gender findGenderById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT gender.* FROM gender WHERE idGender = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                Gender gender = new Gender();
                gender.setId(rs.getInt("idGender"));
                gender.setName(rs.getString("name"));
                return gender;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }  
    
    public Gender findGenderByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM gender WHERE name = ?");
            st.setString(1, name);
            rs = st.executeQuery();
            if (rs.next()){
                Gender gender = new Gender();
                gender.setId(rs.getInt("idGender"));
                gender.setName(rs.getString("name"));
                return gender;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }  

    public List<Gender> pickAllGenders() {
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        List<Gender> genders = new ArrayList<>();        
        try {
            stmt = conn.prepareStatement("SELECT * FROM gender");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Gender gender = new Gender();
                gender.setId(rs.getInt("idGender"));
                gender.setName(rs.getString("name"));
                genders.add(gender);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return genders;
    }
    
    public List<Director> pickAllDirectors() {
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        List<Director> directors = new ArrayList<>();        
        try {
            stmt = conn.prepareStatement("SELECT * FROM director");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Director director = new Director();
                director.setId(rs.getInt("idDirector"));
                director.setName(rs.getString("name"));
                directors.add(director);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return directors;
    }

    
}
