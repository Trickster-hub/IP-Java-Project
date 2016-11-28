/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipproject.java;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author akhil
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }

    public static boolean isUserAdmin = false;
    public static boolean isUserAnonymous = false;
    public static String loggedInUser = "";

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
        usernameInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        resetFieldsButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        anonymousLoginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        usernameInput.setBackground(new java.awt.Color(0,0,0,0));
        usernameInput.setForeground(new java.awt.Color(51, 255, 255));
        usernameInput.setOpaque(false);
        getContentPane().add(usernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 102, -1));

        passwordInput.setBackground(new java.awt.Color(0,0,0,0));
        passwordInput.setForeground(new java.awt.Color(51, 255, 255));
        passwordInput.setOpaque(false);
        getContentPane().add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 102, -1));

        LoginButton.setBackground(new java.awt.Color(0, 0, 0));
        LoginButton.setForeground(new java.awt.Color(51, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LoginButton.setContentAreaFilled(false);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        resetFieldsButton.setBackground(new java.awt.Color(0, 0, 0));
        resetFieldsButton.setForeground(new java.awt.Color(51, 255, 255));
        resetFieldsButton.setText("Reset Fields");
        resetFieldsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resetFieldsButton.setContentAreaFilled(false);
        resetFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFieldsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetFieldsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        cancelButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelButton.setForeground(new java.awt.Color(51, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancelButton.setContentAreaFilled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setForeground(new java.awt.Color(51, 255, 255));
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exitButton.setContentAreaFilled(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        showPassword.setForeground(new java.awt.Color(51, 255, 255));
        showPassword.setText("Show Password");
        showPassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showPasswordItemStateChanged(evt);
            }
        });
        getContentPane().add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        anonymousLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        anonymousLoginButton.setForeground(new java.awt.Color(51, 255, 255));
        anonymousLoginButton.setText("Anonymous Login");
        anonymousLoginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        anonymousLoginButton.setContentAreaFilled(false);
        anonymousLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anonymousLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(anonymousLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipproject/java/images/login-screen-bg.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String username = usernameInput.getText();
        String password = new String(passwordInput.getPassword());
        if (username.equals("") || password.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please enter proper details");
            return ;
        }
        if(username.length()>20 || password.length()>20)
        {
            JOptionPane.showMessageDialog(this,"Credentials cannot be longer than 20 characters");
            return ;
        }
        if (username.equals("admin"))
        {
            if (password.equals("nrkgamesadmin123"))
            {
                isUserAdmin=true;
                loggedInUser=username;
                new LoggedInForm().setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Wrong password for admin!");
            }
            return ;
        }
        try
        {
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection(Utils.URL,Utils.USER,Utils.PASSWORD);
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from users");
            boolean doesUserExist = false;
            while (rs.next())
            {
                String u = rs.getString("username");
                if(u.equalsIgnoreCase(username))
                {
                    doesUserExist = true;
                    break;
                }
            }
            String pw = rs.getString("password");
            if (!doesUserExist)
            {
                JOptionPane.showMessageDialog(this,"Please enter a registered username");
            }
            else if(pw.equals(Utils.encrypt(password)))
            {
                loggedInUser = username;
                new LoggedInForm().setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid password for user "+username);
                passwordInput.setText("");
            }
            rs.close();
            s.close();
            c.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            Utils.displayError(e);
            return ;
        }
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int n = JOptionPane.showConfirmDialog(null,"Do you want to exit the program?");
        if (n==0)
            System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int n = JOptionPane.showConfirmDialog(null,"Do you want to cancel login?");
        if (n==0)
        {
            new MainForm().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void resetFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFieldsButtonActionPerformed
        usernameInput.setText("");
        passwordInput.setText("");
        showPassword.setSelected(false);
    }//GEN-LAST:event_resetFieldsButtonActionPerformed

    private void showPasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showPasswordItemStateChanged
        Utils.showPassword(passwordInput,showPassword);
    }//GEN-LAST:event_showPasswordItemStateChanged

    private void anonymousLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anonymousLoginButtonActionPerformed
        isUserAnonymous = true;
        new LoggedInForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_anonymousLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton anonymousLoginButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton resetFieldsButton;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
