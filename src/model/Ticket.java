package model;

import java.util.Date;

public class Ticket {
    
    private int id;
    private Date date;
    private Date hour;
    private Double price;
    private String cinemaName;
    private int ticketType;
    private Movie movie;
    private Client client;
    private PSell sell;
    private String seat;
    private FilmHall hall;
    private boolean lyrics;
    private Session session;

    public Ticket() {
    }

    public Ticket(int id, Date date, Double price, String cinemaName, int ticketType, Movie movie, Client client, PSell sell, String seat, Date hour, FilmHall hall) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.cinemaName = cinemaName;
        this.ticketType = ticketType;
        this.movie = movie;
        this.client = client;
        this.sell = sell;
        this.seat = seat;
        this.hour = hour;
        this.hall = hall;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getTicketType() {
        return ticketType;
    }

    public void setTicketType(int ticketType) {
        this.ticketType = ticketType;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public PSell getSell() {
        return sell;
    }

    public void setSell(PSell sell) {
        this.sell = sell;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public FilmHall getHall() {
        return hall;
    }

    public void setHall(FilmHall hall) {
        this.hall = hall;
    }

    public boolean isLyrics() {
        return lyrics;
    }

    public void setLyrics(boolean lyrics) {
        this.lyrics = lyrics;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
    
    
}
