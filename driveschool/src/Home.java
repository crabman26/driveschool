import java.awt.Toolkit;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.JTable;
import java.lang.Exception;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Home extends javax.swing.JFrame 
{
    String str1;
    ImageIcon image1;
    
    public Home() 
    {   
    initComponents();
    setIcon();
    setResizable(false);
    setDefaultCloseOperation(Bus.EXIT_ON_CLOSE);
    setDefaultCloseOperation(Calendar.EXIT_ON_CLOSE);
    setDefaultCloseOperation(Car.EXIT_ON_CLOSE);
    setDefaultCloseOperation(LessonsAdd.EXIT_ON_CLOSE);
    setDefaultCloseOperation(LessonsEdit.EXIT_ON_CLOSE);
    setDefaultCloseOperation(MotorcycleAM.EXIT_ON_CLOSE);
    setDefaultCloseOperation(MotorcycleA.EXIT_ON_CLOSE);
    setDefaultCloseOperation(MotorcycleA1.EXIT_ON_CLOSE);
    setDefaultCloseOperation(MotorcycleA2.EXIT_ON_CLOSE);
    setDefaultCloseOperation(Truck.EXIT_ON_CLOSE);
    setDefaultCloseOperation(Practical.EXIT_ON_CLOSE);
    setDefaultCloseOperation(StudentsEdit.EXIT_ON_CLOSE);
    setDefaultCloseOperation(Lorry.EXIT_ON_CLOSE);
    setDefaultCloseOperation(ClientPrint.EXIT_ON_CLOSE);
    setDefaultCloseOperation(LessonsDelete.EXIT_ON_CLOSE);
    setDefaultCloseOperation(EcoDriving.EXIT_ON_CLOSE);
    
    try{
	Class.forName("org.sqlite.JDBC");
        String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
	java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
	Statement statement=ConnectiondatabaseConnection.createStatement();
	String sql="SELECT * FROM students";
	ResultSet result=statement.executeQuery(sql);
        Students2.setModel(DbUtils.resultSetToTableModel(result));
	ConnectiondatabaseConnection.close();
        result.close();
	}
	catch(Exception e1)
        {
	System.out.println(e1);
	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Student_Add_Button = new javax.swing.JButton();
        Student_Delete_Button = new javax.swing.JButton();
        Student_Edit_Button = new javax.swing.JButton();
        Search_TextField = new javax.swing.JTextField();
        Student_Search_Button = new javax.swing.JButton();
        Clean_Button = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_Students = new javax.swing.JScrollPane();
        Students2 = new javax.swing.JTable();
        Widget_Calendar = new com.toedter.calendar.JCalendar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Schedule_Button = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Client_Print_Button = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Theoretical_Bus_Button = new javax.swing.JMenuItem();
        Theoretical_Car_Button = new javax.swing.JMenuItem();
        Theoretical_MotorcycleAM_Button = new javax.swing.JMenuItem();
        Theoretical_MotorcycleA1_Button = new javax.swing.JMenuItem();
        Theoretical_MotorcycleA2_Button = new javax.swing.JMenuItem();
        Theoretical_MotorcycleA_Button = new javax.swing.JMenuItem();
        Theoretical_Lorry_Button = new javax.swing.JMenuItem();
        Theoretical_Truck_Button = new javax.swing.JMenuItem();
        Practical_Button = new javax.swing.JMenuItem();
        EcoDriving_Button = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΣΧΟΛΗ ΟΔΗΓΩΝ");

        Student_Add_Button.setText("ΚΑΤΑΧΩΡΗΣΗ ΜΑΘΗΤΗ");
        Student_Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Add_ButtonActionPerformed(evt);
            }
        });

        Student_Delete_Button.setText("ΔΙΑΓΡΑΦΗ ΜΑΘΗΤΗ");
        Student_Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Delete_ButtonActionPerformed(evt);
            }
        });

        Student_Edit_Button.setText("ΕΠΕΞΕΡΓΑΣΙΑ ΜΑΘΗΤΗ");
        Student_Edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Edit_ButtonActionPerformed(evt);
            }
        });

        Search_TextField.setToolTipText("ΕΠΩΝΥΜΟ");

        Student_Search_Button.setText("ΑΝΑΖΗΤΗΣΗ ΜΑΘΗΤΗ");
        Student_Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Search_ButtonActionPerformed(evt);
            }
        });

        Clean_Button.setText("ΚΑΘΑΡΙΣΜΟΣ ΠΕΔΙΩΝ");
        Clean_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clean_ButtonActionPerformed(evt);
            }
        });

        Students2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Students2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table_Students.setViewportView(Students2);

        jScrollPane3.setViewportView(Table_Students);

        jMenu1.setText("ΗΜΕΡΟΛΟΓΙΟ");
        jMenu1.setPreferredSize(new java.awt.Dimension(90, 25));

        Schedule_Button.setText("ΠΡΟΓΡΑΜΜΑ ΜΑΘΗΜΑΤΩΝ");
        Schedule_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Schedule_ButtonActionPerformed(evt);
            }
        });
        jMenu1.add(Schedule_Button);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("ΠΕΛΑΤΕΣ");

        Client_Print_Button.setText("ΚΑΡΤΕΛΑ ΠΕΛΑΤΗ");
        Client_Print_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_Print_ButtonActionPerformed(evt);
            }
        });
        jMenu2.add(Client_Print_Button);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("ΕΚΤΥΠΩΣΗ ΜΑΘΗΜΑΤΩΝ");

        Theoretical_Bus_Button.setText("ΘΕΩΡΗΤΙΚΑ ΛΕΩΦΟΡΕΙΟ");
        Theoretical_Bus_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theoretical_Bus_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Theoretical_Bus_Button);

        Theoretical_Car_Button.setText("ΘΕΩΡΗΤΙΚΑ ΑΥΤΟΚΙΝΗΤΟ");
        Theoretical_Car_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theoretical_Car_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Theoretical_Car_Button);

        Theoretical_MotorcycleAM_Button.setText("ΘΕΩΡΗΤΙΚΑ ΜΟΤΟΣΥΚΛΕΤΑ ΑΜ");
        Theoretical_MotorcycleAM_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theoretical_MotorcycleAM_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Theoretical_MotorcycleAM_Button);

        Theoretical_MotorcycleA1_Button.setText("ΘΕΩΡΗΤΙΚΑ ΜΟΤΟΣΥΚΛΕΤΑ Α1");
        Theoretical_MotorcycleA1_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theoretical_MotorcycleA1_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Theoretical_MotorcycleA1_Button);

        Theoretical_MotorcycleA2_Button.setText("ΘΕΩΡΗΤΙΚΑ ΜΟΤΟΣΥΚΛΕΤΑ Α2");
        Theoretical_MotorcycleA2_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theoretical_MotorcycleA2_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Theoretical_MotorcycleA2_Button);

        Theoretical_MotorcycleA_Button.setText("ΘΕΩΡΗΤΙΚΑ ΜΟΤΟΣΥΚΛΕΤΑ Α");
        Theoretical_MotorcycleA_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theoretical_MotorcycleA_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Theoretical_MotorcycleA_Button);

        Theoretical_Lorry_Button.setText("ΘΕΩΡΗΤΙΚΑ ΦΟΡΤΗΓΟ");
        Theoretical_Lorry_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theoretical_Lorry_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Theoretical_Lorry_Button);

        Theoretical_Truck_Button.setText("ΘΕΩΡΗΤΙΚΑ ΝΤΑΛΙΚΑ");
        Theoretical_Truck_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theoretical_Truck_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Theoretical_Truck_Button);

        Practical_Button.setText("ΠΡΑΚΤΙΚΑ");
        Practical_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Practical_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(Practical_Button);

        EcoDriving_Button.setText("ECO DRIVING");
        EcoDriving_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcoDriving_ButtonActionPerformed(evt);
            }
        });
        jMenu3.add(EcoDriving_Button);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Student_Add_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Student_Edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Student_Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Clean_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Student_Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(Widget_Calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Student_Add_Button)
                    .addComponent(Student_Delete_Button)
                    .addComponent(Student_Edit_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Student_Search_Button)
                    .addComponent(Clean_Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Widget_Calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        setSize(new java.awt.Dimension(937, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Students Jframe
    private void Student_Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Add_ButtonActionPerformed
      Students.getObj().setVisible(true);
    }//GEN-LAST:event_Student_Add_ButtonActionPerformed
//Students Edit Jframe
    private void Student_Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Edit_ButtonActionPerformed
       StudentsEdit.getObj().setVisible(true);
    }//GEN-LAST:event_Student_Edit_ButtonActionPerformed
//Studetns Delete Button
    private void Student_Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Delete_ButtonActionPerformed
        
    int selectedOption = JOptionPane.showConfirmDialog(null, "Θέλετε να διαγράψετε τον μαθητή!!!?", "Choose", JOptionPane.YES_NO_OPTION); 
    if (selectedOption == JOptionPane.YES_OPTION) 
    {   
    try
        {
            Class.forName("org.sqlite.JDBC");
            String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
	    java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
	    String str1=Search_TextField.getText();
            String sql="DELETE FROM students WHERE   Επώνυμο= ?";
            PreparedStatement pst = ConnectiondatabaseConnection.prepareStatement(sql);
            pst.setString(1,str1);
            pst.execute();
            pst.close();
            ConnectiondatabaseConnection.close();
        }
        catch(ClassNotFoundException e1)
        {
            System.out.println(e1);
        }
        catch(SQLException e2)
        {
	    System.out.println(e2);
            setVisible(false);
            dispose();
        }
    }
    if (selectedOption == JOptionPane.NO_OPTION){}
	        	
    }//GEN-LAST:event_Student_Delete_ButtonActionPerformed
//Student Search Button
    private void Student_Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Search_ButtonActionPerformed
    
    try 
        {
        Class.forName("org.sqlite.JDBC");
        String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
        java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
        Statement statement=ConnectiondatabaseConnection.createStatement();
        String str1=Search_TextField.getText();
        if (!str1.startsWith("'"))
        str1 = "'" + str1;
        if (!str1.endsWith("'"))
        str1 = str1 + "'";                 
        String sql="SELECT * FROM students WHERE Επώνυμο="+str1;
        ResultSet result=statement.executeQuery(sql);
        Students2.setModel(DbUtils.resultSetToTableModel(result));
        ConnectiondatabaseConnection.close();
        result.close();
        }
    catch (SQLException ex) 
        {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    catch (ClassNotFoundException ex)
        {
        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }		
    }//GEN-LAST:event_Student_Search_ButtonActionPerformed
//Clean Search Button
    private void Clean_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clean_ButtonActionPerformed
    
    Search_TextField.setText("");
     
    try
        {
	Class.forName("org.sqlite.JDBC");
        String sourceURL=new String("jdbc:sqlite:driveschool.sqlite");
	java.sql.Connection ConnectiondatabaseConnection = DriverManager.getConnection(sourceURL);
	Statement statement=ConnectiondatabaseConnection.createStatement();
	String sql="SELECT * FROM students ";
	ResultSet result=statement.executeQuery(sql);
        Students2.setModel(DbUtils.resultSetToTableModel(result));
	ConnectiondatabaseConnection.close();
        result.close();	
	}
	catch(Exception e1)
        {
	System.out.println(e1);
	}
    }//GEN-LAST:event_Clean_ButtonActionPerformed
//Client Print Button
    private void Client_Print_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client_Print_ButtonActionPerformed
        ClientPrint.getObj().setVisible(true);
    }//GEN-LAST:event_Client_Print_ButtonActionPerformed
//Schedule Button
    private void Schedule_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Schedule_ButtonActionPerformed
      Calendar.getObj().setVisible(true);
    }//GEN-LAST:event_Schedule_ButtonActionPerformed
//Practical Button
    private void Practical_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Practical_ButtonActionPerformed
        Practical.getObj().setVisible(true);
    }//GEN-LAST:event_Practical_ButtonActionPerformed
//Theoretical Lorry Button
    private void Theoretical_Lorry_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theoretical_Lorry_ButtonActionPerformed
    Lorry.getObj().setVisible(true);
    }//GEN-LAST:event_Theoretical_Lorry_ButtonActionPerformed
//Theoretical MotorcycleAM Button
    private void Theoretical_MotorcycleAM_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theoretical_MotorcycleAM_ButtonActionPerformed
    MotorcycleAM.getObj().setVisible(true);
    }//GEN-LAST:event_Theoretical_MotorcycleAM_ButtonActionPerformed
//Theoretical Car Button
    private void Theoretical_Car_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theoretical_Car_ButtonActionPerformed
    Car.getObj().setVisible(true);
    }//GEN-LAST:event_Theoretical_Car_ButtonActionPerformed
//Theoretical Bus Button
    private void Theoretical_Bus_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theoretical_Bus_ButtonActionPerformed
    Bus.getObj().setVisible(true);
    }//GEN-LAST:event_Theoretical_Bus_ButtonActionPerformed
//Theoretical MotorcycleA1 Button
    private void Theoretical_MotorcycleA1_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theoretical_MotorcycleA1_ButtonActionPerformed
        MotorcycleA1.getObj().setVisible(true);
    }//GEN-LAST:event_Theoretical_MotorcycleA1_ButtonActionPerformed
//Theoretical MotorcycleA2 Button
    private void Theoretical_MotorcycleA2_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theoretical_MotorcycleA2_ButtonActionPerformed
      MotorcycleA2.getObj().setVisible(true);
    }//GEN-LAST:event_Theoretical_MotorcycleA2_ButtonActionPerformed
//Theoretical MotorcycleA Button
    private void Theoretical_MotorcycleA_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theoretical_MotorcycleA_ButtonActionPerformed
       MotorcycleA.getObj().setVisible(true);
    }//GEN-LAST:event_Theoretical_MotorcycleA_ButtonActionPerformed
//Theoretical Motorcycle Truck Button
    private void Theoretical_Truck_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theoretical_Truck_ButtonActionPerformed
       Truck.getObj().setVisible(true);
    }//GEN-LAST:event_Theoretical_Truck_ButtonActionPerformed
//EcoDriving Button
    private void EcoDriving_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcoDriving_ButtonActionPerformed
        EcoDriving.getObj().setVisible(true);
    }//GEN-LAST:event_EcoDriving_ButtonActionPerformed
    
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    private void setIcon() 
    {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clean_Button;
    private javax.swing.JMenuItem Client_Print_Button;
    private javax.swing.JMenuItem EcoDriving_Button;
    private javax.swing.JLabel Image;
    private javax.swing.JMenuItem Practical_Button;
    private javax.swing.JMenuItem Schedule_Button;
    private javax.swing.JTextField Search_TextField;
    private javax.swing.JButton Student_Add_Button;
    private javax.swing.JButton Student_Delete_Button;
    private javax.swing.JButton Student_Edit_Button;
    private javax.swing.JButton Student_Search_Button;
    private javax.swing.JTable Students2;
    private javax.swing.JScrollPane Table_Students;
    private javax.swing.JMenuItem Theoretical_Bus_Button;
    private javax.swing.JMenuItem Theoretical_Car_Button;
    private javax.swing.JMenuItem Theoretical_Lorry_Button;
    private javax.swing.JMenuItem Theoretical_MotorcycleA1_Button;
    private javax.swing.JMenuItem Theoretical_MotorcycleA2_Button;
    private javax.swing.JMenuItem Theoretical_MotorcycleAM_Button;
    private javax.swing.JMenuItem Theoretical_MotorcycleA_Button;
    private javax.swing.JMenuItem Theoretical_Truck_Button;
    private com.toedter.calendar.JCalendar Widget_Calendar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
