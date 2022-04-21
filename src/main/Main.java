package main;

import component.Header;
import component.Menu;
import event.EventMenuSelected;
import event.EventShowPopupMenu;
import form.Employee.EmployeeData;
import form.Employee.Registered;
import form.Employee.addEmployee;
import form.History.ProductHistory;
import form.History.RelatoryHistory;
import form.History.SellHistory;
import form.LoginScreen;
import form.MainForm;
import form.MainMenu;
import form.Product.AddCombo;
import form.Product.AddProduct;
import form.Product.RegisteredCombos;
import form.Product.RegisteredProducts;
import form.Product.StockForm;
import form.Sell.NewSell;
import form.Sell.TicketSell;
import form.clients.AddClient;
import form.clients.RegisteredClient;
import form.schedules.AddSession;
import form.schedules.RegisteredMovies;
import form.schedules.RegisteredSession;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Employee;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import swing.MenuItem;
import swing.Message;
import swing.PopupMenu;

public class Main extends javax.swing.JFrame {
    
    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    private Employee emp;
    private boolean exit = false;
    
    public Main(Employee emp) {
        initComponents();
        this.emp = emp;
        init();      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA CINEMA");
        setResizable(false);

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        setSize(new java.awt.Dimension(1516, 839));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
    
    private void init() {
        layout = new MigLayout("fill","0[]0[100%, fill]0","0[fill, top]0");
        bg.setLayout(layout);
        menu = new Menu();
        header = new Header();        
        main = new MainForm(this);
        main.showForm (new MainMenu());
        loadData();
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index: " + menuIndex + "SubMenu Index:" + subMenuIndex);
                
                switch (menuIndex) {
                    case 0:
                        main.showForm(new MainMenu());
                        break;
                    case 1:
                        if (subMenuIndex == 0) {
                            main.showForm(new NewSell(main, emp));
                        } else if (subMenuIndex == 1) {
                            main.showForm(new TicketSell(main, emp));
                        } break;
                    case 2:
                    switch (subMenuIndex) {
                        case 0:
                            main.showForm(new StockForm());
                            break;
                        case 1:
                            if (emp.getFunction() != 0) {
                                showMessage(Message.MessageType.ERROR, "Usuário não autorizado para essa função");
                            } else {
                                main.showForm(new AddProduct(main));
                            }                            
                            break;
                        case 2:
                            if (emp.getFunction() != 0) {
                                main.showForm(new RegisteredProducts(main, false));
                            } else {
                                main.showForm(new RegisteredProducts(main, true));
                            }                            
                            break;
                        case 3:
                            if (emp.getFunction() != 0) {
                                showMessage(Message.MessageType.ERROR, "Usuário não autorizado para essa função");
                            } else {
                                main.showForm(new AddCombo(main));
                            }                            
                            break;
                        case 4:
                            if (emp.getFunction() != 0) {
                                main.showForm(new RegisteredCombos(main, false));
                            } else {
                                main.showForm(new RegisteredCombos(main, true));
                            }                            
                            break;
                        default:
                            break;
                    }
                    break;

                    case 3:
                        if (subMenuIndex == 0) {
                            if (emp.getFunction() != 0) {
                                main.showForm(new Registered(main, false));
                            } else {
                                main.showForm(new Registered(main, true));
                            }
                        } else if (subMenuIndex == 1) {
                            if (emp.getFunction() != 0) {
                                showMessage(Message.MessageType.ERROR, "Usuário não autorizado para essa função");
                            } else {                                                            
                                main.showForm(new addEmployee(main));
                            }
                        }   break;
                    case 4:
                    switch (subMenuIndex) {
                        case 0:
                            if (emp.getFunction() != 0) {
                               showMessage(Message.MessageType.ERROR, "Usuário não autorizado para essa função");
                            } else {
                               main.showForm(new SellHistory()); 
                            }                            
                            break;
                        case 1:
                            if (emp.getFunction() != 0) {
                                showMessage(Message.MessageType.ERROR, "Usuário não autorizado para essa função");
                            } else {
                                main.showForm(new ProductHistory());
                            }                            
                            break;
                        case 2:
                            if (emp.getFunction() != 0) {
                                showMessage(Message.MessageType.ERROR, "Usuário não autorizado para essa função");
                            } else {
                                main.showForm(new RelatoryHistory());
                            }
                            break;
                        default:
                            break;
                    }
                    break;

                    case 5:
                    if (subMenuIndex == 0) {
                        main.showForm(new RegisteredSession(main));
                    } else if (subMenuIndex == 1) {
                        if (emp.getFunction() != 0) {
                            showMessage(Message.MessageType.ERROR, "Usuário não autorizado para essa função");
                        } else {                                                 
                            main.showForm(new AddSession(main));
                        }
                    } else if (subMenuIndex == 2) {
                        if (emp.getFunction() != 0 ) {
                            main.showForm(new RegisteredMovies(main, false));
                        } else {
                            main.showForm(new RegisteredMovies(main, true));
                        }
                        
                    }                     
                    
                }
                if (menuIndex == 6) {
                    if (subMenuIndex == 0) {
                        if (emp.getFunction() != 0) {
                           main.showForm(new EmployeeData(main, emp, false)); 
                        } else {
                           main.showForm(new EmployeeData(main, emp, true)); 
                        }
                        
                    } else if (subMenuIndex == 1){
                        int a = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Deslogar", JOptionPane.YES_NO_OPTION);
                        if (a == JOptionPane.YES_OPTION) {
                            LoginScreen login = new LoginScreen();
                            login.setVisible(true);
                            exit = true; 
                            exit();
                        }
                    }
                }
                
                
                if (menuIndex == 7) {
                    if (subMenuIndex == 0) {
                        main.showForm(new RegisteredClient(main));
                    } else if (subMenuIndex == 1) {
                        main.showForm(new AddClient(main));                                                
                    }
                }
                
            }
        });
        menu.addEventShowPopup(new EventShowPopupMenu() {
            @Override
            public void showPopup(Component com) {
                MenuItem item = (MenuItem) com;
                PopupMenu popup = new PopupMenu(Main.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                int x = Main.this.getX() + 52;
                int y = Main.this.getY() + com.getY() + 120;
                popup.setLocation(x, y);
                popup.setVisible(true);
            }
        });
        menu.initMenuItem();
        bg.add(menu,"w 236!, spany 2");
        bg.add(header,"h 55!, wrap");
        bg.add(main,"w 100%, h 100%");
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowMenu()) {
                    width = 60 + (170*(1f-fraction));
                } else {
                    width = 60 + (170*fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }
            
            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }
            
        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (!animator.isRunning()){
                    animator.start();
                }
                menu.setEnableMenu(false);
                if (menu.isShowMenu()) {
                    menu.hideallMenu();
                }
            }
        });
    }
    
    public void showMessage(Message.MessageType messageType, String message) {
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
    }
    
    public void exit() {
        if (exit) {
            this.dispose();
        }
    }
    
    public void loadData() {
        header.getLblNome().setText(emp.getName());
        String fc = "";
        switch (emp.getFunction()) {
            case 0:
                fc = "ADMINISTRADOR";
                break;
            case 1:
                fc = "BOMBONIERE";
                break;
            case 2:
                fc = "TICKET";
                break;
            case 3:
                fc = "BOMBONIERE E TICKET";
                break;
            default:
                break;
        }
        header.getLblCargo().setText(fc);
    }
}
