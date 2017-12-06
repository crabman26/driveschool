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
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class EcoDriving extends javax.swing.JFrame {

     String str10,str11,str12,str13,str14,str15,str16,str17,str18,str20,str21,str22,str23,str24,str25,str26,str27,str28,str29,str30,str31,str32,str33,str34,str35,str36,str40,str41,str42;

    String surname,name,fullname,a,fathername;
     int a1,a2,a3;
    /**
     * Creates new form EcoDriving
     */
    private static EcoDriving obj=null;
    private EcoDriving() {
        initComponents();
        
        setResizable(false);
        fillcombo();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EcoDriving.DO_NOTHING_ON_CLOSE);
        setIcon();
    }
     public static EcoDriving getObj(){
        if(obj==null){
            obj=new EcoDriving();
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

        Print = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ECO DRIVING");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Print.setText("ΕΚΤΥΠΩΣΗ");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        Add.setText("ΠΡΟΣΘΗΚΗ");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

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

        jLabel1.setText("ΕΠΩΝΥΜΟ ΜΑΘΗΤΗ");

        jButton1.setText("ΔΙΑΓΡΑΦΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Add)
                    .addComponent(jButton1)
                    .addComponent(Print))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try{
            Class.forName("org.sqlite.JDBC");
String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement=ConnectiondatabaseConnection.createStatement();

            String sql="SELECT * FROM ecodriving";
            ResultSet result=statement.executeQuery(sql);
            Statement statement3=ConnectiondatabaseConnection.createStatement();
            ResultSet result3=statement3.executeQuery(sql);
            displayresults(result);
            result.close();
            result3.close();
            File fontFile = new File("C:/Windows/Fonts/arialuni.ttf");

            BaseFont unicode = BaseFont.createFont(fontFile.getAbsolutePath(), BaseFont.IDENTITY_H, true);
            Font fonty=new Font(unicode,12,Font.NORMAL);
            Font fonty2=new Font(unicode,8,Font.NORMAL);

            String Message="Το αρχείο έχει δημιουργηθεί";
            Document document = new Document();

            PdfWriter.getInstance(document, new FileOutputStream("EcoDriving.pdf"));

            document.open();

            PdfPTable table=new PdfPTable(7);
            table.setWidthPercentage(110);
            document.add(new Paragraph("                                                                                             ΠΑΡΟΥΣΙΟΛΟΓΙΟ"+"\n",fonty2));
            document.add(new Paragraph("3η Ώρα ημερα:05/11/2013                                    Εκπαιδευτής:Παππάς Μιχάλης                                           Υπογραφή:...................................."+ "\n",fonty2));
            document.add(new Paragraph("Μαθημα:Eco Driving                                   Παρόντες:Όλοι                                                                                           Απόντες                                                     "+ "\n",fonty2));

            str10="α/α";
            PdfPCell cell33=new PdfPCell(new Paragraph(str10,fonty2));
            cell33.setColspan(0);
            table.addCell(cell33);

            str12="Ονοματεπώνυμο Οδηγού";
            PdfPCell cell35=new PdfPCell(new Paragraph(str12,fonty2));
            cell35.setColspan(0);
            table.addCell(cell35);

            str13="Πατρώνυμο";
            PdfPCell cell36=new PdfPCell(new Paragraph(str13,fonty2));
            cell36.setColspan(0);
            table.addCell(cell36);
            str14="Υπογραφή";

            PdfPCell cell37=new PdfPCell(new Paragraph(str14,fonty2));
            cell37.setColspan(1);
            table.addCell(cell37);
            str15="Ονοματεπώνυμο Οδηγού";
            PdfPCell cell38=new PdfPCell(new Paragraph(str15,fonty2));
            cell38.setColspan(0);
            table.addCell(cell38);
            str16="Πατρώνυμο";

            PdfPCell cell39=new PdfPCell(new Paragraph(str16,fonty2));
            cell39.setColspan(0);
            table.addCell(cell39);
            str17="Υπογραφή";

            PdfPCell cell40=new PdfPCell(new Paragraph(str14,fonty2));
            cell40.setColspan(1);
            table.addCell(cell40);
            while(result3.next()){
                str30=result3.getString(1);
                str31=result3.getString(2);
                str32= result3.getString(3);
                str33=result3.getString(4);

                a=Integer.toString(a3);
                str18=""+a;
                PdfPCell cell41=new PdfPCell(new Paragraph(str18,fonty2));
                cell41.setColspan(0);
                table.addCell(cell41);
                fullname=str31+str32;
                str20=""+fullname;
                PdfPCell cell42=new PdfPCell(new Paragraph(str20,fonty2));
                cell42.setColspan(0);
                table.addCell(cell42);
                fathername=str33;
                str21=""+fathername;
                PdfPCell cell43=new PdfPCell(new Paragraph(str21,fonty2));
                cell43.setColspan(0);
                table.addCell(cell43);
                str25="";
                PdfPCell cell47=new PdfPCell(new Paragraph(str25,fonty2));
                cell47.setColspan(0);
                table.addCell(cell47);
                str22="";
                PdfPCell cell44=new PdfPCell(new Paragraph(str22,fonty2));
                cell44.setColspan(0);
                table.addCell(cell44);
                str23="";
                PdfPCell cell45=new PdfPCell(new Paragraph(str23,fonty2));
                cell45.setColspan(0);
                table.addCell(cell45);
                str24="";
                PdfPCell cell46=new PdfPCell(new Paragraph(str24,fonty2));
                cell46.setColspan(0);
                table.addCell(cell46);
            }
            document.add(table);
            document.close();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,Message);

        }
        catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (IOException ex) {
            Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        try{
            Object test=combobox.getSelectedItem();
            surname=String.valueOf(test);
            if (!surname.startsWith("'"))
            surname = "'" + surname;
            if (!surname.endsWith("'"))
            surname = surname + "'";

             Class.forName("org.sqlite.JDBC");
String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement=ConnectiondatabaseConnection.createStatement();
            
            

            
            Statement statement2=ConnectiondatabaseConnection.createStatement();
            String sql3="SELECT `Όνομα`,`Επώνυμο`,`Πατρώνυμο` FROM students WHERE `Επώνυμο`="+surname;
            ResultSet result3=statement2.executeQuery(sql3);
            displayresult3(result3);
            result3.close();

            String sql="INSERT INTO ecodriving (Όνομα,Επώνυμο,Πατρώνυμο) VALUES (?,?,?)";
            PreparedStatement pst = ConnectiondatabaseConnection.prepareStatement(sql);
            pst.setString(1,str40 );
            pst.setString(2,str41 );
            pst.setString(3,str42 );
        
            
           
            pst.execute();
            pst.close();
            rowcount(a1);
           String sql2="SELECT * FROM ecodriving";
            ResultSet result2=statement.executeQuery(sql2);
            Result.setModel(DbUtils.resultSetToTableModel(result2));
            result2.close();
            ConnectiondatabaseConnection.close();

        }catch(Exception e1){
            System.out.println(e1);
        };
    }//GEN-LAST:event_AddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("org.sqlite.JDBC");
                                String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
	        	java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
	        	

            String Message="Είστε σίγουρος για την διαγραφή των μαθητών??";

            String sql="DELETE FROM ecodriving ";
            PreparedStatement pst = ConnectiondatabaseConnection.prepareStatement(sql);

            pst.execute();
            pst.close();
            ConnectiondatabaseConnection.close();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,Message);
        }catch(ClassNotFoundException e1){
            System.out.println(e1);
        }
        catch(SQLException e2){
            System.out.println(e2);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

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
            java.util.logging.Logger.getLogger(EcoDriving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EcoDriving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EcoDriving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EcoDriving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EcoDriving().setVisible(true);
            }
        });
    }
     private void displayresults(ResultSet result){
        try{
          while(result.next()){
             str30=result.getString(1);
             str31=result.getString(2);
             str32= result.getString(3);
             str33=result.getString(4);
              
            
        }  
        }catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
       
        
        
    }
    
    private void displayresult3(ResultSet result3){
         try{
          while(result3.next()){
             str40=result3.getString(1);
             str41=result3.getString(2);
             str42= result3.getString(3);
              
            
        }  
        }catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    private void rowcount(int a1){
        try{
        Class.forName("org.sqlite.JDBC");
String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
	java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
	Statement statement3=ConnectiondatabaseConnection.createStatement();
        String sql4="SELECT COUNT(*) FROM ecodriving";
                 ResultSet result4=statement3.executeQuery(sql4);
                 result4.next();
                a3=result4.getInt(1);
               
              
                for (int i=1;i<=a1;i++){
                 
                    
                    
                   
                }
                result4.close();
        }catch(ClassNotFoundException e1){
				System.out.println(e1);
			}
        catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex); 
    }
    }
        private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.png")));
    }
    private void fillcombo(){
    try{
        
         Class.forName("org.sqlite.JDBC");
String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
	java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
	Statement statement=ConnectiondatabaseConnection.createStatement();

	String sql="SELECT * FROM students; ";
	ResultSet result=statement.executeQuery(sql);
        
        while(result.next()){
             String surname2=result.getString("Επώνυμο");
            
            combobox.addItem(surname2);
            
        }
        
	ConnectiondatabaseConnection.close();
        
        
    }catch(Exception e1){
       System.out.println(e1); 
    };
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Print;
    private javax.swing.JTable Result;
    private javax.swing.JComboBox combobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
