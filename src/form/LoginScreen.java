package form;

import main.Main;
import model.Employee;
import model.controllers.loginController;
//import net.miginfocom.swing.MigLayout;
//import org.jdesktop.animation.timing.Animator;
//import org.jdesktop.animation.timing.TimingTarget;
//import org.jdesktop.animation.timing.TimingTargetAdapter;
//import swing.Message;

public class LoginScreen extends javax.swing.JFrame {
    
    //private MigLayout layout;
    private loginController controller;
    
    public LoginScreen() {
        initComponents();
        controller = new loginController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtCPF = new swing.TFandPF.TextField();
        jtxtSenha = new swing.TFandPF.PasswordField();
        btnLogar = new swing.Button();
        lblbg = new javax.swing.JLabel();
        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SYSCINE");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtCPF.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCPF.setToolTipText("");
        jtxtCPF.setLabelText("CPF");
        jtxtCPF.setLineColor(new java.awt.Color(101, 16, 197));
        jtxtCPF.setSelectionColor(new java.awt.Color(101, 16, 197));
        jtxtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 380, -1));

        jtxtSenha.setBackground(new java.awt.Color(255, 255, 255));
        jtxtSenha.setLabelText("SENHA");
        jtxtSenha.setLineColor(new java.awt.Color(101, 16, 197));
        jtxtSenha.setSelectionColor(new java.awt.Color(101, 16, 197));
        getContentPane().add(jtxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 380, -1));

        btnLogar.setBackground(new java.awt.Color(101, 16, 197));
        btnLogar.setForeground(new java.awt.Color(255, 255, 255));
        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 140, -1));

        lblbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tela login.png"))); // NOI18N
        getContentPane().add(lblbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCPFActionPerformed

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        // TODO add your handling code here:
        String cpf = jtxtCPF.getText();
        String password = jtxtSenha.getText();
        Employee test = controller.login(cpf, password);
        if (test != null) {
            Main main = new Main(test);
            main.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnLogarActionPerformed

/*    public void showMessage(Message.MessageType messageType, String message) {
        Message ms = new Message();
        ms.showMessage(messageType, message);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void begin() {
                if (!ms.isShow()) {
                    bg.add(ms, "pos 0.5al -30", 0); //  Insert to bg fist index 0
                    ms.setVisible(true);
                    bg.repaint();
                }
            }

            @Override
            public void timingEvent(float fraction) {
                float f;
                if (ms.isShow()) {
                    f = 40 * (1f - fraction);
                } else {
                    f = 40 * fraction;
                }
                layout.setComponentConstraints(ms, "pos 0.5al " + (int) (f - 30));
                bg.repaint();
                bg.revalidate();
            }

            @Override
            public void end() {
                if (ms.isShow()) {
                    bg.remove(ms);
                    bg.repaint();
                    bg.revalidate();
                } else {
                    ms.setShow(true);
                }
            }
        };
        Animator animator = new Animator(300, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    animator.start();
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
            }
        }).start();
    } */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    private swing.Button btnLogar;
    private swing.TFandPF.TextField jtxtCPF;
    private swing.TFandPF.PasswordField jtxtSenha;
    private javax.swing.JLabel lblbg;
    // End of variables declaration//GEN-END:variables
}
