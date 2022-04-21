package form.Product;

public class StockForm extends javax.swing.JPanel {

    public StockForm() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCliente4 = new javax.swing.JLabel();
        combobox2 = new swing.Combobox();
        button2 = new swing.Button();
        button3 = new swing.Button();
        lblCliente5 = new javax.swing.JLabel();
        button4 = new swing.Button();
        lblCliente6 = new javax.swing.JLabel();
        button5 = new swing.Button();
        button6 = new swing.Button();
        jtxtQuantidade2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Estoque");
        lblNovaVenda.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Produto", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblCliente4.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente4.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente4.setText("Produtos adicionados:");
        lblCliente4.setToolTipText("");

        combobox2.setLabeText("Selecione");
        combobox2.setLineColor(new java.awt.Color(101, 16, 197));

        button2.setBackground(new java.awt.Color(101, 16, 197));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Adicionar");

        button3.setBackground(new java.awt.Color(101, 16, 197));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Remover");

        lblCliente5.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente5.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente5.setText("Produtos:");
        lblCliente5.setToolTipText("");

        button4.setBackground(new java.awt.Color(101, 16, 197));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Consultar");

        lblCliente6.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente6.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente6.setText("Quantidade:");
        lblCliente6.setToolTipText("");

        button5.setBackground(new java.awt.Color(101, 16, 197));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Remover");

        button6.setBackground(new java.awt.Color(101, 16, 197));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("Adicionar");

        jtxtQuantidade2.setBackground(new java.awt.Color(255, 255, 255));
        jtxtQuantidade2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCliente4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCliente5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNovaVenda)
                        .addGap(979, 979, 979)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblCliente6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtQuantidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNovaVenda)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCliente6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtQuantidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCliente5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lblCliente4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button2;
    private swing.Button button3;
    private swing.Button button4;
    private swing.Button button5;
    private swing.Button button6;
    private swing.Combobox combobox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtQuantidade2;
    private javax.swing.JLabel lblCliente4;
    private javax.swing.JLabel lblCliente5;
    private javax.swing.JLabel lblCliente6;
    private javax.swing.JLabel lblNovaVenda;
    // End of variables declaration//GEN-END:variables
}
