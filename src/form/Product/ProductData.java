package form.Product;

import form.MainForm;
import javax.swing.JOptionPane;
import model.Product;
import model.controllers.productController;
import swing.Message;

public class ProductData extends javax.swing.JPanel {
    
    private MainForm main;
    private productController controller;
    private Product product;
    private boolean permission;
    
    public ProductData(MainForm main, Product product, boolean permission) {
        this.main = main;
        this.permission = permission;
        initComponents();
        setOpaque(false);
        jtxtObservacao.setEditable(false);
        controller = new productController(this);
        this.product = product;
        //COLOCANDO OS DADOS NOS CAMPOS
        setData();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblObservacao = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        jtxtObservacao = new javax.swing.JTextPane();
        btnVoltar = new swing.Button();
        btnDeletar = new swing.Button();
        btnAlterar = new swing.Button();
        lblCNOME = new javax.swing.JLabel();
        lblCPRECO = new javax.swing.JLabel();
        lblCCODIGO = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Dados produto");
        lblNovaVenda.setToolTipText("");

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        lblPreco.setBackground(new java.awt.Color(101, 16, 197));
        lblPreco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(83, 84, 81));
        lblPreco.setText("Preço:");
        lblPreco.setToolTipText("");

        lblCodigo.setBackground(new java.awt.Color(101, 16, 197));
        lblCodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(83, 84, 81));
        lblCodigo.setText("Código:");
        lblCodigo.setToolTipText("");

        lblObservacao.setBackground(new java.awt.Color(101, 16, 197));
        lblObservacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblObservacao.setForeground(new java.awt.Color(83, 84, 81));
        lblObservacao.setText("Observação:");
        lblObservacao.setToolTipText("");

        jtxtObservacao.setBackground(new java.awt.Color(255, 255, 255));
        jtxtObservacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscroll.setViewportView(jtxtObservacao);

        btnVoltar.setBackground(new java.awt.Color(101, 16, 197));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(101, 16, 197));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(101, 16, 197));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblCNOME.setBackground(new java.awt.Color(101, 16, 197));
        lblCNOME.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCNOME.setForeground(new java.awt.Color(83, 84, 81));
        lblCNOME.setText("NOME");
        lblCNOME.setToolTipText("");

        lblCPRECO.setBackground(new java.awt.Color(101, 16, 197));
        lblCPRECO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCPRECO.setForeground(new java.awt.Color(83, 84, 81));
        lblCPRECO.setText("PRECO");
        lblCPRECO.setToolTipText("");

        lblCCODIGO.setBackground(new java.awt.Color(101, 16, 197));
        lblCCODIGO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCCODIGO.setForeground(new java.awt.Color(83, 84, 81));
        lblCCODIGO.setText("CODIGO");
        lblCCODIGO.setToolTipText("");

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
                        .addGap(375, 375, 375)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(lblCNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCPRECO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCCODIGO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lblObservacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(322, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(343, 343, 343))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblNovaVenda)
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblCNOME))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(lblCPRECO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblCCODIGO))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblObservacao)
                        .addGap(71, 71, 71)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        main.showForm(new RegisteredProducts(main, permission));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (permission) {
             main.showForm(new AlterProduct(main, product, permission));  
        } else {
            showMessage(false, "Usuário não autorizado para essa função");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        
        if (permission) {
            int a = JOptionPane.showConfirmDialog(null, "Deseja deletar o produto?", "Deletar produto", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                boolean test = controller.deleteProduct(product.getId());
                if (test) {
                    main.showForm(new RegisteredProducts(main, permission));
                }
            } 
        } else {
            showMessage(false, "Usuário não autorizado para essa função");

        }
               
    }//GEN-LAST:event_btnDeletarActionPerformed
    //MÉTODO PARA SETAR OS DADOS NOS CAMPOS
    private void setData (){
        lblCNOME.setText(product.getName());
        lblCCODIGO.setText(product.getCode());
        lblCPRECO.setText(String.format("R$%.2f", product.getPrice()));
        jtxtObservacao.setText(product.getNote());
    }
    
    //MOSTRAR MENSAGENS PARA O USUÁRIO
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAlterar;
    private swing.Button btnDeletar;
    private swing.Button btnVoltar;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextPane jtxtObservacao;
    private javax.swing.JLabel lblCCODIGO;
    private javax.swing.JLabel lblCNOME;
    private javax.swing.JLabel lblCPRECO;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNovaVenda;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblPreco;
    // End of variables declaration//GEN-END:variables
}
