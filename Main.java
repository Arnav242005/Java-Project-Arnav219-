/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jadha
 */
import javax.swing.JOptionPane;
public class Main extends javax.swing.JFrame {
static int amount;
static int pinnumber;
static long cardnumber;
    /**
     * Creates new form Main
     */
    public Main(int pinnumber,long cardnumber) {
        this.pinnumber = pinnumber;
        this.cardnumber = cardnumber;
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

        lblmain = new javax.swing.JLabel();
        lblcardno = new javax.swing.JLabel();
        lblpin = new javax.swing.JLabel();
        txtcardno = new javax.swing.JTextField();
        txtpinno = new javax.swing.JTextField();
        btnsignin = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblmain.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblmain.setText("WELCOME TO ATM");

        lblcardno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcardno.setText("Card No: ");

        lblpin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpin.setText("PIN: ");

        txtcardno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcardnoActionPerformed(evt);
            }
        });

        txtpinno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpinnoActionPerformed(evt);
            }
        });

        btnsignin.setBackground(new java.awt.Color(0, 0, 0));
        btnsignin.setForeground(new java.awt.Color(255, 255, 255));
        btnsignin.setText("SIGN IN");
        btnsignin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnsigninMouseMoved(evt);
            }
        });
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(0, 0, 0));
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnsignup.setBackground(new java.awt.Color(0, 0, 0));
        btnsignup.setForeground(new java.awt.Color(255, 255, 255));
        btnsignup.setText("SIGN UP");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblmain)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblcardno, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(lblpin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsignup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnsignin, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcardno)
                            .addComponent(txtpinno))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblmain, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcardno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcardno)
                        .addGap(3, 3, 3)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpinno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsignin)
                    .addComponent(btnclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsignup)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcardnoActionPerformed

    private void txtpinnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpinnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpinnoActionPerformed

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
    long cardno =Long.parseLong(txtcardno.getText());
    int pin =Integer.parseInt(txtpinno.getText());
    
    if(cardno == cardnumber && pin == pinnumber){
        setVisible(false);
        new Transaction(amount,pinnumber).setVisible(true);
    }
    else {
        JOptionPane.showMessageDialog(this, "Please Enter Valid Credentials");
    }
    }//GEN-LAST:event_btnsigninActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtcardno.setText("");
        txtpinno.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        setVisible(false);
        new SignupPage().setVisible(true);
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnsigninMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsigninMouseMoved
    String cardno =txtcardno.getText();
    String pin =txtpinno.getText();
   
    if(cardno.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please Enter Card Number");
    }
    if(pin.isEmpty()){
        JOptionPane.showMessageDialog(this,"Please Enter Pin Number");
    }
    }//GEN-LAST:event_btnsigninMouseMoved

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(pinnumber,cardnumber).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsignin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel lblcardno;
    private javax.swing.JLabel lblmain;
    private javax.swing.JLabel lblpin;
    private javax.swing.JTextField txtcardno;
    private javax.swing.JTextField txtpinno;
    // End of variables declaration//GEN-END:variables
}
