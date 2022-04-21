package form.schedules;

import form.MainForm;
import model.Director;
import model.Gender;
import model.Movie;
import model.controllers.movieController;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import swing.Message;

public class AddMovie extends javax.swing.JPanel {
    
    private MainForm main;
    private movieController controller;
    private boolean permission;
    
    public AddMovie(MainForm main, boolean permission) {
        initComponents();
        controller = new movieController(this);
        this.permission = permission;
        this.main = main;
        AutoCompleteDecorator.decorate(combobox);
    
        
        for (Gender a: controller.pickGenders()){
            comboboxGenero.addItem(a);
        }
        
        for (Director b: controller.pickDirectors()){
            comboboxDiretor.addItem(b);
        }
        
        AutoCompleteDecorator.decorate(comboboxDiretor);
        AutoCompleteDecorator.decorate(comboboxGenero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblESRB = new javax.swing.JLabel();
        lblSinopse = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        jtxtSinopse = new javax.swing.JTextPane();
        btnVoltar = new swing.Button();
        lblNome = new javax.swing.JLabel();
        lblDuracao = new javax.swing.JLabel();
        jtxtDuracao = new javax.swing.JTextField();
        lblAdicionarFlme = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblDiretores = new javax.swing.JLabel();
        btnAdicionarFilme = new swing.Button();
        jtxtNome = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        comboboxGenero = new javax.swing.JComboBox<>();
        comboboxDiretor = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(203, 204, 215));

        lblESRB.setBackground(new java.awt.Color(101, 16, 197));
        lblESRB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblESRB.setForeground(new java.awt.Color(83, 84, 81));
        lblESRB.setText("ESRB:");
        lblESRB.setToolTipText("");

        lblSinopse.setBackground(new java.awt.Color(101, 16, 197));
        lblSinopse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSinopse.setForeground(new java.awt.Color(83, 84, 81));
        lblSinopse.setText("Sinopse:");
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

        jtxtDuracao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblAdicionarFlme.setBackground(new java.awt.Color(101, 16, 197));
        lblAdicionarFlme.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblAdicionarFlme.setForeground(new java.awt.Color(101, 16, 197));
        lblAdicionarFlme.setText("Adicionar filme");
        lblAdicionarFlme.setToolTipText("");

        lblGenero.setBackground(new java.awt.Color(101, 16, 197));
        lblGenero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(83, 84, 81));
        lblGenero.setText("Gênero:");
        lblGenero.setToolTipText("");

        lblDiretores.setBackground(new java.awt.Color(101, 16, 197));
        lblDiretores.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDiretores.setForeground(new java.awt.Color(83, 84, 81));
        lblDiretores.setText("Diretor:");
        lblDiretores.setToolTipText("");

        btnAdicionarFilme.setBackground(new java.awt.Color(101, 16, 197));
        btnAdicionarFilme.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarFilme.setText("Adicionar filme");
        btnAdicionarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarFilmeActionPerformed(evt);
            }
        });

        jtxtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIVRE", "10 ANOS", "12 ANOS", "14 ANOS", "16 ANOS", "18 ANOS" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAdicionarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblAdicionarFlme))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDuracao)
                                    .addComponent(lblNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtNome)
                                    .addComponent(jtxtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblESRB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDiretores, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(combobox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboboxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboboxDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSinopse)
                                .addGap(10, 10, 10)
                                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblAdicionarFlme)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDuracao)
                            .addComponent(jtxtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblESRB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combobox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenero)
                            .addComponent(comboboxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiretores)
                            .addComponent(comboboxDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblSinopse))
                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        main.showForm(new RegisteredMovies(main, permission));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarFilmeActionPerformed
        try {
            String name = jtxtNome.getText();
            int duration = Integer.valueOf(jtxtDuracao.getText());
            int esrb = 0;
            switch (combobox.getSelectedIndex()) {
                case 0: esrb = 0;
                break;
                case 1: esrb = 1;
                break;
                case 2: esrb = 2;
                break;
                case 3: esrb = 3;
                break;
                case 4: esrb = 4;
                break;
                case 5: esrb = 5;
                break;
            }
            Gender gender = (Gender) comboboxGenero.getSelectedItem();
            Director director = (Director) comboboxDiretor.getSelectedItem();
            
            if (name.isEmpty()) {
               showMessage(false, "Nome inválido"); 
            } else {
                controller.addMovie(name, duration, esrb, name, gender, director);
            }
                
        } catch (NumberFormatException e) {
            showMessage(false, "Duração inválida");
        }
        
    }//GEN-LAST:event_btnAdicionarFilmeActionPerformed
    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAdicionarFilme;
    private swing.Button btnVoltar;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JComboBox<Object> comboboxDiretor;
    private javax.swing.JComboBox<Object> comboboxGenero;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextField jtxtDuracao;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextPane jtxtSinopse;
    private javax.swing.JLabel lblAdicionarFlme;
    private javax.swing.JLabel lblDiretores;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblESRB;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSinopse;
    // End of variables declaration//GEN-END:variables
}
