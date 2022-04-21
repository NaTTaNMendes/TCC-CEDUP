package form.Sell;

import form.MainForm;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.Combo;
import model.Employee;
import model.PSell;
import model.Product;
import model.controllers.sellController;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import swing.Message;

public class NewSell extends javax.swing.JPanel {
    
    private MainForm main;
    private sellController controller;
    private Double total;
    private Employee emp;
    
    public NewSell(MainForm main, Employee emp) {
        initComponents();
        controller = new sellController(this);
        this.emp = emp;
        setOpaque(false);
        this.main = main;
        lblValorTotal1.setText("0.00");
        
        for (Combo b: controller.pickCombos()) {
            combobocCombo.addItem(b);
        }
        
        for (Product p: controller.pickProducts()) {
            comboboxProduto.addItem(p);
        }
        
        for (Client c: controller.pickClients()) {
            comboboxCliente.addItem(c);
        }
        
        AutoCompleteDecorator.decorate(combobocCombo);
        AutoCompleteDecorator.decorate(comboboxCliente);
        AutoCompleteDecorator.decorate(comboboxProduto);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        lblCombo = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        lblQuantidadeP = new javax.swing.JLabel();
        jtxtQuantidadeP = new javax.swing.JTextField();
        jscroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblObs = new javax.swing.JLabel();
        jscrollObs = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        btnRealizarVenda = new swing.Button();
        lblProduto = new javax.swing.JLabel();
        comboboxCliente = new javax.swing.JComboBox<>();
        combobocCombo = new javax.swing.JComboBox<>();
        comboboxProduto = new javax.swing.JComboBox<>();
        lblQuantidadeCombo = new javax.swing.JLabel();
        jtxtQuantidadeCombo = new javax.swing.JTextField();
        btnAddCombo = new swing.Button();
        btnAddProduto = new swing.Button();
        lblValorTotal1 = new javax.swing.JLabel();
        btnDeletar = new swing.Button();

        setBackground(new java.awt.Color(203, 204, 215));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Nova Venda");
        lblNovaVenda.setToolTipText("");

        lblCombo.setBackground(new java.awt.Color(101, 16, 197));
        lblCombo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCombo.setForeground(new java.awt.Color(83, 84, 81));
        lblCombo.setText("Combo:");
        lblCombo.setToolTipText("");

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Cliente:");
        lblCliente.setToolTipText("");

        lblValorTotal.setBackground(new java.awt.Color(101, 16, 197));
        lblValorTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(83, 84, 81));
        lblValorTotal.setText("Valor total: R$");
        lblValorTotal.setToolTipText("");

        lblQuantidadeP.setBackground(new java.awt.Color(101, 16, 197));
        lblQuantidadeP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblQuantidadeP.setForeground(new java.awt.Color(83, 84, 81));
        lblQuantidadeP.setText("Quantidade:");
        lblQuantidadeP.setToolTipText("");

        jtxtQuantidadeP.setBackground(new java.awt.Color(255, 255, 255));
        jtxtQuantidadeP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        jscroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jscroll.setFocusCycleRoot(true);

        table.setForeground(new java.awt.Color(83, 84, 81));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nome", "Quantidade", "Preço", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(153, 153, 255));
        table.getTableHeader().setReorderingAllowed(false);
        jscroll.setViewportView(table);
        table.getAccessibleContext().setAccessibleDescription("");

        lblObs.setBackground(new java.awt.Color(101, 16, 197));
        lblObs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblObs.setForeground(new java.awt.Color(83, 84, 81));
        lblObs.setText("Observação:");
        lblObs.setToolTipText("");

        jtxtObs.setBackground(new java.awt.Color(255, 255, 255));
        jtxtObs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscrollObs.setViewportView(jtxtObs);

        btnRealizarVenda.setBackground(new java.awt.Color(101, 16, 197));
        btnRealizarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarVenda.setText("Realizar Venda");
        btnRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVendaActionPerformed(evt);
            }
        });

        lblProduto.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto.setText("Produto:");
        lblProduto.setToolTipText("");

        lblQuantidadeCombo.setBackground(new java.awt.Color(101, 16, 197));
        lblQuantidadeCombo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblQuantidadeCombo.setForeground(new java.awt.Color(83, 84, 81));
        lblQuantidadeCombo.setText("Quantidade:");
        lblQuantidadeCombo.setToolTipText("");

        jtxtQuantidadeCombo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtQuantidadeCombo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        btnAddCombo.setBackground(new java.awt.Color(101, 16, 197));
        btnAddCombo.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCombo.setText("Adicionar");
        btnAddCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddComboActionPerformed(evt);
            }
        });

        btnAddProduto.setBackground(new java.awt.Color(101, 16, 197));
        btnAddProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduto.setText("Adicionar");
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        lblValorTotal1.setBackground(new java.awt.Color(101, 16, 197));
        lblValorTotal1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorTotal1.setForeground(new java.awt.Color(83, 84, 81));
        lblValorTotal1.setText("Valor total: R$");
        lblValorTotal1.setToolTipText("");

        btnDeletar.setBackground(new java.awt.Color(101, 16, 197));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar item");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jscroll)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblNovaVenda)
                        .addGap(0, 1041, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboboxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboboxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCombo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combobocCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantidadeCombo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtQuantidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantidadeP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtQuantidadeP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(lblObs))
                            .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)))
                .addGap(18, 18, 18)
                .addComponent(jscrollObs, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblNovaVenda)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(comboboxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCombo)
                            .addComponent(combobocCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtQuantidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantidadeCombo)
                            .addComponent(btnAddCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObs))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProduto)
                            .addComponent(comboboxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtQuantidadeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantidadeP)
                            .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addComponent(jscrollObs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorTotal)
                    .addComponent(lblValorTotal1))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVendaActionPerformed
        
        if (table.getRowCount() != 0) {
            PSell sell = new PSell();
            for (int i = 0; i < table.getRowCount(); i++) {
                if (table.getValueAt(i, 0) == "Combo") {
                    Combo c = new Combo();
                    int id = controller.getComboId((String) table.getValueAt(i, 1));
                    c.setId(id);
                    c.setName((String) table.getValueAt(i, 1));
                    c.setPrice((Double) table.getValueAt(i, 3));
                    sell.addCombos(c, (int) table.getValueAt(i, 2));

                } else {
                    Product p = new Product();
                    int id = controller.getProductId((String) table.getValueAt(i, 1));
                    p.setId(id);
                    p.setName((String) table.getValueAt(i, 1));
                    p.setPrice((Double) table.getValueAt(i, 3));
                    sell.addProducts(p, (int) table.getValueAt(i, 2));
                }
            }
        sell.setClient((Client) comboboxCliente.getSelectedItem());
        sell.setEmp(emp);
        sell.setNote(jtxtObs.getText());
        sell.setTotal(total);                
        main.showForm(new Payment(main, 1, sell));
        
        } else {
            showMessage(false, "Nenhum item adicionado");
        } 
        
        
    }//GEN-LAST:event_btnRealizarVendaActionPerformed
    
    private void btnAddComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddComboActionPerformed
        // TODO add your handling code here:
        try {
            Combo c = (Combo) combobocCombo.getSelectedItem();
            int quantidade = Integer.parseInt(jtxtQuantidadeCombo.getText());            
            if (quantidade <= 0) {
                throw new NumberFormatException();
            }
            boolean test = false;
            
            for (int i = 0; i < table.getRowCount(); i++) {
                if (c.getName() == table.getValueAt(i, 1)) {
                    table.setValueAt((int)table.getValueAt(i, 2) + quantidade, i, 2);
                    
                    quantidade = (int) table.getValueAt(i, 2);                    
                    Double value = (Double) table.getValueAt(i, 3);
                    Double result = calculateSubtotal(quantidade, value);
                    
                    table.setValueAt(result, i, 4);
                    test = true;
                }
            }
            if (test == false) {
                Object [] data = {"Combo", c.getName(), quantidade, c.getPrice(), calculateSubtotal(quantidade, c.getPrice())};
                DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
                dtmTable.addRow(data);
            }            
            calculateTotal();
        } catch (NumberFormatException e) {
            showMessage(false, "Quantidade inválida");
        }
        
    }//GEN-LAST:event_btnAddComboActionPerformed
    
    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        // TODO add your handling code here:
        try {
            Product p = (Product) comboboxProduto.getSelectedItem();
            int quantidade = Integer.parseInt(jtxtQuantidadeP.getText());
            if (quantidade <= 0) {
                throw new NumberFormatException();
            }
            boolean test = false;
            
            for (int i = 0; i < table.getRowCount(); i++) {
                if (p.getName() == table.getValueAt(i, 1)) {
                    table.setValueAt((int)table.getValueAt(i, 2) + quantidade, i, 2);
                    
                    quantidade = (int) table.getValueAt(i, 2);                    
                    Double value = (Double) table.getValueAt(i, 3);
                    Double result = calculateSubtotal(quantidade, value);
                    
                    table.setValueAt(result, i, 4);
                    test = true;
                }
            }
            if (test == false) {
                Object [] data = {"Produto", p.getName(), quantidade, p.getPrice(), calculateSubtotal(quantidade, p.getPrice())};
                DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
                dtmTable.addRow(data);
            }            
            calculateTotal();
        } catch (NumberFormatException e) {
            showMessage(false, "Quantidade inválida");
        }
    }//GEN-LAST:event_btnAddProdutoActionPerformed
    
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        if (table.getSelectedRow() == -1) {
            showMessage(false, "Selecione um item");
        } else {
            DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
            dtmTable.removeRow(table.getSelectedRow());
            showMessage(true, "Item deletado");
        }
        calculateTotal();
    }//GEN-LAST:event_btnDeletarActionPerformed
    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }
    
    public Double calculateSubtotal(int quantity, Double price) {
        return quantity * price;
    }
    
    public void calculateTotal() {
        Double t = 0.0;
        for (int i = 0; i < table.getRowCount(); i++) {
            t = t + (double) table.getValueAt(i, 4);
        }
        total = t;
        lblValorTotal1.setText(String.format("%.2f", total));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAddCombo;
    private swing.Button btnAddProduto;
    private swing.Button btnDeletar;
    private swing.Button btnRealizarVenda;
    private javax.swing.JComboBox<Object> combobocCombo;
    private javax.swing.JComboBox<Object> comboboxCliente;
    private javax.swing.JComboBox<Object> comboboxProduto;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JScrollPane jscrollObs;
    private javax.swing.JTextPane jtxtObs;
    private javax.swing.JTextField jtxtQuantidadeCombo;
    private javax.swing.JTextField jtxtQuantidadeP;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCombo;
    private javax.swing.JLabel lblNovaVenda;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidadeCombo;
    private javax.swing.JLabel lblQuantidadeP;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblValorTotal1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
