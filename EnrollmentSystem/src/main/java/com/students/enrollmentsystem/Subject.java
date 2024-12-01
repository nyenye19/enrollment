/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.students.enrollmentsystem;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Updates;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Lenovo
 */
public class Subject extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    //Creating a MongoDB client
    MongoClient mongo;
    //Connecting to the database
    MongoDatabase database;

    public Subject() {
        initComponents();

        //Creating a MongoDB client
        mongo = new MongoClient("localhost", 27017);
        //Connecting to the database
        database = mongo.getDatabase("db1");

        //Creating a collection
        database.createCollection("subjects");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSubjCode = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtUnits = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SubjectCode:");

        jLabel2.setText("Description:");

        jLabel3.setText("Units:");

        txtSubjCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjCodeActionPerformed(evt);
            }
        });
        txtSubjCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSubjCodeKeyPressed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDesc)
                            .addComponent(txtUnits)
                            .addComponent(txtSubjCode, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSubjCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSubjCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjCodeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSubjCodeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Document document = new Document();
        String SubjectCode = txtSubjCode.getText();

        String Description = txtDesc.getText();
        String Units = txtUnits.getText();

        if (this.getTitle().compareTo("Add Subject") == 0) {
            document.append("SubjectCode", SubjectCode);

            document.append("SubjectCode", SubjectCode);
            document.append("Description", Description);
            document.append("Units", Units);

            database.getCollection("subjects").insertOne(document);
        } else if (this.getTitle().compareTo("Edit Subject") == 0) {
            Bson updates = Updates.combine(
                    Updates.set("SubjectCode", SubjectCode),
                    Updates.set("Description", Description),
                    Updates.set("Units", Units)
            );
            database.getCollection("subjects").updateOne(Filters.eq("SubjectCode", SubjectCode), updates);
        } else if (this.getTitle().compareTo("Remove Student") == 0) {
            database.getCollection("subjects").deleteOne(Filters.eq("SubjectCode", SubjectCode));
        }

        JOptionPane.showMessageDialog(null, "Student record saved");

        this.dispose();

    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSubjCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubjCodeKeyPressed
        // TODO add your handling code here:
       // if (evt.getKeyCode() == 10) {  //ENTER
           // if (this.getTitle().compareTo("Edit Subject") == 0 || 
             //    this.getTitle().compareTo("Remove Subject") == 0 ) {
             //   txtDesc.setText(doc.get("Description").toString());
               // txtUnits.setText(doc.get("Units").toString());
                
                
                //if(doc.get("gender").toString().equals("M")){
                  //  rbnMale.setSelected(true);
                //}
               // else {
                 //   rbnFemale.setSelected(true);
             //   }
           // }
       // }
    }//GEN-LAST:event_txtSubjCodeKeyPressed

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
            java.util.logging.Logger.getLogger(Student.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Subject().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtSubjCode;
    private javax.swing.JTextField txtUnits;
    // End of variables declaration//GEN-END:variables
}
