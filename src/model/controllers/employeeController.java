package model.controllers;

import db.DbException;
import form.Employee.EmployeeData;
import form.Employee.Registered;
import form.Employee.addEmployee;
import form.Employee.alterEmployee;
import java.util.Date;
import model.Employee;
import model.dao.EmployeeDAO;

public class employeeController {
    
    private alterEmployee alterEmployee;
    private addEmployee addEmployee;
    private Registered registeredEmployee;
    private EmployeeData employeeData;
    private EmployeeDAO dao = new EmployeeDAO();

    public employeeController() {
    }

    public employeeController(alterEmployee alterEmployee) {
        this.alterEmployee = alterEmployee;
    }

    public employeeController(addEmployee addEmployee) {
        this.addEmployee = addEmployee;
    }

    public employeeController(Registered registeredEmployee) {
        this.registeredEmployee = registeredEmployee;
    }

    public employeeController(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }
    
    public Employee findEmployee (String txt) {
        try {
            int i = Integer.parseInt(txt);
            return findId(i);
        } catch (DbException e) {
            registeredEmployee.showMessage("Usuário não encontrado");
            return null;
        } catch (Exception e) {
            return findName(txt);
        }
    }
    
    public Employee findId(int id){
        return dao.findById(id);
    }
    
    public Employee findName(String name){
        return dao.findByName(name);
    }
    
    public void addEmployee (String name, String RG, String password, String phone, String state, String street, String complement, String neighborhood, Date birthDate, String ITR, String email, String country, String city, String note, int number, int selectedNumber) {
        String message = "";
        try {
            
            //CRIANDO MODELO FUNCIONARIO
            Employee e = new Employee();
            e.setName(name);
            e.setRg(RG);
            e.setPassword(password);
            e.setPhone(phone);
            e.setState(state);
            e.setStreet(street);
            e.setComplement(complement);
            e.setNeighborhood(neighborhood);
            e.setBirthDate(birthDate);
            e.setITR(ITR);
            e.setEmail(email);
            e.setCountry(country);
            e.setCity(city);
            e.setNote(note);
            e.setNumber(number);
            e.setFunction(selectedNumber);
            
            //INSERINDO NO BANCO
            message = dao.insert(e);    
            if (message.isEmpty()) {
                addEmployee.showMessage(false, "Valor já cadastrado");
            } else {
                addEmployee.showMessage(true, message);
            }
            
        } catch (DbException e) {
            addEmployee.showMessage(false, message);
        }
        
    }
    
    public void alterEmployee (int id, String name, String RG, String password, String phone, String state, String street, String complement, String neighborhood, Date birthDate, String ITR, String email, String country, String city, String note, int number, int selectedNumber, int idAddress) {
        String message = "";
        try {
            
            //CRIANDO MODELO FUNCIONARIO
            Employee e = new Employee();
            e.setId(id);
            e.setName(name);
            e.setRg(RG);
            e.setPassword(password);
            e.setPhone(phone);
            e.setState(state);
            e.setStreet(street);
            e.setComplement(complement);
            e.setNeighborhood(neighborhood);
            e.setBirthDate(birthDate);
            e.setITR(ITR);
            e.setEmail(email);
            e.setCountry(country);
            e.setCity(city);
            e.setNote(note);
            e.setNumber(number);
            e.setIdaddress(idAddress);
            e.setFunction(selectedNumber);
            
            //INSERINDO NO BANCO
            message = dao.update(e);    
            
            alterEmployee.showMessage(true, message);            
            
        } catch (DbException e) {
            alterEmployee.showMessage(false, message);
        }
        
    }
    
    public boolean deleteEmployee (Employee employee) {
        String message = "";
        try {
           message = dao.deleteById(employee);
           employeeData.showMessage(true, message);
           return true;
        } catch (DbException e) {
            employeeData.showMessage(false, message);
            return false;
        }
    }
}
