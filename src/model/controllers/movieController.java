package model.controllers;

import db.DbException;
import form.schedules.AddMovie;
import form.schedules.AlterMovie;
import form.schedules.MovieData;
import form.schedules.RegisteredMovies;
import java.util.List;
import model.Director;
import model.Gender;
import model.Movie;
import model.dao.MovieDAO;

public class movieController {
    
    private AddMovie addMovie;
    private AlterMovie alterMovie;
    private MovieData movieData;
    private RegisteredMovies registeredMovies;
    private MovieDAO dao = new MovieDAO();

    public movieController() {
    }

    public movieController(AddMovie addMovie) {
        this.addMovie = addMovie;
    }

    public movieController(AlterMovie alterMovie) {
        this.alterMovie = alterMovie;
    }

    public movieController(MovieData movieData) {
        this.movieData = movieData;
    }

    public movieController(RegisteredMovies registeredMovies) {
        this.registeredMovies = registeredMovies;
    }
    
    public void addMovie(String name, int duration, int Cocind, String synopsis, Gender gender, Director director) {
        Movie m = new Movie();
        String message = "";
        try {
            m.setCocind(Cocind);
            m.setDuration(duration);
            m.setName(name);
            m.setSynopsis(synopsis);
            m.setGender(gender);
            m.setDirector(director);
            message = dao.insert(m);
            if (message.isEmpty()) {
                addMovie.showMessage(false, "Valor já cadastrado");
            } else {
                addMovie.showMessage(true, message);
            }
        
        } catch (DbException e) {
            addMovie.showMessage(false, message);
        }
        
    }

    public Movie findMovie (String txt) {
        try {
            int i = Integer.parseInt(txt);
            return findId(i);
        } catch (DbException e) {
            registeredMovies.showMessage("Filme não encontrado");
            return null;
        } catch (Exception e) {
            return findName(txt);
        }
    }
    
    public Movie findId(int id){
        return dao.findById(id);
    }
    
    public Movie findName(String name){
        return dao.findByName(name);
    }
    
    public Movie updateMovie(int id, String name, int duration, int Cocind, String synopsis, Gender gender, Director director) {
        Movie m = new Movie();
        String message = "";
        try {
            m.setId(id);
            m.setCocind(Cocind);
            m.setDuration(duration);
            m.setName(name);
            m.setSynopsis(synopsis);
            m.setGender(gender);
            m.setDirector(director);
            message = dao.update(m);
            if (message.isEmpty()) {
                alterMovie.showMessage(false, "Falha ao atualizar filme");
                return null;
            } else {
                alterMovie.showMessage(true, message);
            }                        
        } catch (DbException e) {
            alterMovie.showMessage(false, message);
            return null;
        }
        return m;
    }
    
    public boolean deleteMovie (Movie movie) {
        String message = "";
        try {
           message = dao.deleteById(movie.getId());
           movieData.showMessage(true, message);
           return true;
        } catch (DbException e) {
            movieData.showMessage(false, message);
            return false;
        }
    }
    
    public List<Gender> pickGenders() {
        return dao.pickAllGenders();
    }
    
    public List<Director> pickDirectors() {
        return dao.pickAllDirectors();
    }
    
}
