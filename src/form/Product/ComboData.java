package form.Product;

import form.MainForm;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Combo;
import model.controllers.comboController;
import swing.Message;

public class ComboData extends javax.swing.JPanel {

    private MainForm main;
    private Combo combo;
    private comboController controller;
    private boolean permission;
    
    public ComboData(MainForm main, Combo combo, boolean permission) {
        this.main = main;
        this.permission = permission;
        this.combo = combo;
        controller = new comboController(this);
        initComponents();
        setOpaque(false);
        jtxtObs.setEditable(false);
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDados = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblObservacao = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        btnVoltar = new swing.Button();
        lblItens = new javax.swing.JLabel();
        jscrollTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnDeletar = new swing.Button();
        btnAlterar = new swing.Button();
        lblID = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblPreco1 = new javax.swing.JLabel();
        lblCodigo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblDados.setBackground(new java.awt.Color(101, 16, 197));
        lblDados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblDados.setForeground(new java.awt.Color(101, 16, 197));
        lblDados.setText("Dados combo");
        lblDados.setToolTipText("");

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

        jtxtObs.setBackground(new java.awt.Color(255, 255, 255));
        jtxtObs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscroll.setViewportView(jtxtObs);

        btnVoltar.setBackground(new java.awt.Color(101, 16, 197));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblItens.setBackground(new java.awt.Color(101, 16, 197));
        lblItens.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblItens.setForeground(new java.awt.Color(83, 84, 81));
        lblItens.setText("Itens no combo");
        lblItens.setToolTipText("");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jscrollTable.setViewportView(table);

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

        lblID.setBackground(new java.awt.Color(101, 16, 197));
        lblID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(83, 84, 81));
        lblID.setText("ID:");
        lblID.setToolTipText("");

        lblID1.setBackground(new java.awt.Color(101, 16, 197));
        lblID1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblID1.setForeground(new java.awt.Color(83, 84, 81));
        lblID1.setText("ID");
        lblID1.setToolTipText("");

        lblNome1.setBackground(new java.awt.Color(101, 16, 197));
        lblNome1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(83, 84, 81));
        lblNome1.setText("NOME");
        lblNome1.setToolTipText("");

        lblPreco1.setBackground(new java.awt.Color(101, 16, 197));
        lblPreco1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPreco1.setForeground(new java.awt.Color(83, 84, 81));
        lblPreco1.setText("PRECO");
        lblPreco1.setToolTipText("");

        lblCodigo1.setBackground(new java.awt.Color(101, 16, 197));
        lblCodigo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(83, 84, 81));
        lblCodigo1.setText("CODIGO");
        lblCodigo1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscrollTable)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblItens)
                        .addGap(541, 541, 541))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblID)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblNome))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCodigo1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(lblPreco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(lblObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblDados)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(lblNome1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco)
                            .addComponent(lblPreco1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(lblCodigo1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblObservacao)
                            .addGap(32, 32, 32))
                        .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lblItens)
                .addGap(18, 18, 18)
                .addComponent(jscrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        main.showForm(new RegisteredCombos(main, permission));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (permission) {
            main.showForm(new AlterCombo(main, combo, permission));
        } else {
            showMessage(false, "Usuário não autorizado para esta função");
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (permission) {
            int a = JOptionPane.showConfirmDialog(null, "Deseja deletar o combo?", "Deletar combo", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                boolean test = controller.deleteCombo(combo.getId());
                if (test) {
                    main.showForm(new RegisteredCombos(main, permission));
                }
            }
        } else {
            showMessage(false, "Usuário não autorizado para esta função");
        }                
    }//GEN-LAST:event_btnDeletarActionPerformed
    
    //MÉTODO PARA SETAR OS DADOS NOS CAMPOS
    private void setData (){
        lblCodigo1.setText(combo.getCode());
        lblID1.setText(String.valueOf(combo.getId()));
        lblNome1.setText(combo.getName());
        lblPreco1.setText(String.format("R$%.2f", combo.getPrice()));
        jtxtObs.setText(combo.getNote());
        Combo itens = controller.getProducts(combo.getId());
        for (int i = 0; i < itens.getList().size(); i ++) {
            Object [] data = {itens.getList().get(i), controller.getItemQuantity(itens.getList().get(i).getId(), combo.getId())};
            DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
            dtmTable.addRow(data);
        }
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
    private javax.swing.JScrollPane jscrollTable;
    private javax.swing.JTextPane jtxtObs;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblItens;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
