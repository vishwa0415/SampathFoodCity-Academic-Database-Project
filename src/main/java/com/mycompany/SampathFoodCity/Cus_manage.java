/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.SampathFoodCity;



/**
 *
 * @author a
 */
public class Cus_manage extends javax.swing.JFrame {

    /**
     * Creates new form Cus_manage
     */
    public Cus_manage() {
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

        jPanel1 = new javax.swing.JPanel();
        backb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        createCus = new javax.swing.JButton();
        ViewCus = new javax.swing.JButton();
        DeleCus = new javax.swing.JButton();
        UpCus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backb.setBackground(new java.awt.Color(51, 255, 51));
        backb.setForeground(new java.awt.Color(255, 255, 255));
        backb.setText("Back");
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Customer Management");

        createCus.setBackground(new java.awt.Color(204, 204, 255));
        createCus.setText("Create New");
        createCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCusActionPerformed(evt);
            }
        });

        ViewCus.setBackground(new java.awt.Color(204, 204, 255));
        ViewCus.setText("View");
        ViewCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCusActionPerformed(evt);
            }
        });

        DeleCus.setBackground(new java.awt.Color(204, 204, 255));
        DeleCus.setText("Delete");
        DeleCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleCusActionPerformed(evt);
            }
        });

        UpCus.setBackground(new java.awt.Color(204, 204, 255));
        UpCus.setText("Update");
        UpCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpCusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createCus, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(DeleCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpCus, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(ViewCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(backb)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCus)
                    .addComponent(ViewCus))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleCus)
                    .addComponent(UpCus))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
        // TODO add your handling code here:
        Vishwa_1031130_SampathDDD Frame =  new Vishwa_1031130_SampathDDD();
Frame.setVisible(true);
dispose();
    }//GEN-LAST:event_backbActionPerformed

    private void createCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCusActionPerformed
        // TODO add your handling code here:
        Create_c Frame1 =  new Create_c();
Frame1.setVisible(true);
dispose();
    }//GEN-LAST:event_createCusActionPerformed

    private void ViewCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCusActionPerformed
        // TODO add your handling code here:
          View_c Frame1 =  new View_c();
Frame1.setVisible(true);
dispose();
    }//GEN-LAST:event_ViewCusActionPerformed

    private void DeleCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleCusActionPerformed
        // TODO add your handling code here:
          Delete_c Frame1 =  new Delete_c();
Frame1.setVisible(true);
dispose();
    }//GEN-LAST:event_DeleCusActionPerformed

    private void UpCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpCusActionPerformed
        // TODO add your handling code here:
          Update_c Frame1 =  new Update_c();
Frame1.setVisible(true);
dispose();
    }//GEN-LAST:event_UpCusActionPerformed
  
  
   /*private void backbActionPerformed(java.awt.event.ActionEvent evt) {
Vishwa_1031130_SampathDDD Frame =  new Vishwa_1031130_SampathDDD();
Frame.setVisible(true);
dispose();
     }
   private void backbActionPerformed(java.awt.event.ActionEvent evt) {
Vishwa_1031130_SampathDDD Frame =  new Vishwa_1031130_SampathDDD();
Frame.setVisible(true);
dispose();
     }
   private void backbActionPerformed(java.awt.event.ActionEvent evt) {
Vishwa_1031130_SampathDDD Frame =  new Vishwa_1031130_SampathDDD();
Frame.setVisible(true);
dispose();
     }*/
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
            java.util.logging.Logger.getLogger(Cus_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cus_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cus_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cus_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cus_manage().setVisible(true);
            }
        });
        
       
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleCus;
    private javax.swing.JButton UpCus;
    private javax.swing.JButton ViewCus;
    private javax.swing.JButton backb;
    private javax.swing.JButton createCus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
