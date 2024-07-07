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

    public EasyMode() {
        initComponents();
        setSize(700, 800);
        setLocationRelativeTo(this);
        loadingLabels();
        addcard();
        jPanel1easy.setVisible(false);
        compare.setEnabled(false);
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
        }
    }
    void flipcards() {
        ImageIcon backIcon = new ImageIcon(getClass().getResource("/others/1.jpg"));
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
            Quantitycard[Quantityclick] = numcards;
            Quantityclick++;
            if (Quantityclick == 2) {
                compare.setEnabled(true);
            }
        }
    }

    boolean PlayingYesorNo() {
        boolean PlayActivate;
        if (play.getText().equals("Jugando")) {
            PlayActivate = true;
        } else {
            PlayActivate = false;
        }
        return PlayActivate;
    
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
        play = new javax.swing.JButton();
        compare = new javax.swing.JButton();
        jlhits = new javax.swing.JLabel();
        jlfailures = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        StartButton.setText("Empezar");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartButton);
        StartButton.setBounds(30, 70, 80, 23);

        jPanel1easy.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        card1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card1MouseClicked(evt);
            }
        });

        card2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card2MouseClicked(evt);
            }
        });

        card3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }
        });

        card4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });

        card5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card5MouseClicked(evt);
            }
        });

        card6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card6MouseClicked(evt);
            }
        });

        card7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card7MouseClicked(evt);
            }
        });

        card8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card8MouseClicked(evt);
            }
        });

        card9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card9MouseClicked(evt);
            }
        });

        card10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card10MouseClicked(evt);
            }
        });

        card12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card12MouseClicked(evt);
            }
        });

        card11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1easyLayout = new javax.swing.GroupLayout(jPanel1easy);
        jPanel1easy.setLayout(jPanel1easyLayout);
        jPanel1easyLayout.setHorizontalGroup(
            jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1easyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1easyLayout.createSequentialGroup()
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1easyLayout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1easyLayout.createSequentialGroup()
                        .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1easyLayout.createSequentialGroup()
                                .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1easyLayout.createSequentialGroup()
                                .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1easyLayout.setVerticalGroup(
            jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1easyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1easyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel1easy);
        jPanel1easy.setBounds(30, 116, 340, 420);

        play.setText("MOSTRAR/JUGAR");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        jPanel1.add(play);
        play.setBounds(410, 106, 130, 30);

        compare.setText("COMPARAR");
        compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareActionPerformed(evt);
            }
        });
        jPanel1.add(compare);
        compare.setBounds(410, 166, 130, 30);

        jlhits.setBorder(javax.swing.BorderFactory.createTitledBorder("ACIERTOS"));
        jPanel1.add(jlhits);
        jlhits.setBounds(430, 236, 100, 90);

        jlfailures.setBorder(javax.swing.BorderFactory.createTitledBorder("FALLOS"));
        jPanel1.add(jlfailures);
        jlfailures.setBounds(430, 361, 100, 90);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(490, 540, 72, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(14, 15, 590, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card1.getText()) - 1);
        }
    }//GEN-LAST:event_card1MouseClicked

    private void card2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card2.getText()) - 1);
        }
    }//GEN-LAST:event_card2MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card3.getText()) - 1);
        }
    }//GEN-LAST:event_card3MouseClicked

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card4.getText()) - 1);
        }
    }//GEN-LAST:event_card4MouseClicked

    private void card5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card5.getText()) - 1);
        }
    }//GEN-LAST:event_card5MouseClicked

    private void card6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card6.getText()) - 1);
        }
    }//GEN-LAST:event_card6MouseClicked

    private void card7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card7MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card7.getText()) - 1);
        }
    }//GEN-LAST:event_card7MouseClicked

    private void card8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card8MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card8.getText()) - 1);
        }
    }//GEN-LAST:event_card8MouseClicked

    private void card9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card9MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card9.getText()) - 1);
        }
    }//GEN-LAST:event_card9MouseClicked

    private void card10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card10MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card10.getText()) - 1);
        }
    }//GEN-LAST:event_card10MouseClicked

    private void card12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card12MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card12.getText()) - 1);
        }
    }//GEN-LAST:event_card12MouseClicked

    private void card11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card11MouseClicked
        if (PlayingYesorNo()) {
            ShowLabels(Integer.parseInt(card11.getText()) - 1);
        }
    }//GEN-LAST:event_card11MouseClicked

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
        if (easyroute[0][0] == null) {
            loadimageslabels();
            play.setText("Jugar");

        } else {
            flipcards();
            play.setText("Jugando");
             play.setEnabled(false);
        }
    }//GEN-LAST:event_playActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        InterfaceMain Main = new InterfaceMain();
        Main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
     // TODO add your handling code here:
        jPanel1easy.setVisible(true);
    }//GEN-LAST:event_StartButtonActionPerformed

    private void compareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareActionPerformed
        // TODO add your handling code here:
         if (Compare[0].equals(Compare[1])) {
            Labels.get(Quantitycard[0]).setVisible(false);
            Labels.get(Quantitycard[1]).setVisible(false);
            JOptionPane.showMessageDialog(null, "Bien lo acertaste");
            Hits++;
            jlhits.setText("" + Hits);
        } else {
            failures++;
            jlfailures.setText("" + failures);
            flipcards();
        }
        compare.setEnabled(false);
        Quantityclick = 0;
    }//GEN-LAST:event_compareActionPerformed

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
    private javax.swing.JButton compare;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1easy;
    private javax.swing.JLabel jlfailures;
    private javax.swing.JLabel jlhits;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables

}
