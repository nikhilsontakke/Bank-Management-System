/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;

/**
 *
 * @author nikhil
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        
        try{
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","bmsmanager","bmspassword")) {
                Statement stmt = con.createStatement();
                stmt.executeUpdate("CREATE TABLE if not exists currentsession like userdetails;");
                stmt.executeUpdate("DELETE from currentsession");
                stmt.close();
                con.close();             
            }
        }
        catch(Exception e){
            System.out.println(e+" login issue");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bank Management System");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setFocusTraversalPolicyProvider(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 23)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee Portal", "Login as Admin", " " }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Username");

        username.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        username.setNextFocusableComponent(password);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Password");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        password.setNextFocusableComponent(jButton1);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username)
                                    .addComponent(password)))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //Toolkit toolkit = getToolkit();
        //Dimension size = toolkit.getScreenSize();
        //setLocation(size.width/2 - getWidth()/2, size.width/2 - getWidth()/2);
        this.setLocationRelativeTo(null);
        //this.setBounds(size.width/2 - getWidth()/2,size.width/2 - getWidth()/2,750,550);
        //jTextField1.setUI(new JTextFieldHintUI("This is a hint..."));
    }//GEN-LAST:event_formWindowActivated

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        jButton1.doClick();
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String item = (String)jComboBox1.getSelectedItem();
        if(item.equals("Employee Portal")){
        String user = username.getText();
        String pass = new String(password.getPassword());
        String name,dob,ifsc,accountNo,aadharNo,gender,address,mobileNo,panNo;
        long accbal;
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","bmsmanager","bmspassword");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from userdetails");
            while(rs.next()){
                if(user.equals(rs.getString("username")) && pass.equals(rs.getString("password"))){
                    name = rs.getString("name");
                    dob = rs.getString("dob");
                    ifsc = rs.getString("ifsc");
                    accountNo = rs.getString("accno");
                    aadharNo = rs.getString("addno");
                    gender = rs.getString("gen");
                    address = rs.getString("address");
                    mobileNo = rs.getString("mono");
                    panNo = rs.getString("panno");
                    accbal = rs.getInt("accbal");
                    
                    Statement stmt2 = con.createStatement();
                    stmt2.executeUpdate("insert into currentsession (name,dob,ifsc,accno,addno,gen,address,mono,panno,username,password,accbal) values ('"+name+"','"+dob+"','"+ifsc+"',"+accountNo+","+aadharNo+",'"+gender+"','"+address+"',"+mobileNo+",'"+panNo+"','"+user+"','"+pass+"','"+accbal+"');");
                    
                    customerMain obj = new customerMain();
                    obj.setVisible(true);
                    this.setVisible(false);
                }
            }
            rs.close();
            stmt.close();
            con.close();
           
        }
        catch(Exception e){
            System.out.print(e+" login button issue ");
        }
        }
        else {
            String user = username.getText();
            String pass = new String(password.getPassword());
            if(user.equals("admin") && pass.equals("admin@123")){
                admin obj = new admin();
                obj.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordKeyPressed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
