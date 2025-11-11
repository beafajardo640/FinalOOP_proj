
package finalproj_oop;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;



public class DungeonLVL extends javax.swing.JFrame {

    private static int unlockedLevel = 1; 
    private JButton[] levelButtons; // store all buttons para madaling i-update
     public static boolean isShortcutUsed = false;
    
    public DungeonLVL() { 
        initComponents();
        
        // Change Icon
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png")); 
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setSize(1033,678);
        this.setLocationRelativeTo(null); // center window
        
        
        // Store buttons para madaling i-update
        levelButtons = new JButton[]{ 
            lvlONE, lvlTWO, lvlThree, 
            lvlFOUR, LVLFIVE, lvlSix, 
            lvlSeven, lvlEighth, lvlNine, lvlTEN };
        
        updateLevelButtons(); // apply initial colors

        
        if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) 
        { AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav"); }
        for (JButton btn : levelButtons) 
        { AudioManager.addSelectSound(btn); }
        AudioManager.addSelectSound(BACK);
    }
    
    // Access checker
    private boolean AccessLevel(int levelNumber) { 
    if (levelNumber <= unlockedLevel) {
        return true;
    } else { 
      JLabel message = new JLabel("Nice try! But you haven’t unlocked this level yet.");
         message.setFont(new Font("Courier New", Font.BOLD, 18)); 
         message.setForeground(Color.BLACK); 
    JOptionPane.showMessageDialog(this, message, "Woopiess!", JOptionPane.WARNING_MESSAGE); 
    return false;
    }
    }
    
    
    // Unlock next level method
    public void unlockNextLevel(int nextLevel) {
        if (nextLevel > unlockedLevel) {
           unlockedLevel = nextLevel;
           
           JLabel message = new JLabel("You got it! Keep going!"); 
           message.setFont(new Font("Courier New", Font.BOLD, 18)); 
           message.setForeground(Color.BLACK); 
           JOptionPane.showMessageDialog(this, message, "Correct!", JOptionPane.INFORMATION_MESSAGE); 
           updateLevelButtons(); // refresh button colors 
        } 
    }
    
    public void resetToLevelOne() {
    unlockedLevel = 1;
    updateLevelButtons();
    
    }
    
    private void updateLevelButtons() {
        
    for (int i = 0; i < levelButtons.length; i++) {
        JButton btn = levelButtons[i];
        if (i + 1 <= unlockedLevel) {
        btn.setForeground(new Color(255, 215, 0)); // gold unlocked
        btn.setFont(new Font("Snap ITC", Font.BOLD, 18));
        } else {
        btn.setForeground(Color.GRAY); // gray pag locked 
        btn.setFont(new Font("Snap ITC", Font.PLAIN, 18));
    }
    
  } 
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dunTITLE = new javax.swing.JLabel();
        LVLtitle = new javax.swing.JLabel();
        LVLFIVE = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        lvlONE = new javax.swing.JButton();
        lvlThree = new javax.swing.JButton();
        lvlFOUR = new javax.swing.JButton();
        lvlSix = new javax.swing.JButton();
        lvlSeven = new javax.swing.JButton();
        lvlEighth = new javax.swing.JButton();
        lvlNine = new javax.swing.JButton();
        lvlTEN = new javax.swing.JButton();
        lvlTWO = new javax.swing.JButton();
        dungeonBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dunTITLE.setFont(new java.awt.Font("Snap ITC", 1, 26)); // NOI18N
        dunTITLE.setForeground(new java.awt.Color(255, 192, 0));
        dunTITLE.setText("          DUNGEON");
        getContentPane().add(dunTITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 420, 70));

        LVLtitle.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        LVLtitle.setForeground(new java.awt.Color(255, 192, 0));
        LVLtitle.setText("LEVELS");
        getContentPane().add(LVLtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, 30));

        LVLFIVE.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        LVLFIVE.setForeground(new java.awt.Color(255, 192, 0));
        LVLFIVE.setText("Level 5");
        LVLFIVE.setContentAreaFilled(false);
        LVLFIVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LVLFIVEActionPerformed(evt);
            }
        });
        getContentPane().add(LVLFIVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 130, 30));

        BACK.setBackground(new java.awt.Color(158, 101, 21));
        BACK.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 192, 0));
        BACK.setText("<");
        BACK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        lvlONE.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlONE.setForeground(new java.awt.Color(255, 192, 0));
        lvlONE.setText("Level 1");
        lvlONE.setContentAreaFilled(false);
        lvlONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlONEActionPerformed(evt);
            }
        });
        getContentPane().add(lvlONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 30));

        lvlThree.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlThree.setForeground(new java.awt.Color(255, 192, 0));
        lvlThree.setText("Level 3");
        lvlThree.setContentAreaFilled(false);
        lvlThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlThreeActionPerformed(evt);
            }
        });
        getContentPane().add(lvlThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, 30));

        lvlFOUR.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlFOUR.setForeground(new java.awt.Color(255, 192, 0));
        lvlFOUR.setText("Level 4");
        lvlFOUR.setContentAreaFilled(false);
        lvlFOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlFOURActionPerformed(evt);
            }
        });
        getContentPane().add(lvlFOUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, 30));

        lvlSix.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlSix.setForeground(new java.awt.Color(255, 192, 0));
        lvlSix.setText("Level 6");
        lvlSix.setContentAreaFilled(false);
        lvlSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlSixActionPerformed(evt);
            }
        });
        getContentPane().add(lvlSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        lvlSeven.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlSeven.setForeground(new java.awt.Color(255, 192, 0));
        lvlSeven.setText("Level 7");
        lvlSeven.setContentAreaFilled(false);
        lvlSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlSevenActionPerformed(evt);
            }
        });
        getContentPane().add(lvlSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, 30));

        lvlEighth.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlEighth.setForeground(new java.awt.Color(255, 192, 0));
        lvlEighth.setText("Level 8");
        lvlEighth.setContentAreaFilled(false);
        lvlEighth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlEighthActionPerformed(evt);
            }
        });
        getContentPane().add(lvlEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        lvlNine.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlNine.setForeground(new java.awt.Color(255, 192, 0));
        lvlNine.setText("Level 9");
        lvlNine.setContentAreaFilled(false);
        lvlNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlNineActionPerformed(evt);
            }
        });
        getContentPane().add(lvlNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, 30));

        lvlTEN.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlTEN.setForeground(new java.awt.Color(255, 192, 0));
        lvlTEN.setText("Level 10");
        lvlTEN.setContentAreaFilled(false);
        lvlTEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlTENActionPerformed(evt);
            }
        });
        getContentPane().add(lvlTEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, 30));

        lvlTWO.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        lvlTWO.setForeground(new java.awt.Color(255, 192, 0));
        lvlTWO.setText("Level 2");
        lvlTWO.setContentAreaFilled(false);
        lvlTWO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvlTWOActionPerformed(evt);
            }
        });
        getContentPane().add(lvlTWO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 30));

        dungeonBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DungeonLVL.png"))); // NOI18N
        getContentPane().add(dungeonBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LVLFIVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LVLFIVEActionPerformed
     if (AccessLevel(5)) {
     DonkeyPOP popup = new DonkeyPOP(this);
     popup.setVisible(true);
     this.setVisible(false);
     }
    }//GEN-LAST:event_LVLFIVEActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
       story SPage = new story();
       SPage.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void lvlTENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlTENActionPerformed
    if (AccessLevel(10)) {
    this.setVisible(false);
    new QuestionPage(this, 10).setVisible(true);
    }


    }//GEN-LAST:event_lvlTENActionPerformed

    private void lvlONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlONEActionPerformed
     if (AccessLevel(1)) {
    this.setVisible(false);
    new QuestionPage(this, 1).setVisible(true);
    }

    }//GEN-LAST:event_lvlONEActionPerformed

    private void lvlSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlSixActionPerformed
    if (AccessLevel(6)) {
    this.setVisible(false);
    new QuestionPage(this, 6).setVisible(true);
   }

    }//GEN-LAST:event_lvlSixActionPerformed

    private void lvlTWOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlTWOActionPerformed
    if (AccessLevel(2)) {
    this.setVisible(false);
    new QuestionPage(this, 2).setVisible(true);
}


    }//GEN-LAST:event_lvlTWOActionPerformed

    private void lvlThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlThreeActionPerformed
    if (AccessLevel(3)) {
    this.setVisible(false);
    new QuestionPage(this, 3).setVisible(true);
}

    }//GEN-LAST:event_lvlThreeActionPerformed

    private void lvlFOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlFOURActionPerformed
    if (AccessLevel(4)) {
    this.setVisible(false);
    new QuestionPage(this, 4).setVisible(true);
}

    }//GEN-LAST:event_lvlFOURActionPerformed

    private void lvlEighthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlEighthActionPerformed
    if (AccessLevel(8)) {
    this.setVisible(false);
    new QuestionPage(this, 8).setVisible(true);
}
    }//GEN-LAST:event_lvlEighthActionPerformed

    private void lvlSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlSevenActionPerformed
   if (AccessLevel(7)) {
    this.setVisible(false);
    new QuestionPage(this, 7).setVisible(true);
   }

    }//GEN-LAST:event_lvlSevenActionPerformed

    private void lvlNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvlNineActionPerformed
      if (AccessLevel(9)) {
    this.setVisible(false);
    new QuestionPage(this, 9).setVisible(true);
     }
    }//GEN-LAST:event_lvlNineActionPerformed

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new DungeonLVL().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton LVLFIVE;
    private javax.swing.JLabel LVLtitle;
    private javax.swing.JLabel dunTITLE;
    private javax.swing.JLabel dungeonBG;
    private javax.swing.JButton lvlEighth;
    private javax.swing.JButton lvlFOUR;
    private javax.swing.JButton lvlNine;
    private javax.swing.JButton lvlONE;
    private javax.swing.JButton lvlSeven;
    private javax.swing.JButton lvlSix;
    private javax.swing.JButton lvlTEN;
    private javax.swing.JButton lvlTWO;
    private javax.swing.JButton lvlThree;
    // End of variables declaration//GEN-END:variables
}
