package form.clients;

import form.MainForm;
import javax.swing.JOptionPane;
import model.Client;
import model.controllers.clientController;
import swing.Message;

public class ClientData extends javax.swing.JPanel {
    
    private MainForm main;
    private clientController controller;
    private Client client;
    
    public ClientData(MainForm main, Client client) {
        initComponents();
        this.main = main;
        this.client = client;
        jtxtObs.setEditable(false);
        setData();
        controller = new clientController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new swing.Button();
        lblData = new javax.swing.JLabel();
        btnDeletar = new swing.Button();
        lblObs = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        btnAlterar = new swing.Button();
        lblEmail = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDados = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        lblDeficiente = new javax.swing.JLabel();
        lblEstudante = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblTelefone1 = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        lblCPF1 = new javax.swing.JLabel();
        lblDeficiente1 = new javax.swing.JLabel();
        lblEstudante1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        btnVoltar.setBackground(new java.awt.Color(101, 16, 197));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblData.setBackground(new java.awt.Color(101, 16, 197));
        lblData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(83, 84, 81));
        lblData.setText("Data nascimento:");
        lblData.setToolTipText("");

        btnDeletar.setBackground(new java.awt.Color(101, 16, 197));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        lblObs.setBackground(new java.awt.Color(101, 16, 197));
        lblObs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblObs.setForeground(new java.awt.Color(83, 84, 81));
        lblObs.setText("Observação:");
        lblObs.setToolTipText("");

        lblTelefone.setBackground(new java.awt.Color(101, 16, 197));
        lblTelefone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(83, 84, 81));
        lblTelefone.setText("Telefone:");
        lblTelefone.setToolTipText("");

        btnAlterar.setBackground(new java.awt.Color(101, 16, 197));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblEmail.setBackground(new java.awt.Color(101, 16, 197));
        lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(83, 84, 81));
        lblEmail.setText("Email:");
        lblEmail.setToolTipText("");

        lblCPF.setBackground(new java.awt.Color(101, 16, 197));
        lblCPF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(83, 84, 81));
        lblCPF.setText("CPF:");
        lblCPF.setToolTipText("");

        lblDados.setBackground(new java.awt.Color(101, 16, 197));
        lblDados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblDados.setForeground(new java.awt.Color(101, 16, 197));
        lblDados.setText("Dados cliente");
        lblDados.setToolTipText("");

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        jtxtObs.setBackground(new java.awt.Color(255, 255, 255));
        jtxtObs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscroll.setViewportView(jtxtObs);

        lblDeficiente.setBackground(new java.awt.Color(101, 16, 197));
        lblDeficiente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDeficiente.setForeground(new java.awt.Color(83, 84, 81));
        lblDeficiente.setText("Deficiente:");
        lblDeficiente.setToolTipText("");

        lblEstudante.setBackground(new java.awt.Color(101, 16, 197));
        lblEstudante.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEstudante.setForeground(new java.awt.Color(83, 84, 81));
        lblEstudante.setText("Estudante:");
        lblEstudante.setToolTipText("");

        lblId.setBackground(new java.awt.Color(101, 16, 197));
        lblId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(83, 84, 81));
        lblId.setText("ID:");
        lblId.setToolTipText("");

        lblId1.setBackground(new java.awt.Color(101, 16, 197));
        lblId1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblId1.setForeground(new java.awt.Color(83, 84, 81));
        lblId1.setText("ID");
        lblId1.setToolTipText("");

        lblNome1.setBackground(new java.awt.Color(101, 16, 197));
        lblNome1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(83, 84, 81));
        lblNome1.setText("NOME");
        lblNome1.setToolTipText("");

        lblTelefone1.setBackground(new java.awt.Color(101, 16, 197));
        lblTelefone1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTelefone1.setForeground(new java.awt.Color(83, 84, 81));
        lblTelefone1.setText("TELEFONE");
        lblTelefone1.setToolTipText("");

        lblEmail1.setBackground(new java.awt.Color(101, 16, 197));
        lblEmail1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail1.setForeground(new java.awt.Color(83, 84, 81));
        lblEmail1.setText("EMAIL");
        lblEmail1.setToolTipText("");

        lblData1.setBackground(new java.awt.Color(101, 16, 197));
        lblData1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData1.setForeground(new java.awt.Color(83, 84, 81));
        lblData1.setText("DATA NASCIMENTO");
        lblData1.setToolTipText("");

        lblCPF1.setBackground(new java.awt.Color(101, 16, 197));
        lblCPF1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCPF1.setForeground(new java.awt.Color(83, 84, 81));
        lblCPF1.setText("CPF");
        lblCPF1.setToolTipText("");

        lblDeficiente1.setBackground(new java.awt.Color(101, 16, 197));
        lblDeficiente1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDeficiente1.setForeground(new java.awt.Color(83, 84, 81));
        lblDeficiente1.setText("DEFICIENTE");
        lblDeficiente1.setToolTipText("");

        lblEstudante1.setBackground(new java.awt.Color(101, 16, 197));
        lblEstudante1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEstudante1.setForeground(new java.awt.Color(83, 84, 81));
        lblEstudante1.setText("ESTUDANTE");
        lblEstudante1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addComponent(lblNome))
                                .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblData)
                                .addComponent(lblCPF))
                            .addComponent(lblDeficiente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstudante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCPF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDeficiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEstudante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDados)
                        .addGap(429, 429, 429)))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblObs)
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDados)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(lblId1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(lblNome1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(lblTelefone1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(lblEmail1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(lblData1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(lblCPF1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDeficiente)
                            .addComponent(lblDeficiente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstudante)
                            .addComponent(lblEstudante1))))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        main.showForm(new RegisteredClient(main));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        main.showForm(new AlterClient(main, client));
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Deseja deletar o cliente?", "Deletar cliente", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            boolean test = controller.deleteById(client.getId());
            if (test) {
                main.showForm(new RegisteredClient(main));
            }
        }
        
    }//GEN-LAST:event_btnDeletarActionPerformed
    
    //MÉTODO PARA SETAR OS DADOS NOS CAMPOS
    private void setData (){
        lblCPF1.setText(client.getITR());
        lblData1.setText(client.getBirthDate().toString());
        if (client.isDeficient()){
            lblDeficiente1.setText("SIM");
        } else {
            lblDeficiente1.setText("NÃO");
        }
        lblEmail1.setText(client.getEmail());
        if (client.isStudent()){
            lblEstudante1.setText("SIM");
        } else {
            lblEstudante1.setText("NÃO");
        }
        lblId1.setText(String.valueOf(client.getId()));
        lblNome1.setText(client.getName());
        lblTelefone1.setText(client.getPhone());
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
    private swing.Button btnDeletar;
    private swing.Button btnVoltar;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextPane jtxtObs;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPF1;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblDeficiente;
    private javax.swing.JLabel lblDeficiente1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEstudante;
    private javax.swing.JLabel lblEstudante1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    // End of variables declaration//GEN-END:variables
}
