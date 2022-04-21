package form.Product;

import form.MainForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
import model.controllers.productController;
import swing.Message;
import swing.textflield.EventCallBack;
import swing.textflield.EventTextField;

public class RegisteredProducts extends javax.swing.JPanel {
    
    private MainForm main;
    private productController controller;
    private boolean permission;
    
    public RegisteredProducts(MainForm main, boolean permission) {
        initComponents();
        this.main = main;
        this.permission = permission;
        controller = new productController(this);
        jtxtCliente.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                Product p = controller.findProduct(jtxtCliente.getText());
                if (p != null) {
                    main.showForm(new ProductData(main, p, permission));
                } else {
                    showMessage("Produto inválido");
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    Logger.getLogger(RegisteredProducts.class.getName()).log(Level.SEVERE, null, ex);
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

        lblCliente = new javax.swing.JLabel();
        lblNovaVenda = new javax.swing.JLabel();
        jtxtCliente = new swing.textflield.TextFieldAnimation();

        setBackground(new java.awt.Color(203, 204, 215));

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Pesquise o nome ou ID");
        lblCliente.setToolTipText("");

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Produtos cadastrados");
        lblNovaVenda.setToolTipText("");

        jtxtCliente.setAnimationColor(new java.awt.Color(101, 16, 197));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblNovaVenda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(lblCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(770, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNovaVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(lblCliente)
                .addGap(27, 27, 27)
                .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
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
