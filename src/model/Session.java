package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Session {
    
    private int id;
    private boolean lyrics;
    private FilmHall filmHall;
    private Movie movie;
    private Date date;
    private Date beginingHour;
    private Date finishHour;

    public Session() {
    }

    public Session(int id, boolean lyrics, FilmHall filmHall, Movie movie, Date date, Date beginingHour, Date finishHour) {
        this.id = id;
        this.lyrics = lyrics;
        this.filmHall = filmHall;
        this.movie = movie;
        this.date = date;
        this.beginingHour = beginingHour;
        this.finishHour = finishHour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLyrics() {
        return lyrics;
    }

    public void setLyrics(boolean lyrics) {
        this.lyrics = lyrics;
    }

    public FilmHall getFilmHall() {
        return filmHall;
    }

    public void setFilmHall(FilmHall filmHall) {
        this.filmHall = filmHall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getBeginingHour() {
        return beginingHour;
    }

    public void setBeginingHour(Date beginingHour) {
        this.beginingHour = beginingHour;
    }

    public Date getFinishHour() {
        return finishHour;
    }

    public void setFinishHour(Date finishHour) {
        this.finishHour = finishHour;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(beginingHour) + "  -  " + getData();
    }

    public String getData() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

}
