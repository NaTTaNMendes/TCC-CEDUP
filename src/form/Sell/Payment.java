package form.Sell;

import form.MainForm;
import form.MainMenu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PSell;
import model.Ticket;
import model.controllers.sellController;
import swing.Message;

public class Payment extends javax.swing.JPanel {
    
    private MainForm main;
    private int screen;
    private PSell sell;
    private Double pago;
    private Double troco;
    private sellController controller;
    private List<Ticket> tickets = new ArrayList<>();
    
    public Payment(MainForm main, int screen, PSell sell) {
        initComponents();
        this.main = main;
        controller = new sellController(this);
        this.sell = sell;
        this.screen = screen;
        setData();
        initTable();
    }
     
    public Payment(MainForm main, int screen, PSell sell, List<Ticket> tickets) {
        initComponents();
        this.main = main;
        controller = new sellController(this);
        this.sell = sell;
        this.tickets = tickets;
        this.screen = screen;
        this.screen = screen;
        setData();
        initTable();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPagamento = new javax.swing.JLabel();
        lblForma = new javax.swing.JLabel();
        lblTroco = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        lblValorRecebido = new javax.swing.JLabel();
        jtxtValor = new javax.swing.JTextField();
        btnAplicar = new swing.Button();
        btnFinalizar = new swing.Button();
        btnVoltar = new swing.Button();
        combobox = new javax.swing.JComboBox<>();
        lblVendedor1 = new javax.swing.JLabel();
        lblCliente1 = new javax.swing.JLabel();
        lblValorTotal1 = new javax.swing.JLabel();
        lblValorTotal2 = new javax.swing.JLabel();
        lblTroco1 = new javax.swing.JLabel();
        lblTroco2 = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(203, 204, 215));

        lblPagamento.setBackground(new java.awt.Color(101, 16, 197));
        lblPagamento.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblPagamento.setForeground(new java.awt.Color(101, 16, 197));
        lblPagamento.setText("Pagamento");
        lblPagamento.setToolTipText("");

        lblForma.setBackground(new java.awt.Color(101, 16, 197));
        lblForma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblForma.setForeground(new java.awt.Color(83, 84, 81));
        lblForma.setText("Forma de pagamento:");
        lblForma.setToolTipText("");

        lblTroco.setBackground(new java.awt.Color(101, 16, 197));
        lblTroco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTroco.setForeground(new java.awt.Color(83, 84, 81));
        lblTroco.setText("Troco:");
        lblTroco.setToolTipText("");

        lblProdutos.setBackground(new java.awt.Color(101, 16, 197));
        lblProdutos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(83, 84, 81));
        lblProdutos.setText("Produtos");
        lblProdutos.setToolTipText("");

        lblValorTotal.setBackground(new java.awt.Color(101, 16, 197));
        lblValorTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(83, 84, 81));
        lblValorTotal.setText("Valor total:");
        lblValorTotal.setToolTipText("");

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Cliente:");
        lblCliente.setToolTipText("");

        lblVendedor.setBackground(new java.awt.Color(101, 16, 197));
        lblVendedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVendedor.setForeground(new java.awt.Color(83, 84, 81));
        lblVendedor.setText("Vendedor:");
        lblVendedor.setToolTipText("");

        lblValorRecebido.setBackground(new java.awt.Color(101, 16, 197));
        lblValorRecebido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorRecebido.setForeground(new java.awt.Color(83, 84, 81));
        lblValorRecebido.setText("Valor recebido:");
        lblValorRecebido.setToolTipText("");

        jtxtValor.setBackground(new java.awt.Color(255, 255, 255));
        jtxtValor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        btnAplicar.setBackground(new java.awt.Color(101, 16, 197));
        btnAplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        btnFinalizar.setBackground(new java.awt.Color(101, 16, 197));
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar venda");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
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

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Crédito", "Débito", "Ticket" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        lblVendedor1.setBackground(new java.awt.Color(101, 16, 197));
        lblVendedor1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVendedor1.setForeground(new java.awt.Color(83, 84, 81));
        lblVendedor1.setText("Vendedor:");
        lblVendedor1.setToolTipText("");

        lblCliente1.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente1.setText("Cliente:");
        lblCliente1.setToolTipText("");

        lblValorTotal1.setBackground(new java.awt.Color(101, 16, 197));
        lblValorTotal1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorTotal1.setForeground(new java.awt.Color(83, 84, 81));
        lblValorTotal1.setText("R$");
        lblValorTotal1.setToolTipText("");

        lblValorTotal2.setBackground(new java.awt.Color(101, 16, 197));
        lblValorTotal2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValorTotal2.setForeground(new java.awt.Color(83, 84, 81));
        lblValorTotal2.setText("R$");
        lblValorTotal2.setToolTipText("");

        lblTroco1.setBackground(new java.awt.Color(101, 16, 197));
        lblTroco1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTroco1.setForeground(new java.awt.Color(83, 84, 81));
        lblTroco1.setText("R$");
        lblTroco1.setToolTipText("");

        lblTroco2.setBackground(new java.awt.Color(101, 16, 197));
        lblTroco2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTroco2.setForeground(new java.awt.Color(83, 84, 81));
        lblTroco2.setText("R$");
        lblTroco2.setToolTipText("");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblPagamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jscroll)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblForma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTroco)
                            .addComponent(lblValorTotal)
                            .addComponent(lblCliente)
                            .addComponent(lblVendedor)
                            .addComponent(lblValorRecebido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdutos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxtValor)
                                .addComponent(lblVendedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblValorTotal1)
                                    .addGap(4, 4, 4)
                                    .addComponent(lblValorTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTroco1)
                                    .addGap(4, 4, 4)
                                    .addComponent(lblTroco2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblPagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblForma)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorRecebido)
                    .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor)
                    .addComponent(lblVendedor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(lblCliente1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorTotal)
                    .addComponent(lblValorTotal1)
                    .addComponent(lblValorTotal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTroco)
                    .addComponent(lblTroco1)
                    .addComponent(lblTroco2))
                .addGap(32, 32, 32)
                .addComponent(lblProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        if (screen == 1) {
            main.showForm(new NewSell(main, sell.getEmp()));
        } else {
            main.showForm(new ChairSelection(main, tickets, screen, sell));
        }
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
        if (combobox.getSelectedItem() != "Dinheiro") {
            jtxtValor.setEnabled(false);
            btnAplicar.setEnabled(false);
            setData();
        } else {
            jtxtValor.setEnabled(true);
            btnAplicar.setEnabled(true);
        }
    }//GEN-LAST:event_comboboxActionPerformed

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        // TODO add your handling code here:
        try {
            pago = Double.parseDouble(jtxtValor.getText());
            if (pago <= 0 || pago < sell.getTotal()) {
                throw new NumberFormatException();
            }
            if (jtxtValor.getText() != null) {
                troco = pago - sell.getTotal();
                lblTroco2.setText(String.format("%.2f", troco));
            }
        } catch (NumberFormatException e) {
            showMessage(false, "Valor inválido");
        }
        
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        boolean test = true;
        if (combobox.getSelectedItem() == "Dinheiro") {
            if (jtxtValor.getText().isEmpty()) {
                showMessage(false, "Insira o valor");
                test = false;
            }
            if (troco == null) {
                showMessage(false, "Insira o valor");
                test = false;
            }
        }
        if (test) {
            int payment;
            if (combobox.getSelectedItem() == "Dinheiro") {
                payment = 0;
            } else if (combobox.getSelectedItem() == "Crédito") {
                payment = 1;
            } else if (combobox.getSelectedItem() == "Débito") {
                payment = 2;
            } else {
                payment = 3;
            }
            sell.setPaymentMethod(payment);
            sell.setTickets(tickets);
            if (jtxtValor.isEnabled()) {            
                sell.setMoneyReceived(pago);            
            }
            controller.insertSell(sell);
            if (tickets.isEmpty() == false) {
                controller.updateChair(tickets);
                controller.insertTickets(tickets);
            }
            
            main.showForm(new MainMenu());
        }
        
    }//GEN-LAST:event_btnFinalizarActionPerformed
    
    public void setData() {
        lblCliente1.setText(sell.getClient().getName());
        lblTroco2.setText("0.00");
        lblValorTotal2.setText(String.format("%.2f", sell.getTotal()));
        lblVendedor1.setText(sell.getEmp().getName());              
    }
    
    public void initTable () {
       for (int i = 0; i < sell.getCombos().size(); i ++) {
            Object [] data = {"Combo", sell.getCombos().get(i).getCombo().getName(), sell.getCombos().get(i).getQuantity(), sell.getCombos().get(i).getCombo().getPrice(), calculateSubtotal(sell.getCombos().get(i).getQuantity(), sell.getCombos().get(i).getCombo().getPrice())};                   
            DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
            dtmTable.addRow(data);                       
        }
       
       for (int i = 0; i < sell.getProducts().size(); i++) {
           Object [] data = {"Produto", sell.getProducts().get(i).getProduct().getName(), sell.getProducts().get(i).getQuantity(), sell.getProducts().get(i).getProduct().getPrice(), calculateSubtotal(sell.getProducts().get(i).getQuantity(),sell.getProducts().get(i).getProduct().getPrice())};
           DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
           dtmTable.addRow(data);
       }
       
       if (!tickets.isEmpty()){
            for (int i = 0; i < tickets.size(); i++) {
               String ticketT = "";
               switch(tickets.get(i).getTicketType()) {
                    case 0: ticketT = "INTEIRA";
                            break;
                    case 1: ticketT = "MEIA";
                            break;
                    case 2: ticketT = "VIP";
                            break;
               }
               Object [] data = {"Ticket", ticketT, 1, tickets.get(i).getPrice(), tickets.get(i).getPrice()};
               DefaultTableModel dtmTable = (DefaultTableModel) table.getModel();
               dtmTable.addRow(data);
           }
       }
       
    }
    
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAplicar;
    private swing.Button btnFinalizar;
    private swing.Button btnVoltar;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextField jtxtValor;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblForma;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblTroco;
    private javax.swing.JLabel lblTroco1;
    private javax.swing.JLabel lblTroco2;
    private javax.swing.JLabel lblValorRecebido;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblValorTotal1;
    private javax.swing.JLabel lblValorTotal2;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JLabel lblVendedor1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
