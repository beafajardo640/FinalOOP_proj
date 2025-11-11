
package finalproj_oop;
import java.awt.Color; // kulay
import java.awt.Font; // font
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
/*/
 *
 * @author admin
 */
public class story extends javax.swing.JFrame {
  /**
     * Creates new form story
     */
    public story() {
        initComponents();
        
      if (AudioManager.isBackgroundStopped() && !AudioManager.isMuted()) {
        AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");
    }
     // sound ng button
    AudioManager.addSelectSound(NEXT);
    AudioManager.addSelectSound(back);

        
    // changeIcon
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));this.setIconImage(icon.getImage());
    this.setResizable(false);
    this.setSize(973,678);
     
        
         // TEXT tranparent
        gameStory.setOpaque(false);
        gameStory.setBackground(new Color(0,0,0,0)); // transparent
        gameStory.setBorder(null);

         // SCROLL tranparent
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        scroll.setBorder(null);

       
        this.getContentPane().setBackground(new Color(0,0,0,0));

      // story
     String storyContent = 
      "                                                  Once upon a time \n\n"
    + "     In the land of Far Far Away, Princess Fiona has been captured by a fearsome "
    + "  dragon and locked inside a dark and dangerous dungeon. The brave but grumpy ogre Shrek,"
    + "    together with his loyal and very talkative friend Donkey, sets out on a daring rescue mission."
    + " To reach Fiona, they must pass through ten magical doors, each one sealed with a mysterious "
    + "    riddle. Only those who answer correctly can open the next door and move deeper into the dungeon."
    + " Along their journey, Donkey notices a strange shortcut path. It looks dangerous,"
    + " but it might lead them to Fiona faster.\n\n"
    + "   Now, it’s up to you to help Shrek and Donkey solve every riddle, choose               the right path,"
    + " and rescue Princess Fiona before it’s too late!"
    + "                                                Press Start Game to begin your adventure!";
      
       gameStory.setText(storyContent);
        gameStory.setLineWrap(true);
        gameStory.setWrapStyleWord(true);
        gameStory.setEditable(false);
        gameStory.setFont(new Font("Arial", Font.PLAIN, 18));
        gameStory.setForeground(Color.decode("#FFFFFF")); // white
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        storytitle = new javax.swing.JLabel();
        NEXT = new javax.swing.JButton();
        back = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        gameStory = new javax.swing.JTextArea();
        storyBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storytitle.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        storytitle.setForeground(new java.awt.Color(158, 101, 21));
        storytitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storytitle.setText(" STORY");
        getContentPane().add(storytitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 210, 70));

        NEXT.setBackground(new java.awt.Color(158, 101, 21));
        NEXT.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        NEXT.setForeground(new java.awt.Color(255, 192, 0));
        NEXT.setText("START GAME");
        NEXT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTActionPerformed(evt);
            }
        });
        getContentPane().add(NEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 170, 50));

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
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        scroll.setBorder(null);
        scroll.setOpaque(false);

        gameStory.setBackground(new java.awt.Color(158, 101, 21));
        gameStory.setColumns(20);
        gameStory.setRows(5);
        gameStory.setBorder(null);
        gameStory.setOpaque(false);
        scroll.setViewportView(gameStory);

        getContentPane().add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 630, 220));

        storyBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/O,H,S BG.png"))); // NOI18N
        getContentPane().add(storyBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTActionPerformed
        DungeonLVL dunLVL = new DungeonLVL();
        dunLVL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NEXTActionPerformed

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
            java.util.logging.Logger.getLogger(story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(story.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new story().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NEXT;
    private javax.swing.JButton back;
    private javax.swing.JTextArea gameStory;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel storyBG;
    private javax.swing.JLabel storytitle;
    // End of variables declaration//GEN-END:variables
}
