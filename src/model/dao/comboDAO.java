package model.dao;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Combo;
import model.Product;

public class comboDAO {
    
    private Connection conn;

    public comboDAO() {
        conn = DB.getConnection();
    } 
    
    public String insert(Combo obj) {
        PreparedStatement st = null;
        String message = "";
        if (findByName(obj.getName()) == null) {
            try {
                if (obj.getId() == null) {
                    st = conn.prepareStatement("INSERT INTO combo (name, price, note, code) values (?,?,?,?)");
                    st.setString(1, obj.getName());
                    st.setDouble(2, obj.getPrice());
                    st.setString(3, obj.getNote());
                    st.setString(4, obj.getCode());
                } else {
                    st = conn.prepareStatement("INSERT INTO combo (idCombo ,name, price, note, code) values (?,?,?,?,?)");
                    st.setInt(1, obj.getId());
                    st.setString(2, obj.getName());
                    st.setDouble(3, obj.getPrice());
                    st.setString(4, obj.getNote());
                    st.setString(5, obj.getCode());
                }
                

                int rowsAffected = st.executeUpdate();
                if (rowsAffected > 0){
                    message = "Combo adicionado";
                } else {
                    message = "Falha ao adicionar o combo";
                    throw new DbException("Unexpected error! No rows Affected");                
                } 

            } catch (SQLException e){
                throw new DbException(e.getMessage());
            } finally {
                DB.closeStatement(st);
            }
            return message;
        } else {
            return null;
        }        
    }

    public String update(Combo obj) {
        PreparedStatement st = null;
        String message = "";
        try {
            st = conn.prepareStatement("UPDATE combo set name = ?, price = ?, note = ?, code = ? where idCombo = ?");
            st.setString(1, obj.getName());
            st.setDouble(2, obj.getPrice());
            st.setString(3, obj.getNote());
            st.setString(4, obj.getCode());
            st.setInt(5, obj.getId());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Combo atualizado no banco";
            } else {
                message = "Falha ao atualizar combo";
                throw new DbException("Unexpected error! No rows Affected");
            } 

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            return message;
        }
    }
    
    public Combo findByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT combo.* FROM combo WHERE combo.name = ?");
            st.setString(1, name);
            
            rs = st.executeQuery();
            while (rs.next()){
                Combo combo = new Combo();
                combo.setId(rs.getInt("idCombo"));
                combo.setName(rs.getString("name"));
                combo.setPrice(rs.getDouble("price"));
                combo.setCode(rs.getString("code"));
                combo.setNote(rs.getString("note"));
                return combo;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    } 
   
    public Combo findById(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT combo.* FROM combo WHERE combo.idCombo = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                Combo combo = new Combo();
                combo.setId(rs.getInt("idCombo"));
                combo.setName(rs.getString("name"));
                combo.setPrice(rs.getDouble("price"));
                combo.setCode(rs.getString("code"));
                combo.setNote(rs.getString("note"));
                return combo;
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
        deleteItens(id);
        try {
            st = conn.prepareStatement("DELETE FROM combo WHERE idCombo = ?");
            
            st.setInt(1, id);
            st.executeUpdate();
            message = "Combo deletado com succeso";
        } catch (SQLException e){
            message = "Falha ao deletar o combo";
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            return message;
        }
    }
    
    public void addComboItem(Product p, int c, int quantity) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO combo_has_product (Combo_idCombo, product_idProduct, quantiy) values (?,?,?)");
            st.setInt(1, c);
            st.setInt(2, p.getId());
            st.setInt(3, quantity);

            int rowsAffected = st.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("PRODUTO "+p.getName()+" ADICIONADO");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DB.closeStatement(st);
        }
        
    }
    
    public int getItemQuantity (int idp, int idc) {
        PreparedStatement st = null;
        ResultSet rs = null;
        int quantity = 0;
        try {
            st = conn.prepareStatement("Select quantiy from combo_has_product where Combo_idCombo = ? and product_idProduct = ?");
            st.setInt(1, idc);
            st.setInt(2, idp);
            rs = st.executeQuery();
            if (rs.next()){
                quantity = rs.getInt("quantiy");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            return quantity;
        }
    }

    public Combo findItens(Combo c) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT product_idProduct FROM combo_has_product WHERE Combo_idCombo = ?");
            st.setInt(1, c.getId());
            
            rs = st.executeQuery();
            Combo combo = new Combo();
            ProductDAO pdao = new ProductDAO();
            while (rs.next()){       
                combo.addProduct(pdao.findById(rs.getInt("product_idProduct")));
            }
            return combo;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public void deleteItens(int id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM combo_has_product WHERE Combo_idCombo = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
    
    public List<Combo> pickAll() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Combo> combos = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM combo");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Combo combo = new Combo();

                combo.setId(rs.getInt("idCombo"));
                combo.setName(rs.getString("name"));
                combo.setPrice(rs.getDouble("price"));
                combo.setCode(rs.getString("code"));
                combo.setNote(rs.getString("note"));
                combos.add(combo);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return combos;
    }
}
