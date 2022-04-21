package model.controllers;

import db.DbException;
import form.Product.AddProduct;
import form.Product.AlterProduct;
import form.Product.ProductData;
import form.Product.RegisteredProducts;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.Product;
import model.dao.ProductDAO;

public class productController {
    
    private AddProduct addProduct;
    private AlterProduct alterProduct;
    private ProductData productData;
    private RegisteredProducts registeredProducts;
    ProductDAO dao = new ProductDAO(); 

    public productController() {
    }
    
    public productController(AddProduct addProduct) {
        this.addProduct = addProduct;
    }

    public productController(AlterProduct alterProduct) {
        this.alterProduct = alterProduct;
    }

    public productController(ProductData productData) {
        this.productData = productData;
    }

    public productController(RegisteredProducts registeredProducts) {
        this.registeredProducts = registeredProducts;
    }
    
    public void addProduct (String name, Double price, String code, String note) {
        String message = "";
        try {
            
            //CRIANDO MODELO PRODUTO
            Product p = new Product();
            p.setName(name);
            p.setPrice(price);
            p.setCode(code);  
            p.setNote(note);
            //INSERINDO NO BANCO
            message = dao.insert(p);    
            if (message == "") {
                addProduct.showMessage(false, "Valor já cadastrado");
            } else {
                addProduct.showMessage(true, message);
            }                
            
        } catch (DbException e) {
            addProduct.showMessage(false, message);
        }
        
    }
    
    public Product alterProduct (int id ,String name, Double price, String code, String note) {
        String message = "";
        try {
            //CRIANDO MODELO PRODUTO
            Product p = new Product();
            p.setId(id);
            p.setName(name);
            p.setPrice(price);
            p.setCode(code);
            p.setNote(note);
            message = dao.update(p);
            alterProduct.showMessage(true, message);
            return p;
        } catch (DbException e) {
            alterProduct.showMessage(false, message);
            return null;
        }
        
    }
    
    public Product findProduct(String txt){
        try {
            int i = Integer.parseInt(txt);
            return findId(i);
        } catch (DbException e) {
            registeredProducts.showMessage("Produto não encontrado");
            return null;
        } catch (Exception e) {
            return findName(txt);
        }    
    }
    
    public Product findId(int id){
        return dao.findById(id);
    }
    public Product findName(String name){
        return dao.findByName(name);
    }
    
    public boolean deleteProduct(int id){
        String message = "";
        try {
           message = dao.deleteById(id);
           productData.showMessage(true, message);
           return true;
        } catch (DbException e) {
            productData.showMessage(false, message);
            return false;
        }
    }
    
    public void searchItens (String field, DefaultListModel list, JList listC) {
        dao.searchBox(field, list, listC);        
    }
}
