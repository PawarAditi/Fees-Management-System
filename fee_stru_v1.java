/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class fee_stru_v1 extends javax.swing.JFrame {

      conn c;
    PreparedStatement ps, psn;
    boolean found = false;
    ResultSet result;
    public fee_stru_v1() {
        initComponents();
        
         setSize(1200,800);
        setLocation(400,150);
        setResizable(false);
        setTitle("Fee Structure page");
        
        
        
        searchtable();
                DefaultTableModel tbl;
    }

    public void searchtable()
    {
         DefaultTableModel tbl;
        try{
           
        
            
            tbl=(DefaultTableModel)strutbl.getModel();
                 
           tbl.setRowCount(0);
           
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fees", "root", "root123");
            Statement stat = con.createStatement();
            //tring sql="Select count(FIR_no) from fir w";
            
              Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/fees", "root", "root123");
           Statement stat1 = con1.createStatement();
           
            ResultSet rs1=stat1.executeQuery("Select Str_id,Category from fee_structure");
            
            
           /* String sql="select count(FIR_no) from fir where Location ='" + c1 + "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                String count=rs.getString("count(FIR_no)");
                String abc ="%";
                cr.setText(count+abc);
                
            }
            */
           while(rs1.next())
            tbl.addRow(new Object[]{rs1.getString(1),rs1.getString(2)});
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
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

        str_id_frm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        str_acd_yr_frm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        str_category_frm = new javax.swing.JTextField();
        str_fee_amt_frm = new javax.swing.JTextField();
        add_butn = new javax.swing.JButton();
        mod_butn = new javax.swing.JButton();
        dlt_butn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        strutbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        acdlabel = new javax.swing.JLabel();
        catlabel = new javax.swing.JLabel();
        feelabel = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        stridlabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        str_id_frm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                str_id_frmActionPerformed(evt);
            }
        });
        str_id_frm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                str_id_frmKeyReleased(evt);
            }
        });
        getContentPane().add(str_id_frm, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 138, 300, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("Structure ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 138, 200, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Academic Year :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 208, 230, 40));

        str_acd_yr_frm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                str_acd_yr_frmKeyReleased(evt);
            }
        });
        getContentPane().add(str_acd_yr_frm, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 208, 300, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setText("Category :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 278, 200, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel4.setText("Fee Amount :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 348, 200, 40));

        str_category_frm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                str_category_frmKeyReleased(evt);
            }
        });
        getContentPane().add(str_category_frm, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 268, 300, 40));

        str_fee_amt_frm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                str_fee_amt_frmKeyReleased(evt);
            }
        });
        getContentPane().add(str_fee_amt_frm, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 338, 300, 40));

        add_butn.setIcon(new javax.swing.ImageIcon("E:\\Projects\\FMS\\src\\dbms fms\\Add-icon.png")); // NOI18N
        add_butn.setText("ADD");
        add_butn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_butnActionPerformed(evt);
            }
        });
        getContentPane().add(add_butn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 150, 50));

        mod_butn.setIcon(new javax.swing.ImageIcon("E:\\Projects\\FMS\\src\\dbms fms\\modify-key-icon.png")); // NOI18N
        mod_butn.setText("MODIFY");
        mod_butn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_butnActionPerformed(evt);
            }
        });
        getContentPane().add(mod_butn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 150, 50));

        dlt_butn.setIcon(new javax.swing.ImageIcon("E:\\Projects\\FMS\\src\\dbms fms\\Button-Close-icon.png")); // NOI18N
        dlt_butn.setText("DELETE");
        dlt_butn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlt_butnActionPerformed(evt);
            }
        });
        getContentPane().add(dlt_butn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 150, 50));

        jButton2.setIcon(new javax.swing.ImageIcon("E:\\Projects\\FMS\\src\\dbms fms\\Monitor-icon.png")); // NOI18N
        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 150, 50));

        strutbl.setAutoCreateRowSorter(true);
        strutbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Structure ID", "Category"
            }
        ));
        strutbl.setEditingColumn(0);
        strutbl.setEditingRow(0);
        strutbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strutblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(strutbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 377, 280));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setText("Fee Structure");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 30, 369, 51));

        acdlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        acdlabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(acdlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 207, 300, 29));

        catlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        catlabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(catlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 276, 300, 29));

        feelabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        feelabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(feelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 345, 300, 29));

        datelabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        datelabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(datelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 402, 300, 29));

        stridlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        stridlabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(stridlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 138, 300, 29));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms fms/Go-back-icon.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, 140, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\Projects\\FMS\\src\\dbms fms\\fee (2).jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void str_id_frmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_str_id_frmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_str_id_frmActionPerformed

    private void str_id_frmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_str_id_frmKeyReleased
        // TODO add your handling code here:
        String pat="^[0-9]{0,30}$";
        Pattern patt = Pattern.compile(pat);
        Matcher match=patt.matcher(str_id_frm.getText());
        if(!match.matches())
        {
            stridlabel.setText("Please Enter Number");
        }
        else
        {
            stridlabel.setText(null);
        }
    }//GEN-LAST:event_str_id_frmKeyReleased

    private void str_acd_yr_frmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_str_acd_yr_frmKeyReleased
        // TODO add your handling code here:
        /* String pat="^[0-9]{0,5}[-]{0,5}[0,9]{0,10}$";
        Pattern patt = Pattern.compile(pat);
        Matcher match=patt.matcher(str_acd_yr_frm.getText());
        if(!match.matches())
        {
            acdlabel.setText("Please Enter Number");
        }
        else
        {
            acdlabel.setText(null);
        }*/
    }//GEN-LAST:event_str_acd_yr_frmKeyReleased

    private void str_category_frmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_str_category_frmKeyReleased
        // TODO add your handling code here:
        String pat="^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(pat);
        Matcher match=patt.matcher(str_category_frm.getText());
        if(!match.matches())
        {
            catlabel.setText("Please Enter Charachter");
        }
        else
        {
            catlabel.setText(null);
        }
    }//GEN-LAST:event_str_category_frmKeyReleased

    private void str_fee_amt_frmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_str_fee_amt_frmKeyReleased
        // TODO add your handling code here:
        String pat="^[0-9]{0,30}$";
        Pattern patt = Pattern.compile(pat);
        Matcher match=patt.matcher(str_fee_amt_frm.getText());
        if(!match.matches())
        {
            feelabel.setText("Please Enter Number");
        }
        else
        {
            feelabel.setText(null);
        }
    }//GEN-LAST:event_str_fee_amt_frmKeyReleased

    private void add_butnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_butnActionPerformed
        // TODO add your handling code here:

        c = new conn();

        if (!str_id_frm.getText().equals("") & !str_acd_yr_frm.getText().equals("") & !str_category_frm.getText().equals("") & !str_fee_amt_frm.getText().equals("")) // if the JTextField is not empty then enable the button
        {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fees", "root", "root123");
                String Query = "insert into fee_structure values(?,?,?,?)";
                ps = con.prepareStatement(Query);
                ps.setString(1, str_id_frm.getText());
                ps.setString(2, str_acd_yr_frm.getText());
                ps.setString(3, str_category_frm.getText());
                ps.setString(4, str_fee_amt_frm.getText());

                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "New Record is Added", "Message", JOptionPane.INFORMATION_MESSAGE);
                //disable();
                str_id_frm.setText("");

                str_category_frm.setText("");
                str_acd_yr_frm.setText("");
                str_fee_amt_frm.setText("");
                searchtable();
            } catch (Exception e) {
              //  JOptionPane.showMessageDialog(this, e.toString());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Pealse Fillup All Fields", "Error", JOptionPane.ERROR_MESSAGE);
            enable();
        }
    }//GEN-LAST:event_add_butnActionPerformed

    private void mod_butnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_butnActionPerformed
        // TODO add your handling code here:
        if (!str_id_frm.getText().equals("")) {
            enable();
            String stru_id= str_id_frm.getText();
            try {

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fees", "root", "root123");
                Statement stat = con.createStatement();
                String strid = str_id_frm.getText();
                String acdyr = str_acd_yr_frm.getText();
                String cat = str_category_frm.getText();
                String strfee = str_fee_amt_frm.getText();
                String sql = "update fee_structure set Str_id='" + strid + "',Acd_year='" + acdyr + "',Category='" + cat + "',Fee_amnt='" + strfee + "' where Str_id='" + strid + "'";
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Updated");
                str_id_frm.setText("");
                str_acd_yr_frm.setText("");
                str_category_frm.setText("");
                str_fee_amt_frm.setText("");
                searchtable();

            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter Structure ID.", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mod_butnActionPerformed

    private void dlt_butnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlt_butnActionPerformed
        // TODO add your handling code here:
        if (!str_id_frm.getText().equals("")) {
            enable();
            String stru_id= str_id_frm.getText();
            try {
                conn c1 = new conn();
                ps = c1.con.prepareStatement("delete from fee_structure where Str_id=?");
                ps.setString(1, str_id_frm.getText());
                ps.executeUpdate();
                str_id_frm.setText("");
                str_acd_yr_frm.setText("");
                str_category_frm.setText("");
                str_fee_amt_frm.setText("");
                JOptionPane.showMessageDialog(this, "Record Deleted ", "Message", JOptionPane.INFORMATION_MESSAGE);
                searchtable();
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter Structure ID.", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dlt_butnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        feestru_display fee = new feestru_display();
        fee.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void strutblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strutblMouseClicked

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fees", "root", "root123");
            Statement stat = con.createStatement();

            int row = strutbl.getSelectedRow();
            String Table_click=(strutbl.getModel().getValueAt(row, 0).toString());
            String sql="select * from fee_structure where Str_id ='" + Table_click +"' ";
            //  ps = con.prepareStatement(sql);
            //   Resultset r=ps.executeQuery();
            Statement st = con.createStatement();

            ResultSet r = st.executeQuery(sql);

            if(r.next()){

                /*  String add1 = result.getString("Str_id");
                str_id_frm.setText(add1);
                String add2 = result.getString("Acd_year");
                str_acd_yr_frm.setText(add1);
                String add3 = result.getString("Category");
                str_category_frm.setText(add1);
                String add4 = result.getString("Fee_amnt");
                str_fee_amt_frm.setText(add1);
                String add5 = result.getString("Last_date");
                //    str_last_date_frm.setText(add1);
                */

                str_id_frm.setText(r.getString("Str_id"));
                str_acd_yr_frm.setText(r.getString("Acd_year"));


                str_category_frm.setText(r.getString("Category"));
                str_fee_amt_frm.setText(r.getString("Fee_amnt"));
            }

        }catch(Exception e){

        }

    }//GEN-LAST:event_strutblMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(fee_stru_v1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fee_stru_v1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fee_stru_v1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fee_stru_v1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fee_stru_v1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acdlabel;
    private javax.swing.JButton add_butn;
    private javax.swing.JLabel catlabel;
    private javax.swing.JLabel datelabel;
    private javax.swing.JButton dlt_butn;
    private javax.swing.JLabel feelabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mod_butn;
    private javax.swing.JTextField str_acd_yr_frm;
    private javax.swing.JTextField str_category_frm;
    private javax.swing.JTextField str_fee_amt_frm;
    private javax.swing.JTextField str_id_frm;
    private javax.swing.JLabel stridlabel;
    private javax.swing.JTable strutbl;
    // End of variables declaration//GEN-END:variables
}
