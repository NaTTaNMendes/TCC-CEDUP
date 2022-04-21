package model.dao;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Chair;
import model.PSell;
import model.Session;
import model.Ticket;

public class SellDAO {
    
    private Connection conn;

    public SellDAO() {
        conn = DB.getConnection();
    }
    
    public String insert(PSell sell) {
        PreparedStatement st = null;
        String message = "";
            try {
                st = conn.prepareStatement("INSERT INTO sell (date, note, employee_idEmployee, client_idClient, hour, sell.total, moneyReceived, paymentMethod) values (?,?,?,?,?,?,?,?)");
                Date data = new Date(System.currentTimeMillis());
                java.sql.Date date = new java.sql.Date(data.getTime());
                st.setDate(1, date);
                st.setString(2, sell.getNote());
                st.setInt(3, sell.getEmp().getId());
                st.setInt(4, sell.getClient().getId());
                st.setTime(5, new java.sql.Time(data.getTime()));
                st.setDouble(6, sell.getTotal());
                if (sell.getPaymentMethod() != 0) {
                    st.setDouble(7, 0);
                } else {
                    st.setDouble(7, sell.getMoneyReceived());
                }                
                st.setInt(8, sell.getPaymentMethod());

                int rowsAffected = st.executeUpdate();
                if (rowsAffected > 0){
                    message = "Venda realizada com sucesso";
                } else {
                    message = "Falha ao realizar venda";
                    throw new DbException("Unexpected error! No rows Affected");                
                } 
            } catch (SQLException e){
                throw new DbException(e.getMessage());
            } finally {
                DB.closeStatement(st);
            }
            return message;        
    }
    
    public void insertSHC(int idSell, int idCombo, int quantity) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("insert into sell_has_combo (Sell_idSell, Combo_idCombo, quantity) values (?,?,?)");
            st.setInt(1, idSell);
            st.setInt(2, idCombo);
            st.setInt(3, quantity);
            
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
    
    public void insertSHP(int idSell, int idProduct, int quantity) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("insert into sell_has_product (Sell_idSell, Product_idProduct, quantity) values (?,?,?)");
            st.setInt(1, idSell);
            st.setInt(2, idProduct);
            st.setInt(3, quantity);
            
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
    
    public int selectLastIdSell() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT max(idSell) FROM sell");
            
            rs = st.executeQuery();
            while (rs.next()){
                return rs.getInt("max(idSell)");
            }
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return 0;
    }
    
    public List<Chair> pickAllChairsHall1(Date session, int sessionId) {
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        List<Chair> chairs = new ArrayList<>();        
        try {
            stmt = conn.prepareStatement("SELECT * FROM chair\n" +
            "inner join session_has_chair on idChair = chair_idChair\n" +
            "inner join session on idSession = session_idSession\n" +
            "where session.data = ? and session_has_chair.session_idSession = ?");
                     
            java.sql.Date date = new java.sql.Date(session.getTime());
            stmt.setDate(1, date);
            stmt.setInt(2, sessionId);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Chair chair = new Chair();
                chair.setId(rs.getInt("idChair"));
                chair.setName(rs.getString("name"));
                chair.setChairStatus(rs.getInt("chairStatus"));
                chair.setChairType(rs.getInt("chairType"));
                SessionDAO sdao = new SessionDAO();
                chair.setHall(sdao.findHallById(1));
                chairs.add(chair);                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return chairs;
    }
    
    public List<Chair> pickAllChairsHall2(Date session, int sessionID) {
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        List<Chair> chairs = new ArrayList<>();        
        try {
            stmt = conn.prepareStatement("SELECT * FROM chair\n" +
            "inner join session_has_chair on idChair = chair_idChair\n" +
            "inner join session on idSession = session_idSession\n" +
            "where session.data = ? and session_has_chair.session_idSession = ?");
            
            java.sql.Date date = new java.sql.Date(session.getTime());
            stmt.setDate(1, date);
            stmt.setInt(1, sessionID);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Chair chair = new Chair();
                chair.setId(rs.getInt("idChair"));
                chair.setName(rs.getString("name"));
                chair.setChairStatus(rs.getInt("chairStatus"));
                chair.setChairType(rs.getInt("chairType"));
                SessionDAO sdao = new SessionDAO();
                chair.setHall(sdao.findHallById(2));
                chairs.add(chair);                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            DB.closeStatement(stmt);
        }
        return chairs;
    }
    
    public void updateChair(Session session, int idChair) {
        PreparedStatement st = null;
        try {
            
            st = conn.prepareStatement("UPDATE session_has_chair SET chairStatus = ? where session_idSession = ? and chair_idChair = ?");
            st.setInt(1, 1);
            st.setInt(2, session.getId());
            st.setInt(3, idChair);
            
            st.executeUpdate();          
            
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
    
    public void insertTicket(Ticket ticket) {
        PreparedStatement st = null;
            try {
                st = conn.prepareStatement("INSERT INTO ticket (date, price, cinemaName, ticketType, movie_idMovie, client_idClient, sell_idSell, hour, seat) values (?,?,?,?,?,?,?,?,?)");
                java.sql.Date date = new java.sql.Date(ticket.getDate().getTime());
                st.setDate(1, date);
                st.setDouble(2, ticket.getPrice());
                st.setString(3, ticket.getCinemaName());
                st.setInt(4, ticket.getTicketType());
                st.setInt(5, ticket.getMovie().getId());
                st.setInt(6, ticket.getClient().getId());
                st.setInt(7, selectLastIdSell());
                java.sql.Time time = new java.sql.Time(ticket.getHour().getTime());
                st.setTime(8, time);
                st.setString(9, ticket.getSeat());                
                
                st.executeUpdate();
                 
            } catch (SQLException e){
                throw new DbException(e.getMessage());
            } finally {
                DB.closeStatement(st);
            }        
    }
    
    public int selectLastIdTicket() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT max(idTicket) FROM ticket");
            
            rs = st.executeQuery();
            while (rs.next()){
                return rs.getInt("max(idTicket)");
            }
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return 0;
    }
    
    public int selectIdChair(String name, int hall) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT idChair from chair where chair.name = ? and filmHall_idFilmHall = ?");
            st.setString(1, name);
            st.setInt(2, hall);
            
            rs = st.executeQuery();
            while (rs.next()){
                return rs.getInt("idChair");
            }
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
        return 0;
    }
}
