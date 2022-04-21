package form.Product;

import form.MainForm;
import java.util.Scanner;
import model.controllers.productController;
import swing.Message;

public class AddProduct extends javax.swing.JPanel {
    
    private productController controller;
    private MainForm main;
    
    //INICIALIZANDO CLASSE
    public AddProduct(MainForm main) {
        initComponents();
        jtxtObservacao.removeAll();
        setOpaque(false);
        controller = new productController(this);
        this.main = main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdicionarProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        jtxtPreco = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        lblObservacao = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        jtxtObservacao = new javax.swing.JTextPane();
        btnAddProduto = new swing.Button();

        setBackground(new java.awt.Color(203, 204, 215));

        lblAdicionarProduto.setBackground(new java.awt.Color(101, 16, 197));
        lblAdicionarProduto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblAdicionarProduto.setForeground(new java.awt.Color(101, 16, 197));
        lblAdicionarProduto.setText("Adicionar produto");
        lblAdicionarProduto.setToolTipText("");

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        jtxtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPreco.setBackground(new java.awt.Color(101, 16, 197));
        lblPreco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(83, 84, 81));
        lblPreco.setText("Preço:");
        lblPreco.setToolTipText("");

        jtxtPreco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblCodigo.setBackground(new java.awt.Color(101, 16, 197));
        lblCodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(83, 84, 81));
        lblCodigo.setText("Código:");
        lblCodigo.setToolTipText("");

        jtxtCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblObservacao.setBackground(new java.awt.Color(101, 16, 197));
        lblObservacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblObservacao.setForeground(new java.awt.Color(83, 84, 81));
        lblObservacao.setText("Observação:");
        lblObservacao.setToolTipText("");

        jtxtObservacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscroll.setViewportView(jtxtObservacao);

        btnAddProduto.setBackground(new java.awt.Color(101, 16, 197));
        btnAddProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduto.setText("Adicionar Produto");
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblAdicionarProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblNome))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtCodigo)
                            .addComponent(jtxtPreco)
                            .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lblObservacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblAdicionarProduto)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(jtxtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblObservacao)
                        .addGap(71, 71, 71)))
                .addGap(36, 36, 36)
                .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        try {
            
            //COLETANDO DADOS
            String name = jtxtNome.getText();
            Double price = Double.parseDouble(jtxtPreco.getText());
            String code = jtxtCodigo.getText();
            String note = jtxtObservacao.getText();
                         
            //REALIZANDO VERIFICAÇÕES
            if (name.isEmpty()) {
                showMessage(false, "Nome inválido");
            } else if (price < 0 || price == null) {
                throw new NumberFormatException();
            } else if (code.isEmpty()) {
                showMessage(false, "Código inválido");
            } else {
                //INICIANDO CONTROLLER
                controller.addProduct(name, price, code, note);
            }
        } catch (NumberFormatException e) {
            showMessage(false, "Preço inválido");
        } 
    }//GEN-LAST:event_btnAddProdutoActionPerformed
    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAddProduto;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextPane jtxtObservacao;
    private javax.swing.JTextField jtxtPreco;
    private javax.swing.JLabel lblAdicionarProduto;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblPreco;
    // End of variables declaration//GEN-END:variables
}
