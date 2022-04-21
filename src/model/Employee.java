package model;

import java.util.Date;

public class Employee {

    private Integer id;
    private String name;
    private Date birthDate;
    private String ITR;
    private String phone;
    private String email;
    private String note;
    private String rg;
    private String password;
    private int function;
    private String street;
    private int number;
    private String city;
    private String complement;
    private String state;
    private String country;
    private String neighborhood;
    private int idaddress;

    public Employee() {
    }

    public Employee(int id, String name, Date birthDate, String ITR, String phone, String email, String note, String rg, String password, int function, String street, int number, String complement, String state, String country, String neighborhood) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.ITR = ITR;
        this.phone = phone;
        this.email = email;
        this.note = note;
        this.rg = rg;
        this.password = password;
        this.function = function;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.state = state;
        this.country = country;
        this.neighborhood = neighborhood;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getITR() {
        return ITR;
    }

    public void setITR(String ITR) {
        this.ITR = ITR;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFunction() {
        return function;
    }

    public void setFunction(int function) {
        this.function = function;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getIdaddress() {
        return idaddress;
    }

    public void setIdaddress(int idaddress) {
        this.idaddress = idaddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", ITR=" + ITR + ", phone=" + phone + ", email=" + email + ", note=" + note + ", rg=" + rg + ", password=" + password + ", function=" + function + ", street=" + street + ", number=" + number + ", city=" + city + ", complement=" + complement + ", state=" + state + ", country=" + country + ", neighborhood=" + neighborhood + ", idaddress=" + idaddress + '}';
    }
    
    
    
}
