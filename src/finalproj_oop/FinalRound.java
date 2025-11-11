
package finalproj_oop;

import javax.swing.ImageIcon;


public class FinalRound extends javax.swing.JFrame {
    
    private DungeonLVL dungeonPage;

    public FinalRound() {
        initComponents();
        setupWindow();
    }

    public FinalRound(DungeonLVL dungeonPage) {
        initComponents();
        this.dungeonPage = dungeonPage;
        setupWindow();
    }

    private void setupWindow() {
        // Change Icon
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setSize(1034, 678);
        this.setLocationRelativeTo(null); // center window

        if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) {

        }
        AudioManager.playEffect("src/AUDIO/dragon.wav");
        
        AudioManager.addSelectSound(SAVEF);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SAVEF = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SAVEF.setBackground(new java.awt.Color(158, 101, 21));
        SAVEF.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        SAVEF.setForeground(new java.awt.Color(255, 192, 0));
        SAVEF.setText("SAVE FIONA");
        SAVEF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SAVEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEFActionPerformed(evt);
            }
        });
        getContentPane().add(SAVEF, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, 180, 70));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fionacage.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SAVEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEFActionPerformed
      this.dispose();

      int finalQuestionIndex = RiddleData.normalRiddles.length - 1; // last index
      QuestionPage finalQuestion = new QuestionPage(dungeonPage, finalQuestionIndex, true);
      finalQuestion.setVisible(true);

    }//GEN-LAST:event_SAVEFActionPerformed

    
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
            java.util.logging.Logger.getLogger(FinalRound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalRound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalRound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalRound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalRound().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton SAVEF;
    // End of variables declaration//GEN-END:variables
}
