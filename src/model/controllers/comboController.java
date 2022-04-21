package model.controllers;

import db.DbException;
import form.Product.AddCombo;
import form.Product.AlterCombo;
import form.Product.ComboData;
import form.Product.RegisteredCombos;
import java.util.List;
import model.Combo;
import model.Product;
import model.dao.comboDAO;

public class comboController {
    
    private RegisteredCombos registeredCombos;
    private AddCombo addCombo;
    private AlterCombo alterCombo;
    private ComboData comboData;
    private comboDAO dao = new comboDAO();

    public comboController() {
    }

    public comboController(RegisteredCombos registeredCombos) {
        this.registeredCombos = registeredCombos;
    }

    public comboController(AddCombo addCombo) {
        this.addCombo = addCombo;
    }

    public comboController(AlterCombo alterCombo) {
        this.alterCombo = alterCombo;
    }

    public comboController(ComboData comboData) {
        this.comboData = comboData;
    }
    
    public void insertCombo(String name, Double price, String code, String note) {
        String message = "";        
        //INSERINDO DADOS NA CLASSE
        try {
            Combo combo = new Combo();
            combo.setName(name);
            combo.setPrice(price);
            combo.setCode(code);
            combo.setNote(note);        
            //INSERINDO CLASSE NO BANCO
            message = dao.insert(combo);
            if (message == null) {
                addCombo.showMessage(false, "Valor já existente no banco");
            } else {
                addCombo.showMessage(true, message);  
            }            
        } catch (DbException e){
            addCombo.showMessage(false, message);
        }
        
    }
    
    public void insertComboAlter(int id ,String name, Double price, String code, String note) {
        String message = "";        
        //INSERINDO DADOS NA CLASSE
        try {
            Combo combo = new Combo();
            combo.setName(name);
            combo.setPrice(price);
            combo.setCode(code);
            combo.setNote(note);
            combo.setId(id);
            //INSERINDO CLASSE NO BANCO
            message = dao.insert(combo);
            if (message == null) {
                alterCombo.showMessage(false, "Valor já existente no banco");
            } else {
                alterCombo.showMessage(true, message);  
            }            
        } catch (DbException e){
            alterCombo.showMessage(false, message);
        }
        
    }
    
    public Combo getComboById(int id){
        return dao.findById(id);      
    }
    
    public Combo getComboByName (String name) {
        return dao.findByName(name);
    }
    
    public void insertComboItem (List<Product> p, int id, int listN, int quantity) {
        Combo combo = dao.findById(id);
        dao.addComboItem(p.get(listN), combo.getId(), quantity);
        
    }
    
    public Combo findCombo(String txt){
        try {
            int i = Integer.parseInt(txt);
            return findId(i);
        } catch (DbException e) {
            registeredCombos.showMessage("Combo não encontrado");
            return null;
        } catch (NumberFormatException a) {
            return findName(txt);
        }    
    }
    
    public Combo getProducts(int id) {
        Combo combo = findId(id);
        combo = dao.findItens(combo);
        return combo;
    }
    
    public Combo findId(int id){
        return dao.findById(id);
    }
    
    public Combo findName(String name){
        return dao.findByName(name);
    }
    
    public Combo alterCombo(int id ,String name, Double price, String code, String note) {
        Combo combo = new Combo(id, name, price, note, code);
        dao.update(combo);
        combo = findId(id);
        return combo;
    }
    
    public void deleteItens(int id) {
        dao.deleteItens(id);
    }
    
    public boolean deleteCombo (int id) {
        String message = "";
        try {
           message = dao.deleteById(id);
           comboData.showMessage(true, message);
           return true;
        } catch (DbException e) {
            comboData.showMessage(false, message);
            return false;
        }
    }
    
    public void deleteComboAlter (int id) {
        dao.deleteById(id);
    }
    
    public int getItemQuantity(int idp, int idc) {
        return dao.getItemQuantity(idp, idc);
    }
}
