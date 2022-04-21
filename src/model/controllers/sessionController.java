package model.controllers;

import db.DbException;
import form.schedules.AddSession;
import form.schedules.AlterSession;
import form.schedules.RegisteredSession;
import form.schedules.SessionData;
import java.util.Date;
import java.util.List;
import model.FilmHall;
import model.Movie;
import model.Session;
import model.dao.SessionDAO;

public class sessionController {
    
    private AddSession addSession;
    private AlterSession alterSession;
    private RegisteredSession registeredSession;
    private SessionData sessionData;
    private SessionDAO dao = new SessionDAO();

    public sessionController() {
    }

    public sessionController(AddSession addSession) {
        this.addSession = addSession;
    }

    public sessionController(AlterSession alterSession) {
        this.alterSession = alterSession;
    }

    public sessionController(RegisteredSession registeredSession) {
        this.registeredSession = registeredSession;
    }

    public sessionController(SessionData sessionData) {
        this.sessionData = sessionData;
    }
    
    public void insertSession (boolean lyrics, Movie movie, FilmHall filmHall, Date data, Date begining, Date finish) {
        String message = "";
        //CRIANDO MODELO
        try {
            Session session = new Session();
            session.setBeginingHour(begining);
            session.setDate(data);
            session.setFilmHall(filmHall);
            session.setFinishHour(finish);
            session.setLyrics(lyrics);
            session.setMovie(movie);
            message = dao.insert(session);
            session = dao.findSession(session);
            dao.insertChairs(session.getId());
            if (message == null) {
                addSession.showMessage(false, "Sessão já cadastrada");
            } else {
                addSession.showMessage(true, message);
            }
        } catch (DbException e) {
            addSession.showMessage(false, message);
        }
        
    }
    
    
    
    public void alterSession (int id, boolean lyrics, Movie movie, FilmHall filmHall, Date data, Date begining, Date finish) {
        String message = "";
        //CRIANDO MODELO
        try {
            Session session = new Session();
            session.setId(id);
            session.setBeginingHour(begining);
            session.setDate(data);
            session.setFilmHall(filmHall);
            session.setFinishHour(finish);
            session.setLyrics(lyrics);
            session.setMovie(movie);
            message = dao.update(session);
            if (message == null) {
                alterSession.showMessage(false, "Sessão já cadastrada");
            } else {
                alterSession.showMessage(true, message);
            }
        } catch (DbException e) {
            alterSession.showMessage(false, message);
        }
        
    }
    
    public void deleteSession (int id) {
        dao.deleteById(id);
        String message = "";
        try {
           message = dao.deleteById(id);
           sessionData.showMessage(true, message);
           dao.deleteChairs(id);
        } catch (DbException e) {
            sessionData.showMessage(false, message);
        }
    }
    
    public Session findSessionById(int id) {
        return dao.findSessionById(id);
    }
    
    public List<Movie> pickMovies() {
        return dao.pickAllMovies();
    }
    
    public List<FilmHall> pickHalls(){
        return dao.pickAllHalls();
    }
    
    public List<Session> findSessions(Movie movie, FilmHall filmHall) {
        return dao.findSessions(movie, filmHall);
    }
}
