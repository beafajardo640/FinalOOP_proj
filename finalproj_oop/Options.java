
package finalproj_oop;

import javax.swing.ImageIcon;
import finalproj_oop.AudioManager;


public class Options extends javax.swing.JFrame {

    
    public Options() {
        initComponents();
        
     // changeIcon
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));this.setIconImage(icon.getImage());
    this.setResizable(false);

    this.setSize(973,678);
    
    if (!AudioManager.isMuted()) {
        AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");
    }
    
        AudioManager.addSelectSound(OFFBU);
        AudioManager.addSelectSound(ON);
        AudioManager.addSelectSound(HOME);
        AudioManager.addSelectSound(EXITG);
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.JLabel();
        EXITG = new javax.swing.JButton();
        HOME = new javax.swing.JButton();
        offText = new javax.swing.JLabel();
        OFFBU = new javax.swing.JButton();
        ON = new javax.swing.JButton();
        ONtext = new javax.swing.JButton();
        HomeTxt = new javax.swing.JLabel();
        bghow2play = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        options.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        options.setForeground(new java.awt.Color(158, 101, 21));
        options.setText(" OPTIONS");
        getContentPane().add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 160, 60));

        EXITG.setBackground(new java.awt.Color(158, 101, 21));
        EXITG.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        EXITG.setForeground(new java.awt.Color(255, 192, 0));
        EXITG.setText("EXIT GAME");
        EXITG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EXITG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITGActionPerformed(evt);
            }
        });
        getContentPane().add(EXITG, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 160, 50));

        HOME.setBackground(new java.awt.Color(158, 101, 21));
        HOME.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 192, 0));
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HOMEBUTTON.png"))); // NOI18N
        HOME.setBorder(null);
        HOME.setContentAreaFilled(false);
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 140, 120));

        offText.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        offText.setForeground(new java.awt.Color(255, 255, 255));
        offText.setText("  OFF");
        getContentPane().add(offText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 80, 30));

        OFFBU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OFFBUTTON.png"))); // NOI18N
        OFFBU.setContentAreaFilled(false);
        OFFBU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFBUActionPerformed(evt);
            }
        });
        getContentPane().add(OFFBU, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, 120));

        ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ONBUTTON.png"))); // NOI18N
        ON.setContentAreaFilled(false);
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });
        getContentPane().add(ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 120));

        ONtext.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        ONtext.setForeground(new java.awt.Color(255, 255, 255));
        ONtext.setText("ON");
        ONtext.setContentAreaFilled(false);
        ONtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONtextActionPerformed(evt);
            }
        });
        getContentPane().add(ONtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, 30));

        HomeTxt.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        HomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        HomeTxt.setText("HOME");
        getContentPane().add(HomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, 50));

        bghow2play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/O,H,S BG.png"))); // NOI18N
        getContentPane().add(bghow2play, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITGActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EXITGActionPerformed

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
        open OpenPage = new open();
        OpenPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HOMEActionPerformed

    private void ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONActionPerformed
    AudioManager.setMuted(false);
    }//GEN-LAST:event_ONActionPerformed

    private void ONtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ONtextActionPerformed

    private void OFFBUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFBUActionPerformed
    AudioManager.setMuted(true);
    }//GEN-LAST:event_OFFBUActionPerformed

    
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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXITG;
    private javax.swing.JButton HOME;
    private javax.swing.JLabel HomeTxt;
    private javax.swing.JButton OFFBU;
    private javax.swing.JButton ON;
    private javax.swing.JButton ONtext;
    private javax.swing.JLabel bghow2play;
    private javax.swing.JLabel offText;
    private javax.swing.JLabel options;
    // End of variables declaration//GEN-END:variables
}
