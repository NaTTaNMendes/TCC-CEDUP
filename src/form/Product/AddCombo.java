package form.Product;

import db.DbException;
import form.MainForm;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.controllers.comboController;
import model.dao.ProductDAO;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import swing.Message;

public class AddCombo extends javax.swing.JPanel {
    
    private comboController cController;
    private MainForm main;
    
    public AddCombo(MainForm main) {
        initComponents();
        setOpaque(false);
        cController = new comboController(this);
        this.main = main;
        
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

        jscrollTabela = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jtxtCodigo = new javax.swing.JTextField();
        lblObservacao = new javax.swing.JLabel();
        jscrollObservacao = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        lblAdicionar = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnAdicionar = new swing.Button();
        jtxtNome = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        btnRemover = new swing.Button();
        jtxtPreco = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        btnAddCombo = new swing.Button();

        setBackground(new java.awt.Color(203, 204, 215));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jscrollTabela.setViewportView(table);

        jtxtCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblObservacao.setBackground(new java.awt.Color(101, 16, 197));
        lblObservacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblObservacao.setForeground(new java.awt.Color(83, 84, 81));
        lblObservacao.setText("Observação:");
        lblObservacao.setToolTipText("");

        jtxtObs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscrollObservacao.setViewportView(jtxtObs);

        lblAdicionar.setBackground(new java.awt.Color(101, 16, 197));
        lblAdicionar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblAdicionar.setForeground(new java.awt.Color(101, 16, 197));
        lblAdicionar.setText("Adicionar combo");
        lblAdicionar.setToolTipText("");

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        btnAdicionar.setBackground(new java.awt.Color(101, 16, 197));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jtxtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblProduto.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto.setText("Produto:");
        lblProduto.setToolTipText("");

        lblPreco.setBackground(new java.awt.Color(101, 16, 197));
        lblPreco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(83, 84, 81));
        lblPreco.setText("Preço:");
        lblPreco.setToolTipText("");

        btnRemover.setBackground(new java.awt.Color(101, 16, 197));
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jtxtPreco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblCodigo.setBackground(new java.awt.Color(101, 16, 197));
        lblCodigo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(83, 84, 81));
        lblCodigo.setText("Código:");
        lblCodigo.setToolTipText("");

        combobox.setForeground(new java.awt.Color(51, 51, 51));

        btnAddCombo.setBackground(new java.awt.Color(101, 16, 197));
        btnAddCombo.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCombo.setText("Adicionar combo");
        btnAddCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(846, Short.MAX_VALUE)
                .addComponent(lblObservacao)
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jscrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jscrollTabela)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(lblAdicionar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(89, 89, 89)
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
                                .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lblObservacao)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jscrollObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnAddCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(lblAdicionar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblProduto)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(63, 63, 63)
                    .addComponent(jscrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(83, 83, 83)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    //ADICIONANDO PRODUTO NA TABELA
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Product p = (Product) combobox.getSelectedItem();
        Object [] data = {p};
        DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
        dtmTable.addRow(data);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAddComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddComboActionPerformed
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
                cController.insertCombo(name, price, code, note);
                
                //INSERINDO ITENS DO COMBO
                for (int i = 0; i < p.size(); i++) {
                    int quantity = 1;    
                    for (int a = 0; a < p.size();a++){
                        if (p.get(i) == p.get(a)) {
                            quantity++;
                        }
                    }
                    quantity--;
                    cController.insertComboItem(p, cController.getComboByName(name).getId(), i, quantity);
                }
                
                
            } catch (DbException a) {
                showMessage(false, "Falha ao adicionar o combo");
            } catch (NumberFormatException e) {
                showMessage(false, "Valor inválido");
            }
            
    }//GEN-LAST:event_btnAddComboActionPerformed
 
    //MÉTODO PARA REMOVER UM PRODUTO DA TABLE
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        if (table.getSelectedRow() == -1) {
            showMessage(false, "Selecione um produto");
        } else {
            DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
            dtmTable.removeRow(table.getSelectedRow());
            showMessage(true, "Produto deletado");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed
  
    //MÉTODO PARA MOSTRAR MENSAGENS
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAddCombo;
    private swing.Button btnAdicionar;
    private swing.Button btnRemover;
    private javax.swing.JComboBox<Object> combobox;
    private javax.swing.JScrollPane jscrollObservacao;
    private javax.swing.JScrollPane jscrollTabela;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextPane jtxtObs;
    private javax.swing.JTextField jtxtPreco;
    private javax.swing.JLabel lblAdicionar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObservacao;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
