/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arun
 */
public class AddNewPatient extends javax.swing.JFrame {

    /**
     * Creates new form Add_patient
     */
    public AddNewPatient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Pid = new javax.swing.JTextField();
        tfname = new javax.swing.JTextField();
        tfphoneno = new javax.swing.JTextField();
        tfage = new javax.swing.JTextField();
        tfbd = new javax.swing.JTextField();
        tfaddress = new javax.swing.JTextField();
        tfmajordisease = new javax.swing.JTextField();
        tfgender = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        tfPid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("patientID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 43, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 81, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Phone no");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 121, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 163, 53, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 201, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("BloodGroup");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 236, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 273, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Any major disease Suffered Earlier");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 306, -1, -1));
        getContentPane().add(Pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 41, 237, -1));
        getContentPane().add(tfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 81, 237, -1));
        getContentPane().add(tfphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 121, 237, -1));
        getContentPane().add(tfage, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 161, 237, -1));
        getContentPane().add(tfbd, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 231, 232, -1));
        getContentPane().add(tfaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 271, 232, -1));
        getContentPane().add(tfmajordisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 341, 355, -1));

        tfgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(tfgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 202, 232, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/save-icon--1.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 100, 30));

        tfPid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/add new patient background.jpg"))); // NOI18N
        tfPid.setText("jLabel9");
        getContentPane().add(tfPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Homepage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       String pid = Pid.getText();
        String name = tfname.getText();
        String phoneNumberText = tfphoneno.getText(); 
        
        String age = tfage.getText();
        String gender =(String) tfgender.getSelectedItem();
        String bg = tfbd.getText();
        String address= tfaddress.getText();
        String md = tfmajordisease.getText();
       
       if( address.isEmpty()||md.isEmpty()||pid.isEmpty()|| name.isEmpty()|| phoneNumberText.isEmpty()||age.isEmpty()|| gender.isEmpty()||bg.isEmpty()||md.isEmpty()){
           JOptionPane.showMessageDialog(this,"Fill-Up the form Properly","ERROR",JOptionPane.ERROR_MESSAGE);
       }else{
            AddPatient(pid,name,phoneNumberText,age,gender,bg,address,md);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddNewPatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel tfPid;
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfage;
    private javax.swing.JTextField tfbd;
    private javax.swing.JComboBox<String> tfgender;
    private javax.swing.JTextField tfmajordisease;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfphoneno;
    // End of variables declaration//GEN-END:variables

    private void AddPatient(String pid, String name, String phoneNumberText, String age, String gender, String bg, String address, String md) {
      Connection dbconn = DBconnection.connectDB();
        if (dbconn!=null){
        try {
        PreparedStatement st;
            st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO patientdetails (patientid,name,phoneno,age,gender,bloodgroup,address,majordisease) VALUES(?,?,?,?,?,?,?,?)");
        st.setString(1, pid);
        st.setString(2, name);
        st.setString(3, phoneNumberText);
        st.setString(4, age);
        st.setString(5, gender);
        st.setString(6, bg);
        st.setString(7, address);
        st.setString(8, md);
        int res = st.executeUpdate();
        JOptionPane.showMessageDialog(this,"Registered Successfully ","Success",JOptionPane.INFORMATION_MESSAGE);
        Pid.setText("");
        tfname.setText("");
        tfphoneno.setText("");
        tfage.setText("");
        tfbd.setText("");
        tfaddress.setText("");
        tfmajordisease.setText("");
    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }else{
            System.out.println("The connection not available");
        }
    }
    
}
