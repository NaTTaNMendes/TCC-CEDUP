package form.Employee;

import form.MainForm;
import java.util.Date;
import model.Employee;
import model.controllers.employeeController;
import swing.Message;

public class alterEmployee extends javax.swing.JPanel {

    private MainForm main;
    private Employee employee;
    private employeeController controller;
    private boolean permission;
    
    public alterEmployee(MainForm main, Employee employee, boolean permission) {
        initComponents();
        setOpaque(false);
        this.main = main;
        this.permission = permission;
        controller = new employeeController(this);
        this.employee = employee;
        setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNovaVenda = new javax.swing.JLabel();
        btnAlterar = new swing.Button();
        btnVoltar = new swing.Button();
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
        lblBairro = new javax.swing.JLabel();
        jtxtComplemento = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        lblRG = new javax.swing.JLabel();
        jtxtRG = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        jtxtSenha = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        jtxtPais = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jtxtCidade = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        jdate = new com.toedter.calendar.JDateChooser();
        lblData = new javax.swing.JLabel();
        jtxtNumero = new javax.swing.JTextField();
        lblFuncao = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        jtxtCPF = new javax.swing.JTextField();
        jscroll = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        lblObs = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblNovaVenda.setBackground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblNovaVenda.setForeground(new java.awt.Color(101, 16, 197));
        lblNovaVenda.setText("Alterar funcionário");
        lblNovaVenda.setToolTipText("");

        btnAlterar.setBackground(new java.awt.Color(101, 16, 197));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(101, 16, 197));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

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

        lblBairro.setBackground(new java.awt.Color(101, 16, 197));
        lblBairro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(83, 84, 81));
        lblBairro.setText("Bairro:");
        lblBairro.setToolTipText("");

        jtxtComplemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

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

        jtxtPais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblCidade.setBackground(new java.awt.Color(101, 16, 197));
        lblCidade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(83, 84, 81));
        lblCidade.setText("Cidade:");
        lblCidade.setToolTipText("");

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "BOMBONIERE", "TICKET", "BOMBONIERE E TICKET" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblNovaVenda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(lblNome))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblComplemento, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblRua, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblRG, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtRua)
                                    .addComponent(jtxtEstado)
                                    .addComponent(jtxtTelefone)
                                    .addComponent(jtxtSenha)
                                    .addComponent(jtxtRG)
                                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
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
                                    .addComponent(jdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(397, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblNovaVenda)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jtxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairro)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblObs)))
                .addGap(119, 119, 119))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        main.showForm(new EmployeeData(main, employee, permission));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

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
            controller.alterEmployee(employee.getId(), name, RG, password, phone, state, street, complement, neighborhood, birthDate, ITR, email, country, city, note, number, selectedNumber, employee.getIdaddress());
            employee = controller.findId(employee.getId());
    }//GEN-LAST:event_btnAlterarActionPerformed
    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }
    
    public void setData () {
        jtxtBairro.setText(employee.getNeighborhood());
        jtxtCPF.setText(employee.getITR());
        jtxtCidade.setText(employee.getCity());
        jtxtComplemento.setText(employee.getComplement());
        jtxtEmail.setText(employee.getEmail());
        jtxtEstado.setText(employee.getState());
        jtxtNome.setText(employee.getName());
        jtxtNumero.setText(String.valueOf(employee.getNumber()));
        jtxtObs.setText(employee.getNote());
        jtxtPais.setText(employee.getCountry());
        jtxtRG.setText(employee.getRg());
        jtxtRua.setText(employee.getStreet());
        jtxtSenha.setText(employee.getPassword());
        jtxtTelefone.setText(employee.getPhone());
        jdate.setDate(employee.getBirthDate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnAlterar;
    private swing.Button btnVoltar;
    private javax.swing.JComboBox<String> combobox;
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
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNovaVenda;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables
}
