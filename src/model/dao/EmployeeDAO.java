package model.dao;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Employee;

public class EmployeeDAO {
    
    private Connection conn;

    public EmployeeDAO() {
        conn = DB.getConnection();
    }
    
    public String insert(Employee obj) {
        PreparedStatement st = null;
        String message = "";
        System.out.println(obj);
        Employee test = findByName(obj.getName());
        System.out.println(test);
        if (test == null) {
        
            int idAdress = insertAdress(obj);
            try {
                st = conn.prepareStatement("INSERT INTO employee (name, birthDate, ITR, phone, email, note, RG, password, employee.function, address_idAddress_Employee) values (?,?,?,?,?,?,?,?,?,?)");
                st.setString(1, obj.getName());
                Date date = new java.sql.Date(obj.getBirthDate().getTime());
                st.setDate(2, date);
                st.setString(3, obj.getITR());
                st.setString(4, obj.getPhone());
                st.setString(5, obj.getEmail());
                st.setString(6, obj.getNote());
                st.setString(7, obj.getRg());
                st.setString(8, obj.getPassword());
                st.setInt(9, obj.getFunction());
                st.setInt(10, idAdress);
                int rowsAffected = st.executeUpdate();
                if (rowsAffected > 0){
                    message = "Usuário adicionado";
                } else {
                    message = "Falha ao adicionar usuário";
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
    
    public int insertAdress(Employee obj) {
        PreparedStatement st = null;
        Employee test = findAddress(obj.getStreet(), obj.getNumber());
        System.out.println("ENTREI NO INSERT ADDRESS");
        if (test == null) {
            System.out.println("PASSEI DO IF");
            try {
            st = conn.prepareStatement("INSERT INTO address (street, number, complement, state, country, neighborhood, city) values (?,?,?,?,?,?,?)");
            st.setString(1, obj.getStreet());
            st.setInt(2, obj.getNumber());
            st.setString(3, obj.getComplement());
            st.setString(4, obj.getState());
            st.setString(5, obj.getCountry());
            st.setString(6, obj.getNeighborhood());
            st.setString(7, obj.getCity());
            System.out.println("PASSEI DO PREPARE STATEMENT");           
                
            st.executeUpdate();
            System.out.println("PASSEI DO execute update");
            obj = findAddress(obj.getStreet(), obj.getNumber());
            System.out.println("PASSEI DO FIND ADDRESS");
            return obj.getIdaddress();
            } catch (SQLException e){                
                throw new DbException(e.getMessage());
            } finally {
                DB.closeStatement(st);
            }
        } else {
            return test.getIdaddress();
        }        
    }
    
    public Employee findAddress (String street, int number) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Employee employee = new Employee();
        try {
            st = conn.prepareStatement("SELECT * FROM address WHERE street = ? and number = ?");
            st.setString(1, street);
            st.setInt(2, number);

            rs = st.executeQuery();
            if (rs.next()){
                employee.setStreet(rs.getString("street"));
                employee.setNumber(rs.getInt("number"));
                employee.setComplement(rs.getString("complement"));
                employee.setState(rs.getString("state"));
                employee.setCountry(rs.getString("country"));
                employee.setNeighborhood(rs.getString("neighborhood"));
                employee.setIdaddress(rs.getInt("idAddress"));
                employee.setCity(rs.getString("city"));
            } else {
              employee = null;  
            }
            
        } catch (SQLException e){
            e.printStackTrace();
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            return employee;
        }
    }
    
    public Employee findAddressById (int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT address.* FROM address WHERE address.idAddress = ?");
            st.setInt(1, id);

            rs = st.executeQuery();
            if (rs.next()){
                Employee employee = new Employee();
                employee.setStreet(rs.getString("street"));
                employee.setNumber(rs.getInt("number"));
                employee.setComplement(rs.getString("complement"));
                employee.setState(rs.getString("state"));
                employee.setCountry(rs.getString("country"));
                employee.setNeighborhood(rs.getString("neighborhood"));
                employee.setIdaddress(rs.getInt("idAddress"));
                employee.setCity(rs.getString("city"));
                return employee;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public String update(Employee obj) {
        PreparedStatement st = null;
        String message = "";
        try {
            updateAddress(obj);
            st = conn.prepareStatement("UPDATE employee SET name = ?, birthDate = ?, ITR = ?, phone = ?, email = ?, note = ?, RG = ?, password = ?, employee.function = ?, address_idAddress_Employee = ? where idEmployee = ?");
            st.setString(1, obj.getName());
            Date date = new java.sql.Date(obj.getBirthDate().getTime());
            st.setDate(2, date);
            st.setString(3, obj.getITR());
            st.setString(4, obj.getPhone());
            st.setString(5, obj.getEmail());
            st.setString(6, obj.getNote());
            st.setString(7, obj.getRg());
            st.setString(8, obj.getPassword());
            st.setInt(9, obj.getFunction());
            st.setInt(10, obj.getIdaddress());
            st.setInt(11, obj.getId());

            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0){
                message = "Usuário atualizado no banco";
            } else {
                message = "Falha ao atualizar usuário";
                throw new DbException("Unexpected error! No rows Affected");
            } 
        } catch (SQLException e){
            e.printStackTrace();
            throw new DbException(e.getMessage());            
        } finally {
            DB.closeStatement(st);
            return message;
        }
    }
    
    public void updateAddress(Employee obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("UPDATE address SET street = ?, number = ?, complement = ?, state = ?, country = ?, neighborhood = ?, city = ? where idAddress = ?");
            st.setString(1, obj.getStreet());
            st.setInt(2, obj.getNumber());
            st.setString(3, obj.getComplement());
            st.setString(4, obj.getState());
            st.setString(5, obj.getCountry());
            st.setString(6, obj.getNeighborhood());
            st.setString(7, obj.getCity());
            st.setInt(8, obj.getIdaddress());

            st.executeUpdate();

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
    
    public Employee findByName(String name) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM employee WHERE name = ?");
            st.setString(1, name);
            
            rs = st.executeQuery();
            if (rs.next()){
                System.out.println("CHEGUEI ATÉ AQUI");
                Employee employee = new Employee();
                employee.setId(rs.getInt("idEmployee"));
                employee.setName(rs.getString("name"));
                employee.setBirthDate(rs.getDate("birthDate"));
                employee.setPhone(rs.getString("phone"));
                employee.setEmail(rs.getString("email"));
                employee.setNote(rs.getString("note"));
                employee.setRg(rs.getString("RG"));
                employee.setPassword(rs.getString("password"));
                employee.setFunction(rs.getInt("function"));
                employee.setITR(rs.getString("ITR"));
                employee.setIdaddress(rs.getInt("address_idAddress_Employee"));
                Employee temporary = findAddressById(employee.getIdaddress());
                employee.setStreet(temporary.getStreet());
                employee.setNumber(temporary.getNumber());
                employee.setComplement(temporary.getComplement());
                employee.setState(temporary.getState());
                employee.setCity(temporary.getCity());
                employee.setCountry(temporary.getCountry());
                employee.setNeighborhood(temporary.getNeighborhood());
                return employee;                              
            } else {
              return null;  
            }            
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public Employee findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT employee.* FROM employee WHERE idEmployee = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            if (rs.next()){
                Employee employee = new Employee();
                employee.setId(rs.getInt("idEmployee"));
                employee.setName(rs.getString("name"));
                employee.setBirthDate(rs.getDate("birthDate"));
                employee.setPhone(rs.getString("phone"));
                employee.setEmail(rs.getString("email"));
                employee.setNote(rs.getString("note"));
                employee.setRg(rs.getString("RG"));
                employee.setPassword(rs.getString("password"));
                employee.setFunction(rs.getInt("function"));
                employee.setIdaddress(rs.getInt("address_idAddress_Employee"));
                Employee temporary = findAddressById(employee.getIdaddress());
                employee.setStreet(temporary.getStreet());
                employee.setNumber(temporary.getNumber());
                employee.setComplement(temporary.getComplement());
                employee.setState(temporary.getState());
                employee.setCountry(temporary.getCountry());
                employee.setCity(temporary.getCity());
                employee.setITR(rs.getString("ITR"));
                employee.setNeighborhood(temporary.getNeighborhood());                
                return employee;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public Employee findLogin(String cpf, String password) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT employee.* FROM employee WHERE employee.ITR = ? and employee.password = ?");
            st.setString(1, cpf);
            st.setString(2, password);
            
            rs = st.executeQuery();
            if (rs.next()){
                Employee employee = new Employee();
                employee.setId(rs.getInt("idEmployee"));
                employee.setName(rs.getString("name"));
                employee.setBirthDate(rs.getDate("birthDate"));
                employee.setPhone(rs.getString("phone"));
                employee.setEmail(rs.getString("email"));
                employee.setNote(rs.getString("note"));
                employee.setRg(rs.getString("RG"));
                employee.setPassword(rs.getString("password"));
                employee.setFunction(rs.getInt("function"));
                employee.setIdaddress(rs.getInt("address_idAddress_Employee"));
                Employee temporary = findAddressById(employee.getIdaddress());
                employee.setStreet(temporary.getStreet());
                employee.setNumber(temporary.getNumber());
                employee.setComplement(temporary.getComplement());
                employee.setState(temporary.getState());
                employee.setCountry(temporary.getCountry());
                employee.setCity(temporary.getCity());
                employee.setITR(rs.getString("ITR"));
                employee.setNeighborhood(temporary.getNeighborhood());                
                return employee;
            }
            return null;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    public String deleteById(Employee obj) {
        PreparedStatement st = null;
        String message = "";
        
        try {
            st = conn.prepareStatement("DELETE FROM employee WHERE idEmployee = ?");
            
            st.setInt(1, obj.getId());
            st.executeUpdate();
            message = "Usuário deletado com succeso";
            deleteAddress(obj.getIdaddress());
        } catch (SQLException e){
            message = "Falha ao deletar usuário";
            throw new DbException(e.getMessage());
        } finally {   
            DB.closeStatement(st);
            return message;
        }
    }
    
    public void deleteAddress(int id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM address WHERE idAddress = ?");            
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {   
            DB.closeStatement(st);
        }
    }
    
}
