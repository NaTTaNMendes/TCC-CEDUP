package form.schedules;

import form.MainForm;
import javax.swing.JOptionPane;
import model.Movie;
import model.controllers.movieController;
import swing.Message;


public class MovieData extends javax.swing.JPanel {
    
    private MainForm main;
    private movieController controller;
    private Movie movie;
    private boolean permission;
    
    public MovieData(MainForm main, Movie movie, boolean permission) {
        initComponents();
        this.main = main;
        this.permission = permission;
        this.movie = movie;
        controller = new movieController(this);
        jtxtSinopse.setEditable(false);
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDados = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblDuracao = new javax.swing.JLabel();
        lblESRB = new javax.swing.JLabel();
        lblGeneros = new javax.swing.JLabel();
        lblDiretores = new javax.swing.JLabel();
        lblSinopse = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        jtxtSinopse = new javax.swing.JTextPane();
        btnVoltar = new swing.Button();
        btnAlterar = new swing.Button();
        btnDeletar = new swing.Button();
        lblNome1 = new javax.swing.JLabel();
        lblDuracao1 = new javax.swing.JLabel();
        lblESRB1 = new javax.swing.JLabel();
        lblGeneros1 = new javax.swing.JLabel();
        lblDiretores1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblDados.setBackground(new java.awt.Color(101, 16, 197));
        lblDados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblDados.setForeground(new java.awt.Color(101, 16, 197));
        lblDados.setText("Dados filme");
        lblDados.setToolTipText("");

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        lblDuracao.setBackground(new java.awt.Color(101, 16, 197));
        lblDuracao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDuracao.setForeground(new java.awt.Color(83, 84, 81));
        lblDuracao.setText("Duração:");
        lblDuracao.setToolTipText("");

        lblESRB.setBackground(new java.awt.Color(101, 16, 197));
        lblESRB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblESRB.setForeground(new java.awt.Color(83, 84, 81));
        lblESRB.setText("ESRB:");
        lblESRB.setToolTipText("");

        lblGeneros.setBackground(new java.awt.Color(101, 16, 197));
        lblGeneros.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblGeneros.setForeground(new java.awt.Color(83, 84, 81));
        lblGeneros.setText("Gênero:");
        lblGeneros.setToolTipText("");

        lblDiretores.setBackground(new java.awt.Color(101, 16, 197));
        lblDiretores.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDiretores.setForeground(new java.awt.Color(83, 84, 81));
        lblDiretores.setText("Diretor:");
        lblDiretores.setToolTipText("");

        lblSinopse.setBackground(new java.awt.Color(101, 16, 197));
        lblSinopse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSinopse.setForeground(new java.awt.Color(83, 84, 81));
        lblSinopse.setText("Sinopse");
        lblSinopse.setToolTipText("");

        jtxtSinopse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscroll.setViewportView(jtxtSinopse);

        btnVoltar.setBackground(new java.awt.Color(101, 16, 197));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(101, 16, 197));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
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

        lblNome1.setBackground(new java.awt.Color(101, 16, 197));
        lblNome1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(83, 84, 81));
        lblNome1.setText("Nome:");
        lblNome1.setToolTipText("");

        lblDuracao1.setBackground(new java.awt.Color(101, 16, 197));
        lblDuracao1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDuracao1.setForeground(new java.awt.Color(83, 84, 81));
        lblDuracao1.setText("Duração:");
        lblDuracao1.setToolTipText("");

        lblESRB1.setBackground(new java.awt.Color(101, 16, 197));
        lblESRB1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblESRB1.setForeground(new java.awt.Color(83, 84, 81));
        lblESRB1.setText("ESRB:");
        lblESRB1.setToolTipText("");

        lblGeneros1.setBackground(new java.awt.Color(101, 16, 197));
        lblGeneros1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblGeneros1.setForeground(new java.awt.Color(83, 84, 81));
        lblGeneros1.setText("Gêneros:");
        lblGeneros1.setToolTipText("");

        lblDiretores1.setBackground(new java.awt.Color(101, 16, 197));
        lblDiretores1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDiretores1.setForeground(new java.awt.Color(83, 84, 81));
        lblDiretores1.setText("Diretores:");
        lblDiretores1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblDados))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblESRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblESRB1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDuracao)
                                    .addComponent(lblNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDuracao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblDiretores)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblDiretores1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblGeneros)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblGeneros1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSinopse)
                                .addGap(177, 177, 177))
                            .addComponent(jscroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(378, 378, 378))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(lblSinopse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(lblNome1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDuracao)
                            .addComponent(lblDuracao1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblESRB)
                            .addComponent(lblESRB1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGeneros)
                            .addComponent(lblGeneros1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiretores)
                            .addComponent(lblDiretores1))))
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        main.showForm(new RegisteredMovies(main, permission));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (permission) {
            main.showForm(new AlterMovie(main, movie, permission));
        } else {
            showMessage(false, "Usuário não autorizado para esta função");
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        if (permission) {
            int a = JOptionPane.showConfirmDialog(null, "Deseja deletar o filme?", "Deletar filme", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                boolean test = controller.deleteMovie(movie);
                if (test) 
                    main.showForm(new RegisteredMovies(main, permission));        
            }
        } else {
            showMessage(false, "Usuário não autorizado para esta função");
        }
      
    }//GEN-LAST:event_btnDeletarActionPerformed

    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }
    
    public void setData() {
        lblDiretores1.setText(movie.getDirector().getName()); 
        lblDuracao1.setText(String.valueOf(movie.getDuration()) + " Minutos");
        int cocind = movie.getCocind();
        String esrb = "";
        switch (cocind) {
                case 0: esrb = "LiVRE";
                break;
                case 1: esrb = "10 ANOS";
                break;
                case 2: esrb = "12 ANOS";
                break;
                case 3: esrb = "14 ANOS";
                break;
                case 4: esrb = "16 ANOS";
                break;
                case 5: esrb = "18 ANOS";
                break;
            }
        lblESRB1.setText(esrb);
        lblGeneros1.setText(movie.getGender().getName());
        lblNome1.setText(movie.getName());
        jtxtSinopse.setText(movie.getSynopsis());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAlterar;
    private swing.Button btnDeletar;
    private swing.Button btnVoltar;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextPane jtxtSinopse;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblDiretores;
    private javax.swing.JLabel lblDiretores1;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblDuracao1;
    private javax.swing.JLabel lblESRB;
    private javax.swing.JLabel lblESRB1;
    private javax.swing.JLabel lblGeneros;
    private javax.swing.JLabel lblGeneros1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblSinopse;
    // End of variables declaration//GEN-END:variables
}
