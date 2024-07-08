/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package memory_games;

import java.security.SecureRandom;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HardMode extends javax.swing.JFrame {

    ArrayList<JLabel> Labels = new ArrayList();
    SecureRandom cardsrandom = new cardsrandom();
    String[] picHard = new String[8];
    String[][] hardRoute = new String[4][4];
    int[] cards = new int[8];
    int clickCounter = 0;
    int score = 0;
    int hits = 0;
    int fail = 0;
    String[] comparation = new String[2];
    int[] numCards = new int[2];

    public HardMode() {
        initComponents();
        setSize(700, 800);
        setLocationRelativeTo(this);
        loadingLabels();
        addcard();
        jPanelHard.setVisible(true);

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
        Labels.add(card13);
        Labels.add(card14);
        Labels.add(card15);
        Labels.add(card16);
    }

    public int cardImage() {
        int cardNumber = cardsrandom.nextInt(8);
        return cardNumber;
    }

    void addcard() {
        for (int pic = 0; pic < picHard.length; pic++) {
            picHard[pic] = "/imgHard/" + (pic + 1) + ".jpg";
        }
    }

    public void loadimageslabels() {
        int counter = 0;
        for (int row = 0; row < hardRoute.length; row++) {
            for (int column = 0; column < hardRoute[0].length; column++) {
                int temp = cardImage();
                if (cards[temp] == 2) {
                    column--;
                } else {
                    hardRoute[row][column] = picHard[temp];
                    cards[temp]++;
                }
            }
        }

        for (int row = 0; row < hardRoute.length; row++) {
            for (int column = 0; column < hardRoute[0].length; column++) {
                Labels.get(counter).setOpaque(true);
                Labels.get(counter).setIcon(new ImageIcon(getClass().getResource(hardRoute[row][column])));
                Labels.get(counter).setText("" + (counter + 1));
                counter++;
            }
        }
    }

    void flipCards() {
        ImageIcon backIcon = new ImageIcon(getClass().getResource("/others/1.jpg"));
        for (int i = 0; i < Labels.size(); i++) {
            Labels.get(i).setIcon(backIcon);
        }
    }

    void showImages(int numLabel) {
        if (clickCounter != 2) {
            if (numLabel >= 0 && numLabel <= 3) {
                comparation[clickCounter] = hardRoute[0][numLabel];
                Labels.get(numLabel).setIcon(new ImageIcon(getClass().getResource(hardRoute[0][numLabel])));
            } else if (numLabel >= 4 && numLabel <= 7) {
                comparation[clickCounter] = hardRoute[1][numLabel - 4];
                Labels.get(numLabel).setIcon(new ImageIcon(getClass().getResource(hardRoute[1][numLabel - 4])));
            } else if (numLabel >= 8 && numLabel <= 11) {
                comparation[clickCounter] = hardRoute[2][numLabel - 8];
                Labels.get(numLabel).setIcon(new ImageIcon(getClass().getResource(hardRoute[2][numLabel - 8])));
            } else if (numLabel >= 12 && numLabel <= 15) {
                comparation[clickCounter] = hardRoute[3][numLabel - 12];
                Labels.get(numLabel).setIcon(new ImageIcon(getClass().getResource(hardRoute[3][numLabel - 12])));
            }
            System.out.println("Click " + clickCounter + ": " + comparation[clickCounter]); // Debug print
            numCards[clickCounter] = numLabel;
            clickCounter++;
        } else {
            comparationCards();
        }
    }

    void comparationCards() {
        System.out.println("Comparing: " + comparation[0] + " and " + comparation[1]); // Debug print
        if (comparation[1].equals(comparation[0])) {
            JOptionPane.showMessageDialog(null, "Es correcto");
            Labels.get(numCards[0]).setVisible(false);
            Labels.get(numCards[1]).setVisible(false);
            hits++;
            numHits.setText("" + hits);
            score = score + 100;
            gameScore.setText("" + score);
        } else {
            flipCards();
            fail++;
            numFails.setText("" + fail);
            if (score >= 50) {
                score = score - 50;
            }
            gameScore.setText("" + score);
        }
        clickCounter = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHard = new javax.swing.JPanel();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        card9 = new javax.swing.JLabel();
        card10 = new javax.swing.JLabel();
        card11 = new javax.swing.JLabel();
        card12 = new javax.swing.JLabel();
        card13 = new javax.swing.JLabel();
        card14 = new javax.swing.JLabel();
        card16 = new javax.swing.JLabel();
        card15 = new javax.swing.JLabel();
        card8 = new javax.swing.JLabel();
        card7 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        gameScore = new javax.swing.JLabel();
        numHits = new javax.swing.JLabel();
        numFails = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelHard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        card1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card1MouseClicked(evt);
            }
        });

        card2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card2MouseClicked(evt);
            }
        });

        card4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });

        card5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card5MouseClicked(evt);
            }
        });

        card6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card6MouseClicked(evt);
            }
        });

        card9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card9MouseClicked(evt);
            }
        });

        card10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card10MouseClicked(evt);
            }
        });

        card11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card11MouseClicked(evt);
            }
        });

        card12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card12MouseClicked(evt);
            }
        });

        card13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card13MouseClicked(evt);
            }
        });

        card14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card14MouseClicked(evt);
            }
        });

        card16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card16MouseClicked(evt);
            }
        });

        card15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card15MouseClicked(evt);
            }
        });

        card8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card8MouseClicked(evt);
            }
        });

        card7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card7MouseClicked(evt);
            }
        });

        card3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelHardLayout = new javax.swing.GroupLayout(jPanelHard);
        jPanelHard.setLayout(jPanelHardLayout);
        jPanelHardLayout.setHorizontalGroup(
            jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHardLayout.createSequentialGroup()
                .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelHardLayout.createSequentialGroup()
                                .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHardLayout.createSequentialGroup()
                                .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelHardLayout.setVerticalGroup(
            jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHardLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHardLayout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHardLayout.createSequentialGroup()
                        .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHardLayout.createSequentialGroup()
                        .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanelHard);
        jPanelHard.setBounds(6, 78, 395, 386);

        play.setText("Empezar");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play);
        play.setBounds(6, 37, 76, 23);

        backButton.setText("Volver");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(480, 460, 72, 23);

        gameScore.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        gameScore.setText("           ");
        gameScore.setBorder(javax.swing.BorderFactory.createTitledBorder("PUNTAJE"));
        getContentPane().add(gameScore);
        gameScore.setBounds(440, 10, 100, 60);

        numHits.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        numHits.setText("    ");
        numHits.setBorder(javax.swing.BorderFactory.createTitledBorder("ACIERTOS"));
        getContentPane().add(numHits);
        numHits.setBounds(440, 130, 100, 90);

        numFails.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        numFails.setText("    ");
        numFails.setBorder(javax.swing.BorderFactory.createTitledBorder("FALLOS"));
        getContentPane().add(numFails);
        numFails.setBounds(440, 250, 100, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        backButton.setEnabled(false);
        if (hardRoute[0][0] == null) {
            loadimageslabels();
            play.setText("Jugar");
        } else {
            flipCards();
            play.setText("Jugando");
            play.setEnabled(false);
        }
    }//GEN-LAST:event_playActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        InterfaceMain Main = new InterfaceMain();
        Main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked
        showImages(Integer.parseInt(card1.getText()) - 1);
    }//GEN-LAST:event_card1MouseClicked

    private void card2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseClicked
        showImages(Integer.parseInt(card2.getText()) - 1);
    }//GEN-LAST:event_card2MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
        showImages(Integer.parseInt(card3.getText()) - 1);
    }//GEN-LAST:event_card3MouseClicked

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
        showImages(Integer.parseInt(card4.getText()) - 1);
    }//GEN-LAST:event_card4MouseClicked

    private void card5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseClicked
        showImages(Integer.parseInt(card5.getText()) - 1);
    }//GEN-LAST:event_card5MouseClicked

    private void card6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseClicked
        showImages(Integer.parseInt(card6.getText()) - 1);
    }//GEN-LAST:event_card6MouseClicked

    private void card7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card7MouseClicked
        showImages(Integer.parseInt(card7.getText()) - 1);
    }//GEN-LAST:event_card7MouseClicked

    private void card8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card8MouseClicked
        showImages(Integer.parseInt(card8.getText()) - 1);
    }//GEN-LAST:event_card8MouseClicked

    private void card9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card9MouseClicked
        showImages(Integer.parseInt(card9.getText()) - 1);
    }//GEN-LAST:event_card9MouseClicked

    private void card10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card10MouseClicked
        showImages(Integer.parseInt(card10.getText()) - 1);
    }//GEN-LAST:event_card10MouseClicked

    private void card11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card11MouseClicked
        showImages(Integer.parseInt(card11.getText()) - 1);
    }//GEN-LAST:event_card11MouseClicked

    private void card12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card12MouseClicked
        showImages(Integer.parseInt(card12.getText()) - 1);
    }//GEN-LAST:event_card12MouseClicked

    private void card13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card13MouseClicked
        showImages(Integer.parseInt(card13.getText()) - 1);
    }//GEN-LAST:event_card13MouseClicked

    private void card14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card14MouseClicked
        showImages(Integer.parseInt(card14.getText()) - 1);
    }//GEN-LAST:event_card14MouseClicked

    private void card15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card15MouseClicked
        showImages(Integer.parseInt(card15.getText()) - 1);
    }//GEN-LAST:event_card15MouseClicked

    private void card16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card16MouseClicked
        showImages(Integer.parseInt(card16.getText()) - 1);
    }//GEN-LAST:event_card16MouseClicked

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
            java.util.logging.Logger.getLogger(HardMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HardMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HardMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HardMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HardMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card10;
    private javax.swing.JLabel card11;
    private javax.swing.JLabel card12;
    private javax.swing.JLabel card13;
    private javax.swing.JLabel card14;
    private javax.swing.JLabel card15;
    private javax.swing.JLabel card16;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel card7;
    private javax.swing.JLabel card8;
    private javax.swing.JLabel card9;
    private javax.swing.JLabel gameScore;
    private javax.swing.JPanel jPanelHard;
    private javax.swing.JLabel numFails;
    private javax.swing.JLabel numHits;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
