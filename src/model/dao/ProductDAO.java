package model.dao;

import db.DB;
import db.DbException;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.Product;

public class ProductDAO {

    private Connection conn;

    public ProductDAO() {
        conn = DB.getConnection();
    }

    
    public String insert(Product obj) {
        PreparedStatement st = null;
        String message = "";
        if (findByName(obj.getName()) == null) {
            try {
            st = conn.prepareStatement("INSERT INTO product (name, price, code, note, stock) VALUES (?,?,?,?,NULL)");
            st.setString(1, obj.getName());
            st.setDouble(2, obj.getPrice());
            st.setString(3, obj.getCode());
            st.setString(4, obj.getNote());
   
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Produto adicionado";
            } else {
                message = "Falha ao adicionar o produto";
                throw new DbException("Unexpected error! No rows Affected");                
            } 

            } catch (SQLException e){
                throw new DbException(e.getMessage());
            } finally {
                DB.closeStatement(st);
                return message;
            }
        } else {
            return message;
        }        
    }

    public String update(Product obj) {
        PreparedStatement st = null;
        String message = "";
        try {
            st = conn.prepareStatement("UPDATE product SET name = ?, price = ?, code = ?, note = ? WHERE idProduct = ?");
            st.setString(1, obj.getName());
            st.setDouble(2, obj.getPrice());
            st.setString(3, obj.getCode());
            st.setString(4, obj.getNote());
            st.setInt(5, obj.getId());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Produto atualizado no banco";
            } else {
                message = "Falha ao atualizar produto";
                throw new DbException("Unexpected error! No rows Affected");
            } 

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            return message;
        }
    }
    
    public Product findByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT product.* FROM product WHERE product.name = ?");
            st.setString(1, name);
            
            rs = st.executeQuery();
            if (rs.next()){
                Product product = new Product();
                product.setId(rs.getInt("idProduct"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setCode(rs.getString("code"));
                product.setNote(rs.getString("note"));
                product.setStock(rs.getInt("stock"));
                return product;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    public void searchBox(String field, DefaultListModel list, JList listC) {
        try {
            Statement st = null;
            ResultSet rs = null;
            rs =  st.executeQuery("select * from product where name like '" + field + "%' order by name");
            list.removeAllElements();
            int i = 0;
            while (rs.next() && i < 6) {
                list.addElement(rs.getString("name"));
                i++;
            }
            if (i >= 1) {
                listC.setVisible(true);
            } else {
                listC.setVisible(false);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Product findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT product.* FROM product WHERE idProduct = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                Product product = new Product();
                product.setId(rs.getInt("idProduct"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setCode(rs.getString("code"));
                product.setNote(rs.getString("note"));
                return product;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public String deleteById(Integer id) {
        PreparedStatement st = null;
        String message = "";
        try {
            st = conn.prepareStatement("DELETE FROM product WHERE idProduct = ?");
            
            st.setInt(1, id);
            st.executeUpdate();
            message = "Produto deletado com succeso";
        } catch (SQLException e){
            message = "Falha ao deletar o produto";
            throw new DbException(e.getMessage());
        } finally {   
            DB.closeStatement(st);
            return message;
        }
    }
    
    public List<Product> pickAll() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Product> products = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM product");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Product product = new Product();

                product.setId(rs.getInt("idProduct"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setCode(rs.getString("code"));
                product.setNote(rs.getString("note"));
                products.add(product);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return products;
    }
    }

