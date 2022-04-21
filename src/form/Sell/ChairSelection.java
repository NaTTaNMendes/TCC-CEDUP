package form.Sell;

import form.MainForm;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import model.Chair;
import model.PSell;
import model.Ticket;
import model.controllers.sellController;
import swing.Message;

public class ChairSelection extends javax.swing.JPanel {

    private MainForm main;
    private sellController controller;
    private List<Ticket> tickets;
    private int h;
    JButton[] buttons;
    private int normalTickets = 0;
    private int vipTickets = 0;
    private List<String> selectedChairs = new ArrayList<>();
    private boolean testQ = true;
    private PSell sell;

    public ChairSelection(MainForm main, List<Ticket> tickets, int ihall, PSell sell) {
        initComponents();
        this.main = main;
        this.sell = sell;
        this.tickets = tickets;
        h = ihall;
        controller = new sellController(this);

        lblCadeiras1.setText("");

        JButton[] button = {A1, A2, A3, A4, A5, A8, A9, A10, A11, A12, B1, B2, B3, B4, B5, B8, B9, B10,
            B11, B12, C1, C2, C3, C4, C5, C8, C9, C10, C11, C12, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11,
            D12, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11,
            F12, G1, G2, G3, G4, G5, G6, G7, G8, G9, G10, G11, G12, H1, H2, H3, H4, H5, H8, H9, H10, H11, H12,
            I1, I2, I3, I4, I5, I8, I9, I10, I11, I12, J1, J2, J3, J4, J5, J8, J9, J10, J11, J12};

        buttons = button;

        setChairsDatabase();

        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getTicketType() == 2) {
                vipTickets++;
            } else {
                normalTickets++;
            }
        }
        lblIngressosVip.setText(String.valueOf(vipTickets));
        lblIngressos1.setText(String.valueOf(normalTickets));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelecione = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        I1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        J1 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        I2 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        J2 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        H4 = new javax.swing.JButton();
        I3 = new javax.swing.JButton();
        J4 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        J3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        I4 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        H5 = new javax.swing.JButton();
        J5 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        I5 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        I8 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        H12 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        J12 = new javax.swing.JButton();
        H8 = new javax.swing.JButton();
        A12 = new javax.swing.JButton();
        J8 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        C12 = new javax.swing.JButton();
        E9 = new javax.swing.JButton();
        D12 = new javax.swing.JButton();
        I9 = new javax.swing.JButton();
        E12 = new javax.swing.JButton();
        I12 = new javax.swing.JButton();
        F9 = new javax.swing.JButton();
        G9 = new javax.swing.JButton();
        H9 = new javax.swing.JButton();
        J9 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        D9 = new javax.swing.JButton();
        F11 = new javax.swing.JButton();
        D10 = new javax.swing.JButton();
        G11 = new javax.swing.JButton();
        E10 = new javax.swing.JButton();
        H11 = new javax.swing.JButton();
        I10 = new javax.swing.JButton();
        J11 = new javax.swing.JButton();
        F10 = new javax.swing.JButton();
        A11 = new javax.swing.JButton();
        G10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        H10 = new javax.swing.JButton();
        C11 = new javax.swing.JButton();
        J10 = new javax.swing.JButton();
        D11 = new javax.swing.JButton();
        A10 = new javax.swing.JButton();
        E11 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        I11 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        F12 = new javax.swing.JButton();
        G12 = new javax.swing.JButton();
        lblCadeiras = new javax.swing.JLabel();
        btnContinuar = new swing.Button();
        lblIngressos = new javax.swing.JLabel();
        btnCancelar = new swing.Button();
        D6 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        E7 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        lblIngressosVips = new javax.swing.JLabel();
        lblProduto4 = new javax.swing.JLabel();
        lblProduto5 = new javax.swing.JLabel();
        lblProduto6 = new javax.swing.JLabel();
        lblProduto7 = new javax.swing.JLabel();
        lblProduto8 = new javax.swing.JLabel();
        lblProduto9 = new javax.swing.JLabel();
        lblProduto10 = new javax.swing.JLabel();
        lblProduto11 = new javax.swing.JLabel();
        lblProduto12 = new javax.swing.JLabel();
        lblProduto13 = new javax.swing.JLabel();
        lblProduto14 = new javax.swing.JLabel();
        lblProduto15 = new javax.swing.JLabel();
        lblProduto16 = new javax.swing.JLabel();
        lblProduto17 = new javax.swing.JLabel();
        lblProduto18 = new javax.swing.JLabel();
        lblProduto19 = new javax.swing.JLabel();
        lblProduto20 = new javax.swing.JLabel();
        lblProduto21 = new javax.swing.JLabel();
        lblProduto22 = new javax.swing.JLabel();
        lblProduto23 = new javax.swing.JLabel();
        lblProduto24 = new javax.swing.JLabel();
        lblProduto25 = new javax.swing.JLabel();
        lblCadeiras1 = new javax.swing.JLabel();
        lblIngressos1 = new javax.swing.JLabel();
        lblIngressosVip = new javax.swing.JLabel();

        setBackground(new java.awt.Color(203, 204, 215));

        lblSelecione.setBackground(new java.awt.Color(101, 16, 197));
        lblSelecione.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSelecione.setForeground(new java.awt.Color(101, 16, 197));
        lblSelecione.setText("Selecione as cadeiras");
        lblSelecione.setToolTipText("");

        B1.setBackground(new java.awt.Color(101, 16, 197));
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(101, 16, 197));
        C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        D1.setBackground(new java.awt.Color(101, 16, 197));
        D1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        E1.setBackground(new java.awt.Color(101, 16, 197));
        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        I1.setBackground(new java.awt.Color(101, 16, 197));
        I1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });

        F1.setBackground(new java.awt.Color(101, 16, 197));
        F1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        G1.setBackground(new java.awt.Color(101, 16, 197));
        G1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        H1.setBackground(new java.awt.Color(101, 16, 197));
        H1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        J1.setBackground(new java.awt.Color(101, 16, 197));
        J1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        A1.setBackground(new java.awt.Color(101, 16, 197));
        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        E2.setBackground(new java.awt.Color(101, 16, 197));
        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        I2.setBackground(new java.awt.Color(101, 16, 197));
        I2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I2ActionPerformed(evt);
            }
        });

        F2.setBackground(new java.awt.Color(101, 16, 197));
        F2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        G2.setBackground(new java.awt.Color(101, 16, 197));
        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        H2.setBackground(new java.awt.Color(101, 16, 197));
        H2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });

        J2.setBackground(new java.awt.Color(101, 16, 197));
        J2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J2ActionPerformed(evt);
            }
        });

        A2.setBackground(new java.awt.Color(101, 16, 197));
        A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(101, 16, 197));
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(101, 16, 197));
        C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        D2.setBackground(new java.awt.Color(101, 16, 197));
        D2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        F4.setBackground(new java.awt.Color(101, 16, 197));
        F4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        D3.setBackground(new java.awt.Color(101, 16, 197));
        D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        G4.setBackground(new java.awt.Color(101, 16, 197));
        G4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        E3.setBackground(new java.awt.Color(101, 16, 197));
        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        H4.setBackground(new java.awt.Color(101, 16, 197));
        H4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H4ActionPerformed(evt);
            }
        });

        I3.setBackground(new java.awt.Color(101, 16, 197));
        I3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I3ActionPerformed(evt);
            }
        });

        J4.setBackground(new java.awt.Color(101, 16, 197));
        J4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        F3.setBackground(new java.awt.Color(101, 16, 197));
        F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        A4.setBackground(new java.awt.Color(101, 16, 197));
        A4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        G3.setBackground(new java.awt.Color(101, 16, 197));
        G3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(101, 16, 197));
        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        H3.setBackground(new java.awt.Color(101, 16, 197));
        H3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(101, 16, 197));
        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        J3.setBackground(new java.awt.Color(101, 16, 197));
        J3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });

        D4.setBackground(new java.awt.Color(101, 16, 197));
        D4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        A3.setBackground(new java.awt.Color(101, 16, 197));
        A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        E4.setBackground(new java.awt.Color(101, 16, 197));
        E4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(101, 16, 197));
        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        I4.setBackground(new java.awt.Color(101, 16, 197));
        I4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(101, 16, 197));
        C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        F5.setBackground(new java.awt.Color(101, 16, 197));
        F5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        G5.setBackground(new java.awt.Color(101, 16, 197));
        G5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });

        H5.setBackground(new java.awt.Color(101, 16, 197));
        H5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H5ActionPerformed(evt);
            }
        });

        J5.setBackground(new java.awt.Color(101, 16, 197));
        J5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J5ActionPerformed(evt);
            }
        });

        A5.setBackground(new java.awt.Color(101, 16, 197));
        A5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(101, 16, 197));
        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(101, 16, 197));
        C5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        D5.setBackground(new java.awt.Color(101, 16, 197));
        D5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        E5.setBackground(new java.awt.Color(101, 16, 197));
        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        I5.setBackground(new java.awt.Color(101, 16, 197));
        I5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I5ActionPerformed(evt);
            }
        });

        D8.setBackground(new java.awt.Color(101, 16, 197));
        D8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        E8.setBackground(new java.awt.Color(101, 16, 197));
        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });

        I8.setBackground(new java.awt.Color(101, 16, 197));
        I8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I8ActionPerformed(evt);
            }
        });

        F8.setBackground(new java.awt.Color(101, 16, 197));
        F8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });

        H12.setBackground(new java.awt.Color(101, 16, 197));
        H12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H12ActionPerformed(evt);
            }
        });

        G8.setBackground(new java.awt.Color(101, 16, 197));
        G8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G8ActionPerformed(evt);
            }
        });

        J12.setBackground(new java.awt.Color(101, 16, 197));
        J12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J12ActionPerformed(evt);
            }
        });

        H8.setBackground(new java.awt.Color(101, 16, 197));
        H8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H8ActionPerformed(evt);
            }
        });

        A12.setBackground(new java.awt.Color(101, 16, 197));
        A12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });

        J8.setBackground(new java.awt.Color(101, 16, 197));
        J8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J8ActionPerformed(evt);
            }
        });

        B12.setBackground(new java.awt.Color(101, 16, 197));
        B12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        A8.setBackground(new java.awt.Color(101, 16, 197));
        A8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        C12.setBackground(new java.awt.Color(101, 16, 197));
        C12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });

        E9.setBackground(new java.awt.Color(101, 16, 197));
        E9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E9ActionPerformed(evt);
            }
        });

        D12.setBackground(new java.awt.Color(101, 16, 197));
        D12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D12ActionPerformed(evt);
            }
        });

        I9.setBackground(new java.awt.Color(101, 16, 197));
        I9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I9ActionPerformed(evt);
            }
        });

        E12.setBackground(new java.awt.Color(101, 16, 197));
        E12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E12ActionPerformed(evt);
            }
        });

        I12.setBackground(new java.awt.Color(101, 16, 197));
        I12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I12ActionPerformed(evt);
            }
        });

        F9.setBackground(new java.awt.Color(101, 16, 197));
        F9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F9ActionPerformed(evt);
            }
        });

        G9.setBackground(new java.awt.Color(101, 16, 197));
        G9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G9ActionPerformed(evt);
            }
        });

        H9.setBackground(new java.awt.Color(101, 16, 197));
        H9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H9ActionPerformed(evt);
            }
        });

        J9.setBackground(new java.awt.Color(101, 16, 197));
        J9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J9ActionPerformed(evt);
            }
        });

        A9.setBackground(new java.awt.Color(101, 16, 197));
        A9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(101, 16, 197));
        B9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(101, 16, 197));
        C9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        D9.setBackground(new java.awt.Color(101, 16, 197));
        D9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });

        F11.setBackground(new java.awt.Color(101, 16, 197));
        F11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F11ActionPerformed(evt);
            }
        });

        D10.setBackground(new java.awt.Color(101, 16, 197));
        D10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D10ActionPerformed(evt);
            }
        });

        G11.setBackground(new java.awt.Color(101, 16, 197));
        G11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G11ActionPerformed(evt);
            }
        });

        E10.setBackground(new java.awt.Color(101, 16, 197));
        E10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E10ActionPerformed(evt);
            }
        });

        H11.setBackground(new java.awt.Color(101, 16, 197));
        H11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H11ActionPerformed(evt);
            }
        });

        I10.setBackground(new java.awt.Color(101, 16, 197));
        I10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I10ActionPerformed(evt);
            }
        });

        J11.setBackground(new java.awt.Color(101, 16, 197));
        J11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J11ActionPerformed(evt);
            }
        });

        F10.setBackground(new java.awt.Color(101, 16, 197));
        F10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F10ActionPerformed(evt);
            }
        });

        A11.setBackground(new java.awt.Color(101, 16, 197));
        A11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });

        G10.setBackground(new java.awt.Color(101, 16, 197));
        G10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G10ActionPerformed(evt);
            }
        });

        B11.setBackground(new java.awt.Color(101, 16, 197));
        B11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        H10.setBackground(new java.awt.Color(101, 16, 197));
        H10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        H10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H10ActionPerformed(evt);
            }
        });

        C11.setBackground(new java.awt.Color(101, 16, 197));
        C11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });

        J10.setBackground(new java.awt.Color(101, 16, 197));
        J10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        J10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J10ActionPerformed(evt);
            }
        });

        D11.setBackground(new java.awt.Color(101, 16, 197));
        D11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D11ActionPerformed(evt);
            }
        });

        A10.setBackground(new java.awt.Color(101, 16, 197));
        A10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });

        E11.setBackground(new java.awt.Color(101, 16, 197));
        E11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E11ActionPerformed(evt);
            }
        });

        B10.setBackground(new java.awt.Color(101, 16, 197));
        B10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        I11.setBackground(new java.awt.Color(101, 16, 197));
        I11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        I11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I11ActionPerformed(evt);
            }
        });

        C10.setBackground(new java.awt.Color(101, 16, 197));
        C10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(101, 16, 197));
        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        C8.setBackground(new java.awt.Color(101, 16, 197));
        C8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        F12.setBackground(new java.awt.Color(101, 16, 197));
        F12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F12ActionPerformed(evt);
            }
        });

        G12.setBackground(new java.awt.Color(101, 16, 197));
        G12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G12ActionPerformed(evt);
            }
        });

        lblCadeiras.setBackground(new java.awt.Color(101, 16, 197));
        lblCadeiras.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCadeiras.setForeground(new java.awt.Color(83, 84, 81));
        lblCadeiras.setText("Cadeiras selecionadas:");
        lblCadeiras.setToolTipText("");

        btnContinuar.setBackground(new java.awt.Color(101, 16, 197));
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        lblIngressos.setBackground(new java.awt.Color(101, 16, 197));
        lblIngressos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblIngressos.setForeground(new java.awt.Color(83, 84, 81));
        lblIngressos.setText("Ingressos disponíveis:");
        lblIngressos.setToolTipText("");

        btnCancelar.setBackground(new java.awt.Color(101, 16, 197));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        D6.setBackground(new java.awt.Color(101, 16, 197));
        D6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        D7.setBackground(new java.awt.Color(101, 16, 197));
        D7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        E6.setBackground(new java.awt.Color(101, 16, 197));
        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });

        E7.setBackground(new java.awt.Color(101, 16, 197));
        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });

        F6.setBackground(new java.awt.Color(101, 16, 197));
        F6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        F7.setBackground(new java.awt.Color(101, 16, 197));
        F7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });

        G6.setBackground(new java.awt.Color(101, 16, 197));
        G6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G6ActionPerformed(evt);
            }
        });

        G7.setBackground(new java.awt.Color(101, 16, 197));
        G7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assento.png"))); // NOI18N
        G7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G7ActionPerformed(evt);
            }
        });

        lblIngressosVips.setBackground(new java.awt.Color(101, 16, 197));
        lblIngressosVips.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblIngressosVips.setForeground(new java.awt.Color(83, 84, 81));
        lblIngressosVips.setText("Ingressos vips disponíveis:");
        lblIngressosVips.setToolTipText("");

        lblProduto4.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto4.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto4.setText("A");
        lblProduto4.setToolTipText("");

        lblProduto5.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto5.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto5.setText("B");
        lblProduto5.setToolTipText("");

        lblProduto6.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto6.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto6.setText("C");
        lblProduto6.setToolTipText("");

        lblProduto7.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto7.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto7.setText("D");
        lblProduto7.setToolTipText("");

        lblProduto8.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto8.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto8.setText("F");
        lblProduto8.setToolTipText("");

        lblProduto9.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto9.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto9.setText("E");
        lblProduto9.setToolTipText("");

        lblProduto10.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto10.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto10.setText("I");
        lblProduto10.setToolTipText("");

        lblProduto11.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto11.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto11.setText("J");
        lblProduto11.setToolTipText("");

        lblProduto12.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto12.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto12.setText("H");
        lblProduto12.setToolTipText("");

        lblProduto13.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto13.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto13.setText("G");
        lblProduto13.setToolTipText("");

        lblProduto14.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto14.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto14.setText("1");
        lblProduto14.setToolTipText("");

        lblProduto15.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto15.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto15.setText("2");
        lblProduto15.setToolTipText("");

        lblProduto16.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto16.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto16.setText("4");
        lblProduto16.setToolTipText("");

        lblProduto17.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto17.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto17.setText("3");
        lblProduto17.setToolTipText("");

        lblProduto18.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto18.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto18.setText("5");
        lblProduto18.setToolTipText("");

        lblProduto19.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto19.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto19.setText("6");
        lblProduto19.setToolTipText("");

        lblProduto20.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto20.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto20.setText("7");
        lblProduto20.setToolTipText("");

        lblProduto21.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto21.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto21.setText("8");
        lblProduto21.setToolTipText("");

        lblProduto22.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto22.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto22.setText("9");
        lblProduto22.setToolTipText("");

        lblProduto23.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto23.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto23.setText("10");
        lblProduto23.setToolTipText("");

        lblProduto24.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto24.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto24.setText("12");
        lblProduto24.setToolTipText("");

        lblProduto25.setBackground(new java.awt.Color(101, 16, 197));
        lblProduto25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblProduto25.setForeground(new java.awt.Color(83, 84, 81));
        lblProduto25.setText("11");
        lblProduto25.setToolTipText("");

        lblCadeiras1.setBackground(new java.awt.Color(101, 16, 197));
        lblCadeiras1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCadeiras1.setForeground(new java.awt.Color(83, 84, 81));
        lblCadeiras1.setText("Cadeiras selecionadas:");
        lblCadeiras1.setToolTipText("");

        lblIngressos1.setBackground(new java.awt.Color(101, 16, 197));
        lblIngressos1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblIngressos1.setForeground(new java.awt.Color(83, 84, 81));
        lblIngressos1.setText("Ingressos disponíveis:");
        lblIngressos1.setToolTipText("");

        lblIngressosVip.setBackground(new java.awt.Color(101, 16, 197));
        lblIngressosVip.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblIngressosVip.setForeground(new java.awt.Color(83, 84, 81));
        lblIngressosVip.setText("Ingressos vips disponíveis:");
        lblIngressosVip.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProduto4)
                    .addComponent(lblProduto5)
                    .addComponent(lblProduto6)
                    .addComponent(lblProduto7)
                    .addComponent(lblProduto9)
                    .addComponent(lblProduto8)
                    .addComponent(lblProduto13)
                    .addComponent(lblProduto12)
                    .addComponent(lblProduto10)
                    .addComponent(lblProduto11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1)
                    .addComponent(C1)
                    .addComponent(B1)
                    .addComponent(E1)
                    .addComponent(D1)
                    .addComponent(G1)
                    .addComponent(F1)
                    .addComponent(I1)
                    .addComponent(H1)
                    .addComponent(J1)
                    .addComponent(lblProduto14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A2)
                    .addComponent(C2)
                    .addComponent(B2)
                    .addComponent(E2)
                    .addComponent(D2)
                    .addComponent(G2)
                    .addComponent(F2)
                    .addComponent(I2)
                    .addComponent(H2)
                    .addComponent(J2)
                    .addComponent(lblProduto15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A3)
                    .addComponent(C3)
                    .addComponent(B3)
                    .addComponent(E3)
                    .addComponent(D3)
                    .addComponent(G3)
                    .addComponent(F3)
                    .addComponent(I3)
                    .addComponent(H3)
                    .addComponent(J3)
                    .addComponent(lblProduto17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProduto16)
                    .addComponent(A4)
                    .addComponent(C4)
                    .addComponent(B4)
                    .addComponent(E4)
                    .addComponent(D4)
                    .addComponent(G4)
                    .addComponent(F4)
                    .addComponent(I4)
                    .addComponent(H4)
                    .addComponent(J4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(A5)
                            .addComponent(C5)
                            .addComponent(B5)
                            .addComponent(I5)
                            .addComponent(H5)
                            .addComponent(J5)
                            .addComponent(E5)
                            .addComponent(D5)
                            .addComponent(G5)
                            .addComponent(F5)
                            .addComponent(lblProduto18))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E6)
                            .addComponent(D6)
                            .addComponent(G6)
                            .addComponent(F6)
                            .addComponent(lblProduto19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E7)
                            .addComponent(D7)
                            .addComponent(G7)
                            .addComponent(F7)
                            .addComponent(lblProduto20))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A8)
                            .addComponent(C8)
                            .addComponent(B8)
                            .addComponent(E8)
                            .addComponent(D8)
                            .addComponent(G8)
                            .addComponent(F8)
                            .addComponent(I8)
                            .addComponent(H8)
                            .addComponent(J8)
                            .addComponent(lblProduto21))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduto22)
                            .addComponent(A9)
                            .addComponent(C9)
                            .addComponent(B9)
                            .addComponent(E9)
                            .addComponent(D9)
                            .addComponent(G9)
                            .addComponent(F9)
                            .addComponent(I9)
                            .addComponent(H9)
                            .addComponent(J9))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A10)
                            .addComponent(C10)
                            .addComponent(B10)
                            .addComponent(E10)
                            .addComponent(D10)
                            .addComponent(G10)
                            .addComponent(F10)
                            .addComponent(I10)
                            .addComponent(H10)
                            .addComponent(J10)
                            .addComponent(lblProduto23))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A11)
                            .addComponent(C11)
                            .addComponent(B11)
                            .addComponent(E11)
                            .addComponent(D11)
                            .addComponent(G11)
                            .addComponent(F11)
                            .addComponent(I11)
                            .addComponent(H11)
                            .addComponent(J11)
                            .addComponent(lblProduto25))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduto24)
                            .addComponent(A12)
                            .addComponent(C12)
                            .addComponent(B12)
                            .addComponent(E12)
                            .addComponent(D12)
                            .addComponent(G12)
                            .addComponent(F12)
                            .addComponent(I12)
                            .addComponent(H12)
                            .addComponent(J12))
                        .addGap(14, 232, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblSelecione))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngressosVips)
                    .addComponent(lblIngressos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCadeiras, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIngressosVip)
                            .addComponent(lblIngressos1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblCadeiras1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelecione)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProduto25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProduto14)
                        .addComponent(lblProduto15)
                        .addComponent(lblProduto17)
                        .addComponent(lblProduto16)
                        .addComponent(lblProduto18)
                        .addComponent(lblProduto19)
                        .addComponent(lblProduto20)
                        .addComponent(lblProduto21)
                        .addComponent(lblProduto22)
                        .addComponent(lblProduto23)
                        .addComponent(lblProduto24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(A1)
                                                    .addComponent(lblProduto4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B1))
                                            .addComponent(lblProduto5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C1))
                                    .addComponent(lblProduto6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblProduto7)
                                        .addGap(42, 42, 42))
                                    .addComponent(lblProduto9))
                                .addGap(42, 42, 42))
                            .addComponent(lblProduto8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(G1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(J1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblProduto13)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblProduto12)
                                        .addGap(42, 42, 42))
                                    .addComponent(lblProduto10))
                                .addGap(42, 42, 42))
                            .addComponent(lblProduto11, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(G4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(D5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(D6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(I5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(A9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(D9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(E9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(F9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(J9))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(A10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(D10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(E10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(F10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(J10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(A11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(D11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(E11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(F11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(J11))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(A12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(D12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(E12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(F12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(J12))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(A8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(D8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(E8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(D7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(E7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(F7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G7)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(J8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIngressosVips)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblIngressos)
                                .addComponent(lblIngressos1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCadeiras)
                            .addComponent(lblCadeiras1)))
                    .addComponent(lblIngressosVip))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        main.showForm(new TicketSell(main, sell.getEmp()));
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        // main.showForm(new Payment(main, 0));
        if (normalTickets > 0 || vipTickets > 0) {
            showMessage(false, "Ingressos não utilizados");
        } else {
            for (int i = 0; i < tickets.size(); i++) {
                tickets.get(i).setSeat(selectedChairs.get(i));
            }
            main.showForm(new Payment(main, ERROR, sell, tickets));
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here: 
        A1.setName("A1");
        clickChair(A1);
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        A2.setName("A2");
        clickChair(A2);
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        A3.setName("A3");
        clickChair(A3);
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
        A4.setName("A4");
        clickChair(A4);
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        A5.setName("A5");
        clickChair(A5);
    }//GEN-LAST:event_A5ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:
        A8.setName("A8");
        clickChair(A8);
    }//GEN-LAST:event_A8ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        // TODO add your handling code here:
        A9.setName("A9");
        clickChair(A9);
    }//GEN-LAST:event_A9ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
        // TODO add your handling code here:
        A10.setName("A10");
        clickChair(A10);
    }//GEN-LAST:event_A10ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
        // TODO add your handling code here:
        A11.setName("A11");
        clickChair(A11);
    }//GEN-LAST:event_A11ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
        // TODO add your handling code here:
        A12.setName("A12");
        clickChair(A12);
    }//GEN-LAST:event_A12ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        B1.setName("B1");
        clickChair(B1);
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        B2.setName("B2");
        clickChair(B2);
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        B3.setName("B3");
        clickChair(B3);
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        B4.setName("B4");
        clickChair(B4);
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        B5.setName("B5");
        clickChair(B5);
    }//GEN-LAST:event_B5ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        B8.setName("B8");
        clickChair(B8);
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        B9.setName("B9");
        clickChair(B9);
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        // TODO add your handling code here:
        B10.setName("B10");
        clickChair(B10);
    }//GEN-LAST:event_B10ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        // TODO add your handling code here:
        B11.setName("B11");
        clickChair(B11);
    }//GEN-LAST:event_B11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        // TODO add your handling code here:
        B12.setName("B12");
        clickChair(B12);
    }//GEN-LAST:event_B12ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        C1.setName("C1");
        clickChair(C1);
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        C2.setName("C2");
        clickChair(C2);    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        C3.setName("C3");
        clickChair(C3);    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        C4.setName("C4");
        clickChair(C4);    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
       C5.setName("C5");
        clickChair(C5);    }//GEN-LAST:event_C5ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        C8.setName("C8");
        clickChair(C8);    }//GEN-LAST:event_C8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        C9.setName("C9");
        clickChair(C9);    }//GEN-LAST:event_C9ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        C10.setName("C10");
        clickChair(C10);    }//GEN-LAST:event_C10ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        C11.setName("C11");
        clickChair(C11);    }//GEN-LAST:event_C11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
        C12.setName("C12");
        clickChair(C12);    }//GEN-LAST:event_C12ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        D1.setName("D1");
        clickChair(D1);    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        D2.setName("D2");
        clickChair(D2);    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        D3.setName("D3");
        clickChair(D3);    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        D4.setName("D4");
        clickChair(D4);    }//GEN-LAST:event_D4ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        D5.setName("D5");
        clickChair(D5);    }//GEN-LAST:event_D5ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        D6.setName("D6");
        clickChair(D6);    }//GEN-LAST:event_D6ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        D7.setName("D7");
        clickChair(D7);    }//GEN-LAST:event_D7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        D8.setName("D8");
        clickChair(D8);    }//GEN-LAST:event_D8ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
        D9.setName("D9");
        clickChair(D9);    }//GEN-LAST:event_D9ActionPerformed

    private void D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D10ActionPerformed
        D10.setName("D10");
        clickChair(D10);    }//GEN-LAST:event_D10ActionPerformed

    private void D11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D11ActionPerformed
        D11.setName("D11");
        clickChair(D11);    }//GEN-LAST:event_D11ActionPerformed

    private void D12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D12ActionPerformed
        D12.setName("D12");
        clickChair(D12);    }//GEN-LAST:event_D12ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        E1.setName("E1");
        clickChair(E1);    }//GEN-LAST:event_E1ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        E2.setName("E2");
        clickChair(E2);    }//GEN-LAST:event_E2ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        E3.setName("E3");
        clickChair(E3);    }//GEN-LAST:event_E3ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        E4.setName("E4");
        clickChair(E4);    }//GEN-LAST:event_E4ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        E5.setName("E5");
        clickChair(E5);    }//GEN-LAST:event_E5ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        E6.setName("E6");
        clickChair(E6);    }//GEN-LAST:event_E6ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        E7.setName("E7");
        clickChair(E7);    }//GEN-LAST:event_E7ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        E8.setName("E8");
        clickChair(E8);    }//GEN-LAST:event_E8ActionPerformed

    private void E9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E9ActionPerformed
        E9.setName("E9");
        clickChair(E9);    }//GEN-LAST:event_E9ActionPerformed

    private void E10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E10ActionPerformed
        E10.setName("E10");
        clickChair(E10);    }//GEN-LAST:event_E10ActionPerformed

    private void E11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E11ActionPerformed
        E11.setName("E11");
        clickChair(E11);    }//GEN-LAST:event_E11ActionPerformed

    private void E12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E12ActionPerformed
        E12.setName("E12");
        clickChair(E12);    }//GEN-LAST:event_E12ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        F1.setName("F1");
        clickChair(F1);    }//GEN-LAST:event_F1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        F2.setName("F2");
        clickChair(F2);    }//GEN-LAST:event_F2ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        F3.setName("F3");
        clickChair(F3);    }//GEN-LAST:event_F3ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        F4.setName("F4");
        clickChair(F4);    }//GEN-LAST:event_F4ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        F5.setName("F5");
        clickChair(F5);    }//GEN-LAST:event_F5ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        F6.setName("F6");
        clickChair(F6);    }//GEN-LAST:event_F6ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        F7.setName("F7");
        clickChair(F7);    }//GEN-LAST:event_F7ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        F8.setName("F8");
        clickChair(F8);    }//GEN-LAST:event_F8ActionPerformed

    private void F9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F9ActionPerformed
        F9.setName("F9");
        clickChair(F9);    }//GEN-LAST:event_F9ActionPerformed

    private void F10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F10ActionPerformed
        F10.setName("F10");
        clickChair(F10);    }//GEN-LAST:event_F10ActionPerformed

    private void F11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F11ActionPerformed
        F11.setName("F11");
        clickChair(F11);    }//GEN-LAST:event_F11ActionPerformed

    private void F12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F12ActionPerformed
        F12.setName("F12");
        clickChair(F12);    }//GEN-LAST:event_F12ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        G1.setName("G1");
        clickChair(G1);    }//GEN-LAST:event_G1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        G2.setName("G2");
        clickChair(G2);    }//GEN-LAST:event_G2ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        G3.setName("G3");
        clickChair(G3);    }//GEN-LAST:event_G3ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        G4.setName("G4");
        clickChair(G4);    }//GEN-LAST:event_G4ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        G5.setName("G5");
        clickChair(G5);    }//GEN-LAST:event_G5ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed
       G6.setName("G6");
        clickChair(G6);    }//GEN-LAST:event_G6ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed
        G7.setName("G7");
        clickChair(G7);    }//GEN-LAST:event_G7ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed
        G8.setName("G8");
        clickChair(G8);    }//GEN-LAST:event_G8ActionPerformed

    private void G9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G9ActionPerformed
        G9.setName("G9");
        clickChair(G9);    }//GEN-LAST:event_G9ActionPerformed

    private void G10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G10ActionPerformed
        G10.setName("G10");
        clickChair(G10);    }//GEN-LAST:event_G10ActionPerformed

    private void G11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G11ActionPerformed
        G11.setName("G11");
        clickChair(G11);    }//GEN-LAST:event_G11ActionPerformed

    private void G12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G12ActionPerformed
        G12.setName("G12");
        clickChair(G12);    }//GEN-LAST:event_G12ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        H1.setName("H1");
        clickChair(H1);    }//GEN-LAST:event_H1ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        H2.setName("H2");
        clickChair(H2);    }//GEN-LAST:event_H2ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        H3.setName("H3");
        clickChair(H3);    }//GEN-LAST:event_H3ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
        H4.setName("H4");
        clickChair(H4);    }//GEN-LAST:event_H4ActionPerformed

    private void H5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H5ActionPerformed
        H5.setName("H5");
        clickChair(H5);    }//GEN-LAST:event_H5ActionPerformed

    private void H8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H8ActionPerformed
        H8.setName("H8");
        clickChair(H8);    }//GEN-LAST:event_H8ActionPerformed

    private void H9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H9ActionPerformed
        H9.setName("H9");
        clickChair(H9);    }//GEN-LAST:event_H9ActionPerformed

    private void H10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H10ActionPerformed
        H10.setName("H10");
        clickChair(H10);    }//GEN-LAST:event_H10ActionPerformed

    private void H11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H11ActionPerformed
        H11.setName("H11");
        clickChair(H11);    }//GEN-LAST:event_H11ActionPerformed

    private void H12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H12ActionPerformed
        H12.setName("H12");
        clickChair(H12);    }//GEN-LAST:event_H12ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
        I1.setName("I1");
        clickChair(I1);    }//GEN-LAST:event_I1ActionPerformed

    private void I2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I2ActionPerformed
        I2.setName("I2");
        clickChair(I2);    }//GEN-LAST:event_I2ActionPerformed

    private void I3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I3ActionPerformed
        I3.setName("I3");
        clickChair(I3);    }//GEN-LAST:event_I3ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        I4.setName("I4");
        clickChair(I4);    }//GEN-LAST:event_I4ActionPerformed

    private void I5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I5ActionPerformed
        I5.setName("I5");
        clickChair(I5);    }//GEN-LAST:event_I5ActionPerformed

    private void I8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I8ActionPerformed
        I8.setName("I8");
        clickChair(I8);    }//GEN-LAST:event_I8ActionPerformed

    private void I9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I9ActionPerformed
        I9.setName("I9");
        clickChair(I9);    }//GEN-LAST:event_I9ActionPerformed

    private void I10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I10ActionPerformed
        I10.setName("I10");
        clickChair(I10);    }//GEN-LAST:event_I10ActionPerformed

    private void I11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I11ActionPerformed
        I11.setName("I11");
        clickChair(I11);    }//GEN-LAST:event_I11ActionPerformed

    private void I12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I12ActionPerformed
        I12.setName("I12");
        clickChair(I12);    }//GEN-LAST:event_I12ActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        J1.setName("J1");
        clickChair(J1);    }//GEN-LAST:event_J1ActionPerformed

    private void J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J2ActionPerformed
        J2.setName("J2");
        clickChair(J2);    }//GEN-LAST:event_J2ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
        J3.setName("J3");
        clickChair(J3);    }//GEN-LAST:event_J3ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
        J4.setName("J4");
        clickChair(J4);    }//GEN-LAST:event_J4ActionPerformed

    private void J5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J5ActionPerformed
        J5.setName("J5");
        clickChair(J5);    }//GEN-LAST:event_J5ActionPerformed

    private void J8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J8ActionPerformed
        J8.setName("J8");
        clickChair(J8);    }//GEN-LAST:event_J8ActionPerformed

    private void J9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J9ActionPerformed
        J9.setName("J9");
        clickChair(J9);    }//GEN-LAST:event_J9ActionPerformed

    private void J10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J10ActionPerformed
        J10.setName("J10");
        clickChair(J10);    }//GEN-LAST:event_J10ActionPerformed

    private void J11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J11ActionPerformed
        J11.setName("J11");
        clickChair(J11);    }//GEN-LAST:event_J11ActionPerformed

    private void J12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J12ActionPerformed
        J12.setName("J12");
        clickChair(J12);    }//GEN-LAST:event_J12ActionPerformed

    public void setChairsDatabase() {

        List<Chair> chairs = new ArrayList<>();
        Date date = tickets.get(0).getSession().getDate();
        if (h == 1) {
            chairs = controller.pickChairs1(date, tickets.get(0).getSession().getId());
        } else {
            chairs = controller.pickChairs2(date,tickets.get(0).getSession().getId());
        }

        for (int i = 0; i < chairs.size(); i++) {
            int status = chairs.get(i).getChairStatus();

            if (status != 0) {
                buttons[i].setBackground(Color.GRAY);
                buttons[i].setEnabled(false);
            }
        }
    }

    public void clickChair(JButton btn) {
        
        if (btn.getBackground() == Color.BLUE) {
            btn.setBackground(new Color(101, 16, 197));
            String seat = btn.getName();
            selectedChairs.remove(seat);
            normalTickets++;
            testQ = true;
            setData();
        
        } else {
            if (testQ) {
                btn.setBackground(Color.BLUE);
                String seat = btn.getName();
                selectedChairs.add(seat);
                normalTickets--;
                if (normalTickets == 0) {
                    testQ = false;
                }
                setData();
            } else {
                showMessage(false, "Ingressos já utilizados");
            }
            
        }
    }

    public void setData() {
        String cadeiras = "";
        for (int i = 0; i < selectedChairs.size(); i++) {
            cadeiras = cadeiras + "  " + selectedChairs.get(i);
        }
        lblCadeiras1.setText(cadeiras);

        lblIngressos1.setText(String.valueOf(normalTickets));

        lblIngressosVip.setText(String.valueOf(vipTickets));
    }
    
    public void showMessage(boolean test, String message) {
        if (test){
            main.getMain().showMessage(Message.MessageType.SUCCESS, message);
        } else {
            main.getMain().showMessage(Message.MessageType.ERROR, message);
        }        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A10;
    private javax.swing.JButton A11;
    private javax.swing.JButton A12;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JButton D1;
    private javax.swing.JButton D10;
    private javax.swing.JButton D11;
    private javax.swing.JButton D12;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton D9;
    private javax.swing.JButton E1;
    private javax.swing.JButton E10;
    private javax.swing.JButton E11;
    private javax.swing.JButton E12;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton E7;
    private javax.swing.JButton E8;
    private javax.swing.JButton E9;
    private javax.swing.JButton F1;
    private javax.swing.JButton F10;
    private javax.swing.JButton F11;
    private javax.swing.JButton F12;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton F9;
    private javax.swing.JButton G1;
    private javax.swing.JButton G10;
    private javax.swing.JButton G11;
    private javax.swing.JButton G12;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton G5;
    private javax.swing.JButton G6;
    private javax.swing.JButton G7;
    private javax.swing.JButton G8;
    private javax.swing.JButton G9;
    private javax.swing.JButton H1;
    private javax.swing.JButton H10;
    private javax.swing.JButton H11;
    private javax.swing.JButton H12;
    private javax.swing.JButton H2;
    private javax.swing.JButton H3;
    private javax.swing.JButton H4;
    private javax.swing.JButton H5;
    private javax.swing.JButton H8;
    private javax.swing.JButton H9;
    private javax.swing.JButton I1;
    private javax.swing.JButton I10;
    private javax.swing.JButton I11;
    private javax.swing.JButton I12;
    private javax.swing.JButton I2;
    private javax.swing.JButton I3;
    private javax.swing.JButton I4;
    private javax.swing.JButton I5;
    private javax.swing.JButton I8;
    private javax.swing.JButton I9;
    private javax.swing.JButton J1;
    private javax.swing.JButton J10;
    private javax.swing.JButton J11;
    private javax.swing.JButton J12;
    private javax.swing.JButton J2;
    private javax.swing.JButton J3;
    private javax.swing.JButton J4;
    private javax.swing.JButton J5;
    private javax.swing.JButton J8;
    private javax.swing.JButton J9;
    private swing.Button btnCancelar;
    private swing.Button btnContinuar;
    private javax.swing.JLabel lblCadeiras;
    private javax.swing.JLabel lblCadeiras1;
    private javax.swing.JLabel lblIngressos;
    private javax.swing.JLabel lblIngressos1;
    private javax.swing.JLabel lblIngressosVip;
    private javax.swing.JLabel lblIngressosVips;
    private javax.swing.JLabel lblProduto10;
    private javax.swing.JLabel lblProduto11;
    private javax.swing.JLabel lblProduto12;
    private javax.swing.JLabel lblProduto13;
    private javax.swing.JLabel lblProduto14;
    private javax.swing.JLabel lblProduto15;
    private javax.swing.JLabel lblProduto16;
    private javax.swing.JLabel lblProduto17;
    private javax.swing.JLabel lblProduto18;
    private javax.swing.JLabel lblProduto19;
    private javax.swing.JLabel lblProduto20;
    private javax.swing.JLabel lblProduto21;
    private javax.swing.JLabel lblProduto22;
    private javax.swing.JLabel lblProduto23;
    private javax.swing.JLabel lblProduto24;
    private javax.swing.JLabel lblProduto25;
    private javax.swing.JLabel lblProduto4;
    private javax.swing.JLabel lblProduto5;
    private javax.swing.JLabel lblProduto6;
    private javax.swing.JLabel lblProduto7;
    private javax.swing.JLabel lblProduto8;
    private javax.swing.JLabel lblProduto9;
    private javax.swing.JLabel lblSelecione;
    // End of variables declaration//GEN-END:variables
}
