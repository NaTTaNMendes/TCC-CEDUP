package form.Employee;

import form.MainForm;
import java.util.Date;
import model.controllers.employeeController;
import swing.Message;

public class addEmployee extends javax.swing.JPanel {
    
    private employeeController controller;
    private MainForm main;
    
    public addEmployee(MainForm main) {
        initComponents();
        setOpaque(false);
        this.main = main;
        controller = new employeeController(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        jtxtRG = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        jtxtSenha = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        jtxtTelefone = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        jtxtEstado = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        jtxtRua = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        jtxtBairro = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        jtxtPais = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        jtxtCidade = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jtxtNumero = new javax.swing.JTextField();
        lblFuncao = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        jtxtCPF = new javax.swing.JTextField();
        jscroll = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        lblObs = new javax.swing.JLabel();
        btnCadastrar = new swing.Button();
        lblBairro = new javax.swing.JLabel();
        jtxtComplemento = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        jdate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(203, 204, 215));

        lblCadastro.setBackground(new java.awt.Color(101, 16, 197));
        lblCadastro.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCadastro.setForeground(new java.awt.Color(101, 16, 197));
        lblCadastro.setText("Cadastro de funcionários");
        lblCadastro.setToolTipText("");

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        jtxtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblRG.setBackground(new java.awt.Color(101, 16, 197));
        lblRG.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblRG.setForeground(new java.awt.Color(83, 84, 81));
        lblRG.setText("RG:");
        lblRG.setToolTipText("");

        jtxtRG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblSenha.setBackground(new java.awt.Color(101, 16, 197));
        lblSenha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(83, 84, 81));
        lblSenha.setText("Senha:");
        lblSenha.setToolTipText("");

        jtxtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblTelefone.setBackground(new java.awt.Color(101, 16, 197));
        lblTelefone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(83, 84, 81));
        lblTelefone.setText("Telefone:");
        lblTelefone.setToolTipText("");

        jtxtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblEstado.setBackground(new java.awt.Color(101, 16, 197));
        lblEstado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(83, 84, 81));
        lblEstado.setText("Estado:");
        lblEstado.setToolTipText("");

        jtxtEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblRua.setBackground(new java.awt.Color(101, 16, 197));
        lblRua.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblRua.setForeground(new java.awt.Color(83, 84, 81));
        lblRua.setText("Rua:");
        lblRua.setToolTipText("");

        jtxtRua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblComplemento.setBackground(new java.awt.Color(101, 16, 197));
        lblComplemento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblComplemento.setForeground(new java.awt.Color(83, 84, 81));
        lblComplemento.setText("Complemento:");
        lblComplemento.setToolTipText("");

        jtxtBairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblEmail.setBackground(new java.awt.Color(101, 16, 197));
        lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(83, 84, 81));
        lblEmail.setText("Email:");
        lblEmail.setToolTipText("");

        jtxtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPais.setBackground(new java.awt.Color(101, 16, 197));
        lblPais.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPais.setForeground(new java.awt.Color(83, 84, 81));
        lblPais.setText("País:");
        lblPais.setToolTipText("");

        jtxtPais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblCidade.setBackground(new java.awt.Color(101, 16, 197));
        lblCidade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(83, 84, 81));
        lblCidade.setText("Cidade:");
        lblCidade.setToolTipText("");

        jtxtCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblNumero.setBackground(new java.awt.Color(101, 16, 197));
        lblNumero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(83, 84, 81));
        lblNumero.setText("Número:");
        lblNumero.setToolTipText("");

        lblData.setBackground(new java.awt.Color(101, 16, 197));
        lblData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(83, 84, 81));
        lblData.setText("Data nascimento:");
        lblData.setToolTipText("");

        jtxtNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblFuncao.setBackground(new java.awt.Color(101, 16, 197));
        lblFuncao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFuncao.setForeground(new java.awt.Color(83, 84, 81));
        lblFuncao.setText("Função:");
        lblFuncao.setToolTipText("");

        lblCPF.setBackground(new java.awt.Color(101, 16, 197));
        lblCPF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(83, 84, 81));
        lblCPF.setText("CPF:");
        lblCPF.setToolTipText("");

        jtxtCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        jtxtObs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscroll.setViewportView(jtxtObs);

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

        lblBairro.setBackground(new java.awt.Color(101, 16, 197));
        lblBairro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(83, 84, 81));
        lblBairro.setText("Bairro:");
        lblBairro.setToolTipText("");

        jtxtComplemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "BOMBONIERE", "TICKET", "BOMBONIERE E TICKET" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(lblNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblComplemento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRua, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRG, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblBairro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblObs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtRua)
                                        .addComponent(jtxtEstado)
                                        .addComponent(jtxtTelefone)
                                        .addComponent(jtxtSenha)
                                        .addComponent(jtxtRG)
                                        .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtComplemento))
                                    .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblData)
                                            .addComponent(lblPais, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblFuncao, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtxtCPF)
                                            .addComponent(jtxtEmail)
                                            .addComponent(jtxtPais)
                                            .addComponent(jtxtCidade)
                                            .addComponent(jtxtNumero)
                                            .addComponent(combobox, 0, 285, Short.MAX_VALUE)
                                            .addComponent(jdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblCadastro)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRG)
                            .addComponent(jtxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSenha)
                            .addComponent(jtxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(jtxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstado)
                            .addComponent(jtxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRua)
                            .addComponent(jtxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComplemento)
                            .addComponent(jtxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblData)
                            .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(jtxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPais)
                            .addComponent(jtxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidade)
                            .addComponent(jtxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(jtxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFuncao)
                            .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObs))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            //COLETANDO DADOS
            String name = jtxtNome.getText();
            String RG = jtxtRG.getText();
            String password = jtxtSenha.getText();
            String phone = jtxtTelefone.getText();
            String state = jtxtEstado.getText();
            String street = jtxtRua.getText();
            String complement = jtxtComplemento.getText();
            String neighborhood = jtxtBairro.getText();
            Date birthDate = jdate.getDate();
            String ITR = jtxtCPF.getText();
            String email = jtxtEmail.getText();
            String country = jtxtPais.getText();
            String city = jtxtCidade.getText();
            String note = jtxtObs.getText();
            int number = Integer.parseInt(jtxtNumero.getText());
            String selected = (String) combobox.getSelectedItem();
            int selectedNumber;
            if (selected == "ADMINISTRADOR") {
                selectedNumber = 0;
            } else if (selected == "BOMBONIERE") {
                selectedNumber = 1;
            } else if (selected == "TICKET") {
                selectedNumber = 2;
            } else {
                selectedNumber = 3;
            }   
            //VERIFICANDO DADOS
            if (name.isEmpty()) {
                showMessage(false, "Nome inválido");
            } else if (RG.isEmpty()) {
                showMessage(false, "RG inválido");
            } else if (password.isEmpty()) {
                showMessage(false, "Senha inválida");
            } else if (phone.isEmpty()) {
                showMessage(false, "Telefone inválido");
            } else if (state.isEmpty()) {
                showMessage(false, "Estado inválido");
            } else if (street.isEmpty()) {
                showMessage(false, "Rua inválida");
            } else if (complement.isEmpty()) {
                showMessage(false, "Complemento inválido");
            } else if (neighborhood.isEmpty()) {
                showMessage(false, "Bairro inválido");
            } else if (birthDate == null) {
                showMessage(false, "Data inválida");
            } else if (ITR.isEmpty()) {
                showMessage(false, "CPF inválido");
            } else if (email.isEmpty()) {
                showMessage(false, "Email inválido");
            } else if (country.isEmpty()) {
                showMessage(false, "País inválido");
            } else if (city.isEmpty()) {
                showMessage(false, "Cidade inválida");
            } 
            controller.addEmployee(name, RG, password, phone, state, street, complement, neighborhood, birthDate, ITR, email, country, city, note, number, selectedNumber);
            
            
        } catch (NumberFormatException e) {
            showMessage(false, "Número inválido");
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
    private javax.swing.JComboBox<Object> combobox;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JScrollPane jscroll;
    private javax.swing.JTextField jtxtBairro;
    private javax.swing.JTextField jtxtCPF;
    private javax.swing.JTextField jtxtCidade;
    private javax.swing.JTextField jtxtComplemento;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtEstado;
    private javax.swing.JTextField jtxtNome;
    private javax.swing.JTextField jtxtNumero;
    private javax.swing.JTextPane jtxtObs;
    private javax.swing.JTextField jtxtPais;
    private javax.swing.JTextField jtxtRG;
    private javax.swing.JTextField jtxtRua;
    private javax.swing.JTextField jtxtSenha;
    private javax.swing.JTextField jtxtTelefone;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables
}
