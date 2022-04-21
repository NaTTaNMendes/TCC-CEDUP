package form.History;

public class SellHistory extends javax.swing.JPanel {

    public SellHistory() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jtxtQuantidade = new javax.swing.JTextField();
        lblCliente1 = new javax.swing.JLabel();
        jtxtQuantidade1 = new javax.swing.JTextField();
        lblCliente2 = new javax.swing.JLabel();
        button1 = new swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCliente3 = new javax.swing.JLabel();
        combobox1 = new swing.Combobox();
        lblCliente4 = new javax.swing.JLabel();
        combobox2 = new swing.Combobox();
        button2 = new swing.Button();
        button3 = new swing.Button();
        lblCliente5 = new javax.swing.JLabel();
        jtxtCliente = new swing.textflield.TextFieldAnimation();
        lblCliente6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Histórico de vendas");
        lblNovaVenda.setToolTipText("");

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Data inicial:");
        lblCliente.setToolTipText("");

        jtxtQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        jtxtQuantidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblCliente1.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente1.setText("Data final:");
        lblCliente1.setToolTipText("");

        jtxtQuantidade1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtQuantidade1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblCliente2.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente2.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente2.setText("Produtos adicionados:");
        lblCliente2.setToolTipText("");

        button1.setBackground(new java.awt.Color(101, 16, 197));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Consultar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Produtos", "Método pagamento", "Vendedor", "Promoção", "Cliente"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblCliente3.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente3.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente3.setText("Vendedor:");
        lblCliente3.setToolTipText("");

        combobox1.setLabeText("Selecione");
        combobox1.setLineColor(new java.awt.Color(101, 16, 197));

        lblCliente4.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente4.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente4.setText("Produtos:");
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
        lblCliente5.setText("Cliente:");
        lblCliente5.setToolTipText("");

        jtxtCliente.setAnimationColor(new java.awt.Color(101, 16, 197));

        lblCliente6.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente6.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente6.setText("PRODUTO X");
        lblCliente6.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNovaVenda)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCliente2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCliente6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 947, Short.MAX_VALUE)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCliente5)
                                    .addComponent(lblCliente3))
                                .addGap(18, 18, 18)
                                .addComponent(jtxtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCliente1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCliente4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNovaVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(jtxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCliente1)
                            .addComponent(jtxtQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCliente3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCliente4)
                                .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente5)
                            .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente2)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCliente6))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button3;
    private swing.Combobox combobox1;
    private swing.Combobox combobox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private swing.textflield.TextFieldAnimation jtxtCliente;
    private javax.swing.JTextField jtxtQuantidade;
    private javax.swing.JTextField jtxtQuantidade1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblCliente3;
    private javax.swing.JLabel lblCliente4;
    private javax.swing.JLabel lblCliente5;
    private javax.swing.JLabel lblCliente6;
    private javax.swing.JLabel lblNovaVenda;
    // End of variables declaration//GEN-END:variables
}
