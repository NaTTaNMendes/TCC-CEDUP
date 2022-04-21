package form.Sell;

import form.MainForm;
import java.util.ArrayList;
import java.util.List;
import model.Client;
import model.Employee;
import model.FilmHall;
import model.Movie;
import model.PSell;
import model.Session;
import model.Ticket;
import model.controllers.sellController;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import swing.Message;

public class TicketSell extends javax.swing.JPanel {
    
    private MainForm main;
    private sellController controller;
    private Double total;
    Double precoVip = 25.0;
    Double precoNormal = 18.0;
    Double precoMeia = 9.0;
    private PSell psell = new PSell();
    private Employee emp;
    
    public TicketSell(MainForm main, Employee emp) {
        initComponents();
        this.main = main;
        this.emp = emp;
        controller = new sellController(this);
        
        for (Client c: controller.pickClients()){
            comboboxCliente.addItem(c);
        }
        AutoCompleteDecorator.decorate(comboboxCliente);
        
        for (Movie m: controller.pickMovies()) {
            comboboxFilme.addItem(m);
            }
        comboboxSala.setEnabled(false);
        btnSelecionarSala.setEnabled(false);
        comboboxSessao.setEnabled(false);
        lblTotal1.setText("0.00");
        comboboxVIP.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVenda = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblSelecione = new javax.swing.JLabel();
        lblInteira = new javax.swing.JLabel();
        lblMeia = new javax.swing.JLabel();
        lblVIP = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnLimpar = new swing.Button();
        btnCheckout = new swing.Button();
        lblFilme = new javax.swing.JLabel();
        btnSelecionarFilme = new swing.Button();
        lblSala = new javax.swing.JLabel();
        btnSelecionarSala = new swing.Button();
        lblSessao = new javax.swing.JLabel();
        comboboxCliente = new javax.swing.JComboBox<>();
        comboboxFilme = new javax.swing.JComboBox<>();
        comboboxSala = new javax.swing.JComboBox<>();
        comboboxSessao = new javax.swing.JComboBox<>();
        comboboxInteira = new javax.swing.JComboBox<>();
        comboboxMeia = new javax.swing.JComboBox<>();
        comboboxVIP = new javax.swing.JComboBox<>();
        lblTotal1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblVenda.setText("Venda de ingressos");
        lblVenda.setToolTipText("");

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Cliente:");
        lblCliente.setToolTipText("");

        lblSelecione.setBackground(new java.awt.Color(101, 16, 197));
        lblSelecione.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSelecione.setForeground(new java.awt.Color(83, 84, 81));
        lblSelecione.setText("Selecione os ingressos:");
        lblSelecione.setToolTipText("");

        lblInteira.setBackground(new java.awt.Color(101, 16, 197));
        lblInteira.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblInteira.setForeground(new java.awt.Color(83, 84, 81));
        lblInteira.setText("Inteira:");
        lblInteira.setToolTipText("");

        lblMeia.setBackground(new java.awt.Color(101, 16, 197));
        lblMeia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMeia.setForeground(new java.awt.Color(83, 84, 81));
        lblMeia.setText("Meia:");
        lblMeia.setToolTipText("");

        lblVIP.setBackground(new java.awt.Color(101, 16, 197));
        lblVIP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVIP.setForeground(new java.awt.Color(83, 84, 81));
        lblVIP.setText("VIP:");
        lblVIP.setToolTipText("");

        lblTotal.setBackground(new java.awt.Color(101, 16, 197));
        lblTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(83, 84, 81));
        lblTotal.setText("Total: R$");
        lblTotal.setToolTipText("");

        btnLimpar.setBackground(new java.awt.Color(101, 16, 197));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCheckout.setBackground(new java.awt.Color(101, 16, 197));
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("Checkout");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        lblFilme.setBackground(new java.awt.Color(101, 16, 197));
        lblFilme.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFilme.setForeground(new java.awt.Color(83, 84, 81));
        lblFilme.setText("Selecione o filme:");
        lblFilme.setToolTipText("");

        btnSelecionarFilme.setBackground(new java.awt.Color(101, 16, 197));
        btnSelecionarFilme.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarFilme.setText("Selecionar");
        btnSelecionarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarFilmeActionPerformed(evt);
            }
        });

        lblSala.setBackground(new java.awt.Color(101, 16, 197));
        lblSala.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSala.setForeground(new java.awt.Color(83, 84, 81));
        lblSala.setText("Selecione a sala:");
        lblSala.setToolTipText("");

        btnSelecionarSala.setBackground(new java.awt.Color(101, 16, 197));
        btnSelecionarSala.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarSala.setText("Selecionar");
        btnSelecionarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarSalaActionPerformed(evt);
            }
        });

        lblSessao.setBackground(new java.awt.Color(101, 16, 197));
        lblSessao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSessao.setForeground(new java.awt.Color(83, 84, 81));
        lblSessao.setText("Selecione a sessão:");
        lblSessao.setToolTipText("");

        comboboxInteira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboboxInteira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxInteiraActionPerformed(evt);
            }
        });

        comboboxMeia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboboxMeia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxMeiaActionPerformed(evt);
            }
        });

        comboboxVIP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboboxVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxVIPActionPerformed(evt);
            }
        });

        lblTotal1.setBackground(new java.awt.Color(101, 16, 197));
        lblTotal1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(83, 84, 81));
        lblTotal1.setText("Total:");
        lblTotal1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSala)
                                .addGap(4, 4, 4)
                                .addComponent(comboboxSala, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelecionarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSessao)
                                .addGap(4, 4, 4)
                                .addComponent(comboboxSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboboxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFilme)
                                        .addGap(4, 4, 4)
                                        .addComponent(comboboxFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelecionarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblInteira)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboboxInteira, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMeia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboboxMeia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblVIP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboboxVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSelecione)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblVenda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblVenda)
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCliente)
                            .addComponent(comboboxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilme)
                            .addComponent(btnSelecionarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSala)
                            .addComponent(btnSelecionarSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSessao)
                            .addComponent(comboboxSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelecione)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInteira)
                            .addComponent(comboboxInteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMeia)
                            .addComponent(comboboxMeia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVIP)
                            .addComponent(comboboxVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotal1))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarFilmeActionPerformed
        // TODO add your handling code here:
        comboboxSala.removeAllItems();
        comboboxSessao.removeAllItems();
        comboboxSala.setEnabled(false);
        btnSelecionarSala.setEnabled(false);
        comboboxSessao.setEnabled(false);
        
        for (FilmHall h: controller.pickHallsByMovie((Movie) comboboxFilme.getSelectedItem())) {
            comboboxSala.addItem(h);
        }        
        btnSelecionarSala.setEnabled(true);
        comboboxSala.setEnabled(true);
                
    }//GEN-LAST:event_btnSelecionarFilmeActionPerformed

    private void btnSelecionarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarSalaActionPerformed
        // TODO add your handling code here:        
        comboboxSessao.removeAllItems();
        
        if (comboboxSala.getItemCount() != 0) {
            for (Session s:  controller.pickSessions((Movie)comboboxFilme.getSelectedItem(), (FilmHall)comboboxSala.getSelectedItem())) {
                comboboxSessao.addItem(s);
            }
            comboboxSessao.setEnabled(true);
        } else {
            showMessage(false, "Nenhuma sala disponível");
        }
        
        
    }//GEN-LAST:event_btnSelecionarSalaActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
        
        Client client = (Client) comboboxCliente.getSelectedItem();
        Movie movie = (Movie) comboboxFilme.getSelectedItem();
        FilmHall hall = (FilmHall) comboboxSala.getSelectedItem();
        Session session = (Session) comboboxSessao.getSelectedItem();
        int qV = Integer.parseInt((String) comboboxVIP.getSelectedItem());
        int qI = Integer.parseInt((String) comboboxInteira.getSelectedItem());
        int qM = Integer.parseInt((String) comboboxMeia.getSelectedItem());
        
        if (session == null) {
            showMessage(false, "Selecione uma sessão");
        } else if (qV == 0 && qI == 0 && qM == 0) {
            showMessage(false, "Selecione pelo menos um ingresso");
        } else {
            List<Ticket> tickets = new ArrayList<>();
            
            if (qV != 0) {
                for (int i = 0; i < qV; i++) {
                    Ticket ticket = new Ticket();
                    ticket.setCinemaName("CINEMA TESTE");
                    ticket.setClient(client);
                    ticket.setDate(session.getDate());
                    ticket.setMovie(movie);
                    ticket.setPrice(precoVip);
                    ticket.setTicketType(2);
                    ticket.setHour(session.getBeginingHour());
                    ticket.setHall(hall);
                    ticket.setLyrics(session.isLyrics());
                    ticket.setSession(session);
                    tickets.add(ticket);
                }    
            }
            
            if (qI != 0) {
                for (int i = 0; i < qI; i++) {
                    Ticket ticket = new Ticket();
                    ticket.setCinemaName("CINEMA TESTE");
                    ticket.setClient(client);
                    ticket.setDate(session.getDate());
                    ticket.setMovie(movie);
                    ticket.setPrice(precoNormal);
                    ticket.setTicketType(0);
                    ticket.setHall(hall);
                    ticket.setSession(session);
                    ticket.setLyrics(session.isLyrics());
                    ticket.setHour(session.getBeginingHour());
                    tickets.add(ticket);
                }    
            }
            
            if (qM != 0) {
                for (int i = 0; i < qM; i++) {
                    Ticket ticket = new Ticket();
                    ticket.setCinemaName("CINEMA TESTE");
                    ticket.setClient(client);
                    ticket.setDate(session.getDate());
                    ticket.setMovie(movie);
                    ticket.setPrice(precoMeia);
                    ticket.setTicketType(1);
                    ticket.setHall(hall);
                    ticket.setSession(session);
                    ticket.setLyrics(session.isLyrics());
                    ticket.setHour(session.getBeginingHour());
                    tickets.add(ticket);
                }    
            }
            int ihall = hall.getId();
            psell.setEmp(emp);
            psell.setClient(client);
            psell.setTotal(total);
            psell.setTickets(tickets);
            main.showForm(new ChairSelection(main, tickets, ihall, psell));
        }
        
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        comboboxSala.removeAllItems();
        comboboxSessao.removeAllItems();
        comboboxSala.setEnabled(false);
        btnSelecionarSala.setEnabled(false);
        comboboxSessao.setEnabled(false);
        lblTotal1.setText("0.00");
        comboboxVIP.setSelectedItem("0");
        comboboxMeia.setSelectedItem("0");
        comboboxInteira.setSelectedItem("0");
        total = null;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void comboboxInteiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxInteiraActionPerformed
        // TODO add your handling code here:
        calculateTotal();
    }//GEN-LAST:event_comboboxInteiraActionPerformed

    private void comboboxMeiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxMeiaActionPerformed
        // TODO add your handling code here:
        calculateTotal();
    }//GEN-LAST:event_comboboxMeiaActionPerformed

    private void comboboxVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxVIPActionPerformed
        // TODO add your handling code here:
        calculateTotal();
    }//GEN-LAST:event_comboboxVIPActionPerformed
    
    
    public void calculateTotal () {
          int qV = Integer.parseInt((String) comboboxVIP.getSelectedItem());
          int qI = Integer.parseInt((String) comboboxInteira.getSelectedItem());
          int qM = Integer.parseInt((String) comboboxMeia.getSelectedItem());
          
          total = (qV * precoVip) + (qI * precoNormal) + (qM * precoMeia);
          lblTotal1.setText(String.format("%.2f", total));
    }
    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnCheckout;
    private swing.Button btnLimpar;
    private swing.Button btnSelecionarFilme;
    private swing.Button btnSelecionarSala;
    private javax.swing.JComboBox<Object> comboboxCliente;
    private javax.swing.JComboBox<Object> comboboxFilme;
    private javax.swing.JComboBox<String> comboboxInteira;
    private javax.swing.JComboBox<String> comboboxMeia;
    private javax.swing.JComboBox<Object> comboboxSala;
    private javax.swing.JComboBox<Object> comboboxSessao;
    private javax.swing.JComboBox<String> comboboxVIP;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JLabel lblInteira;
    private javax.swing.JLabel lblMeia;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblSessao;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblVIP;
    private javax.swing.JLabel lblVenda;
    // End of variables declaration//GEN-END:variables
}
