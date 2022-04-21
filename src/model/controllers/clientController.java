package model.controllers;

import db.DbException;
import form.clients.AddClient;
import form.clients.AlterClient;
import form.clients.ClientData;
import form.clients.RegisteredClient;
import java.util.Date;
import model.Client;
import model.dao.ClientDAO;

public class clientController {
    
    private AddClient addClient;
    private AlterClient alterClient;
    private ClientData clientData;
    private RegisteredClient registeredClient;
    private ClientDAO dao = new ClientDAO();
    
    public clientController() {
    }

    public clientController(AddClient addClient) {
        this.addClient = addClient;
    }

    public clientController(AlterClient alterClient) {
        this.alterClient = alterClient;
    }

    public clientController(ClientData clientData) {
        this.clientData = clientData;
    }

    public clientController(RegisteredClient registeredClient) {
        this.registeredClient = registeredClient;
    }
    
    public void insertClient (String name, String phone, String email, String itr, Date birthDate, boolean student, boolean deficient, String note) {
        String message = "";
        //CRIANDO MODELO
        try {
            Client client = new Client();
            client.setName(name);
            client.setPhone(phone);
            client.setEmail(email);
            client.setITR(itr);
            client.setBirthDate(birthDate);
            client.setStudent(student);
            client.setDeficient(deficient);
            client.setNote(note);
            message = dao.insert(client);
            if (message == "") {
                addClient.showMessage(false, "Cliente já cadastrado/Inválido");
            } else {
                addClient.showMessage(true, message);
            }
        } catch (DbException e) {
            addClient.showMessage(false, message);
        }
        
    }
    
    public void updateClient (int id, String name, String phone, String email, String itr, Date birthDate, boolean student, boolean deficient, String note) {
        String message = "";
        //CRIANDO MODELO
        try {
            Client client = new Client();
            client.setName(name);
            client.setPhone(phone);
            client.setEmail(email);
            client.setITR(itr);
            client.setBirthDate(birthDate);
            client.setStudent(student);
            client.setDeficient(deficient);
            client.setNote(note);
            client.setId(id);
            message = dao.update(client);
            if (message == "") {
                alterClient.showMessage(false, "Cliente já cadastrado/Inválido");
            } else {
                alterClient.showMessage(true, message);
            }
        } catch (DbException e) {
            alterClient.showMessage(false, message);
        }
        
    }
    
    public Client findByName(String name) {
        return dao.findByName(name);
    }
    
    public Client findById(int id) {
        return dao.findById(id);
    }
    
    public Client findClient (String txt) {
        try {
            int i = Integer.parseInt(txt);
            return findById(i);
        } catch (DbException e) {
            registeredClient.showMessage("Produto não encontrado");
            return null;
        } catch (Exception e) {
            return findByName(txt);
        } 
    }
    
    public boolean deleteById (int id) {
        String message = "";
        try {
           message = dao.deleteById(id);
           clientData.showMessage(true, message);
           return true;
        } catch (DbException e) {
            clientData.showMessage(false, message);
            return false;
        }
    }
}
