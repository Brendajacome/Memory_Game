package View;

import java.util.ArrayList;
import javax.swing.JLabel;
import Controller.CardsRandomEasy;
import Model.AddCardEasy;
import Model.ComparationCardsEasy;

public class EasyMode extends javax.swing.JFrame {
    public ShowLabelsEasy showlabelsEasy;
    public AddCardEasy addCardEasy;
    public CardsRandomEasy cardsRandomEasy;
    public ComparationCardsEasy comparationCards;
    public ArrayList<JLabel> Labels = new ArrayList();
    public String[] piceasy = new String[6];
    public String[][] easyroute = new String[4][3];
    public int[] cards = new int[6];
    public int Quantityclick = 0;
    public String[] Compare = new String[2];
    public int[] Quantitycard = new int[2];
    public int Hits = 0;
    public int failures = 0;
    public int score = 0;
    public int cardsFound = 0;

    public EasyMode() {
        initComponents();
        setSize(700, 700);
        setLocationRelativeTo(null);
        loadingLabels();
        JLabel jlTimeBeforeFlip = new javax.swing.JLabel("");
        jPanel1.add(jlTimeBeforeFlip);
        addCardEasy = new AddCardEasy(this);
        showlabelsEasy = new ShowLabelsEasy(this);
        addCardEasy.AddCard();
        jPanel1easy.setVisible(true);
        InterfaceMain playerName = new InterfaceMain();
        players.setText(playerName.text);
        comparationCards = new ComparationCardsEasy(this);
        cardsRandomEasy = new CardsRandomEasy();
    }

    public final void loadingLabels() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Score = new javax.swing.JLabel();
        players = new javax.swing.JLabel();
        jlhits = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        live1 = new javax.swing.JLabel();
        live2 = new javax.swing.JLabel();
        live3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(700, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(null);

        Score.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setText("           ");
        Score.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCORE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(Score);
        Score.setBounds(450, 210, 140, 60);

        players.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        players.setForeground(new java.awt.Color(255, 255, 255));
        players.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLAYER´S NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(players);
        players.setBounds(100, 80, 170, 60);

        jlhits.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlhits.setForeground(new java.awt.Color(255, 255, 255));
        jlhits.setText("    ");
        jlhits.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HITS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jlhits);
        jlhits.setBounds(450, 290, 140, 90);

        jPanel1easy.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1easy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        jPanel1easy.setBounds(70, 200, 350, 430);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LIVES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        live1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(live1);
        live1.setBounds(10, 30, 35, 35);

        live2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(live2);
        live2.setBounds(50, 30, 35, 35);

        live3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(live3);
        live3.setBounds(90, 30, 35, 35);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(450, 410, 140, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/others/FrameEasy.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 700);
        jLabel1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 700);
        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jlTime);
        jlTime.setBounds(700, 190, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void card11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card11MouseClicked

        showlabelsEasy.ShowLabels(10);


    }//GEN-LAST:event_card11MouseClicked

    private void card12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card12MouseClicked

        showlabelsEasy.ShowLabels(11);

    }//GEN-LAST:event_card12MouseClicked

    private void card10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card10MouseClicked

        showlabelsEasy.ShowLabels(9);

    }//GEN-LAST:event_card10MouseClicked

    private void card9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card9MouseClicked

        showlabelsEasy.ShowLabels(8);

    }//GEN-LAST:event_card9MouseClicked

    private void card8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card8MouseClicked

        showlabelsEasy.ShowLabels(7);

    }//GEN-LAST:event_card8MouseClicked

    private void card7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card7MouseClicked

        showlabelsEasy.ShowLabels(6);

    }//GEN-LAST:event_card7MouseClicked

    private void card6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseClicked

        showlabelsEasy.ShowLabels(5);

    }//GEN-LAST:event_card6MouseClicked

    private void card5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseClicked

        showlabelsEasy.ShowLabels(4);

    }//GEN-LAST:event_card5MouseClicked

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked

        showlabelsEasy.ShowLabels(3);

    }//GEN-LAST:event_card4MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked

        showlabelsEasy.ShowLabels(2);

    }//GEN-LAST:event_card3MouseClicked

    private void card2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseClicked

        showlabelsEasy.ShowLabels(1);

    }//GEN-LAST:event_card2MouseClicked

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked

        showlabelsEasy.ShowLabels(0);

    }//GEN-LAST:event_card1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Score;
    public javax.swing.JLabel card1;
    public javax.swing.JLabel card10;
    public javax.swing.JLabel card11;
    public javax.swing.JLabel card12;
    public javax.swing.JLabel card2;
    public javax.swing.JLabel card3;
    public javax.swing.JLabel card4;
    public javax.swing.JLabel card5;
    public javax.swing.JLabel card6;
    public javax.swing.JLabel card7;
    public javax.swing.JLabel card8;
    public javax.swing.JLabel card9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1easy;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlTime;
    public javax.swing.JLabel jlhits;
    public javax.swing.JLabel live1;
    public javax.swing.JLabel live2;
    public javax.swing.JLabel live3;
    public javax.swing.JLabel players;
    // End of variables declaration//GEN-END:variables

}
