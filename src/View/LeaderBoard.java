package View;

public class LeaderBoard extends javax.swing.JFrame {
    EasyMode easyMode;
    InterfaceMain playerName;
    HardMode hardMode;
    public LeaderBoard() {
        playerName= new InterfaceMain();
        easyMode = new EasyMode();
        hardMode = new HardMode();
        initComponents();
        setSize(700, 700);
        setLocationRelativeTo(null);
        highScores.setText(" " + easyMode.highestScore);
        currentPlayer.setText(playerName.text);
        currentScore.setText("" + easyMode.currentScore);
        currentScore.setText("" + hardMode.currentScore);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackMenu = new javax.swing.JButton();
        currentScore = new javax.swing.JLabel();
        highScores = new javax.swing.JLabel();
        currentPlayer = new javax.swing.JLabel();
        FinalScaore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackMenu.setBackground(new java.awt.Color(153, 255, 204));
        BackMenu.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        BackMenu.setText("Menu");
        BackMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BackMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 150, 50));

        currentScore.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        currentScore.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Score", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 18))); // NOI18N
        jPanel1.add(currentScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 160, 70));

        highScores.setBackground(new java.awt.Color(0, 0, 0));
        highScores.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        highScores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "High Score", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 18))); // NOI18N
        jPanel1.add(highScores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 160, 70));

        currentPlayer.setBackground(new java.awt.Color(102, 255, 204));
        currentPlayer.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        currentPlayer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Player", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Forte", 0, 18))); // NOI18N
        jPanel1.add(currentPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 290, 70));

        FinalScaore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/others/Score.jpg"))); // NOI18N
        jPanel1.add(FinalScaore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenuActionPerformed
        InterfaceMain Main = new InterfaceMain();
        Main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackMenu;
    private javax.swing.JLabel FinalScaore;
    private javax.swing.JLabel currentPlayer;
    private javax.swing.JLabel currentScore;
    private javax.swing.JLabel highScores;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
