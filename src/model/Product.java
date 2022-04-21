package model;

public class Product {
    
    private int id;
    private String name;
    private Double price;
    private int stock;
    private String code;
    private String note;

    public Product() {
    }

    public Product(int id, String name, Double price, int stock, String code, String note) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.code = code;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getCode() {
        return code;
    }

    public String getNote() {
        return note;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
