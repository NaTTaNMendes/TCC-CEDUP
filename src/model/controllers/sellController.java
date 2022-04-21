package model.controllers;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import db.DbException;
import form.Sell.ChairSelection;
import form.Sell.NewSell;
import form.Sell.Payment;
import form.Sell.TicketSell;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.Chair;
import model.Client;
import model.Combo;
import model.FilmHall;
import model.Movie;
import model.PSell;
import model.Product;
import model.Session;
import model.Ticket;
import model.dao.ClientDAO;
import model.dao.MovieDAO;
import model.dao.ProductDAO;
import model.dao.SellDAO;
import model.dao.SessionDAO;
import model.dao.comboDAO;



public class sellController {
    
    private ChairSelection chairSelection;
    private NewSell newSell;
    private Payment payment;
    private TicketSell ticketSell;
    private ProductDAO pdao = new ProductDAO();
    private comboDAO codao = new comboDAO();
    private ClientDAO cldao = new ClientDAO();
    private SellDAO dao = new SellDAO();
    private MovieDAO mdao = new MovieDAO();
    private SessionDAO sdao = new SessionDAO();


    public sellController() {
    }

    public sellController(ChairSelection chairSelection) {
        this.chairSelection = chairSelection;
    }

    public sellController(NewSell newSell) {
        this.newSell = newSell;
    }

    public sellController(Payment payment) {
        this.payment = payment;
    }

    public sellController(TicketSell ticketSell) {
        this.ticketSell = ticketSell;
    }
    
    public List<Product> pickProducts() {
        return pdao.pickAll();
    }
    
    public List<Combo> pickCombos() {
        return codao.pickAll();
    }
    
    public List<Client> pickClients() {
        return cldao.pickAll();
    }
    
    public List<Movie> pickMovies() {
        return sdao.pickAllMovies();
    }
    
    public List<FilmHall> pickHalls() {
        return sdao.pickAllHalls();
    }
    
    public List<FilmHall> pickHallsByMovie(Movie movie) {
        return sdao.pickAllHallsByMovie(movie);
    }
    
    public List<Session> pickSessions(Movie movie, FilmHall filmHall){
        return sdao.findSessions(movie, filmHall);
    }
    
    public List<Chair> pickChairs1(Date date, int session) {
        return dao.pickAllChairsHall1(date, session);
    }
    
    public List<Chair> pickChairs2(Date date, int session) {
        return dao.pickAllChairsHall2(date, session);
    }
    
    public int getComboId(String name) {
        return codao.findByName(name).getId();
    }
    
    public int getProductId(String name) {
        return pdao.findByName(name).getId();
    }
    
    public void insertSell (PSell sell){
        String message = "";
        try {
            message = dao.insert(sell);
            if (!message.isEmpty()) {
                if (sell.getCombos().isEmpty() == false) {
                    for (int i = 0; i < sell.getCombos().size(); i++) {
                        dao.insertSHC(dao.selectLastIdSell(), sell.getCombos().get(i).getCombo().getId(), sell.getCombos().get(i).getQuantity());
                    }
                }
            
                if (sell.getProducts().isEmpty() == false) {
                    for (int i = 0; i < sell.getProducts().size(); i++) {
                        dao.insertSHP(dao.selectLastIdSell(), sell.getProducts().get(i).getProduct().getId(), sell.getProducts().get(i).getQuantity());
                    }
                }
            }          
                        
            payment.showMessage(true, message);
           
            
            Document cupom = new Document(PageSize.A9);
            cupom.setMargins(0, 0, 0, 0);
            
            try {
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdfH = new SimpleDateFormat("HH:mm:ss");
       
                PdfWriter.getInstance(cupom, new FileOutputStream("C:\\Users\\User\\Desktop\\CupomFiscal" + dao.selectLastIdSell() + ".pdf"));
                
                cupom.open();
                
                cupom.add(new Paragraph("              CUPOM NÃO FISCAL", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 6, Font.BOLD, BaseColor.BLACK)));
                cupom.add(new Paragraph("   -----------------------------------------------   ", FontFactory.getFont(FontFactory.HELVETICA, 6)));
                   
                if (sell.getCombos().isEmpty() == false) {
                    for (int i = 0; i < sell.getCombos().size(); i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("     " + sell.getCombos().get(i).getCombo().getName());
                        sb.append("  -  " + sell.getCombos().get(i).getQuantity());
                        Double subtotal = calculateSubtotal(sell.getCombos().get(i).getQuantity(), sell.getCombos().get(i).getCombo().getPrice());
                        sb.append("  -  " + String.format("%.2f", subtotal));
                        cupom.add(new Paragraph(sb.toString(), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                    }
                }
            
                if (sell.getProducts().isEmpty() == false) {
                    for (int i = 0; i < sell.getProducts().size(); i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("     " + sell.getProducts().get(i).getProduct().getName());
                        sb.append("  -  " + sell.getProducts().get(i).getQuantity());
                        Double subtotal = calculateSubtotal(sell.getProducts().get(i).getQuantity(), sell.getProducts().get(i).getProduct().getPrice());
                        sb.append("  -  " + String.format("%.2f", subtotal));
                        cupom.add(new Paragraph(sb.toString(), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                    }
                }
                
                if (sell.getTickets().isEmpty() == false) {
                    for (int i = 0; i < sell.getTickets().size(); i++) {                        
                        String tipo = "";
                        if (sell.getTickets().get(i).getTicketType() == 0) {
                            tipo = "INTEIRA";
                        } else if (sell.getTickets().get(i).getTicketType() == 1) {
                            tipo = "MEIA";
                        } else {
                            tipo = "VIP";
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("     INGRESSO " + tipo);                        
                        Double subtotal = sell.getTickets().get(i).getPrice();
                        sb.append("  -  " + String.format("%.2f", subtotal));
                        cupom.add(new Paragraph(sb.toString(), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                    }
                }
                cupom.add(new Paragraph());
                cupom.add(new Paragraph("     Total: R$ " + String.format("%.2f", sell.getTotal()), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("   ------------------------------------------------------------------------   ", FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("    Vendedor: " + sell.getEmp().getName(), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("    Cliente: " + sell.getClient().getName(), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("    CPF Cliente: " + sell.getClient().getITR(), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("   ------------------------------------------------------------------------   ", FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("    Data:" + sdf.format(new Date()), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("    Hora:" + sdfH.format(new Date().getTime()), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                
            } catch (DocumentException de) {
                de.printStackTrace();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                cupom.close();
            }
            
        } catch (DbException e) {
            payment.showMessage(false, message);
        }
        
    }
    
    public void updateChair(List<Ticket> tickets) {
        for (int i = 0; i < tickets.size(); i++) {
            int idChair = dao.selectIdChair(tickets.get(i).getSeat(), tickets.get(i).getHall().getId());
            dao.updateChair(tickets.get(i).getSession(), idChair);            
        }        
    }
    
    public void insertTickets(List<Ticket> tickets) {
        for (int i = 0 ; i < tickets.size(); i++) {
            dao.insertTicket(tickets.get(i));
            
            int idTicket = dao.selectLastIdTicket();
            Document cupom = new Document(PageSize.A9);
            cupom.setMargins(0, 0, 0, 0);
            
            try {
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdfH = new SimpleDateFormat("HH:mm:ss");
       
                PdfWriter.getInstance(cupom, new FileOutputStream("C:\\Users\\User\\Desktop\\Ticket" + dao.selectLastIdTicket()+ ".pdf"));
                
                cupom.open();
                
       
                
                cupom.add(new Paragraph(" "));
                cupom.add(new Paragraph("                                  " + tickets.get(i).getCinemaName(), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 4, Font.BOLD, BaseColor.BLACK)));
                cupom.add(new Paragraph("   -----------------------------------------------   ", FontFactory.getFont(FontFactory.HELVETICA, 6)));
                cupom.add(new Paragraph("                      " + tickets.get(i).getHall().getName(), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 6, Font.BOLD, BaseColor.BLACK)));
                
                String legendado = "";
                if (tickets.get(i).isLyrics() == true) {
                    legendado = "LEGENDADO";
                } else {
                    legendado = "DUBLADO";
                }
                
                String tipo = "";
                switch (tickets.get(i).getTicketType()) {
                    case 0:
                        tipo = "INTEIRA";
                        break;
                    case 1:
                        tipo = "MEIA";
                        break;
                    default:
                        tipo = "VIP";
                        break;
                }
                
                cupom.add(new Paragraph("                 " + tickets.get(i).getMovie().getName() + "  -  " + legendado, FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("                  Data/Hora:   " + sdf.format(tickets.get(i).getDate()) + "   " + sdfH.format(tickets.get(i).getHour()), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("    Tipo:" + tipo + "                                               Código: " + idTicket, FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("                                        Lugar:" + tickets.get(i).getSeat(), FontFactory.getFont(FontFactory.HELVETICA, 4)));
            
                
                cupom.add(new Paragraph());
                cupom.add(new Paragraph("    Total: R$ " + String.format("%.2f", tickets.get(i).getPrice()), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("   ------------------------------------------------------------------------   ", FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("    Cliente: " + tickets.get(i).getClient().getName(), FontFactory.getFont(FontFactory.HELVETICA, 4)));
                cupom.add(new Paragraph("   ------------------------------------------------------------------------   ", FontFactory.getFont(FontFactory.HELVETICA, 4)));

                
            } catch (DocumentException de) {
                de.printStackTrace();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                cupom.close();
                
            }
        }
    }
    
    public Double calculateSubtotal(int quantity, Double price) {
        return quantity * price;
    }
}
