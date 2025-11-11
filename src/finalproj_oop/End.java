
package finalproj_oop;

import javax.swing.ImageIcon;


public class End extends javax.swing.JFrame {

   
    public End() {
    initComponents();
    
     if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) {
        AudioManager.playBackground("src/AUDIO/WIN.wav");
    }

    AudioManager.addSelectSound(BACKTOMENU);
    AudioManager.addSelectSound(playAgain);
    
        
    // changeIcon
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));this.setIconImage(icon.getImage());
    this.setResizable(false);
    this.setSize(1034,678);
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        TITLE2 = new javax.swing.JLabel();
        playAgain = new javax.swing.JButton();
        BACKTOMENU = new javax.swing.JButton();
        endBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Snap ITC", 1, 28)); // NOI18N
        title.setForeground(new java.awt.Color(255, 192, 0));
        title.setText("   CONGRATULATIONS!");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 490, 140));

        TITLE2.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        TITLE2.setForeground(new java.awt.Color(255, 192, 0));
        TITLE2.setText("   FIONA IS FREE!");
        getContentPane().add(TITLE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 280, 60));

        playAgain.setBackground(new java.awt.Color(158, 101, 21));
        playAgain.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        playAgain.setForeground(new java.awt.Color(255, 192, 0));
        playAgain.setText("PLAY AGAIN");
        playAgain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });
        getContentPane().add(playAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 240, 70));

        BACKTOMENU.setBackground(new java.awt.Color(158, 101, 21));
        BACKTOMENU.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        BACKTOMENU.setForeground(new java.awt.Color(255, 192, 0));
        BACKTOMENU.setText("MAIN MENU ");
        BACKTOMENU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BACKTOMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKTOMENUActionPerformed(evt);
            }
        });
        getContentPane().add(BACKTOMENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 240, 70));

        endBG.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        endBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BGend.png"))); // NOI18N
        getContentPane().add(endBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKTOMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKTOMENUActionPerformed
     AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");
 
     open BackMenu = new open();
     BackMenu.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_BACKTOMENUActionPerformed

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
    AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");

    story storyPage = new story();
    storyPage.setVisible(true);
    this.dispose(); 
    }//GEN-LAST:event_playAgainActionPerformed

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
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new End().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKTOMENU;
    private javax.swing.JLabel TITLE2;
    private javax.swing.JLabel endBG;
    private javax.swing.JButton playAgain;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
