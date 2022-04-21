package model;

import java.util.Date;

public class Client {
    
    private int id;
    private String name;
    private String ITR;
    private String phone;
    private Date birthDate;
    private String email;
    private String note;
    private boolean student;
    private boolean deficient;

    public Client() {
    }

    public Client(int id, String name, String ITR, String phone, Date birthDate, String email, String note, boolean student, boolean deficient) {
        this.id = id;
        this.name = name;
        this.ITR = ITR;
        this.phone = phone;
        this.birthDate = birthDate;
        this.email = email;
        this.note = note;
        this.student = student;
        this.deficient = deficient;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public boolean isDeficient() {
        return deficient;
    }

    public void setDeficient(boolean deficient) {
        this.deficient = deficient;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    
}
