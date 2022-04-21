package model.controllers;

import form.LoginScreen;
import javax.swing.JOptionPane;
import model.Employee;
import model.dao.EmployeeDAO;
import swing.Message;

public class loginController {
    
    private LoginScreen screen;
    private EmployeeDAO dao = new EmployeeDAO();

    public loginController(LoginScreen screen) {
        this.screen = screen;
    }
    
    public Employee login(String cpf, String password) {
        Employee emp = new Employee();
        emp = dao.findLogin(cpf, password);
        if (emp == null) {
            JOptionPane.showMessageDialog(null, "Usuário inválido");
            return null;
        }
        return emp;
    }

}
