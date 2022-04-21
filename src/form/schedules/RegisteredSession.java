package form.schedules;

import form.MainForm;
import java.util.List;
import model.FilmHall;
import model.Movie;
import model.Session;
import model.controllers.sessionController;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import swing.Message;

public class RegisteredSession extends javax.swing.JPanel {
    
    private MainForm main;
    private sessionController controller;
    
    public RegisteredSession(MainForm main) {
        initComponents();
        this.main = main;        
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

        lblCliente1 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        btnConsultar = new swing.Button();
        lblNovaVenda = new javax.swing.JLabel();
        jcomboFilme = new javax.swing.JComboBox<>();
        jcomboSala = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(203, 204, 215));

        lblCliente1.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente1.setText("Sala:");
        lblCliente1.setToolTipText("");

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Filme:");
        lblCliente.setToolTipText("");

        btnConsultar.setBackground(new java.awt.Color(101, 16, 197));
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Consultar sessão");
        lblNovaVenda.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNovaVenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(lblCliente1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomboSala, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(450, 450, 450))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblNovaVenda)
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(lblCliente1)
                    .addComponent(jcomboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        Movie movie = (Movie) jcomboFilme.getSelectedItem();
        FilmHall hall = (FilmHall) jcomboSala.getSelectedItem();
        List<Session> list = controller.findSessions(movie, hall);
        if (list.isEmpty()) {
            showMessage(false, "Sessões não encontradas");
        } else {
            main.showForm(new SessionData(main, list, movie.getName(), hall.getName()));
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnConsultar;
    private javax.swing.JComboBox<Object> jcomboFilme;
    private javax.swing.JComboBox<Object> jcomboSala;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblNovaVenda;
    // End of variables declaration//GEN-END:variables
}
