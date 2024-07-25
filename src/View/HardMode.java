package View;

import Connection.ScoreManager;
import Connection.Connectiondatabase;
import java.util.ArrayList;
import javax.swing.JLabel;
import Controller.CardsRandomHard;
import Model.AddCardHard;
import Model.ComparationCardsHard;

public class HardMode extends javax.swing.JFrame {

    public ShowLabelsHard showLabelsHard;
    public AddCardHard addCardHard;
    public CardsRandomHard cardsRandomHard;
    public ComparationCardsHard comparationCards;
    public ArrayList<JLabel> Labels = new ArrayList();
    public String[] picHard = new String[8];
    public String[][] hardRoute = new String[4][4];
    public int[] cards = new int[8];
    public int clickCounter = 0;
    public int score = 0;
    public int hits = 0;
    public int fail = 0;
    public int cardsFound = 0;
    public String[] comparation = new String[2];
    public int[] numCards = new int[2];
    public int playerId =1;

    private ScoreManager scoreManager;
    private Connectiondatabase connectiondatabase;

    public HardMode() {
        initComponents();
        setSize(700, 700);
        setLocationRelativeTo(null);
        loadingLabels();

        // Inicializar la conexión a la base de datos y ScoreManager
        connectiondatabase = new Connectiondatabase("bg6cfvuhda9jpnz3solz");
        scoreManager = new ScoreManager(connectiondatabase);

        showLabelsHard = new ShowLabelsHard(this);
        addCardHard = new AddCardHard(this);
        addCardHard.AddCard();
        jPanelHard.setVisible(true);
        InterfaceMain playerName = new InterfaceMain();
        players.setText(playerName.text);
        comparationCards = new ComparationCardsHard(this);
        cardsRandomHard = new CardsRandomHard();

        updateScores();
    }

    void updateScores() {
        int highestScore = scoreManager.getHighestScore();
        int currentScore = scoreManager.getCurrentScore(playerId);

        // Actualizar la interfaz de usuario con los puntajes obtenidos
        Score.setText("Highest: " + highestScore + " Current: " + currentScore);
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
        Labels.add(card13);
        Labels.add(card14);
        Labels.add(card15);
        Labels.add(card16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        players = new javax.swing.JLabel();
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
        Score = new javax.swing.JLabel();
        numHits = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        live1 = new javax.swing.JLabel();
        live2 = new javax.swing.JLabel();
        live3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 730));
        getContentPane().setLayout(null);

        jPanel2.setMaximumSize(new java.awt.Dimension(700, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        players.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        players.setForeground(new java.awt.Color(255, 255, 255));
        players.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLAYER´S NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(players, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 220, 60));

        jPanelHard.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelHard.setForeground(new java.awt.Color(255, 255, 255));
        jPanelHard.setLayout(null);

        card1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card1MouseClicked(evt);
            }
        });
        jPanelHard.add(card1);
        card1.setBounds(17, 15, 80, 80);

        card2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card2MouseClicked(evt);
            }
        });
        jPanelHard.add(card2);
        card2.setBounds(109, 15, 80, 80);

        card4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });
        jPanelHard.add(card4);
        card4.setBounds(293, 15, 80, 80);

        card5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card5MouseClicked(evt);
            }
        });
        jPanelHard.add(card5);
        card5.setBounds(17, 107, 80, 80);

        card6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card6MouseClicked(evt);
            }
        });
        jPanelHard.add(card6);
        card6.setBounds(109, 107, 80, 80);

        card9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card9MouseClicked(evt);
            }
        });
        jPanelHard.add(card9);
        card9.setBounds(17, 199, 80, 80);

        card10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card10MouseClicked(evt);
            }
        });
        jPanelHard.add(card10);
        card10.setBounds(109, 199, 80, 80);

        card11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card11MouseClicked(evt);
            }
        });
        jPanelHard.add(card11);
        card11.setBounds(201, 199, 80, 80);

        card12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card12MouseClicked(evt);
            }
        });
        jPanelHard.add(card12);
        card12.setBounds(293, 199, 80, 80);

        card13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card13MouseClicked(evt);
            }
        });
        jPanelHard.add(card13);
        card13.setBounds(17, 291, 80, 80);

        card14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card14MouseClicked(evt);
            }
        });
        jPanelHard.add(card14);
        card14.setBounds(109, 291, 80, 80);

        card16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card16MouseClicked(evt);
            }
        });
        jPanelHard.add(card16);
        card16.setBounds(293, 291, 80, 80);

        card15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card15MouseClicked(evt);
            }
        });
        jPanelHard.add(card15);
        card15.setBounds(201, 291, 80, 80);

        card8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card8MouseClicked(evt);
            }
        });
        jPanelHard.add(card8);
        card8.setBounds(293, 107, 80, 80);

        card7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card7MouseClicked(evt);
            }
        });
        jPanelHard.add(card7);
        card7.setBounds(201, 107, 80, 80);

        card3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card3MouseClicked(evt);
            }
        });
        jPanelHard.add(card3);
        card3.setBounds(201, 15, 80, 80);

        jPanel2.add(jPanelHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 390, 390));

        Score.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setText("           ");
        Score.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCORE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(Score, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 140, 60));

        numHits.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        numHits.setForeground(new java.awt.Color(255, 255, 255));
        numHits.setText("    ");
        numHits.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HITS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(numHits, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 140, 90));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LIVES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        live1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(live1);
        live1.setBounds(10, 30, 35, 35);

        live2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(live2);
        live2.setBounds(50, 30, 35, 35);

        live3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(live3);
        live3.setBounds(90, 30, 35, 35);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 140, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/others/FrameHard.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked
        showLabelsHard.showImages(0);

    }//GEN-LAST:event_card1MouseClicked

    private void card2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseClicked
        showLabelsHard.showImages(1);
    }//GEN-LAST:event_card2MouseClicked

    private void card3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseClicked
        showLabelsHard.showImages(2);
    }//GEN-LAST:event_card3MouseClicked

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
        showLabelsHard.showImages(3);
    }//GEN-LAST:event_card4MouseClicked

    private void card5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseClicked
        showLabelsHard.showImages(4);
    }//GEN-LAST:event_card5MouseClicked

    private void card6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseClicked
        showLabelsHard.showImages(5);
    }//GEN-LAST:event_card6MouseClicked

    private void card7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card7MouseClicked
        showLabelsHard.showImages(6);
    }//GEN-LAST:event_card7MouseClicked

    private void card8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card8MouseClicked
        showLabelsHard.showImages(7);
    }//GEN-LAST:event_card8MouseClicked

    private void card9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card9MouseClicked
        showLabelsHard.showImages(8);
    }//GEN-LAST:event_card9MouseClicked

    private void card10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card10MouseClicked
        showLabelsHard.showImages(9);
    }//GEN-LAST:event_card10MouseClicked

    private void card11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card11MouseClicked
        showLabelsHard.showImages(10);
    }//GEN-LAST:event_card11MouseClicked

    private void card12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card12MouseClicked
        showLabelsHard.showImages(11);
    }//GEN-LAST:event_card12MouseClicked

    private void card13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card13MouseClicked
        showLabelsHard.showImages(12);
    }//GEN-LAST:event_card13MouseClicked

    private void card14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card14MouseClicked
        showLabelsHard.showImages(13);
    }//GEN-LAST:event_card14MouseClicked

    private void card15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card15MouseClicked
        showLabelsHard.showImages(14);
    }//GEN-LAST:event_card15MouseClicked

    private void card16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card16MouseClicked
        showLabelsHard.showImages(15);
    }//GEN-LAST:event_card16MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Score;
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
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHard;
    public javax.swing.JLabel live1;
    public javax.swing.JLabel live2;
    public javax.swing.JLabel live3;
    public javax.swing.JLabel numHits;
    public javax.swing.JLabel players;
    // End of variables declaration//GEN-END:variables
}
