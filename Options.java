
package finalproj_oop;

import javax.swing.ImageIcon;
import finalproj_oop.AudioManager;
import java.awt.Color;



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
    
        AudioManager.addSelectSound(ON);
        AudioManager.addSelectSound(OFFBU);
        AudioManager.addSelectSound(HOME);
        AudioManager.addSelectSound(EXITG);
        AudioManager.addSelectSound(souON);
        AudioManager.addSelectSound(souOFF);
    
        setupMuteButtons();
        setupMuteButton();
    }
  private void setupMuteButtons() {
        // I-patong ang OFF button sa ON button
        OFFBU.setBounds(ON.getBounds());
        
        // Remove button styling
        ON.setBorderPainted(false);
        ON.setContentAreaFilled(false);
        ON.setFocusPainted(false);
        ON.setOpaque(false);
        
        OFFBU.setBorderPainted(false);
        OFFBU.setContentAreaFilled(false);
        OFFBU.setFocusPainted(false);
        OFFBU.setOpaque(false);
        
      updateSoundStatus();
    }
       
 private void updateSoundStatus() {
    if (AudioManager.isMuted()) {
        // Sound OFF - show OFF button and text
        ON.setVisible(false);
        OFFBU.setVisible(true);
        ontext.setVisible(false);    // Hide ON text
        offText.setVisible(true);    // Show OFF text
        offText.setText("OFF");
        offText.setForeground(Color.RED);
    } else {
        // Sound ON - show ON button and text
        ON.setVisible(true);
        OFFBU.setVisible(false);
        ontext.setVisible(true);     // Show ON text
        offText.setVisible(false);   // Hide OFF text
        ontext.setText("ON");
        ontext.setForeground(Color.GREEN);
    }
 } 
   private void setupMuteButton(){
    // I-patong ang souOFF sa souON
    souOFF.setBounds(souON.getBounds());
    
    // Remove button styling
    souON.setBorderPainted(false);
    souON.setContentAreaFilled(false);
    souON.setFocusPainted(false);
    souON.setOpaque(false);
    
    souOFF.setBorderPainted(false);
    souOFF.setContentAreaFilled(false);
    souOFF.setFocusPainted(false);
    souOFF.setOpaque(false);
    
    // Set initial state
    soundStat();
}

private void soundStat(){
    // Debug: Check kung narereach ang method na ito
    System.out.println("soundStat called - isMuted: " + AudioManager.isMuted());
    
    if (AudioManager.isEffectsMuted()) {
        // Sound OFF
        souON.setVisible(false);
        souOFF.setVisible(true);
        onSou.setVisible(false);
        offSou.setVisible(true);
        offSou.setText("OFF");
        offSou.setForeground(Color.RED);
    } else {
        // Sound ON
        souON.setVisible(true);
        souOFF.setVisible(false);
        onSou.setVisible(true);
        offSou.setVisible(false);
        onSou.setText("ON");
        onSou.setForeground(Color.GREEN);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.JLabel();
        EXITG = new javax.swing.JButton();
        HOME = new javax.swing.JButton();
        onSou = new javax.swing.JLabel();
        offSou = new javax.swing.JLabel();
        ontext = new javax.swing.JLabel();
        offText = new javax.swing.JLabel();
        souON = new javax.swing.JButton();
        souOFF = new javax.swing.JButton();
        ON = new javax.swing.JButton();
        OFFBU = new javax.swing.JButton();
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
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 140, 120));

        onSou.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        onSou.setForeground(new java.awt.Color(255, 255, 255));
        onSou.setText("ON");
        onSou.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(onSou, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 40, 30));

        offSou.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        offSou.setForeground(new java.awt.Color(255, 255, 255));
        offSou.setText("  OFF");
        getContentPane().add(offSou, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 60, 30));

        ontext.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        ontext.setForeground(new java.awt.Color(255, 255, 255));
        ontext.setText("ON");
        ontext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ontext, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 40, 30));

        offText.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        offText.setForeground(new java.awt.Color(255, 255, 255));
        offText.setText("  OFF");
        getContentPane().add(offText, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 60, 30));

        souON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/audio.png"))); // NOI18N
        souON.setContentAreaFilled(false);
        souON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                souONActionPerformed(evt);
            }
        });
        getContentPane().add(souON, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 110, 110));

        souOFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/audiomuted.png"))); // NOI18N
        souOFF.setContentAreaFilled(false);
        souOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                souOFFActionPerformed(evt);
            }
        });
        getContentPane().add(souOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 300, 130, 110));

        ON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ONBUTTON.png"))); // NOI18N
        ON.setContentAreaFilled(false);
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });
        getContentPane().add(ON, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 120));

        OFFBU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OFFBUTTON.png"))); // NOI18N
        OFFBU.setContentAreaFilled(false);
        OFFBU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFBUActionPerformed(evt);
            }
        });
        getContentPane().add(OFFBU, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 120));

        HomeTxt.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        HomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        HomeTxt.setText("HOME");
        getContentPane().add(HomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, 50));

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
        AudioManager.playEffect("src/AUDIO/select.wav");
        AudioManager.setMuted(true);
        ON.setVisible(false);
        OFFBU.setVisible(true);
         updateSoundStatus();
    }//GEN-LAST:event_ONActionPerformed

    private void OFFBUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFBUActionPerformed
        AudioManager.playEffect("src/AUDIO/correct.wav");
        AudioManager.setMuted(false);
        OFFBU.setVisible(false);
        ON.setVisible(true); 
        updateSoundStatus();
        
    }//GEN-LAST:event_OFFBUActionPerformed

    private void souONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_souONActionPerformed
        // TODO add your handling code here:
       AudioManager.playEffect("src/AUDIO/select.wav"); // or use click.wav if you have it
    
    // Mute only sound effects after delay
    new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                AudioManager.setEffectsMuted(true); // Mute effects only
                soundStat(); // Update UI
            }
        }, 
        300 // Wait for sound to play
    );
    
    }//GEN-LAST:event_souONActionPerformed

    private void souOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_souOFFActionPerformed
        // TODO add your handling code here:
        AudioManager.setEffectsMuted(false); // Use setEffectsMuted, not setMuted
        AudioManager.playEffect("src/AUDIO/correct.wav");
        soundStat();
    }//GEN-LAST:event_souOFFActionPerformed

    
   

    
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
    private javax.swing.JLabel bghow2play;
    private javax.swing.JLabel offSou;
    private javax.swing.JLabel offText;
    private javax.swing.JLabel onSou;
    private javax.swing.JLabel ontext;
    private javax.swing.JLabel options;
    private javax.swing.JButton souOFF;
    private javax.swing.JButton souON;
    // End of variables declaration//GEN-END:variables
}
