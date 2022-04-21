
package form.Employee;

import form.MainForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import model.controllers.employeeController;
import swing.Message;
import swing.textflield.EventCallBack;
import swing.textflield.EventTextField;

public class Registered extends javax.swing.JPanel {
    
    private MainForm main;
    private employeeController controller;
    private boolean permission;
    
    public Registered(MainForm main, boolean permission) {
        initComponents();
        controller = new employeeController(this);
        this.main = main;
        this.permission = permission;
        setOpaque(false);
        jtxtP.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                Employee e = controller.findEmployee(jtxtP.getText());
                if (e != null) {
                    main.showForm(new EmployeeData(main, e, permission));
                } else {
                    showMessage("Usuário inválido");
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    Logger.getLogger(Registered.class.getName()).log(Level.SEVERE, null, ex);
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

        lblUsuarios = new javax.swing.JLabel();
        lblPesquise = new javax.swing.JLabel();
        jtxtP = new swing.textflield.TextFieldAnimation();

        setBackground(new java.awt.Color(203, 204, 215));

        lblUsuarios.setBackground(new java.awt.Color(101, 16, 197));
        lblUsuarios.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(101, 16, 197));
        lblUsuarios.setText("Usuários cadastrados");
        lblUsuarios.setToolTipText("");

        lblPesquise.setBackground(new java.awt.Color(101, 16, 197));
        lblPesquise.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblPesquise.setForeground(new java.awt.Color(83, 84, 81));
        lblPesquise.setText("Pesquise o nome ou ID");
        lblPesquise.setToolTipText("");

        jtxtP.setAnimationColor(new java.awt.Color(101, 16, 197));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblUsuarios))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblPesquise))
                            .addComponent(jtxtP, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUsuarios)
                .addGap(220, 220, 220)
                .addComponent(lblPesquise)
                .addGap(26, 26, 26)
                .addComponent(jtxtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void showMessage(String message) {
        main.getMain().showMessage(Message.MessageType.ERROR, message);      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.textflield.TextFieldAnimation jtxtP;
    private javax.swing.JLabel lblPesquise;
    private javax.swing.JLabel lblUsuarios;
    // End of variables declaration//GEN-END:variables
}
