package model;

public class Chair {
    
    private int id;
    private String name;
    private int chairStatus;
    private int chairType;
    private FilmHall hall;

    public Chair() {
    }

    public Chair(int id, String name, int chairStatus, int chairType, FilmHall hall) {
        this.id = id;
        this.name = name;
        this.chairStatus = chairStatus;
        this.chairType = chairType;
        this.hall = hall;
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

    public int getChairStatus() {
        return chairStatus;
    }

    public void setChairStatus(int chairStatus) {
        this.chairStatus = chairStatus;
    }

    public int getChairType() {
        return chairType;
    }

    public void setChairType(int chairType) {
        this.chairType = chairType;
    }

    public FilmHall getHall() {
        return hall;
    }

    public void setHall(FilmHall hall) {
        this.hall = hall;
    }
    
    
}
