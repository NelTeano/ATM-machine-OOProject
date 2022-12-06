package com.mycompany.projectoop;

import static com.mycompany.projectoop.InterfacesProject.conn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class WelcomeInterface extends javax.swing.JFrame {
    public static User loggedUser;
 
    
    
    public WelcomeInterface(User user) {
        this.loggedUser = user;
        System.out.println(user.name);
        initComponents();
        String username = user.name;
     
           
        
        jLabel3.setText("Welcome " + username.toUpperCase());
    }
   
    
 
    

    public WelcomeInterface() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        savingsBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        withdrawBTN = new javax.swing.JButton();
        depositBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logoutBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        savingsBTN.setBackground(new java.awt.Color(0, 102, 102));
        savingsBTN.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        savingsBTN.setForeground(new java.awt.Color(153, 255, 0));
        savingsBTN.setText("SAVINGS");
        savingsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsBTNActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("WELCOME");

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("1. SEE SAVINGS");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("2. WITHDRAW MONEY");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("3. DEPOSIT MONEY");

        withdrawBTN.setBackground(new java.awt.Color(0, 102, 102));
        withdrawBTN.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        withdrawBTN.setForeground(new java.awt.Color(153, 255, 51));
        withdrawBTN.setText("WITHDRAW");
        withdrawBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBTNActionPerformed(evt);
            }
        });

        depositBTN.setBackground(new java.awt.Color(0, 102, 102));
        depositBTN.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        depositBTN.setForeground(new java.awt.Color(153, 255, 51));
        depositBTN.setText("DEPOSIT");
        depositBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBTNActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Teano\\Downloads\\servicescrop.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Teano\\Downloads\\atmlogo.png")); // NOI18N

        logoutBTN.setBackground(new java.awt.Color(0, 102, 102));
        logoutBTN.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        logoutBTN.setForeground(new java.awt.Color(255, 0, 51));
        logoutBTN.setText("LOG OUT");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(withdrawBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(depositBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(156, 156, 156)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(savingsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel5)))
                        .addGap(576, 576, 576))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(543, 543, 543))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(savingsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(depositBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBTNActionPerformed
    
       String AmountWithdraw = JOptionPane.showInputDialog("Input the Amount of Money you want to Withdraw: ");
       
          
         
            try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT balance FROM Users WHERE id= '"+loggedUser.id+"'");
            double balance = rs.getInt("balance");
            double ValidationAmount = Integer.parseInt(AmountWithdraw);
                     
            if(ValidationAmount <= balance){
                String Password = JOptionPane.showInputDialog("Input Your Account Pin: ");               
                    if(Password.equals(loggedUser.pin)){   
        try{
        Statement st1 = conn.createStatement();
      
      
        String UpdatesumWithdraw = "UPDATE Users SET sumWithdraw= '"+AmountWithdraw+"' WHERE id= '"+loggedUser.id+"'";
        String afterBalance = "UPDATE Users SET balance = balance - sumWithdraw WHERE id = '"+loggedUser.id+"'";
        String SetsumWithdraw = "UPDATE Users SET sumWithdraw = '0' WHERE id ='"+loggedUser.id+"'";
         
        st1.executeUpdate(UpdatesumWithdraw);
        st1.executeUpdate(afterBalance);
        st1.executeUpdate(SetsumWithdraw);
        JOptionPane.showMessageDialog(this, "the Money has Successfully Withdraw From your Account\n to Check go to Savings! Amount : " + AmountWithdraw);
             
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Withdraw Failed " + e);
        }                
    }
                    else{
                    JOptionPane.showMessageDialog(this,"Wrong Pin Transaction Failed ");
                    }
 }
            else{
            JOptionPane.showMessageDialog(this,"Savings Insufficient ");
}
            }catch(SQLException er){
            JOptionPane.showMessageDialog(this,"Withdraw Failed " + er);
        }                    
            
       
             
            
            
            
         
            
       
       
       
    
  
       
    
    
    }//GEN-LAST:event_withdrawBTNActionPerformed

    private void savingsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsBTNActionPerformed
           
   
     
     
      try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT balance FROM Users WHERE id= '"+loggedUser.id+"'");
            Number balance = rs.getInt("balance");
             JOptionPane.showMessageDialog(this,"Your Balance is : " + balance);
         } 
          catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }

       
       
    }//GEN-LAST:event_savingsBTNActionPerformed

    private void depositBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBTNActionPerformed
    
        String AmountDeposit = JOptionPane.showInputDialog("Input the Amount of Money you want to Deposit: ");
        String Password = JOptionPane.showInputDialog("Input Your Account Pin: ");
        
    if(Password.equals(loggedUser.pin)){    
       try{
        Statement st = conn.createStatement();
        
       
     
        String UpdatesumDeposit = "UPDATE Users SET sumDeposit= '"+AmountDeposit+"' WHERE id= '"+loggedUser.id+"'";
        String UpdateBalance = "UPDATE Users SET balance = sumDeposit + balance WHERE id = '"+loggedUser.id+"'";
        String SetsumDeposit = "UPDATE Users SET sumDeposit = '0' WHERE id ='"+loggedUser.id+"'";
         
        st.executeUpdate(UpdatesumDeposit);
        st.executeUpdate(UpdateBalance);
        st.executeUpdate(SetsumDeposit);
        JOptionPane.showMessageDialog(this, "the Money has Successfully Deposit into your Account\n to Check go to Savings! Amount : " + AmountDeposit );
     
   

      
       
     //        JOptionPane.showMessageDialog(this,"Your Money Successfully Deposited Amount :" + DepositedAmount);        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Deposit Failed " + e);
        }
    }
    else{
        JOptionPane.showMessageDialog(this,"Deposit Failed Wrong Pin");
    }
        
       
           
            
       
         
         
    }//GEN-LAST:event_depositBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
         JOptionPane.showMessageDialog(this,"Thank You For Using cvsuCASHOUT have a Nice Day");
         System.exit(0);
    }//GEN-LAST:event_logoutBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton savingsBTN;
    private javax.swing.JButton withdrawBTN;
    // End of variables declaration//GEN-END:variables
}
