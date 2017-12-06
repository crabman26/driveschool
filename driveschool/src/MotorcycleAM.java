
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crabman
 */
public class MotorcycleAM extends javax.swing.JFrame {
    
    String str1,str2,str3,str4,str5,str23,str24;

    /**
     * Creates new form MotorcycleAM
     */
   
    private static MotorcycleAM obj=null;
    
    private MotorcycleAM() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(MotorcycleAM.DO_NOTHING_ON_CLOSE);
        setIcon();
    }

   public static MotorcycleAM getObj(){
        if(obj==null){
            obj=new MotorcycleAM();
        }return obj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΘΕΩΡΗΤΙΚΑ ΜΟΤΟΣΥΚΛΕΤΑ ΑΜ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("ΣΤΟΙΧΕΙΑ ΥΠΟΨΗΦΙΟΥ");

        jLabel2.setText("ΟΝΟΜΑΤΕΠΩΝΥΜΟ");

        Result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Result);

        jButton1.setText("ΑΝΑΖΗΤΗΣΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ΕΚΤΥΠΩΣΗ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ΚΑΘΑΡΙΣΜΟΣ ΠΕΔΙΩΝ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                  try {
            // TODO add your handling code here:
            
                                    Class.forName("org.sqlite.JDBC");
                                    String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
                            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
                            Statement statement=ConnectiondatabaseConnection.createStatement();
                             
                            
                            String str1=Search.getText();
                            
                            
                            if (!str1.startsWith("'"))
                                 str1 = "'" + str1;
                                 
                                
                            if (!str1.endsWith("'"))
                                 str1 = str1 + "'";
                            
                            String sql="SELECT theoritical.'Ονοματεπώνυμο',theoritical.`Αριθμός_Πρωτοκόλλου`,theoritical.`Κατηγορία`,theoritical.Ημερομηνία_Θεωρητικού,theoritical.`Ωρα_Έναρξης`,theoritical.`Ώρα_Λήξης`,practical.`Ημερομηνία_Πρακτικού`,practical.`Ωρα_Έναρξης`,practical.`Ωρα_Λήξης`FROM theoritical INNER JOIN practical ON theoritical.`Αριθμός_Πρωτοκόλλου` =practical.`Αριθμός_Πρωτοκόλλου` WHERE theoritical.Ονοματεπώνυμο="+str1+"AND theoritical.Κατηγορία='Μοτοσυκλέτα ΑΜ'";

                            ResultSet result=statement.executeQuery(sql);
                          if(result.next()){
                             Result.setModel(DbUtils.resultSetToTableModel(result));
                            result.close();
                            ConnectiondatabaseConnection.close();
                          }else{
                              String Message="Δεν υπάρχει εγγραφή";
                     JOptionPane.showMessageDialog(null,Message); 
                          }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
                  Class.forName("org.sqlite.JDBC");
                  String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
                            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
                            Statement statement=ConnectiondatabaseConnection.createStatement();
                             
                            
                            String str1=Search.getText();
                            
                            
                            if (!str1.startsWith("'"))
                                 str1 = "'" + str1;
                                 
                                
                            if (!str1.endsWith("'"))
                                 str1 = str1 + "'";
                            String sql="SELECT theoritical.'Ονοματεπώνυμο',theoritical.`Αριθμός_Πρωτοκόλλου`,theoritical.`Κατηγορία`,theoritical.Ημερομηνία_Θεωρητικού,theoritical.`Ωρα_Έναρξης`,theoritical.`Ώρα_Λήξης`,practical.`Ημερομηνία_Πρακτικού`,practical.`Ωρα_Έναρξης`,practical.`Ωρα_Λήξης`FROM theoritical INNER JOIN practical ON theoritical.`Αριθμός_Πρωτοκόλλου` =practical.`Αριθμός_Πρωτοκόλλου` WHERE theoritical.Ονοματεπώνυμο="+str1+"AND theoritical.Κατηγορία='Μοτοσυκλέτα ΑΜ'";



                            ResultSet result=statement.executeQuery(sql);
                              displayresults(result);
                              result.close();
                               ConnectiondatabaseConnection.close();
                            
                File fontFile = new File("C:/Windows/Fonts/arialuni.ttf"); 
         
                     BaseFont unicode = BaseFont.createFont(fontFile.getAbsolutePath(), BaseFont.IDENTITY_H, true);
                     Font fonty=new Font(unicode,14,Font.NORMAL);
                       Font fonty2=new Font(unicode,10,Font.NORMAL);
             String Message="Το αρχείο έχει δημιουργηθεί";
                Document document = new Document(); 
                  PdfWriter.getInstance(document, new FileOutputStream("Motorcycle.pdf"));
              
          
               
                    
                     document.open();
                
                       String str="                        ΑΝΑΛΥΤΙΚΗ ΩΡΙΑΙΑ ΚΑΤΑΣΤΑΣΗ ΘΕΩΡΗΤΙΚΗΣ ΕΚΠΑΙΔΕΥΣΗΣ ";
                   
                     PdfPTable table=new PdfPTable(8);
                        table.setWidthPercentage(110);
                       PdfPCell cell33=new PdfPCell(new Paragraph(str,fonty));
                     cell33.setColspan(10);
                     table.addCell(cell33);
                       String str51="ΟΝΟΜ/ΝΥΜΟ ΥΠΟΨΗΦΙΟΥ:"
                             + str23;
                     
                     PdfPCell cell = new PdfPCell (new Paragraph (str51,fonty2));
                     cell.setColspan(2);
                table.addCell(cell);
                    
                      String str2="Αρ.Πρωτ:Δ.Ε.Ε.:"
                              + str24;
                     
                     PdfPCell cell2 = new PdfPCell (new Paragraph (str2,fonty2));
                      cell2.setColspan(2);
                     table.addCell(cell2);
                        
                       String str3="ΚΑΤΗΓΟΡΙΑ:"
                               + " ΜΟΤΟΣΥΚΛΕΤΑ AM,A1,A2,A";
                     
                     PdfPCell cell3 = new PdfPCell (new Paragraph (str3,fonty2));
                      cell3.setColspan(4);
                     table.addCell(cell3);
                     
                        String str4="α/α";
                     
                     PdfPCell cell4 = new PdfPCell (new Paragraph (str4,fonty2));
                    
                      
                     table.addCell(cell4);
                        String str5="ΗΜΕΡ/ΝΙΑ";
                     
                     PdfPCell cell5 = new PdfPCell (new Paragraph (str5,fonty2));
                      
                     table.addCell(cell5);
                        String str6="ΩΡΑ"
                                + "ΕΝΑΡΞΗΣ";
                     
                     PdfPCell cell6 = new PdfPCell (new Paragraph (str6,fonty2));
                   
                     table.addCell(cell6);
                        String str7="ΩΡΑ"
                               + " ΛΗΞΗΣ";
                     
                     PdfPCell cell7 = new PdfPCell (new Paragraph (str7,fonty2));
                    
                     table.addCell(cell7);
                        String str8="ΠΕΡΙΕΧΟΜΕΝΟ ΕΚΠΑΙΔΕΥΣΗΣ";
                     
                     PdfPCell cell8 = new PdfPCell (new Paragraph (str8,fonty2));
                    
                     table.addCell(cell8);
                        String str9="ΕΚΠΑΙΔΕΥΤΗΣ";
                     
                     PdfPCell cell9 = new PdfPCell (new Paragraph (str9,fonty2));
                     
                     table.addCell(cell9);
                        String str10="ΑΡ."
                               + " ΣΕΛΙΔΑΣ";
                     
                     PdfPCell cell10 = new PdfPCell (new Paragraph (str10,fonty2));
                    
                     
                     table.addCell(cell10);
                        String str11="ΑΡ."
                               + " ΓΡΑΜΜΗΣ";
                     
                     PdfPCell cell11 = new PdfPCell (new Paragraph (str11,fonty2));
                    
                     table.addCell(cell11);
                     table.addCell("1");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str12="ΑΝΑΒΑΤΗΣ - ΠΡΟΣΤΑΣΙΑ"
                                          + "ΑΝΑΒΑΤΗ";
                     
                     PdfPCell cell12 = new PdfPCell (new Paragraph (str12,fonty2));
                    
                      table.addCell(cell12);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("2");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str13="ΕΠΙΛΕΓΟΝΤΑΣ ΤΗ ΜΟΤΟΣΥΚΛΕΤΑ";
                     
                     PdfPCell cell13 = new PdfPCell (new Paragraph (str13,fonty2));
                  
                      table.addCell(cell13);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("3");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str14="ΟΡΓΑΝΑ ΕΛΕΓΧΟΥ ΚΑΙ"
                                          + "ΧΕΙΡΙΣΤΗΡΙΑ ΜΟΤΟΣΥΚΛΕΤΑΣ";
                     
                     PdfPCell cell14 = new PdfPCell (new Paragraph (str14,fonty2));
                  
                      table.addCell(cell14);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("4");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str15="ΜΑΘΑΙΝΟΝΤΑΣ ΝΑ ΟΔΗΓΕΙΤΕ-"
                               + "ΟΔΗΓΩΝΤΑΣ ΣΤΟ ΔΡΟΜΟ-"
                               + "ΑΣΦΑΛΗΣ ΟΔΗΓΗΣΗ";
                     
                     PdfPCell cell15 = new PdfPCell (new Paragraph (str15,fonty2));
                    
                      table.addCell(cell15);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("5");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str16="ΟΔΗΓΗΣΗ ΣΤΗΝ ΠΟΛΗ- ΟΔΗΓΗΣΗ "
                                          + "ΕΚΤΟΣ ΠΟΛΗΣ";
                     
                     PdfPCell cell16 = new PdfPCell (new Paragraph (str16,fonty2));
                   
                      table.addCell(cell16);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("6");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str17="ΟΔΗΓΩΝΤΑΣ ΚΑΤΩ ΑΠΟ "
                               + "ΔΥΣΜΕΝΕΙΣ ΣΥΝΘΗΚΕΣ)";
                     
                     PdfPCell cell17 = new PdfPCell (new Paragraph (str17,fonty2));
                    
                      table.addCell(cell17);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("7");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str18="ΜΕΤΑΦΟΡΑ ΦΟΡΤΙΟΥ,ΕΠΙΒΑΤΗ "
                               + "ΚΑΙ ΠΡΟΣΑΡΜΟΓΗ ΤΟΥ"
                               + "ΠΛΕΥΡΙΚΟΥ ΚΑΝΙΣΤΡΟΥ(ΚΑΛΑΘΙ)";
                     
                     PdfPCell cell18 = new PdfPCell (new Paragraph (str18,fonty2));
                     
                      table.addCell(cell18);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("8");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str19="ΒΑΣΙΚΗ ΣΥΝΤΗΡΗΣΗ";
                     
                     PdfPCell cell19 = new PdfPCell (new Paragraph (str19,fonty2));
                   
                      table.addCell(cell19);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("9");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str20="ΒΑΣΙΚΕΣ ΔΙΑΤΑΞΕΙΣ ΤΟΥ ΚΟΚ ΓΙΑ"
                               + "ΤΗ ΜΟΤΟ/ΤΑ";
                     
                     PdfPCell cell20 = new PdfPCell (new Paragraph (str20,fonty2));
                   
                      table.addCell(cell20);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("10");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str21="ΑΔΕΙΑ ΟΔΗΓΗΣΗΣ-ΕΚΠΑΙΔΕΥΣΗ"
                                          + "ΚΑΙ ΕΞΕΤΑΣΗ ΥΠΟΨΗΦΙΩΝ"
                               + "ΟΔΗΓΩΝ ΜΟΤΟΣΥΚΛΕΤΩΝ";
                     
                     PdfPCell cell21 = new PdfPCell (new Paragraph (str21,fonty2));
                     
                      table.addCell(cell21);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                      table.addCell("11");
                     table.addCell("");
                     table.addCell("");
                     table.addCell("");
                       String str22="ΥΠΟΛΟΓΙΣΤΗΣ";
                     
                     PdfPCell cell22 = new PdfPCell (new Paragraph (str22,fonty2));
                    
                      table.addCell(cell22);
                       table.addCell("");
                     table.addCell("");
                     table.addCell("");
                     
                      document.add(table);
                      
                      document.add(new Paragraph("                                                                                                         ......../........../2013"));
                      document.add(new Paragraph(                                                                                               "Ο Δ/ΝΤΗΣ ΣΠΟΥΔΩΝ ΚΕΘΕΥΟ"
                              + "                                                                                                                               ( Σφραγιδα - Υπογραφη)",fonty2));
                      
                    
                     


                     document.close();
                      Toolkit.getDefaultToolkit().beep();
             JOptionPane.showMessageDialog(null,Message);
        } catch (SQLException ex) {
            Logger.getLogger(MotorcycleAM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MotorcycleAM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MotorcycleAM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Search.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        
        
        int selectedOption = JOptionPane.showConfirmDialog(null, "Do you wanna close the window?", "Choose", 
                                  JOptionPane.YES_NO_OPTION); 
        if (selectedOption == JOptionPane.YES_OPTION) 
        {
            setVisible(false);
            dispose();
        }
        if (selectedOption == JOptionPane.NO_OPTION){
    
}
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MotorcycleAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorcycleAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorcycleAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorcycleAM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorcycleAM().setVisible(true);
            }
        });
    }
    
      private void displayresults(ResultSet result) throws SQLException{
        
        if(result.next()){
            str23=result.getString(1);
            str24=result.getString(2);
           
            
            
            
            
        }
        
        
    }
      
      private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Result;
    private javax.swing.JTextField Search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
