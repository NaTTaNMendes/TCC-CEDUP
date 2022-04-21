
package form.clients;

import form.MainForm;
import java.util.Date;
import model.Client;
import model.controllers.clientController;
import swing.Message;

public class AlterClient extends javax.swing.JPanel {
    
    private MainForm main;
    private Client client;
    private clientController controller;
    
    public AlterClient(MainForm main, Client client) {
        initComponents();
        this.client = client;
        this.main = main;
        controller = new clientController(this);
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jscroll = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        lblTelefone = new javax.swing.JLabel();
        jtxtTelefone = new javax.swing.JTextField();
        lblObs = new javax.swing.JLabel();
        lblAlterar = new javax.swing.JLabel();
        btnAlterar = new swing.Button();
        jtxtEmail = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        btnEstudante = new javax.swing.JRadioButton();
        lblData = new javax.swing.JLabel();
        btnDeficiente = new javax.swing.JRadioButton();
        lbCPF = new javax.swing.JLabel();
        jtxtCPF = new javax.swing.JTextField();
        btnVoltar = new swing.Button();
        jdate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(203, 204, 215));

        jtxtObs.setBackground(new java.awt.Color(255, 255, 255));
        jtxtObs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscroll.setViewportView(jtxtObs);

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

        lblAlterar.setBackground(new java.awt.Color(101, 16, 197));
        lblAlterar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblAlterar.setForeground(new java.awt.Color(101, 16, 197));
        lblAlterar.setText("Alterar cliente");
        lblAlterar.setToolTipText("");

        btnAlterar.setBackground(new java.awt.Color(101, 16, 197));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jtxtEmail.setBackground(new java.awt.Color(255, 255, 255));
        jtxtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

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

        lblData.setBackground(new java.awt.Color(101, 16, 197));
        lblData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(83, 84, 81));
        lblData.setText("Data nascimento:");
        lblData.setToolTipText("");

        btnDeficiente.setText("Deficiente");

        lbCPF.setBackground(new java.awt.Color(101, 16, 197));
        lbCPF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbCPF.setForeground(new java.awt.Color(83, 84, 81));
        lbCPF.setText("CPF:");
        lbCPF.setToolTipText("");

        jtxtCPF.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

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
                        .addGap(21, 21, 21)
                        .addComponent(lblAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCPF)
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
                                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAlterar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblData)
                                    .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCPF)
                                    .addComponent(jtxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEstudante)
                            .addComponent(btnDeficiente))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblObs))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        main.showForm(new ClientData(main, client));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        String name = jtxtNome.getText();
        String phone = jtxtTelefone.getText();
        String email = jtxtEmail.getText();
        String itr = jtxtCPF.getText();
        String note = jtxtObs.getText();
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
            controller.updateClient(client.getId(), name, phone, email, itr, birthDate, student, deficient, note);
            client = controller.findById(client.getId());
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    //MÉTODO PARA SETAR OS DADOS NOS CAMPOS
    private void setData (){
        jtxtCPF.setText(client.getITR());
       jdate.setDate(client.getBirthDate());
        if (client.isDeficient()){
            btnDeficiente.doClick();
        }
        jtxtEmail.setText(client.getEmail());
        if (client.isStudent()){
            btnEstudante.doClick();
        } 
        jtxtNome.setText(client.getName());
        jtxtTelefone.setText(client.getPhone());
        jtxtObs.setText(client.getNote());
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
    private javax.swing.JRadioButton btnDeficiente;
    private javax.swing.JRadioButton btnEstudante;
    private swing.Button btnVoltar;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextField jtxtCPF;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextPane jtxtObs;
    private javax.swing.JTextField jtxtTelefone;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables
}
