package form.schedules;

import form.MainForm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.FilmHall;
import model.Movie;
import model.Session;
import model.controllers.sessionController;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import swing.Message;

public class AlterSession extends javax.swing.JPanel {
    
    private MainForm main;
    private sessionController controller;
    private List<Session> sessions;
    private Session session;
    private String movie;
    private String hall;
    
    public AlterSession(MainForm main, List<Session> sessions, Session session, String movie, String hall) {
        initComponents();
        this.main = main;
        this.session = session;
        this.sessions = sessions;
        this.movie = movie;
        this.hall = hall;
        controller = new sessionController(this);
        
        for (Movie m: controller.pickMovies()){
            jcomboFilme.addItem(m);
        }
        
        for (FilmHall h: controller.pickHalls()){
            jcomboSala.addItem(h);
        }
        
        AutoCompleteDecorator.decorate(jcomboSala);
        AutoCompleteDecorator.decorate(jcomboFilme);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        btnAlterarSessao = new swing.Button();
        jcomboFilme = new javax.swing.JComboBox<>();
        jcomboSala = new javax.swing.JComboBox<>();
        jdate = new com.toedter.calendar.JDateChooser();
        jtimeInicio = new com.github.lgooddatepicker.components.TimePicker();
        lblFilme = new javax.swing.JLabel();
        jtimeFim = new com.github.lgooddatepicker.components.TimePicker();
        lblSala = new javax.swing.JLabel();
        btnLegendado = new javax.swing.JToggleButton();
        lblData = new javax.swing.JLabel();
        lblHoraI = new javax.swing.JLabel();
        lblHoraF = new javax.swing.JLabel();
        btnVoltar = new swing.Button();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Alterar sessão");
        lblNovaVenda.setToolTipText("");

        btnAlterarSessao.setBackground(new java.awt.Color(101, 16, 197));
        btnAlterarSessao.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarSessao.setText("Alterar sessão");
        btnAlterarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSessaoActionPerformed(evt);
            }
        });

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

        btnLegendado.setText("Legendado");

        lblData.setBackground(new java.awt.Color(101, 16, 197));
        lblData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(83, 84, 81));
        lblData.setText("Data:");
        lblData.setToolTipText("");

        lblHoraI.setBackground(new java.awt.Color(101, 16, 197));
        lblHoraI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHoraI.setForeground(new java.awt.Color(83, 84, 81));
        lblHoraI.setText("Hora início:");
        lblHoraI.setToolTipText("");

        lblHoraF.setBackground(new java.awt.Color(101, 16, 197));
        lblHoraF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHoraF.setForeground(new java.awt.Color(83, 84, 81));
        lblHoraF.setText("Hora fim:");
        lblHoraF.setToolTipText("");

        btnVoltar.setBackground(new java.awt.Color(101, 16, 197));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblNovaVenda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSala)
                            .addComponent(lblFilme))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcomboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcomboSala, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLegendado)
                                .addGap(57, 57, 57)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHoraF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblData, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHoraI, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtimeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtimeFim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnAlterarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNovaVenda)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblData)
                            .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoraI)
                            .addComponent(jtimeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoraF)
                            .addComponent(jtimeFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlterarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilme)
                            .addComponent(jcomboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSala)
                            .addComponent(jcomboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLegendado)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSessaoActionPerformed
        try {
            Movie m = (Movie) jcomboFilme.getSelectedItem();
            FilmHall j = (FilmHall) jcomboSala.getSelectedItem();
            Date data = jdate.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date begining = sdf.parse(jtimeInicio.getText());
            Date finish = sdf.parse(jtimeFim.getText());
            boolean btnStatus = btnLegendado.isSelected();
            
            if (begining.after(finish)) {
                showMessage(false, "Sessão termina antes do início");
            } else if (data == null) {
                showMessage(false, "Data inválida");
            } else if (begining == null) {
                showMessage(false, "Hora inválida");
            } else if (finish == null) {
                showMessage(false, "Hora inválida");
            } else {
                controller.alterSession(session.getId(), btnStatus, m, j, data, begining, finish);
                for (int i = 0; i < sessions.size(); i++) {
                    if (sessions.get(i).getId() == session.getId()) {
                        sessions.remove(i);
                    }
                }
                session = controller.findSessionById(session.getId());
                sessions.add(session);
            }

        } catch (ParseException e) {
            showMessage(false, "Hora inválida");
        }
    }//GEN-LAST:event_btnAlterarSessaoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        main.showForm(new SessionData(main, sessions, movie, hall));
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAlterarSessao;
    private javax.swing.JToggleButton btnLegendado;
    private swing.Button btnVoltar;
    private javax.swing.JComboBox<Object> jcomboFilme;
    private javax.swing.JComboBox<Object> jcomboSala;
    private com.toedter.calendar.JDateChooser jdate;
    private com.github.lgooddatepicker.components.TimePicker jtimeFim;
    private com.github.lgooddatepicker.components.TimePicker jtimeInicio;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JLabel lblHoraF;
    private javax.swing.JLabel lblHoraI;
    private javax.swing.JLabel lblNovaVenda;
    private javax.swing.JLabel lblSala;
    // End of variables declaration//GEN-END:variables
}
