/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fms;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setSize(1200,800);
        setLocation(400,150);
        setResizable(false);
        setTitle("Login page");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password_login = new javax.swing.JPasswordField();
        usename_login = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 169, 171, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 319, 200, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 438, 200, 40));
        getContentPane().add(password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 438, 300, 40));

        usename_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usename_loginActionPerformed(evt);
            }
        });
        getContentPane().add(usename_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 319, 300, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 150, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 586, 150, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, -490, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms fms/HyperXElite01.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -80, 1480, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usename_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usename_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usename_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (usename_login.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"ID field cannot be empty!","Alert",JOptionPane.WARNING_MESSAGE);
        }

        else if (password_login.getPassword().length==0)
        {
            JOptionPane.showMessageDialog(this,"Enter Password!","Alert",JOptionPane.WARNING_MESSAGE);
        }

        else
        {
            String s1=usename_login.getText();
            char[] s2=password_login.getPassword();
            String s31="admin";
            String s32="admin";
 //           String s22=String.copyValueOf(s2);
               String s22;
            s22 = new String(s2);
    if(!s1.equals(s31) || !s22.equals(s32))
            {
                JOptionPane.showMessageDialog(this,"Enter correct Credentials!","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else if(s1.equals(s31) && s22.equals(s32))
            {
        this.setVisible(false);
        //System.out.println("\n After Login");
        Menu fr=new Menu();
        fr.setVisible(true);
        //System.out.println("\n After Menu");
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
                //textbox coding
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
usename_login.setText("");
password_login.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField password_login;
    private javax.swing.JTextField usename_login;
    // End of variables declaration//GEN-END:variables
}
