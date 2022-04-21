package form.schedules;

import form.MainForm;
import form.Product.RegisteredCombos;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Session;
import model.controllers.sessionController;
import swing.Message;

public class SessionData extends javax.swing.JPanel {
    
    private MainForm main;
    private List<Session> sessions;
    private sessionController controller;
    private String movie;
    private String hall;
    
    public SessionData(MainForm main, List<Session> sessions, String movie, String hall) {
        initComponents();
        this.main = main;
        this.sessions = sessions;
        this.movie = movie;
        this.hall = hall;
        controller = new sessionController(this);
        jTable1.getTableHeader().setReorderingAllowed(false);
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDadosSessao = new javax.swing.JLabel();
        lblFilme = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        lblHorarios = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAlterar = new swing.Button();
        btnVoltar = new swing.Button();
        btnDeletar = new swing.Button();
        lblFilme1 = new javax.swing.JLabel();
        lblSala1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblDadosSessao.setBackground(new java.awt.Color(101, 16, 197));
        lblDadosSessao.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblDadosSessao.setForeground(new java.awt.Color(101, 16, 197));
        lblDadosSessao.setText("Dados da sessão");
        lblDadosSessao.setToolTipText("");

        lblFilme.setBackground(new java.awt.Color(101, 16, 197));
        lblFilme.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFilme.setForeground(new java.awt.Color(83, 84, 81));
        lblFilme.setText("Filme:");
        lblFilme.setToolTipText("");

        lblSala.setBackground(new java.awt.Color(101, 16, 197));
        lblSala.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSala.setForeground(new java.awt.Color(83, 84, 81));
        lblSala.setText("Sala:");
        lblSala.setToolTipText("");

        lblHorarios.setBackground(new java.awt.Color(101, 16, 197));
        lblHorarios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHorarios.setForeground(new java.awt.Color(83, 84, 81));
        lblHorarios.setText("Horários");
        lblHorarios.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Sala", "Legendado", "Horário Inicio", "Horário fim"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jscroll.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        btnAlterar.setBackground(new java.awt.Color(101, 16, 197));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
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

        btnDeletar.setBackground(new java.awt.Color(101, 16, 197));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        lblFilme1.setBackground(new java.awt.Color(101, 16, 197));
        lblFilme1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFilme1.setForeground(new java.awt.Color(83, 84, 81));
        lblFilme1.setText("Filme:");
        lblFilme1.setToolTipText("");

        lblSala1.setBackground(new java.awt.Color(101, 16, 197));
        lblSala1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSala1.setForeground(new java.awt.Color(83, 84, 81));
        lblSala1.setText("Sala:");
        lblSala1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblDadosSessao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
                .addComponent(lblHorarios)
                .addGap(600, 600, 600))
            .addComponent(jscroll, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSala, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFilme, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFilme1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(lblSala1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblDadosSessao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilme)
                            .addComponent(lblFilme1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSala)
                            .addComponent(lblSala1))
                        .addGap(3, 3, 3)))
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHorarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        main.showForm(new RegisteredSession(main));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        Integer row = jTable1.getSelectedRow();
        if (row == null) {
            showMessage(false, "Selecione uma sessão");
        } else {
            int id = (int) jTable1.getValueAt(row, 0);
            Session s = controller.findSessionById(id);
            main.showForm(new AlterSession(main, sessions, s, movie, hall));
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        Integer row = jTable1.getSelectedRow();
        if (row == null) {
            showMessage(false, "Selecione uma sessão");
        } else {
            int a = JOptionPane.showConfirmDialog(null, "Deseja deletar a sessão?", "Deletar sessão", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                int id = (int) jTable1.getValueAt(row, 0);
                controller.deleteSession(id);
                for (int i = 0; i < sessions.size(); i ++) {
                    if (sessions.get(i).getId() == id) {
                        sessions.remove(i);
                    }                        
                }
                setData();
            }              
        }                       
    }//GEN-LAST:event_btnDeletarActionPerformed
    
    public void setData() {
        DefaultTableModel tMOdel = (DefaultTableModel) jTable1.getModel();
        tMOdel.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        for (int i = 0; i < sessions.size(); i ++) {

            Object [] data = {sessions.get(i).getId(), sessions.get(i).getDate().toString(), sessions.get(i).getFilmHall(), sessions.get(i).isLyrics(), sdf.format(sessions.get(i).getBeginingHour()), sdf.format(sessions.get(i).getFinishHour())};
            System.out.println(sessions.get(i).getBeginingHour().toString());
            DefaultTableModel dtmTable = (DefaultTableModel) jTable1.getModel();
            dtmTable.addRow(data);

        }               
        lblFilme1.setText(movie);
        lblSala1.setText(hall);
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
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JLabel lblDadosSessao;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JLabel lblFilme1;
    private javax.swing.JLabel lblHorarios;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblSala1;
    // End of variables declaration//GEN-END:variables
}
