/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swingrailwaylastest.MenuOperations;
import javax.swing.JOptionPane;
import swingrailwaylastest.*;
import swingrailwaylastest.MenuOperations.Payment;

/**
 *
 * @author hashi
 */
public class BuyTicket extends javax.swing.JFrame {
    
    public double ammount;

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
    
public double operationAmmount(double ammount){
     int count = (int) jCount.getValue();
             ammount = count*1.0;
             
             System.out.println("ammount :"+ ammount + Database.getBalance());
             dispose();
             checkBalance(ammount);
             return ammount;
}
    
    public static void checkBalance(double ammount){
       
                
         if (ammount>Database.getBalance()){
                 JOptionPane.showMessageDialog(null, "Your balance is not enought! " +Database.getBalance());
             }
             else{
             
                 Payment payment = new Payment ();
                 payment.setVisible(true);
             }
             }
    /**
     * Creates new form BuyTicket
     */
    public BuyTicket() {
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

        jBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFrom = new javax.swing.JComboBox<>();
        jWhere = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCount = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        jLabel2.setText("balance");
        jLabel2.setText("Balance : " +Database.getBalance());

        jFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baku", "Khirdalan", "Sumgayit"}));
        jFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFromActionPerformed(evt);
            }
        });

        jWhere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baku", "Khirdalan", "Sumgayit"}));

        jLabel3.setText("from");

        jLabel4.setText("where");

        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("count");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jWhere, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jCount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jWhere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addComponent(jBack)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        dispose();
        Menu menu = new Menu ();
        menu.setVisible(true);
    }//GEN-LAST:event_jBackActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        
       
         if (jFrom.getSelectedItem().equals("Baku")||jWhere.getSelectedItem().equals("Sumgayit")) {
           int count = (int) jCount.getValue();
             double ammount = count*1.0;
             System.out.println("ammount :"+ ammount + Database.getBalance());
             dispose();
             checkBalance(ammount);
         
         //its editing..(get by method)
         }
        
         
         else if(jFrom.getSelectedItem().equals("Sumgayit")|| jWhere.getSelectedItem().equals("Baku")){
          int count = (int) jCount.getValue();
             double ammount = count*1.0;
             System.out.println("ammount :"+ ammount + Database.getBalance());
             dispose();
             checkBalance(ammount);
         
         //its editing..(get by method)
         }
         
         
         else if(jFrom.getSelectedItem().equals("Sumgayit")|| jWhere.getSelectedItem().equals("Khirdalan")){
             int count = (int) jCount.getValue();
             double ammount = count*0.6;
             System.out.println("ammount :"+ ammount + Database.getBalance());
             dispose();
             checkBalance(ammount);
         //its editing..(get by method)
         }
         
         else if (jFrom.getSelectedItem().equals("Khirdalan")||jWhere.getSelectedItem().equals("Sumgayit")) {
           int count = (int) jCount.getValue();
             double ammount = count*0.6;
             
             System.out.println("ammount :"+ ammount + Database.getBalance());
             dispose();
             checkBalance(ammount);
               //its editing..(get by method) 
         }
        
        else if (jFrom.getSelectedItem().equals("Khirdalan")||jWhere.getSelectedItem().equals("Baku")) {
           int count = (int) jCount.getValue();
             double ammount = count*0.6;
             
             System.out.println("ammount :"+ ammount + Database.getBalance());
             dispose();
             checkBalance(ammount);
         //its editing..(get by method)
         
         }
        
        else if (jFrom.getSelectedItem().equals("Baku")|| jWhere.getSelectedItem().equals("Khirdalan")){
          int count = (int) jCount.getValue();
             double ammount = count*0.6;
             
             System.out.println("ammount :"+ ammount + Database.getBalance());
             dispose();
             checkBalance(ammount);
             //its editing..(get by method)
        }
        
             
else {
                  JOptionPane.showMessageDialog(rootPane, "You cannot do this operation!");
              }
        
         
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFromActionPerformed
        
    }//GEN-LAST:event_jFromActionPerformed

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
            java.util.logging.Logger.getLogger(BuyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JSpinner jCount;
    private javax.swing.JComboBox<String> jFrom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jWhere;
    // End of variables declaration//GEN-END:variables
}
