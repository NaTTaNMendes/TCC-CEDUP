package form.schedules;

import form.MainForm;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Movie;
import model.controllers.movieController;
import swing.Message;
import swing.textflield.EventCallBack;
import swing.textflield.EventTextField;

public class RegisteredMovies extends javax.swing.JPanel {
    
    private MainForm main;
    private movieController controller;
    private boolean permission;
    
    public RegisteredMovies(MainForm main, boolean permission) {
        initComponents();
        controller = new movieController(this);
        this.main = main;
        this.permission = permission;
        jtxtCliente.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                Movie m = controller.findMovie(jtxtCliente.getText());
                if (m != null) {
                    main.showForm(new MovieData(main, m, permission));
                } else {
                    showMessage("Filme inválido");
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    Logger.getLogger(RegisteredMovies.class.getName()).log(Level.SEVERE, null, ex);
                }
                call.done();
            }            

            @Override
            public void onCancel() {
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jtxtCliente = new swing.textflield.TextFieldAnimation();
        button4 = new swing.Button();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Filmes");
        lblNovaVenda.setToolTipText("");

        lblCliente.setBackground(new java.awt.Color(101, 16, 197));
        lblCliente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(83, 84, 81));
        lblCliente.setText("Pesquise o nome ou ID");
        lblCliente.setToolTipText("");

        jtxtCliente.setAnimationColor(new java.awt.Color(101, 16, 197));

        button4.setBackground(new java.awt.Color(101, 16, 197));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Cadastrar novo");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblNovaVenda)
                .addContainerGap(1045, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(lblCliente))
                            .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(420, 420, 420))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(535, 535, 535))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNovaVenda)
                .addGap(162, 162, 162)
                .addComponent(lblCliente)
                .addGap(33, 33, 33)
                .addComponent(jtxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        
        if (permission) {
            main.showForm(new AddMovie(main, permission));
        } else {
            showMessage("Usuário não permitido para essa função");
        }
        
    }//GEN-LAST:event_button4ActionPerformed

    
    public void showMessage(String message) {
        main.getMain().showMessage(Message.MessageType.ERROR, message);      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button4;
    private swing.textflield.TextFieldAnimation jtxtCliente;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblNovaVenda;
    // End of variables declaration//GEN-END:variables
}
