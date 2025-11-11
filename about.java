
package finalproj_oop;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;


public class about extends javax.swing.JFrame {

   
    public about() {
    initComponents();
     
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));this.setIconImage(icon.getImage());
    this.setResizable(false);
    this.setSize(983,678);
        
    if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) {
        AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");
    }

    AudioManager.addSelectSound(back);
    
        abtBdy.setOpaque(false);
        abtBdy.setBackground(new Color(0, 0, 0, 0)); // transparent
        abtBdy.setBorder(null);
        abtBdy.setEditable(false);
        abtBdy.setLineWrap(true);
        abtBdy.setWrapStyleWord(true);
        abtBdy.setFont(new Font("Arial", Font.PLAIN, 20));
        abtBdy.setForeground(Color.decode("#FFFFFF")); // white

        
        abtScroll.setOpaque(false);
        abtScroll.getViewport().setOpaque(false);
        abtScroll.setBorder(null);

        
         this.getContentPane().setBackground(new Color(0,0,0,0));
        
        String instructions =
                
        "          The Adventure of Shrek and Donkey is an interactive quiz game\n" +
        "  that combines general knowledge and riddle-based questions with a\n" +
        "  fun and engaging storyline. Designed for players of all ages, the game\n" +
        "  aims to both entertain and educate by challenging the player’s\n" + 
        "  memory, logic, and critical thinking skills.\n\n\n" + 
        "                                                 Authors:\n\n" + 
        "                                            Bea G. Fajardo\n " + 
        "                                   Hanilhet R. Pagdanganan\n" + 
        "                                     Martin Jeco B. Regalado\n" +
        "                                        Erika Nicole L. Siron";
          
        
        abtBdy.setText(instructions);
        abtBdy.setCaretPosition(0);
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        abtTIT = new javax.swing.JLabel();
        abtScroll = new javax.swing.JScrollPane();
        abtBdy = new javax.swing.JTextArea();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(158, 101, 21));
        back.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 192, 0));
        back.setText("<");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 40));

        abtTIT.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        abtTIT.setForeground(new java.awt.Color(158, 101, 21));
        abtTIT.setText("ABOUT");
        getContentPane().add(abtTIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 110, 50));

        abtBdy.setColumns(20);
        abtBdy.setRows(5);
        abtScroll.setViewportView(abtBdy);

        getContentPane().add(abtScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 630, 210));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/O,H,S BG.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       open OpenPage = new open();
       OpenPage.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backActionPerformed

    
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
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JTextArea abtBdy;
    private javax.swing.JScrollPane abtScroll;
    private javax.swing.JLabel abtTIT;
    private javax.swing.JButton back;
    // End of variables declaration//GEN-END:variables
}
