package form.clients;

import form.MainForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Client;
import model.controllers.clientController;
import swing.Message;
import swing.textflield.EventCallBack;
import swing.textflield.EventTextField;

public class RegisteredClient extends javax.swing.JPanel {
    
    private MainForm main;
    private clientController controller;
    
    public RegisteredClient(MainForm main) {
        initComponents();
        setOpaque(false);
        controller = new clientController(this);
        this.main = main;
        jtxtCliente.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                Client c = controller.findClient(jtxtCliente.getText());
                if (c != null) {
                    main.showForm(new ClientData(main, c));
                } else {
                    showMessage("Cliente inválido");
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    Logger.getLogger(RegisteredClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                call.done();
            }

            @Override
            public void onCancel() {
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jtxtCliente = new swing.textflield.TextFieldAnimation();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Clientes cadastrados");
        lblNovaVenda.setToolTipText("");

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Pesquise o nome ou ID");
        lblCliente.setToolTipText("");

        jtxtCliente.setAnimationColor(new java.awt.Color(101, 16, 197));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblNovaVenda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblCliente))
                            .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblNovaVenda)
                .addGap(220, 220, 220)
                .addComponent(lblCliente)
                .addGap(26, 26, 26)
                .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void showMessage(String message) {
        main.getMain().showMessage(Message.MessageType.ERROR, message);      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.textflield.TextFieldAnimation jtxtCliente;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblNovaVenda;
    // End of variables declaration//GEN-END:variables
}
