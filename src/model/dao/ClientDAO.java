package model.dao;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Client;

public class ClientDAO {
    
    private Connection conn;
    
    public ClientDAO() {
        conn = DB.getConnection();
    }
    
    public String insert(Client obj) {
        PreparedStatement st = null;
        String message = "";
        if (findByName(obj.getName()) == null) {
            try {
            st = conn.prepareStatement("INSERT INTO client (name, ITR, phone, birthDate, email, note, student, deficient) VALUES (?,?,?,?,?,?,?,?)");
            st.setString(1, obj.getName());
            st.setString(2, obj.getITR());
            st.setString(3, obj.getPhone());
            Date date = new java.sql.Date(obj.getBirthDate().getTime());
            st.setDate(4, date);
            st.setString(5, obj.getEmail());
            st.setString(6, obj.getNote());
            st.setBoolean(7, obj.isStudent());
            st.setBoolean(8, obj.isDeficient());
   
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Cliente adicionado";
            } else {
                message = "Falha ao adicionar cliente";
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
    
    public Client findByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT client.* FROM client WHERE client.name = ?");
            st.setString(1, name);
            
            rs = st.executeQuery();
            if (rs.next()){
                Client client = new Client();
                client.setId(rs.getInt("idClient"));
                client.setName(rs.getString("name"));
                client.setPhone(rs.getString("phone"));
                client.setBirthDate(rs.getDate("birthDate"));
                client.setEmail(rs.getString("email"));
                client.setNote(rs.getString("note"));
                client.setStudent(rs.getBoolean("student"));
                client.setDeficient(rs.getBoolean("deficient"));
                client.setITR(rs.getString("ITR"));
                return client;
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
            st = conn.prepareStatement("DELETE FROM client WHERE idClient = ?");
            
            st.setInt(1, id);
            st.executeUpdate();
            message = "Cliente deletado com succeso";
        } catch (SQLException e){
            message = "Falha ao deletar cliente";
            throw new DbException(e.getMessage());
        } finally {   
            DB.closeStatement(st);
            return message;
        }
    }
    
    public Client findById(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT client.* FROM client WHERE client.idClient = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                Client client = new Client();
                client.setId(rs.getInt("idClient"));
                client.setName(rs.getString("name"));
                client.setPhone(rs.getString("phone"));
                client.setBirthDate(rs.getDate("birthDate"));
                client.setEmail(rs.getString("email"));
                client.setNote(rs.getString("note"));
                client.setStudent(rs.getBoolean("student"));
                client.setDeficient(rs.getBoolean("deficient"));
                client.setITR(rs.getString("ITR"));
                return client;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
  
    public String update(Client obj) {
        PreparedStatement st = null;
        String message = "";
        try {
            st = conn.prepareStatement("UPDATE client SET name = ?, ITR = ?, phone = ?, birthDate = ?, email = ?, note = ?, student = ?, deficient = ? where idClient = ?");
            st.setString(1, obj.getName());
            st.setString(2, obj.getITR());
            st.setString(3, obj.getPhone());
            Date date = new java.sql.Date(obj.getBirthDate().getTime());
            st.setDate(4, date);
            st.setString(5, obj.getEmail());
            st.setString(6, obj.getNote());
            st.setBoolean(7, obj.isStudent());
            st.setBoolean(8, obj.isDeficient());
            st.setInt(9, obj.getId());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Cliente atualizado no banco";
            } else {
                message = "Falha ao atualizar cliente";
                throw new DbException("Unexpected error! No rows Affected");
            } 

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            return message;
        }
    }
    
    public List<Client> pickAll() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Client> clients = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM client");
            rs = stmt.executeQuery();
            while (rs.next()) {

                Client client = new Client();
                client.setId(rs.getInt("idClient"));
                client.setName(rs.getString("name"));
                client.setITR(rs.getString("ITR"));
                client.setPhone(rs.getString("phone"));
                client.setBirthDate(rs.getDate("birthDate"));
                client.setEmail(rs.getString("email"));
                client.setNote(rs.getString("note"));
                client.setStudent(rs.getBoolean("student"));
                client.setDeficient(rs.getBoolean("deficient"));
                clients.add(client);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return clients;
    }
    
}
