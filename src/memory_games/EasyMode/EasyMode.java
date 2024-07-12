/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package memory_games.EasyMode;

import java.security.SecureRandom;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import memory_games.GameOver.GameOver;
import memory_games.GameWin.GameWin;
import memory_games.InterfaceMain;
import memory_games.cardsrandom;

/**
 *
 * @author Usuario
 */
public class EasyMode extends javax.swing.JFrame {

    ArrayList<JLabel> Labels = new ArrayList();
    SecureRandom cardsrandom = new cardsrandom();
    String[] piceasy = new String[6];
    String[][] easyroute = new String[4][3];
    int[] cards = new int[6];
    int Quantityclick = 0;
    String[] Compare = new String[2];
    int[] Quantitycard = new int[2];
    int Hits = 0;
    int failures = 0;
    int score = 0;
    int cardsFound = 0;
    Timer flipBackTimer;

    public EasyMode() {
        initComponents();
        setSize(700, 700);
        setLocationRelativeTo(this);
        loadingLabels();
        JLabel jlTimeBeforeFlip = new javax.swing.JLabel("");
        jPanel1.add(jlTimeBeforeFlip);
        addcard();
        jPanel1easy.setVisible(true);
        InterfaceMain playerName = new InterfaceMain();
        players.setText(playerName.text);
    }

    void loadingLabels() {
        Labels.add(card1);
        Labels.add(card2);
        Labels.add(card3);
        Labels.add(card4);
        Labels.add(card5);
        Labels.add(card6);
        Labels.add(card7);
        Labels.add(card8);
        Labels.add(card9);
        Labels.add(card10);
        Labels.add(card11);
        Labels.add(card12);
    }

    public int cardImagen() {
        int cardcreated = cardsrandom.nextInt(6);

        return cardcreated;
    }

    void addcard() {
        for (int pic = 0; pic < piceasy.length; pic++) {
            piceasy[pic] = "/imgEasy/" + (pic + 1) + ".jpg";
        }
    }

    void lifes() {
        ImageIcon liveIcon = new ImageIcon(getClass().getResource("/others/life.jpg"));
        if (failures == 0) {
            live1.setIcon(liveIcon);
            live2.setIcon(liveIcon);
            live3.setIcon(liveIcon);
        }
        if (failures == 1) {
            live1.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have 2 lives remaining.");
        }
        if (failures == 2) {
            live2.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have 1 lives remaining.");
        }
        if (failures == 3) {
            live3.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have one last try.");
        }
        if (failures == 4) {
            JOptionPane.showMessageDialog(null, "You lose.");
            GameOver Main = new GameOver();
            Main.setVisible(true);
            this.setVisible(false);
        }
    }

    public void loadimageslabels() {
        int counter = 0;
        for (int row = 0; row < easyroute.length; row++) {
            for (int column = 0; column < easyroute[0].length; column++) {
                int temp = cardImagen();
                if (cards[temp] == 2) {
                    column--;
                } else {
                    easyroute[row][column] = piceasy[temp];
                    cards[temp]++;
                }
            }
        }

        for (int row = 0; row < easyroute.length; row++) {
            for (int column = 0; column < easyroute[0].length; column++) {
                Labels.get(counter).setOpaque(true);
                Labels.get(counter).setIcon(new ImageIcon(getClass().getResource(easyroute[row][column])));
                Labels.get(counter).setText("" + (counter + 1));
                counter++;
            }

            Timer timer = new Timer(5000, e -> flipcards());
            timer.setRepeats(false);
            timer.start();
        }
    }

    void flipcards() {
        ImageIcon backIcon = new ImageIcon(getClass().getResource("/others/pokemon.jpeg"));
        for (int i = 0; i < Labels.size(); i++) {
            Labels.get(i).setIcon(backIcon);

        }
    }

    void ShowLabels(int numcards) {
        if (Quantityclick != 2) {
            if (numcards >= 0 && numcards <= 2) {
                Compare[Quantityclick] = easyroute[0][numcards];
                Labels.get(numcards).setIcon(new ImageIcon(getClass().getResource(easyroute[0][numcards])));
            } else if (numcards >= 3 && numcards <= 5) {
                Compare[Quantityclick] = easyroute[1][numcards - 3];
                Labels.get(numcards).setIcon(new ImageIcon(getClass().getResource(easyroute[1][numcards - 3])));
            } else if (numcards >= 6 && numcards <= 8) {
                Compare[Quantityclick] = easyroute[2][numcards - 6];
                Labels.get(numcards).setIcon(new ImageIcon(getClass().getResource(easyroute[2][numcards - 6])));
            } else if (numcards >= 9 && numcards <= 11) {
                Compare[Quantityclick] = easyroute[3][numcards - 9];
                Labels.get(numcards).setIcon(new ImageIcon(getClass().getResource(easyroute[3][numcards - 9])));
            }

            System.out.println("Click " + Quantityclick + ": " + Compare[Quantityclick]);

            Quantitycard[Quantityclick] = numcards;
            Quantityclick++;
        } else {
            comparationCards();
        }
    }

    void comparationCards() {
        System.out.println("Comparing: " + Compare[0] + " and " + Compare[1]); // Debug print
        if (Compare[1].equals(Compare[0])) {
            JOptionPane.showMessageDialog(null, "That´s right");
            Labels.get(Quantitycard[0]).setVisible(false);
            Labels.get(Quantitycard[1]).setVisible(false);
            Hits++;
            jlhits.setText("" + Hits);
            score = score + 100;
            Score.setText("" + score);
            cardsFound++;
            finalGame();
        } else {
            failures++;
            lifes();
            flipcards();

            if (score >= 50) {
                score = score - 50;
            }
            Score.setText("" + score);
        }
        Quantityclick = 0;
    }

    void finalGame() {
        if (cardsFound == 6) {
            JOptionPane.showMessageDialog(null, "You win.");
            GameWin Main = new GameWin();
            Main.setVisible(true);
            this.setVisible(false);
        }
    }

    boolean PlayingYesorNo() {
        return StartButton.getText().equals("Playing");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();
        jPanel1easy = new javax.swing.JPanel();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        card7 = new javax.swing.JLabel();
        card8 = new javax.swing.JLabel();
        card9 = new javax.swing.JLabel();
        card10 = new javax.swing.JLabel();
        card12 = new javax.swing.JLabel();
        card11 = new javax.swing.JLabel();
        jlhits = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        Score = new javax.swing.JLabel();
        players = new javax.swing.JLabel();
        jlTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        live1 = new javax.swing.JLabel();
        live2 = new javax.swing.JLabel();
        live3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartButton);
        StartButton.setBounds(30, 30, 80, 23);

        jPanel1easy.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1easy.setLayout(null);

        card1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card1MouseClicked(evt);
            }
        });
        jPanel1easy.add(card1);
        card1.setBounds(31, 18, 80, 80);

        card2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card2MouseClicked(evt);
            }
        });
        jPanel1easy.add(card2);
        card2.setBounds(129, 18, 80, 80);

        card3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }
        });
        jPanel1easy.add(card3);
        card3.setBounds(221, 18, 80, 80);

        card4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });
        jPanel1easy.add(card4);
        card4.setBounds(31, 116, 80, 80);

        card5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card5MouseClicked(evt);
            }
        });
        jPanel1easy.add(card5);
        card5.setBounds(129, 116, 80, 80);

        card6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card6MouseClicked(evt);
            }
        });
        jPanel1easy.add(card6);
        card6.setBounds(221, 116, 80, 80);

        card7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card7MouseClicked(evt);
            }
        });
        jPanel1easy.add(card7);
        card7.setBounds(31, 214, 80, 80);

        card8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card8MouseClicked(evt);
            }
        });
        jPanel1easy.add(card8);
        card8.setBounds(129, 214, 80, 80);

        card9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card9MouseClicked(evt);
            }
        });
        jPanel1easy.add(card9);
        card9.setBounds(221, 214, 80, 80);

        card10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card10MouseClicked(evt);
            }
        });
        jPanel1easy.add(card10);
        card10.setBounds(31, 310, 80, 80);

        card12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card12MouseClicked(evt);
            }
        });
        jPanel1easy.add(card12);
        card12.setBounds(221, 310, 80, 80);

        card11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card11MouseClicked(evt);
            }
        });
        jPanel1easy.add(card11);
        card11.setBounds(129, 310, 80, 80);

        jPanel1.add(jPanel1easy);
        jPanel1easy.setBounds(30, 120, 350, 430);

        jlhits.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlhits.setText("    ");
        jlhits.setBorder(javax.swing.BorderFactory.createTitledBorder("HITS"));
        jPanel1.add(jlhits);
        jlhits.setBounds(430, 110, 140, 90);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(500, 560, 72, 23);

        Score.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Score.setText("           ");
        Score.setBorder(javax.swing.BorderFactory.createTitledBorder("SCORE"));
        jPanel1.add(Score);
        Score.setBounds(430, 20, 140, 60);

        players.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        players.setBorder(javax.swing.BorderFactory.createTitledBorder("PLAYER´S NAME"));
        jPanel1.add(players);
        players.setBounds(210, 20, 170, 60);
        jPanel1.add(jlTime);
        jlTime.setBounds(150, 120, 80, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("LIVES"));
        jPanel2.setLayout(null);

        live1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        live1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                live1MouseClicked(evt);
            }
        });
        jPanel2.add(live1);
        live1.setBounds(10, 30, 35, 35);

        live2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        live2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                live2MouseClicked(evt);
            }
        });
        jPanel2.add(live2);
        live2.setBounds(50, 30, 35, 35);

        live3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        live3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                live3MouseClicked(evt);
            }
        });
        jPanel2.add(live3);
        live3.setBounds(90, 30, 35, 35);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(430, 260, 140, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 30, 620, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        InterfaceMain Main = new InterfaceMain();
        Main.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_backButtonActionPerformed

    private void card11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card11MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(10);
        }

    }//GEN-LAST:event_card11MouseClicked

    private void card12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card12MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(11);
        }
    }//GEN-LAST:event_card12MouseClicked

    private void card10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card10MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(9);
        }
    }//GEN-LAST:event_card10MouseClicked

    private void card9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card9MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(8);
        }
    }//GEN-LAST:event_card9MouseClicked

    private void card8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card8MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(7);
        }
    }//GEN-LAST:event_card8MouseClicked

    private void card7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card7MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(6);
        }
    }//GEN-LAST:event_card7MouseClicked

    private void card6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(5);
        }
    }//GEN-LAST:event_card6MouseClicked

    private void card5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(4);
        }
    }//GEN-LAST:event_card5MouseClicked

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(3);
        }
    }//GEN-LAST:event_card4MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(2);
        }
    }//GEN-LAST:event_card3MouseClicked

    private void card2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(1);
        }
    }//GEN-LAST:event_card2MouseClicked

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked
        if (PlayingYesorNo()) {

            ShowLabels(0);
        }
    }//GEN-LAST:event_card1MouseClicked

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:

        if (StartButton.getText().equals("Start")) {
            StartButton.setText("Playing");
            StartButton.setEnabled(false);
            backButton.setEnabled(false);
            loadimageslabels();
            lifes();
        }

    }//GEN-LAST:event_StartButtonActionPerformed

    private void live1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_live1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_live1MouseClicked

    private void live2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_live2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_live2MouseClicked

    private void live3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_live3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_live3MouseClicked

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
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasyMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasyMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Score;
    private javax.swing.JButton StartButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card10;
    private javax.swing.JLabel card11;
    private javax.swing.JLabel card12;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel card7;
    private javax.swing.JLabel card8;
    private javax.swing.JLabel card9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1easy;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlTime;
    private javax.swing.JLabel jlhits;
    private javax.swing.JLabel live1;
    private javax.swing.JLabel live2;
    private javax.swing.JLabel live3;
    private javax.swing.JLabel players;
    // End of variables declaration//GEN-END:variables

}
