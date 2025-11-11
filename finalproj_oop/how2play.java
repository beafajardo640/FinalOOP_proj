
package finalproj_oop;

import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import java.awt.Color; // kulay
import java.awt.Font; // font


public class how2play extends javax.swing.JFrame {

    
    public how2play() {
    initComponents();
    
     if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) {
        AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");
    }

    AudioManager.addSelectSound(BACK);
   
        
    // changeIcon
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));this.setIconImage(icon.getImage());
    this.setResizable(false);
    this.setSize(973,678);
    this.setLocationRelativeTo(null); // center window
    
    // TEXT tranparent
        WriteSTory.setOpaque(false);
        WriteSTory.setBackground(new Color(0, 0, 0, 0)); // transparent
        WriteSTory.setBorder(null);
        WriteSTory.setEditable(false);
        WriteSTory.setLineWrap(true);
        WriteSTory.setWrapStyleWord(true);
        WriteSTory.setFont(new Font("Arial", Font.PLAIN, 20));
        WriteSTory.setForeground(Color.decode("#FFFFFF")); // white


         // SCROLL tranparent
        HOW2PLAY.setOpaque(false);
        HOW2PLAY.getViewport().setOpaque(false);
        HOW2PLAY.setBorder(null);

       
        this.getContentPane().setBackground(new Color(0,0,0,0));
        
        
          String instructions =
        "1.) From the Main Menu, click \"PLAY\" to start your adventure.\n\n" +
        "2.) A short story will appear. Read how Shrek and Donkey begin their quest to rescue Princess Fiona.\n\n" +
        "3.) Click \"START GAME\" to begin your journey through the dungeon.\n\n" +
        "4.) You must pass through 10 magical doors, each guarded by a tricky riddle.\n\n" +
        "5.) Read each riddle carefully. Four choices (A–D) will be shown on the screen.\n\n" +
        "6.) Click the button with the letter of your chosen answer.\n\n" +
        "7.) If your answer is correct, the next level will unlock and you’ll move forward in your quest.\n\n" +
        "8.) If your answer is wrong, you will return to the dungeon.\n\n" +
        "9.) At Door 5, Donkey discovers a shortcut!\n" +
        "• If you Agree – you’ll skip ahead to harder riddles starting at Door7.\n" +
        "• If you Disagree – you’ll continue normally from Door 5.\n\n" +
        "10.) After completing Door 10, a fierce DRAGON will appear — this is the final boss!\n\n" +
        "11.) Answer the dragon’s riddle correctly to defeat it and rescue Princess Fiona.\n\n" +
         "\t\t\t\t\t\t\t TIPS: \n" +
        "• Think carefully before answering, some riddles are tricky!\n" +
        "• The shortcut is faster but riskier.\n" +
        "• Donkey might joke around, but focus on saving Fiona!\n" +
        "• Most importantly, have fun and enjoy the quest!";

        WriteSTory.setText(instructions);
        WriteSTory.setCaretPosition(0);
   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        how2playtitle = new javax.swing.JLabel();
        BACK = new javax.swing.JButton();
        HOW2PLAY = new javax.swing.JScrollPane();
        WriteSTory = new javax.swing.JTextArea();
        h2playBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        how2playtitle.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        how2playtitle.setForeground(new java.awt.Color(158, 101, 21));
        how2playtitle.setText("HOW TO PLAY");
        getContentPane().add(how2playtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

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
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        WriteSTory.setColumns(20);
        WriteSTory.setRows(5);
        HOW2PLAY.setViewportView(WriteSTory);

        getContentPane().add(HOW2PLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 620, 210));

        h2playBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/O,H,S BG.png"))); // NOI18N
        getContentPane().add(h2playBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        
        open OpenPage = new open();
        OpenPage.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BACKActionPerformed

      
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
            java.util.logging.Logger.getLogger(how2play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(how2play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(how2play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(how2play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new how2play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JScrollPane HOW2PLAY;
    private javax.swing.JTextArea WriteSTory;
    private javax.swing.JLabel h2playBG;
    private javax.swing.JLabel how2playtitle;
    // End of variables declaration//GEN-END:variables
}
