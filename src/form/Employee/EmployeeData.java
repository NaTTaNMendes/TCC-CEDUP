package form.Employee;

import form.MainForm;
import javax.swing.JOptionPane;
import model.Employee;
import model.controllers.employeeController;
import swing.Message;

public class EmployeeData extends javax.swing.JPanel {

    private MainForm main;
    private Employee employee;
    private employeeController controller;
    private boolean permission;
    
    public EmployeeData(MainForm main, Employee employee, boolean permission) {
        initComponents();
        this.main = main;
        this.permission = permission;
        controller = new employeeController(this);
        this.employee = employee;
        setData();
        jtxtObs.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblObs = new javax.swing.JLabel();
        btnAlterar = new swing.Button();
        lblEmail = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblDados = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblFuncao = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        jscroll = new javax.swing.JScrollPane();
        jtxtObs = new javax.swing.JTextPane();
        lblComplemento = new javax.swing.JLabel();
        btnVoltar = new swing.Button();
        btnDeletar = new swing.Button();
        lblBairro = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblRG1 = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();
        lblTelefone1 = new javax.swing.JLabel();
        lblEstado1 = new javax.swing.JLabel();
        lblRua1 = new javax.swing.JLabel();
        lblComplemento1 = new javax.swing.JLabel();
        lblBairro1 = new javax.swing.JLabel();
        lblData1 = new javax.swing.JLabel();
        lblCPF1 = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblPais1 = new javax.swing.JLabel();
        lblCidade1 = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        lblFuncao1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblObs.setBackground(new java.awt.Color(101, 16, 197));
        lblObs.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblObs.setForeground(new java.awt.Color(83, 84, 81));
        lblObs.setText("Observação:");
        lblObs.setToolTipText("");

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

        lblPais.setBackground(new java.awt.Color(101, 16, 197));
        lblPais.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPais.setForeground(new java.awt.Color(83, 84, 81));
        lblPais.setText("País:");
        lblPais.setToolTipText("");

        lblDados.setBackground(new java.awt.Color(101, 16, 197));
        lblDados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblDados.setForeground(new java.awt.Color(101, 16, 197));
        lblDados.setText("Dados usuário");
        lblDados.setToolTipText("");

        lblNome.setBackground(new java.awt.Color(101, 16, 197));
        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(83, 84, 81));
        lblNome.setText("Nome:");
        lblNome.setToolTipText("");

        lblCidade.setBackground(new java.awt.Color(101, 16, 197));
        lblCidade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(83, 84, 81));
        lblCidade.setText("Cidade:");
        lblCidade.setToolTipText("");

        lblRG.setBackground(new java.awt.Color(101, 16, 197));
        lblRG.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblRG.setForeground(new java.awt.Color(83, 84, 81));
        lblRG.setText("RG:");
        lblRG.setToolTipText("");

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

        lblSenha.setBackground(new java.awt.Color(101, 16, 197));
        lblSenha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(83, 84, 81));
        lblSenha.setText("Senha:");
        lblSenha.setToolTipText("");

        lblTelefone.setBackground(new java.awt.Color(101, 16, 197));
        lblTelefone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(83, 84, 81));
        lblTelefone.setText("Telefone:");
        lblTelefone.setToolTipText("");

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

        lblEstado.setBackground(new java.awt.Color(101, 16, 197));
        lblEstado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(83, 84, 81));
        lblEstado.setText("Estado:");
        lblEstado.setToolTipText("");

        lblRua.setBackground(new java.awt.Color(101, 16, 197));
        lblRua.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblRua.setForeground(new java.awt.Color(83, 84, 81));
        lblRua.setText("Rua:");
        lblRua.setToolTipText("");

        jtxtObs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
        jscroll.setViewportView(jtxtObs);

        lblComplemento.setBackground(new java.awt.Color(101, 16, 197));
        lblComplemento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblComplemento.setForeground(new java.awt.Color(83, 84, 81));
        lblComplemento.setText("Complemento:");
        lblComplemento.setToolTipText("");

        btnVoltar.setBackground(new java.awt.Color(101, 16, 197));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
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

        lblBairro.setBackground(new java.awt.Color(101, 16, 197));
        lblBairro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(83, 84, 81));
        lblBairro.setText("Bairro:");
        lblBairro.setToolTipText("");

        lblNome1.setBackground(new java.awt.Color(101, 16, 197));
        lblNome1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(83, 84, 81));
        lblNome1.setText("Nome:");
        lblNome1.setToolTipText("");

        lblRG1.setBackground(new java.awt.Color(101, 16, 197));
        lblRG1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblRG1.setForeground(new java.awt.Color(83, 84, 81));
        lblRG1.setText("RG:");
        lblRG1.setToolTipText("");

        lblSenha1.setBackground(new java.awt.Color(101, 16, 197));
        lblSenha1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSenha1.setForeground(new java.awt.Color(83, 84, 81));
        lblSenha1.setText("Senha:");
        lblSenha1.setToolTipText("");

        lblTelefone1.setBackground(new java.awt.Color(101, 16, 197));
        lblTelefone1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTelefone1.setForeground(new java.awt.Color(83, 84, 81));
        lblTelefone1.setText("Telefone:");
        lblTelefone1.setToolTipText("");

        lblEstado1.setBackground(new java.awt.Color(101, 16, 197));
        lblEstado1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEstado1.setForeground(new java.awt.Color(83, 84, 81));
        lblEstado1.setText("Estado:");
        lblEstado1.setToolTipText("");

        lblRua1.setBackground(new java.awt.Color(101, 16, 197));
        lblRua1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblRua1.setForeground(new java.awt.Color(83, 84, 81));
        lblRua1.setText("Rua:");
        lblRua1.setToolTipText("");

        lblComplemento1.setBackground(new java.awt.Color(101, 16, 197));
        lblComplemento1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblComplemento1.setForeground(new java.awt.Color(83, 84, 81));
        lblComplemento1.setText("Complemento:");
        lblComplemento1.setToolTipText("");

        lblBairro1.setBackground(new java.awt.Color(101, 16, 197));
        lblBairro1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblBairro1.setForeground(new java.awt.Color(83, 84, 81));
        lblBairro1.setText("Bairro:");
        lblBairro1.setToolTipText("");

        lblData1.setBackground(new java.awt.Color(101, 16, 197));
        lblData1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData1.setForeground(new java.awt.Color(83, 84, 81));
        lblData1.setText("Data nascimento:");
        lblData1.setToolTipText("");

        lblCPF1.setBackground(new java.awt.Color(101, 16, 197));
        lblCPF1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCPF1.setForeground(new java.awt.Color(83, 84, 81));
        lblCPF1.setText("CPF:");
        lblCPF1.setToolTipText("");

        lblEmail1.setBackground(new java.awt.Color(101, 16, 197));
        lblEmail1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail1.setForeground(new java.awt.Color(83, 84, 81));
        lblEmail1.setText("Email:");
        lblEmail1.setToolTipText("");

        lblPais1.setBackground(new java.awt.Color(101, 16, 197));
        lblPais1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPais1.setForeground(new java.awt.Color(83, 84, 81));
        lblPais1.setText("País:");
        lblPais1.setToolTipText("");

        lblCidade1.setBackground(new java.awt.Color(101, 16, 197));
        lblCidade1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCidade1.setForeground(new java.awt.Color(83, 84, 81));
        lblCidade1.setText("Cidade:");
        lblCidade1.setToolTipText("");

        lblNumero1.setBackground(new java.awt.Color(101, 16, 197));
        lblNumero1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNumero1.setForeground(new java.awt.Color(83, 84, 81));
        lblNumero1.setText("Número:");
        lblNumero1.setToolTipText("");

        lblFuncao1.setBackground(new java.awt.Color(101, 16, 197));
        lblFuncao1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFuncao1.setForeground(new java.awt.Color(83, 84, 81));
        lblFuncao1.setText("Função:");
        lblFuncao1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(lblNome))
                            .addComponent(lblComplemento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBairro, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSenha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEstado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRua1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblComplemento1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(lblBairro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblPais, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFuncao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblData1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(lblCPF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPais1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCidade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFuncao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblDados))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(lblObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblDados)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(lblNome1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRG)
                            .addComponent(lblRG1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSenha)
                            .addComponent(lblSenha1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(lblTelefone1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstado)
                            .addComponent(lblEstado1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRua)
                            .addComponent(lblRua1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComplemento)
                            .addComponent(lblComplemento1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(lblData1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(lblCPF1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(lblEmail1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPais)
                            .addComponent(lblPais1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidade)
                            .addComponent(lblCidade1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(lblNumero1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFuncao)
                            .addComponent(lblFuncao1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(lblBairro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObs))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        main.showForm(new Registered(main, permission));
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (permission == true) {
            main.showForm(new alterEmployee(main, employee, permission));
        } else {
            showMessage(false, "Usuário não autorizado para esta função");
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (permission == true) {
            int a = JOptionPane.showConfirmDialog(null, "Deseja deletar o usuário?", "Deletar usuário", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                boolean test = controller.deleteEmployee(employee);
                if (test) {
                    main.showForm(new Registered(main, permission));
                }
            }
        } else {
            showMessage(false, "Usuário não autorizado para esta função");
        }
        
    }//GEN-LAST:event_btnDeletarActionPerformed
    
    
    //MÉTODO PARA SETAR OS DADOS NOS CAMPOS
    private void setData (){
        lblBairro1.setText(employee.getNeighborhood());
        lblCPF1.setText(employee.getITR());
        lblCidade1.setText(employee.getCity());
        lblComplemento1.setText(employee.getComplement());
        lblData1.setText(employee.getBirthDate().toString());
        lblEmail1.setText(employee.getEmail());
        lblEstado1.setText(employee.getState());
        String funcao = "";
        switch (employee.getFunction()) {
            case 0: funcao = "ADMINISTRADOR";
            break;
            case 1: funcao = "BOMBONIERE";
            break;
            case 2: funcao = "TICKET";
            break;
            case 3: funcao = "TICKET AND BOMBONIERE";
            break;                
        }
        lblFuncao1.setText(funcao);
        lblNome1.setText(employee.getName());
        lblNumero1.setText(String.valueOf(employee.getNumber()));
        lblPais1.setText(employee.getCountry());
        lblRG1.setText(employee.getRg());
        lblRua1.setText(employee.getStreet());
        lblSenha1.setText(employee.getPassword());
        lblTelefone1.setText(employee.getPhone());
        jtxtObs.setText(employee.getNote());
    }
    
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
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBairro1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPF1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCidade1;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblComplemento1;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblFuncao;
    private javax.swing.JLabel lblFuncao1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPais1;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRG1;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblRua1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    // End of variables declaration//GEN-END:variables
}
