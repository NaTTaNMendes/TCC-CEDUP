package model;

public class SellCombo {
    
    private Combo combo;
    private int quantity;

    public SellCombo() {
    }

    public SellCombo(Combo combo, int quantity) {
        this.combo = combo;
        this.quantity = quantity;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
