
package finalproj_oop;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;




/**
 *
 * @ERIKA
 */
public class QuestionPage extends javax.swing.JFrame {
   
    private int score = 0;
    private boolean isHardMode = false;
    private String[] riddles;
    private String[][] choices;
    private String[] answers;
    
   private DungeonLVL dungeonPage;
   private int levelNumber;
   private int currentQuestion;
   
   private boolean isFinalQuestion = false;


public QuestionPage(DungeonLVL dungeonPage, int levelNumber) {
    
    // changeIcon
    ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));this.setIconImage(icon.getImage());
    this.setResizable(false);
    this.setSize(1032,678);
    this.setLocationRelativeTo(null); // center window
     
    
    this.dungeonPage = dungeonPage;
    this.levelNumber = levelNumber;

    initComponents();
    setupQuestions();

    if (isHardMode) {
        this.currentQuestion = levelNumber - 7;
    } else {
        this.currentQuestion = levelNumber - 1;
    }

    showQuestion();
    
    AudioManager.playBackground("src/AUDIO/WHILEPLAYING.wav");
 } 
    
    // Special constructor for real final question
    public QuestionPage(DungeonLVL dungeonPage, int finalQuestionIndex, boolean isFinalQuestion) {
        this.dungeonPage = dungeonPage;
        this.levelNumber = 10; // placeholder
        this.isFinalQuestion = true;

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/GameIcon.png"));
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setSize(1032, 678);
        this.setLocationRelativeTo(null);

        initComponents();
        setupQuestions();

        this.currentQuestion = finalQuestionIndex; // final question index
        showQuestion();
    }

    // 🔹 Para piliin kung normal o hard mode at i-setup ang data
    private void setupQuestions() {
    // Decide hard mode: shortcut used AND level is 7..10
    if (DungeonLVL.isShortcutUsed && levelNumber >= 7 && levelNumber <= 10) {
        isHardMode = true;
    } else {
        isHardMode = false;
    }

    if (isHardMode) {
        riddles = RiddleData.hardRiddles;
        choices = RiddleData.hardChoices;
        answers = RiddleData.hardAnswers;
    } else {
        riddles = RiddleData.normalRiddles;
        choices = RiddleData.normalChoices;
        answers = RiddleData.normalAnswers;
    }
}
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionBORDER = new javax.swing.JLabel();
        questTITLE = new javax.swing.JLabel();
        choiceA = new javax.swing.JButton();
        choiceB = new javax.swing.JButton();
        choiceC = new javax.swing.JButton();
        choiceD = new javax.swing.JButton();
        Qbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questionBORDER.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        questionBORDER.setForeground(new java.awt.Color(255, 255, 255));
        questionBORDER.setText("   ");
        questionBORDER.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(158, 101, 21)));
        getContentPane().add(questionBORDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 900, 150));

        questTITLE.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        questTITLE.setForeground(new java.awt.Color(255, 192, 0));
        questTITLE.setText("          QUESTION");
        getContentPane().add(questTITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 390, 80));

        choiceA.setBackground(new java.awt.Color(93, 58, 33));
        choiceA.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choiceA.setForeground(new java.awt.Color(255, 192, 0));
        choiceA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        choiceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAActionPerformed(evt);
            }
        });
        getContentPane().add(choiceA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 280, 60));

        choiceB.setBackground(new java.awt.Color(93, 58, 33));
        choiceB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choiceB.setForeground(new java.awt.Color(255, 192, 0));
        choiceB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        choiceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceBActionPerformed(evt);
            }
        });
        getContentPane().add(choiceB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 280, 60));

        choiceC.setBackground(new java.awt.Color(93, 58, 33));
        choiceC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choiceC.setForeground(new java.awt.Color(255, 192, 0));
        choiceC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        choiceC.setBorderPainted(false);
        choiceC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceCActionPerformed(evt);
            }
        });
        getContentPane().add(choiceC, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 280, 60));

        choiceD.setBackground(new java.awt.Color(93, 58, 33));
        choiceD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choiceD.setForeground(new java.awt.Color(255, 192, 0));
        choiceD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        choiceD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceDActionPerformed(evt);
            }
        });
        getContentPane().add(choiceD, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 280, 60));

        Qbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/questBG.png"))); // NOI18N
        getContentPane().add(Qbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

          private void showQuestion() {
        if (currentQuestion < riddles.length) {
            questionBORDER.setText(riddles[currentQuestion]);
            choiceA.setText(choices[currentQuestion][0]);
            choiceB.setText(choices[currentQuestion][1]);
            choiceC.setText(choices[currentQuestion][2]);
            choiceD.setText(choices[currentQuestion][3]);
        } else {
        // Only show the “finished” message if this is NOT level 10 (the final round trigger)
        if (levelNumber != 10) {
            JOptionPane.showMessageDialog(this,
                "🎉 You finished all the riddles!\nScore: " + score + "/" + riddles.length +
                "\nPrepare to face the dragon!");
        }
        // Don’t dispose here — checkAnswer() will handle the next step
    }
}

  private void checkAnswer(String letter) {
    if (answers[currentQuestion].equalsIgnoreCase(letter)) {
        score++;

        if (isFinalQuestion) {
            AudioManager.playEffect("src/AUDIO/win.wav"); // <-- put your final/win sound here

            // Correct final question show End page
                //JOptionPane.showMessageDialog(this, "🎉 You defeated the dragon! Fiona is saved!");
                this.dispose();
                new End().setVisible(true);
                return;
        } else {
            AudioManager.playEffect("src/AUDIO/CORRECT.wav");
        }

        if (levelNumber == 10 && !isFinalQuestion) {
            // Reached level 10 correct (before final round)
            this.dispose();
            new FinalRound(dungeonPage).setVisible(true);
            return;
        }

        // Normal unlock and return to dungeon
        dungeonPage.unlockNextLevel(levelNumber + 1);
        this.dispose();
        dungeonPage.setVisible(true);

    } else {
        // Wrong answer
        AudioManager.playEffect("src/AUDIO/OPSS.wav");

        if (isFinalQuestion) {
            // ❌ Mali sa final/dragon — ipakita ang ULose (dragon scene)
            this.dispose();
            new ULose().setVisible(true);
            return;
        }

        // Non-final wrong answer: keep old behaviour (message + back to dungeon)
        JLabel message = new JLabel("Nope! Try again, champ!");
        message.setFont(new Font("Courier New", Font.BOLD, 18));
        message.setForeground(Color.BLACK);
        JOptionPane.showMessageDialog(this, message, "Wrong!", JOptionPane.INFORMATION_MESSAGE);

        // Hindi mag-uunlock, balik lang sa dungeon
        this.dispose();
        dungeonPage.setVisible(true);
    }
}

   
    private void choiceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceAActionPerformed
            checkAnswer("A");

    }//GEN-LAST:event_choiceAActionPerformed

    private void choiceCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceCActionPerformed
        checkAnswer("C");

    }//GEN-LAST:event_choiceCActionPerformed

    private void choiceDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceDActionPerformed
        checkAnswer("D");

    }//GEN-LAST:event_choiceDActionPerformed

    private void choiceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceBActionPerformed
        checkAnswer("B");

        
    }//GEN-LAST:event_choiceBActionPerformed

    
    public static void main(String args[]) {
       try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception ex) {
        java.util.logging.Logger.getLogger(QuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new DungeonLVL().setVisible(true);   }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Qbg;
    private javax.swing.JButton choiceA;
    private javax.swing.JButton choiceB;
    private javax.swing.JButton choiceC;
    private javax.swing.JButton choiceD;
    private javax.swing.JLabel questTITLE;
    private javax.swing.JLabel questionBORDER;
    // End of variables declaration//GEN-END:variables
}
