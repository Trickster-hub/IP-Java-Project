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
public class CreateAccountForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccountForm
     */
    public CreateAccountForm() {
        initComponents();
    }

    /** 
     * @deprecated 
     */
    public static int offset = 0;
    
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        resetFieldsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Please enter the details and click Submit");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 507, -1));

        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("The username and password must not be more than 20 characters long");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 507, 15));

        usernameInput.setBackground(new java.awt.Color(0,0,0,0));
        usernameInput.setForeground(new java.awt.Color(51, 255, 255));
        usernameInput.setOpaque(false);
        getContentPane().add(usernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 138, -1));

        passwordInput.setBackground(new java.awt.Color(0,0,0,0));
        passwordInput.setForeground(new java.awt.Color(51, 255, 255));
        getContentPane().add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 138, -1));

        submitButton.setBackground(new java.awt.Color(0, 0, 0));
        submitButton.setForeground(new java.awt.Color(51, 255, 255));
        submitButton.setText(" Submit ");
        submitButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        submitButton.setContentAreaFilled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        cancelButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelButton.setForeground(new java.awt.Color(51, 255, 255));
        cancelButton.setText(" Cancel ");
        cancelButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancelButton.setContentAreaFilled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        resetFieldsButton.setBackground(new java.awt.Color(0, 0, 0));
        resetFieldsButton.setForeground(new java.awt.Color(51, 255, 255));
        resetFieldsButton.setText(" Reset Fields ");
        resetFieldsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resetFieldsButton.setContentAreaFilled(false);
        resetFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFieldsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetFieldsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setForeground(new java.awt.Color(51, 255, 255));
        exitButton.setText(" Exit ");
        exitButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exitButton.setContentAreaFilled(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        showPassword.setForeground(new java.awt.Color(51, 255, 255));
        showPassword.setText("Show Password");
        showPassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showPasswordItemStateChanged(evt);
            }
        });
        getContentPane().add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipproject/java/images/all-inside-screen-bg.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFieldsButtonActionPerformed
        usernameInput.setText("");
        passwordInput.setText("");
    }//GEN-LAST:event_resetFieldsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int n = JOptionPane.showConfirmDialog(null,"Do you want to exit the program?");
        if (n==0)
            System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int n = JOptionPane.showConfirmDialog(null,"Do you want to to cancel account creation?");
        if (n==0)
        {
            new MainForm().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String username = usernameInput.getText();
        String password = new String(passwordInput.getPassword());
        if (username.equals("admin"))
        {
            JOptionPane.showMessageDialog(this,"This username is reserved for administrators");
            resetFieldsButton.doClick();
            return ;
        }
        if (username.equals("") || password.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please enter proper details");
            return ;
        }
        if(username.length()>20 || password.length()>20)
        {
            JOptionPane.showMessageDialog(this,"Please enter shorter details(max 20 characters)");
            return ;
        }
        try
        {
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection(Utils.URL,Utils.USER,Utils.PASSWORD);
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select username from users");
            boolean duplicate = false;
            while (rs.next())
            {
                String u = rs.getString("username");
                if(u.equalsIgnoreCase(username))
                {
                    duplicate=true;
                    break;
                }
            }
            if(duplicate)
            {
                JOptionPane.showMessageDialog(this,"Username is already taken!");
                return ;
            }
            password=Utils.encrypt(password);
            int n = s.executeUpdate("insert into users values(\""+username+"\",\""+password+"\")");
            rs.close();
            s.close();
            c.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            Utils.displayError(e);
            return ;
        }
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void showPasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showPasswordItemStateChanged
        Utils.showPassword(passwordInput,showPassword);
    }//GEN-LAST:event_showPasswordItemStateChanged

    
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
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton resetFieldsButton;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
