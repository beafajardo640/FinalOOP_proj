
package finalproj_oop;

import javax.swing.ImageIcon;


public class DonkeyPOP extends javax.swing.JFrame {
    
    private DungeonLVL mainWindow;

        public DonkeyPOP(DungeonLVL mainWindow) {
        initComponents();
        this.mainWindow = mainWindow;
        
    // changeIcon
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));this.setIconImage(icon.getImage());
    this.setResizable(false);
    this.setSize(1024,634);
    this.setLocationRelativeTo(null);
    
    if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) 
      { AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav"); 
      } AudioManager.addSelectSound(ACCEPT); 
      AudioManager.addSelectSound(NO); 

    }

    private DonkeyPOP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ACCEPT = new javax.swing.JButton();
        NO = new javax.swing.JButton();
        DorBBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ACCEPT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        ACCEPT.setForeground(new java.awt.Color(255, 192, 0));
        ACCEPT.setText("Yes! Let's do it!");
        ACCEPT.setContentAreaFilled(false);
        ACCEPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCEPTActionPerformed(evt);
            }
        });
        getContentPane().add(ACCEPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 240, 90));

        NO.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        NO.setForeground(new java.awt.Color(255, 192, 0));
        NO.setText("No. Too Spooky.");
        NO.setContentAreaFilled(false);
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });
        getContentPane().add(NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 260, 90));

        DorBBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/questDON.jpg"))); // NOI18N
        getContentPane().add(DorBBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
      this.setVisible(false);
      new QuestionPage(mainWindow, 5).setVisible(true);
    }//GEN-LAST:event_NOActionPerformed

    private void ACCEPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCEPTActionPerformed
      this.setVisible(false);
      new QuestionPage(mainWindow, 7).setVisible(true);
    }//GEN-LAST:event_ACCEPTActionPerformed

   
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DonkeyPOP().setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACCEPT;
    private javax.swing.JLabel DorBBG;
    private javax.swing.JButton NO;
    // End of variables declaration//GEN-END:variables
}
