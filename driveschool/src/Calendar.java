
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;


public class Calendar extends javax.swing.JFrame {

  
   private static Calendar obj=null;
   ResultSet result,result2;
   java.sql.Connection ConnectiondatabaseConnection;
  
    private Calendar() {
        initComponents();
        setIcon();
        getDate();
        setResizable(false);
    }

    
     public static Calendar getObj(){
        if(obj==null){
            obj=new Calendar();
        }return obj;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PracticalsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TheoriticalsTable = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΠΡΟΓΡΑΜΜΑ ΜΑΘΗΜΑΤΩΝ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PracticalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(PracticalsTable);

        TheoriticalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TheoriticalsTable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(TheoriticalsTable);
        TheoriticalsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jButton7.setText("ΔΙΑΓΡΑΦΗ ΜΑΘΗΜΑΤΟΣ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setText("ΚΑΤΑΧΩΡΗΣΗ ΜΑΘΗΜΑΤΟΣ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("ΕΠΕΞΕΡΓΑΣΙΑ ΜΑΘΗΜΑΤΟΣ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("ΑΝΑΖΗΤΗΣΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("ΚΑΘΑΡΙΣΜΟΣ ΠΕΔΙΩΝ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        setSize(new java.awt.Dimension(1016, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        LessonsDelete.getObj().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LessonsAdd.getObj().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        LessonsEdit.getObj().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TheoriticalsTable.setVisible(true);
        PracticalsTable.setVisible(true);
        try {

            // TODO add your handling code here:
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d1= jDateChooser1.getDateEditor().getDate();
            String str1=df.format(d1);

            if (!str1.startsWith("'"))
            str1 = "'" + str1;

            if (!str1.endsWith("'"))
            str1 = str1 + "'";

           Class.forName("org.sqlite.JDBC");
String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
            java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
            Statement statement=ConnectiondatabaseConnection.createStatement();
            String sql="SELECT `Ονοματεπώνυμο`,`Κατηγορία`,`Ημερομηνία_Θεωρητικού`,`Ωρα_Έναρξης`,`Ώρα_Λήξης`  FROM theoritical WHERE  Ημερομηνία_Θεωρητικού="+str1;
            ResultSet result=statement.executeQuery(sql);
            TheoriticalsTable.setModel(DbUtils.resultSetToTableModel(result));
            result.close();
            Statement statement2=ConnectiondatabaseConnection.createStatement();
            String sql2="SELECT `Ονοματεπώνυμο`,`Κατηγορία`,`Ημερομηνία_Πρακτικού`,`Ωρα_Έναρξης`,`Ωρα_Λήξης` FROM practical WHERE  Ημερομηνία_Πρακτικού="+str1;
            ResultSet result2=statement2.executeQuery(sql2);
            
            PracticalsTable.setModel(DbUtils.resultSetToTableModel(result2));
            result2.close();
            ConnectiondatabaseConnection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        TheoriticalsTable.setVisible(false);
        PracticalsTable.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        getDate();
    }//GEN-LAST:event_formWindowActivated
 
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendar().setVisible(true);
            }
        });
    }
    
    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.png")));
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PracticalsTable;
    private javax.swing.JTable TheoriticalsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       //get current date time with Date()
       Date date = new Date();
       String date1=dateFormat.format(date);
       System.out.println(dateFormat.format(date));
       try{
           Class.forName("org.sqlite.JDBC");
	        	String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
                             ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
                            Statement statement=ConnectiondatabaseConnection.createStatement();
                                String sql="SELECT * FROM theoritical WHERE `Ημερομηνία_Θεωρητικού`='"+date1+"'";
                                result=statement.executeQuery(sql);
                                 TheoriticalsTable.setModel(DbUtils.resultSetToTableModel(result));
                                 Statement statement2=ConnectiondatabaseConnection.createStatement();
                                String sql2="SELECT * FROM practical WHERE `Ημερομηνία_Πρακτικού`='"+date1+"'";
                                 result2=statement2.executeQuery(sql2);
                                 PracticalsTable.setModel(DbUtils.resultSetToTableModel(result2));
       }
       catch (SQLException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
              try{
                  result.close();
                  result2.close();
                  ConnectiondatabaseConnection.close();
                  
              }catch(Exception e1){
                  System.out.println(e1);
              }
          } //To change body of generated methods, choose Tools | Templates.
    }
}
