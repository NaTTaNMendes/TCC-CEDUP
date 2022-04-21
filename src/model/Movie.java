package model;


public class Movie {
    
    private int id;
    private String name;
    private int duration;
    private int cocind;
    private String synopsis;
    private Gender gender;
    private Director director;

    public Movie() {
    }

    public Movie(int id, String name, int duration, int cocind, String synopsis, Gender gender, Director director) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.cocind = cocind;
        this.synopsis = synopsis;
        this.gender = gender;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCocind() {
        return cocind;
    }

    public void setCocind(int cocind) {
        this.cocind = cocind;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    
}
