
package finalproj_oop;

import javax.swing.ImageIcon;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class open extends javax.swing.JFrame {
   
    public open() {
        initComponents();
    
        if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) {
            AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");
        }
         AudioManager.addSelectSound(PLAY);
         AudioManager.addSelectSound(options);
         AudioManager.addSelectSound(HOW2PLAY);
         AudioManager.addSelectSound(ABOUT);
    
    // changeIcon
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));this.setIconImage(icon.getImage());
    this.setResizable(false);
    this.setSize(972,678);
    this.setLocationRelativeTo(null); // center window
    
    
    // para pag nagBack no sounds
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                AudioManager.stopBackground();
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        THEADVEN = new javax.swing.JLabel();
        SandD = new javax.swing.JLabel();
        PLAY = new javax.swing.JButton();
        options = new javax.swing.JButton();
        HOW2PLAY = new javax.swing.JButton();
        openBG = new javax.swing.JLabel();
        ABOUT = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        THEADVEN.setFont(new java.awt.Font("Snap ITC", 1, 28)); // NOI18N
        THEADVEN.setForeground(new java.awt.Color(255, 192, 0));
        THEADVEN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        THEADVEN.setText("The ADVENTURE of");
        getContentPane().add(THEADVEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 490, 80));

        SandD.setFont(new java.awt.Font("Snap ITC", 1, 32)); // NOI18N
        SandD.setForeground(new java.awt.Color(255, 192, 0));
        SandD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SandD.setText("SHREK & DONKEY");
        getContentPane().add(SandD, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 150, 450, 70));

        PLAY.setBackground(new java.awt.Color(158, 101, 21));
        PLAY.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        PLAY.setForeground(new java.awt.Color(255, 192, 0));
        PLAY.setText("PLAY");
        PLAY.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });
        getContentPane().add(PLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 220, 50));

        options.setBackground(new java.awt.Color(158, 101, 21));
        options.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        options.setForeground(new java.awt.Color(255, 192, 0));
        options.setText("OPTIONS");
        options.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });
        getContentPane().add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 220, 50));

        HOW2PLAY.setBackground(new java.awt.Color(158, 101, 21));
        HOW2PLAY.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        HOW2PLAY.setForeground(new java.awt.Color(255, 192, 0));
        HOW2PLAY.setText("HOW TO PLAY");
        HOW2PLAY.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        HOW2PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOW2PLAYActionPerformed(evt);
            }
        });
        getContentPane().add(HOW2PLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 220, 50));
        getContentPane().add(openBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        ABOUT.setBackground(new java.awt.Color(158, 101, 21));
        ABOUT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        ABOUT.setForeground(new java.awt.Color(255, 192, 0));
        ABOUT.setText("ABOUT");
        ABOUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ABOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABOUTActionPerformed(evt);
            }
        });
        getContentPane().add(ABOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 220, 50));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opnBG.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed
        story storyPage = new story();
        storyPage.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_PLAYActionPerformed

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
       Options optionPage = new Options();
        optionPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_optionsActionPerformed

    private void HOW2PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOW2PLAYActionPerformed
     how2play howToPlayPage = new how2play();
        howToPlayPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HOW2PLAYActionPerformed

    private void ABOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABOUTActionPerformed
      about ABT = new about();
        ABT.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ABOUTActionPerformed

    
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
            java.util.logging.Logger.getLogger(open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(open.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new open().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABOUT;
    private javax.swing.JLabel BG;
    private javax.swing.JButton HOW2PLAY;
    private javax.swing.JButton PLAY;
    private javax.swing.JLabel SandD;
    private javax.swing.JLabel THEADVEN;
    private javax.swing.JLabel openBG;
    private javax.swing.JButton options;
    // End of variables declaration//GEN-END:variables
}
