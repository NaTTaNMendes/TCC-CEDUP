package model;

import java.util.ArrayList;

public class Combo {
    
    private Integer id;
    private String name;
    private Double price;
    private String note;
    private String code;
    ArrayList<Product> list = new ArrayList<>();

    public Combo() {
    }

    public Combo(int id, String name, Double price, String note, String code) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.note = note;
        this.code = code;
    }

    public Integer getId() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    public void addProduct (Product product) {
        list.add(product);
    }
    
    public void removeProduct (Product product) {
        list.remove(product);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    
}
