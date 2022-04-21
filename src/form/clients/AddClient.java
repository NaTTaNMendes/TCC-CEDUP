package form.clients;

import form.MainForm;
import java.util.Date;
import model.controllers.clientController;
import swing.Message;

public class AddClient extends javax.swing.JPanel {
    
    private MainForm main;
    private clientController controller;
    
    public AddClient(MainForm main) {
        initComponents();
        setOpaque(false);
        this.main = main;
        controller = new clientController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastro = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        jtxtCPF = new javax.swing.JTextField();
        jscrollObs = new javax.swing.JScrollPane();
        jtxtOBS = new javax.swing.JTextPane();
        lblTelefone = new javax.swing.JLabel();
        jtxtTelefone = new javax.swing.JTextField();
        lblObs = new javax.swing.JLabel();
        btnCadastrar = new swing.Button();
        lblNome = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        btnEstudante = new javax.swing.JRadioButton();
        btnDeficiente = new javax.swing.JRadioButton();
        jdate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(203, 204, 215));

        lblCadastro.setBackground(new java.awt.Color(101, 16, 197));
        lblCadastro.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(101, 16, 197));
        lblCadastro.setText("Cadastro de clientes");
        lblCadastro.setToolTipText("");

        jtxtEmail.setBackground(new java.awt.Color(255, 255, 255));
        jtxtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblData.setBackground(new java.awt.Color(101, 16, 197));
        lblData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(83, 84, 81));
        lblData.setText("Data nascimento:");
        lblData.setToolTipText("");

        lblCPF.setBackground(new java.awt.Color(101, 16, 197));
        lblCPF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(83, 84, 81));
        lblCPF.setText("CPF:");
        lblCPF.setToolTipText("");

        jtxtCPF.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        jtxtOBS.setBackground(new java.awt.Color(255, 255, 255));
        jtxtOBS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscrollObs.setViewportView(jtxtOBS);

        lblTelefone.setBackground(new java.awt.Color(101, 16, 197));
        lblTelefone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(83, 84, 81));
        lblTelefone.setText("Telefone:");
        lblTelefone.setToolTipText("");

        jtxtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        jtxtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblObs.setBackground(new java.awt.Color(101, 16, 197));
        lblObs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblObs.setForeground(new java.awt.Color(83, 84, 81));
        lblObs.setText("Observação:");
        lblObs.setToolTipText("");

        btnCadastrar.setBackground(new java.awt.Color(101, 16, 197));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setLabel("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        jtxtNome.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblEmail.setBackground(new java.awt.Color(101, 16, 197));
        lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(83, 84, 81));
        lblEmail.setText("Email:");
        lblEmail.setToolTipText("");

        btnEstudante.setText("Estudante");

        btnDeficiente.setText("Deficiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(lblEmail)
                                        .addGap(12, 12, 12)
                                        .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNome)
                                            .addComponent(lblTelefone))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxtTelefone)
                                            .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCPF)
                                        .addGap(12, 12, 12)
                                        .addComponent(jtxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblData)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(btnEstudante)
                                .addGap(100, 100, 100)
                                .addComponent(btnDeficiente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblObs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jscrollObs, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCadastro)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNome)
                                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefone))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail)
                                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblData)
                                    .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCPF)
                                    .addComponent(jtxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEstudante)
                            .addComponent(btnDeficiente))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jscrollObs, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObs))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //COLETANDO DADOS
        String name = jtxtNome.getText();
        String phone = jtxtTelefone.getText();
        String email = jtxtEmail.getText();
        String itr = jtxtCPF.getText();
        String note = jtxtOBS.getText();
        Date birthDate = jdate.getDate();
        boolean student = btnEstudante.isSelected();
        boolean deficient = btnDeficiente.isSelected();
        
        //VERIFICANDO DADOS
        if (name.isEmpty()) {
            showMessage(false, "Nome inválido");
        } else if (phone.isEmpty()) {
            showMessage(false, "Telefone inválido");
        } else if (email.isEmpty()) {
            showMessage(false, "Email inválido");
        } else if (itr.isEmpty()) {
            showMessage(false, "CPF inválido");
        } else if (birthDate == null) {
            showMessage(false, "Data inválida");
        }
        else {
            controller.insertClient(name, phone, email, itr, birthDate, student, deficient, note);
        }        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnCadastrar;
    private javax.swing.JRadioButton btnDeficiente;
    private javax.swing.JRadioButton btnEstudante;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JScrollPane jscrollObs;
    private javax.swing.JTextField jtxtCPF;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextPane jtxtOBS;
    private javax.swing.JTextField jtxtTelefone;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables
}
