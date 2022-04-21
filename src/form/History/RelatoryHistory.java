package form.History;

public class RelatoryHistory extends javax.swing.JPanel {

    public RelatoryHistory() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblCliente1 = new javax.swing.JLabel();
        jtxtQuantidade = new javax.swing.JTextField();
        jtxtQuantidade1 = new javax.swing.JTextField();
        button5 = new swing.Button();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Gerador de relatórios");
        lblNovaVenda.setToolTipText("");

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Data inicial:");
        lblCliente.setToolTipText("");

        lblCliente1.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente1.setText("Data final:");
        lblCliente1.setToolTipText("");

        jtxtQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        jtxtQuantidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        jtxtQuantidade1.setBackground(new java.awt.Color(255, 255, 255));
        jtxtQuantidade1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        button5.setBackground(new java.awt.Color(101, 16, 197));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Gerar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNovaVenda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCliente)
                                .addGap(12, 12, 12)
                                .addComponent(jtxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(lblCliente1)
                                .addGap(12, 12, 12)
                                .addComponent(jtxtQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(377, 377, 377)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblNovaVenda)
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(jtxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente1)
                    .addComponent(jtxtQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button5;
    private javax.swing.JTextField jtxtQuantidade;
    private javax.swing.JTextField jtxtQuantidade1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblNovaVenda;
    // End of variables declaration//GEN-END:variables
}
