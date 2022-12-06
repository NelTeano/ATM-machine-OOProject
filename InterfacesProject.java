package com.mycompany.projectoop;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Teano
 */
public class InterfacesProject extends javax.swing.JFrame {

    public static Connection conn = null;
    public static String url = "jdbc:sqlite:C:/Users/Teano/Documents/NetBeansProjects/OOPProject/account.db";

    public InterfacesProject() {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPane = new javax.swing.JPanel();
        CreateBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        accountName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        accountPin = new javax.swing.JPasswordField();
        LoginBTN1 = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPane.setBackground(new java.awt.Color(0, 255, 153));

        CreateBTN.setBackground(new java.awt.Color(0, 102, 102));
        CreateBTN.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        CreateBTN.setForeground(new java.awt.Color(255, 255, 51));
        CreateBTN.setText("CREATE ACCOUNT");
        CreateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Account Name : ");

        accountName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        accountName.setText("Input Account Name");
        accountName.setToolTipText("");
        accountName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pin  : ");

        accountPin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        accountPin.setText("jPasswordField1");

        LoginBTN1.setBackground(new java.awt.Color(0, 102, 102));
        LoginBTN1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        LoginBTN1.setForeground(new java.awt.Color(255, 255, 51));
        LoginBTN1.setText("Login");
        LoginBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTN1ActionPerformed(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Teano\\Downloads\\cvsuCASHOUT.jpg")); // NOI18N
        icon.setText("jLabel3");

        javax.swing.GroupLayout LoginPaneLayout = new javax.swing.GroupLayout(LoginPane);
        LoginPane.setLayout(LoginPaneLayout);
        LoginPaneLayout.setHorizontalGroup(
            LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneLayout.createSequentialGroup()
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(CreateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(accountName, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LoginBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountPin, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        LoginPaneLayout.setVerticalGroup(
            LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPaneLayout.createSequentialGroup()
                .addGroup(LoginPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(icon)
                        .addGap(18, 18, 18)
                        .addComponent(CreateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPaneLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(accountName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(accountPin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(LoginBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static InterfacesProject loginInterface = new InterfacesProject();
    public static CreateInterface createInterface = new CreateInterface();

    private void CreateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBTNActionPerformed

        createInterface.setVisible(true);
        loginInterface.setVisible(false);

    }//GEN-LAST:event_CreateBTNActionPerformed

    private void LoginBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTN1ActionPerformed
        String accountname = accountName.getText().toLowerCase();
        String accountpin = accountPin.getText();

        User user = null;

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Users;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String pin = rs.getString("pin");
                Number balance = rs.getInt("balance");
                Number withdraw = rs.getInt("sumWithdraw");
                Number deposit = rs.getInt("sumDeposit");
           

                if (pin.equals(accountpin) && (name.equals(accountname))) {
                    user = new User(id, name, pin, balance, deposit, withdraw);
                    break;
                }
            }

            if (user == null) {
                JOptionPane.showMessageDialog(loginInterface, "Username or Password Is Null or Wrong");
                return;
            }

            JOptionPane.showMessageDialog(loginInterface, "Login Success");
            WelcomeInterface welcomeInterface = new WelcomeInterface(user);
            welcomeInterface.setVisible(true);
            this.setVisible(false);
            createInterface.setVisible(false);
            
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }

    }//GEN-LAST:event_LoginBTN1ActionPerformed

    private void accountNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNameActionPerformed

    public static void connect() {
        try {

            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
        connect();
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfacesProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacesProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacesProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacesProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        loginInterface.setVisible(true);
        
      
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateBTN;
    private javax.swing.JButton LoginBTN1;
    private javax.swing.JPanel LoginPane;
    private javax.swing.JTextField accountName;
    private javax.swing.JPasswordField accountPin;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private Object WelcomeInterface() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
