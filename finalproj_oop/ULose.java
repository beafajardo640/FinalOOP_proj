
package finalproj_oop;

import javax.swing.ImageIcon;


public class ULose extends javax.swing.JFrame {

    public ULose() {
        initComponents();
        
            
    if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) {
        AudioManager.playBackground("src/AUDIO/Ulose.wav");
        }
         AudioManager.addSelectSound(menu);
         AudioManager.addSelectSound(again);


        
        // Set window icon
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setSize(1034, 678);
        this.setLocationRelativeTo(null); // center window
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        again = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        loseBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITlabel.setFont(new java.awt.Font("Snap ITC", 1, 26)); // NOI18N
        TITlabel.setForeground(new java.awt.Color(204, 153, 0));
        TITlabel.setText("   RESCUE PATH FAILED");
        getContentPane().add(TITlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 440, 120));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("   GAME OVER!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 260, 50));

        again.setBackground(new java.awt.Color(158, 101, 21));
        again.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        again.setForeground(new java.awt.Color(255, 192, 0));
        again.setText("TRY AGAIN");
        again.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againActionPerformed(evt);
            }
        });
        getContentPane().add(again, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 200, 60));

        menu.setBackground(new java.awt.Color(158, 101, 21));
        menu.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 192, 0));
        menu.setText("MAIN MENU");
        menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 200, 60));

        loseBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uLOSE.png"))); // NOI18N
        getContentPane().add(loseBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againActionPerformed
       AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");

    story storyPage = new story();
    storyPage.setVisible(true);
    this.dispose(); 
    }//GEN-LAST:event_againActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
       AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");
 
     open BackMenu = new open();
     BackMenu.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(ULose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ULose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ULose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ULose.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ULose().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITlabel;
    private javax.swing.JButton again;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loseBG;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
