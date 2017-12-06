
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crabman
 */
public class StudentsEdit extends javax.swing.JFrame {
String str,str1,str2,Sinergates1,Vehicle1,syn,cat;
java.util.Date d1,d2;
java.sql.Date sq1,sq2;
SimpleDateFormat sd1,sd2;
Object s1,o1;
    /**
     * Creates new form StudentsEdit
     */
   private static StudentsEdit obj=null;
    
    private StudentsEdit() {
        initComponents();
        setResizable(false);
        setIcon();
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(StudentsEdit.DO_NOTHING_ON_CLOSE);
    }
    
    
    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.png")));
    }
 
    public static StudentsEdit getObj(){
        if(obj==null){
            obj=new StudentsEdit();
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

        Search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Surname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Father = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Mother = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Identity_Number = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Date_Of_Birth = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        City = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Adress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Postal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Mobile = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        AFM = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Theoritical = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Practical = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Protocolle = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Licence = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Observations = new javax.swing.JTextField();
        Vehicle = new javax.swing.JComboBox();
        Sinergates = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΕΠΕΞΕΡΓΑΣΙΑ ΜΑΘΗΤΗ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel2.setText("ΟΝΟΜΑ");

        jLabel3.setText("ΕΠΩΝΥΜΟ");

        jLabel4.setText("ΠΑΤΡΩΝΥΜΟ");

        Father.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FatherActionPerformed(evt);
            }
        });

        jLabel5.setText("ΜΗΤΡΩΝΥΜΟ");

        Mother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotherActionPerformed(evt);
            }
        });

        jLabel6.setText("Α.Δ.Τ.");

        jLabel7.setText("ΗΜΕΡΟΜΗΝΙΑ ΓΕΝΝΗΣΗΣ");

        jLabel8.setText("ΤΟΠΟΣ ΓΕΝΝΗΣΗΣ");

        jLabel9.setText("ΣΥΝΕΡΓΑΤΕΣ");

        jLabel10.setText("ΔΙΕΥΘΥΝΣΗ");

        jLabel11.setText("Τ.Κ");

        Postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostalActionPerformed(evt);
            }
        });

        jLabel12.setText("ΤΗΛΕΦΩΝΟ");

        jLabel13.setText("ΚΙΝΗΤΟ");

        jLabel14.setText("ΑΦΜ");

        jLabel16.setText("ΘΕΩΡΗΤΙΚΑ ΜΑΘΗΜΑΤΑ");

        Theoritical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoriticalActionPerformed(evt);
            }
        });

        jLabel17.setText("ΠΡΑΚΤΙΚΑ ΜΑΘΗΜΑΤΑ");

        Practical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PracticalActionPerformed(evt);
            }
        });

        jLabel18.setText("ΚΑΤΗΓΟΡΙΑ ΟΧΗΜΑΤΟΣ");

        jButton1.setText("ΑΝΑΖΗΤΗΣΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ΕΠΕΞΕΡΓΑΣΙΑ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("ΚΑΘΑΡΙΣΜΟΣ ΠΕΔΙΩΝ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("ΑΡΙΘΜΟΣ ΠΡΩΤΟΚΟΛΟΥ");

        jLabel19.setText("ΑΡΙΘΜΟΣ ΑΔΕΙΑΣ");

        jLabel20.setText("ΠΑΡΑΤΗΡΗΣΕΙΣ");

        Vehicle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Αυτοκίνητο", "Μοτοσυκλέτα ΑΜ", "Μοτοσυκλέτα Α1", "Μοτοσυκλέτα Α2", "Μοτοσυκλέτα Α", "Νταλίκα", "Λεωφορείο", "Φορτηγό" }));

        Sinergates.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Γεωργουλόπουλος" }));
        Sinergates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinergatesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Father, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date_Of_Birth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel20))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Theoritical)
                            .addComponent(Licence)
                            .addComponent(Identity_Number)
                            .addComponent(Adress)
                            .addComponent(Mobile)
                            .addComponent(Sinergates, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Observations, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel18))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Practical)
                            .addComponent(Postal)
                            .addComponent(City)
                            .addComponent(Phone)
                            .addComponent(Protocolle)
                            .addComponent(Vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AFM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mother, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Mother, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(AFM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Practical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Protocolle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(Vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Father, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Identity_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date_Of_Birth, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(Theoritical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(Licence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Sinergates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(Observations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        try{
            str=Search.getText();
             if (!str.startsWith("'"))
                             str = "'" + str;
                             
                            
                        if (!str.endsWith("'"))
                             str = str + "'";
				
           Class.forName("org.sqlite.JDBC");
           String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
	        	java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
	        	Statement statement=ConnectiondatabaseConnection.createStatement();
	        	
	        	
	        	String sql="SELECT * FROM students WHERE Επώνυμο="+str;
	        	ResultSet result=statement.executeQuery(sql);
                       
                       displayResults(result); // TODO add your handling code here:
                       result.close();
                      
                       
    }                                         
catch(ClassNotFoundException e1){
				System.out.println(e1);
			}
			catch(SQLException e2){
	        	System.out.println(e2);
    /**
     * @param args the command line arguments
     */
                        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
             str=Search.getText();
            
            if (!str.startsWith("'"))
                             str = "'" + str;
                             
                            
                        if (!str.endsWith("'"))
                             str = str + "'";
				
           Class.forName("org.sqlite.JDBC");
           String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
	        	java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
                        o1=Vehicle.getSelectedItem();
                        Vehicle1=String.valueOf(o1);
                         s1=Sinergates.getSelectedItem();
                        Sinergates1=String.valueOf(o1);
                        
                        
                        String sql="UPDATE students SET Όνομα='"+Name.getText()+"',Επώνυμο='"+Surname.getText()+"',Πατρώνυμο='"+Father.getText()+"',Μητρώνυμο='"+Mother.getText()+"','ΑΔΤ'='"+Identity_Number.getText()+"','Ημερομηνία_Γέννησης'='"+Date_Of_Birth.getText()+"','Τόπος_Γέννησης'='"+City.getText()+"',Διεύθυνση='"+Adress.getText()+"',Τηλέφωνο='"+Phone.getText()+"',Κινητό='"+Mobile.getText()+"',ΑΦΜ='"+AFM.getText()+"',Θεωρητικά='"+Theoritical.getText()+"',Πρακτικά='"+Practical.getText()+"',Συνεργάτες='"+Sinergates1+"',Κατηγορία='"+Vehicle1+"','Άδεια'='"+Licence.getText()+"','Πρωτόκολο'='"+Protocolle.getText()+"',Παρατηρήσεις='"+Observations.getText()+"' WHERE Επώνυμο='"+Search.getText()+"'";
	        	
	        	 PreparedStatement pst = ConnectiondatabaseConnection.prepareStatement(sql);
                         pst.execute();
	        	
	        	
                        
                       
                    

	        	
	try{
            str1=Date_Of_Birth.getText();
        sd1=new SimpleDateFormat("yyyy-mm-dd");
        
     
	        	
          java.util.Date d1 = sd1.parse(str1); 
           java.sql.Date sq1 = new Date(d1.getTime());
        
                 ConnectiondatabaseConnection.close();
            
        }   
         catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				

				
			}
        
                      
			catch(ClassNotFoundException e1){
				System.out.println(e1);
			}
			catch(SQLException e2){
	        	System.out.println(e2);

	        	
	        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Search.setText("");
        Name.setText("");
        Surname.setText("");
        Father.setText("");
        Mother.setText("");
        Identity_Number.setText("");
        Date_Of_Birth.setText("");
        City.setText("");
        Adress.setText("");
        Postal.setText("");
        AFM.setText("");
       
        
        Practical.setText("");
        Theoritical.setText("");
        Mobile.setText("");
        Phone.setText("");
        
        Licence.setText("");
        Protocolle.setText("");
        Observations.setText("");
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void TheoriticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoriticalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TheoriticalActionPerformed

    private void PracticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PracticalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PracticalActionPerformed

    private void PostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PostalActionPerformed

    private void FatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FatherActionPerformed

    private void MotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotherActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_formWindowClosed

    private void SinergatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinergatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SinergatesActionPerformed

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
            java.util.logging.Logger.getLogger(StudentsEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsEdit().setVisible(true);
            }
        });
    }
     private   void displayResults(ResultSet result) throws SQLException{
		
		
		
		if (result.next()){
                        Name.setText(result.getString(2));
                        Surname.setText(result.getString(3));
	      Father.setText(result.getString(4));
                        Mother.setText(result.getString(5));
                        Identity_Number.setText(result.getString(6));
	      Date_Of_Birth.setText(result.getString(7));
	      City.setText(result.getString(8));
	      Adress.setText(result.getString(9));
	      Postal.setText(result.getString(10));
	      Phone.setText(result.getString(11));
                        Mobile.setText(result.getString(12));
                        AFM.setText(result.getString(13));
                        
	      Theoritical.setText(result.getString(15));
	      Practical.setText(result.getString(16));
                        syn=result.getString(17);
                        cat=result.getString(18);
                        Licence.setText(result.getString(19));
                        Protocolle.setText(result.getString(20));
                        Observations.setText(result.getString(21));
                        
                        switch (cat){
           case "Αυτοκίνητο":
            Vehicle.setSelectedIndex(0);
            break;
               case "Μοτοσυκλέτα ΑΜ":
            Vehicle.setSelectedIndex(1);
               break;
                   case "Μοτοσυκλέτα Α1":
            Vehicle.setSelectedIndex(2);
               break;
                       case "Μοτοσυκλέτα Α2":
             Vehicle.setSelectedIndex(3);
               break;
                           case "Μοτοσυκλέτα Α":
            Vehicle.setSelectedIndex(4);
               break;
                               case "Νταλίκα":
            Vehicle.setSelectedIndex(5);
               break;
                                   case "Λεωφορείο":
            Vehicle.setSelectedIndex(6);
               break;
                                        case "Φορτηγό":
            Vehicle.setSelectedIndex(7);
               break;
         }



                } else{
                     String Message="Δεν υπάρχει εγγραφή";
                     JOptionPane.showMessageDialog(null,Message);
                }

               
                
		
}
      
     
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AFM;
    private javax.swing.JTextField Adress;
    private javax.swing.JTextField City;
    private javax.swing.JTextField Date_Of_Birth;
    private javax.swing.JTextField Father;
    private javax.swing.JTextField Identity_Number;
    private javax.swing.JTextField Licence;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Mother;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Observations;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField Postal;
    private javax.swing.JTextField Practical;
    private javax.swing.JTextField Protocolle;
    private javax.swing.JTextField Search;
    private javax.swing.JComboBox Sinergates;
    private javax.swing.JTextField Surname;
    private javax.swing.JTextField Theoritical;
    private javax.swing.JComboBox Vehicle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
