
package form;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.border.EmptyBorder;
import main.Main;

public class MainForm extends javax.swing.JPanel {
    
    private Main main;
    
    public MainForm(Main main) {
        initComponents();
        setOpaque(true);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 20, 10, 20));
        this.main = main;
    }
    
    public void showForm (Component form) {
        removeAll();
        add(form);
        repaint();
        revalidate();
    }

    public Main getMain() {
        return main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(203, 204, 215));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
