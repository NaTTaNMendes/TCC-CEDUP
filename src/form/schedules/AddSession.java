
package form.schedules;

import form.MainForm;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.FilmHall;
import model.Movie;
import model.controllers.sessionController;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import swing.Message;

public class AddSession extends javax.swing.JPanel {
    
    private MainForm main;
    private sessionController controller;
    
    public AddSession(MainForm main) {
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

        lblNovaSessao = new javax.swing.JLabel();
        lblFilme = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        btnLegendado = new javax.swing.JToggleButton();
        lblData = new javax.swing.JLabel();
        lblHoraI = new javax.swing.JLabel();
        lblHoraF = new javax.swing.JLabel();
        btnAdicionarSessao = new swing.Button();
        jcomboFilme = new javax.swing.JComboBox<>();
        jcomboSala = new javax.swing.JComboBox<>();
        jdate = new com.toedter.calendar.JDateChooser();
        jtimeInicio = new com.github.lgooddatepicker.components.TimePicker();
        jtimeFim = new com.github.lgooddatepicker.components.TimePicker();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaSessao.setText("Nova sessão");
        lblNovaSessao.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaSessao.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaSessao.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaSessao.setToolTipText("");

        lblFilme.setText("Filme:");
        lblFilme.setBackground(new java.awt.Color(101, 16, 197));
        lblFilme.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFilme.setForeground(new java.awt.Color(83, 84, 81));
        lblFilme.setToolTipText("");

        lblSala.setText("Sala:");
        lblSala.setBackground(new java.awt.Color(101, 16, 197));
        lblSala.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSala.setForeground(new java.awt.Color(83, 84, 81));
        lblSala.setToolTipText("");

        btnLegendado.setText("Legendado");

        lblData.setText("Data:");
        lblData.setBackground(new java.awt.Color(101, 16, 197));
        lblData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(83, 84, 81));
        lblData.setToolTipText("");

        lblHoraI.setText("Hora início:");
        lblHoraI.setBackground(new java.awt.Color(101, 16, 197));
        lblHoraI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHoraI.setForeground(new java.awt.Color(83, 84, 81));
        lblHoraI.setToolTipText("");

        lblHoraF.setText("Hora fim:");
        lblHoraF.setBackground(new java.awt.Color(101, 16, 197));
        lblHoraF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHoraF.setForeground(new java.awt.Color(83, 84, 81));
        lblHoraF.setToolTipText("");

        btnAdicionarSessao.setText("Adicionar Sessão");
        btnAdicionarSessao.setBackground(new java.awt.Color(101, 16, 197));
        btnAdicionarSessao.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarSessaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNovaSessao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdicionarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSala)
                                    .addComponent(lblFilme))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLegendado)
                                        .addGap(57, 57, 57))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jcomboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcomboSala, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHoraF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblData, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHoraI, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtimeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtimeFim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(295, 295, 295))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblNovaSessao)
                .addGap(149, 149, 149)
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
                        .addComponent(btnAdicionarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarSessaoActionPerformed
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
                controller.insertSession(btnStatus, m, j, data, begining, finish);
            }
                   
        } catch (ParseException e) {
            showMessage(false, "Hora inválida");
            System.out.println("foi aq");
        }
    }//GEN-LAST:event_btnAdicionarSessaoActionPerformed
    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAdicionarSessao;
    private javax.swing.JToggleButton btnLegendado;
    private javax.swing.JComboBox<Object> jcomboFilme;
    private javax.swing.JComboBox<Object> jcomboSala;
    private com.toedter.calendar.JDateChooser jdate;
    private com.github.lgooddatepicker.components.TimePicker jtimeFim;
    private com.github.lgooddatepicker.components.TimePicker jtimeInicio;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JLabel lblHoraF;
    private javax.swing.JLabel lblHoraI;
    private javax.swing.JLabel lblNovaSessao;
    private javax.swing.JLabel lblSala;
    // End of variables declaration//GEN-END:variables
}
