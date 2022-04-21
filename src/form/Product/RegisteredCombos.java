package form.Product;

import form.MainForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Combo;
import model.controllers.comboController;
import swing.Message;
import swing.textflield.EventCallBack;
import swing.textflield.EventTextField;

public class RegisteredCombos extends javax.swing.JPanel {

    private MainForm main;
    private comboController controller;
    private boolean permission;
    
    public RegisteredCombos(MainForm main, boolean permission) {
        initComponents();
        this.main = main;
        this.permission = permission;
        controller = new comboController(this);
        jtxtCliente.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                Combo c = controller.findCombo(jtxtCliente.getText());
                if (c != null) {
                    main.showForm(new ComboData(main, c, permission));
                } else {
                    showMessage("Combo inválido");
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    Logger.getLogger(RegisteredCombos.class.getName()).log(Level.SEVERE, null, ex);
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
        lblNovaVenda.setText("Combos cadastrados");
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
                .addGap(24, 24, 24)
                .addComponent(lblNovaVenda)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(lblCliente)))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblNovaVenda)
                .addGap(227, 227, 227)
                .addComponent(lblCliente)
                .addGap(39, 39, 39)
                .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
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
