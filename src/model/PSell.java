package model;

import java.util.ArrayList;
import java.util.List;

public class PSell {
    
    private Client client;
    private List<SellProduct> products = new ArrayList<>();
    private List<SellCombo> combos = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();
    private String note;
    private Double total;
    private Employee emp;
    private Double moneyReceived;
    private int paymentMethod;

    public PSell() {
    }

    public PSell(Client client, String note, Double total, Employee emp, Double moneyReceived, int paymentMethod) {
        this.client = client;
        this.note = note;
        this.total = total;
        this.emp = emp;
        this.moneyReceived = moneyReceived;
        this.paymentMethod = paymentMethod;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<SellProduct> getProducts() {
        return products;
    }

    public void addProducts(Product p, int quantity) {
        SellProduct sp = new SellProduct(p, quantity);
        products.add(sp);
    }
    
    public void removeProducts(Product p, int quantity) {
        SellProduct sp = new SellProduct(p, quantity);
        products.remove(sp);
    }

    public List<SellCombo> getCombos() {
        return combos;
    }

    public void addCombos(Combo c, int quantity) {
        SellCombo sc = new SellCombo(c, quantity);
        combos.add(sc);
    }
    
    public void removeCombos(Combo c, int quantity) {
        SellCombo sc = new SellCombo(c, quantity);
        combos.remove(sc);
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    } 

    public Double getMoneyReceived() {
        return moneyReceived;
    }

    public void setMoneyReceived(Double moneyReceived) {
        this.moneyReceived = moneyReceived;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }   
    
}
