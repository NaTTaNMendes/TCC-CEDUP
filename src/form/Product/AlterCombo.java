package form.Product;

import db.DbException;
import form.MainForm;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Combo;
import model.Product;
import model.controllers.comboController;
import model.dao.ProductDAO;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import swing.Message;

public class AlterCombo extends javax.swing.JPanel {
    
    private MainForm main;
    private Combo combo;
    private comboController controller;
    private boolean permission;
    
    public AlterCombo(MainForm main, Combo combo, boolean permission) {
        initComponents();
        this.combo = combo;
        this.permission = permission;
        controller = new comboController(this);
        setOpaque(false);
        this.main = main;
        setData();
        //POPULANDO O JCOMBOBOX
        ProductDAO dao = new ProductDAO();
        for (Product p: dao.pickAll()){
            combobox.addItem(p);
        } 
        //ACIONANDO A PESQUISA DO JCOMBOBOX
        AutoCompleteDecorator.decorate(combobox); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlterar = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        jtxtPreco = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        lblObs = new javax.swing.JLabel();
        jscrollObs = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        btnAlterar = new swing.Button();
        btnAdicionar = new swing.Button();
        lblProduto = new javax.swing.JLabel();
        btnRemover = new swing.Button();
        btnVoltar = new swing.Button();
        jscrollTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        combobox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(203, 204, 215));

        lblAlterar.setBackground(new java.awt.Color(101, 16, 197));
        lblAlterar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblAlterar.setForeground(new java.awt.Color(101, 16, 197));
        lblAlterar.setText("Alterar combo");
        lblAlterar.setToolTipText("");

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        jtxtNome.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPreco.setBackground(new java.awt.Color(101, 16, 197));
        lblPreco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(83, 84, 81));
        lblPreco.setText("Preço:");
        lblPreco.setToolTipText("");

        jtxtPreco.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPreco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblCodigo.setBackground(new java.awt.Color(101, 16, 197));
        lblCodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(83, 84, 81));
        lblCodigo.setText("Código:");
        lblCodigo.setToolTipText("");

        jtxtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblObs.setBackground(new java.awt.Color(101, 16, 197));
        lblObs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblObs.setForeground(new java.awt.Color(83, 84, 81));
        lblObs.setText("Observação:");
        lblObs.setToolTipText("");

        jtxtObs.setBackground(new java.awt.Color(255, 255, 255));
        jtxtObs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscrollObs.setViewportView(jtxtObs);

        btnAlterar.setBackground(new java.awt.Color(101, 16, 197));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(101, 16, 197));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lblProduto.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto.setText("Produto:");
        lblProduto.setToolTipText("");

        btnRemover.setBackground(new java.awt.Color(101, 16, 197));
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(101, 16, 197));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos"
            }
        ));
        jscrollTable.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblAlterar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jscrollTable)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblNome))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(lblProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtCodigo)
                    .addComponent(jtxtPreco)
                    .addComponent(jtxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jscrollObs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblObs)
                                .addGap(200, 200, 200))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(468, 468, 468))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jscrollObs, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblProduto)
                                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)))
                .addComponent(jscrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        main.showForm(new ComboData(main, combo, permission));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Product p = (Product) combobox.getSelectedItem();
        Object [] data = {p};
        DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
        dtmTable.addRow(data);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (table.getSelectedRow() == -1) {
            showMessage(false, "Selecione um produto");
        } else {
            DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
            dtmTable.removeRow(table.getSelectedRow());
            showMessage(true, "Produto deletado");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
                //COLETA TODOS OS DADOS DA TABELA
                List<Product> p = new ArrayList<>();
                for (int i = 0;i < table.getRowCount(); i++) {
                    p.add((Product) table.getValueAt(i, 0));
                }
                
                String name = jtxtNome.getText();
                String code = jtxtCodigo.getText();
                String note = jtxtObs.getText();
                Double price = Double.parseDouble(jtxtPreco.getText());
                
                //INSERINDO DADOS DO COMBO
                controller.deleteComboAlter(combo.getId());
                controller.insertComboAlter(combo.getId(), name, price, code, note);
                combo = controller.getComboById(combo.getId());
                controller.deleteItens(combo.getId());
                
                //INSERINDO ITENS DO COMBO
                for (int i = 0; i < p.size(); i++) {
                    int quantity = 1;    
                    for (int a = 0; a < p.size();a++){
                        if (p.get(i) == p.get(a)) {
                            quantity++;
                        }
                    }
                    quantity--;
                    controller.insertComboItem(p, combo.getId(), i, quantity);
                }              
                                
            } catch (DbException a) {
                showMessage(false, "Falha ao adicionar o combo");
            } catch (NumberFormatException e) {
                showMessage(false, "Valor inválido");
            }
            
    }//GEN-LAST:event_btnAlterarActionPerformed

    
    //MÉTODO PARA SETAR OS DADOS NOS CAMPOS
    private void setData (){
        jtxtCodigo.setText(combo.getCode());
        jtxtNome.setText(combo.getName());
        jtxtObs.setText(combo.getNote());
        jtxtPreco.setText(combo.getPrice().toString());
        Combo itens = controller.getProducts(combo.getId());
        for (int i = 0; i < itens.getList().size(); i ++) {
            Object [] data = {itens.getList().get(i)};
            int q = controller.getItemQuantity((i+1), combo.getId());
            System.out.println(q + "ITENS DO PRODUTO: " + itens.getList().get(i).getName());
                    
            for (int c = 1; c <= q; c++) {
                DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
                dtmTable.addRow(data);
            }            
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
    private swing.Button btnAdicionar;
    private swing.Button btnAlterar;
    private swing.Button btnRemover;
    private swing.Button btnVoltar;
    private javax.swing.JComboBox<Object> combobox;
    private javax.swing.JScrollPane jscrollObs;
    private javax.swing.JScrollPane jscrollTable;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextPane jtxtObs;
    private javax.swing.JTextField jtxtPreco;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
