package View;

import Connection.Connectiondatabase;
import javax.swing.JOptionPane;
import Model.GameLifesEasy;
import Model.GameLifesHard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InterfaceMain extends javax.swing.JFrame {

   private Connectiondatabase dbConnection;

    
    public InterfaceMain() {
        initComponents();
        setSize(700, 700);
        this.setLocationRelativeTo(null);
        easyButton.setVisible(false);
        hardButton.setVisible(false);
        textInterface.setVisible(false);
        dbConnection = new Connectiondatabase("bg6cfvuhda9jpnz3solz");
    }
    public static String text = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        hardButton = new javax.swing.JButton();
        textInterface = new javax.swing.JLabel();
        easyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        playerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(700, 700));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitButton.setBackground(new java.awt.Color(153, 255, 255));
        submitButton.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 130, 40));

        hardButton.setBackground(new java.awt.Color(51, 51, 255));
        hardButton.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        hardButton.setForeground(new java.awt.Color(0, 255, 204));
        hardButton.setText("HARD");
        hardButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });
        jPanel1.add(hardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 120, 50));

        textInterface.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        textInterface.setForeground(new java.awt.Color(255, 255, 255));
        textInterface.setText("Please, select your game mode.");
        jPanel1.add(textInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        easyButton.setBackground(new java.awt.Color(102, 51, 255));
        easyButton.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        easyButton.setForeground(new java.awt.Color(0, 255, 204));
        easyButton.setText("EASY");
        easyButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        easyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButtonActionPerformed(evt);
            }
        });
        jPanel1.add(easyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 120, 50));

        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter your Nickname");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        playerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerNameActionPerformed(evt);
            }
        });
        jPanel1.add(playerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/others/MEMORY GAME.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));
        jLabel2.getAccessibleContext().setAccessibleParent(this);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 700);
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void easyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Note: You have 5 seconds to see the cards once the game has started.");
        EasyMode Main = new EasyMode();
        Main.setVisible(true);
        this.setVisible(false);
        GameLifesEasy MainLife = new GameLifesEasy(Main);
        LoadImagesEasy MainLoad = new LoadImagesEasy(Main);
        MainLoad.LoadImageslabels();
        MainLife.lifes();

    }//GEN-LAST:event_easyButtonActionPerformed

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Note: You have 3 seconds to see the cards once the game has started.");
        HardMode Main = new HardMode();
        Main.setVisible(true);
        this.setVisible(false);
        LoadImagesHard MainLoad = new LoadImagesHard(Main);
        MainLoad.LoadImageslabels();
        GameLifesHard MainLife = new GameLifesHard(Main);
        MainLife.lifes();

    }//GEN-LAST:event_hardButtonActionPerformed

    private void playerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerNameActionPerformed

    }//GEN-LAST:event_playerNameActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (!playerName.getText().trim().isEmpty()) {
            text = playerName.getText();
            playerName.setEditable(false);
            submitButton.setEnabled(false);
            easyButton.setVisible(true);
            hardButton.setVisible(true);
            textInterface.setVisible(true);
            
            // Guardar el nombre del jugador en la base de datos
            savePlayerName(text);
        } else {
            easyButton.setVisible(false);
            hardButton.setVisible(false);
            JOptionPane.showMessageDialog(this, "Please, enter your name");
        }
    }                                            
      private void savePlayerName(String playerName) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Establecer la conexión con la base de datos
            conn = dbConnection.connect();

            // Crear la sentencia SQL para insertar el nombre del jugador
            String sql = "INSERT INTO players (player_name) VALUES (?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, playerName);

            // Ejecutar la inserción
            pstmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error connecting to the database: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) dbConnection.disconnect();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error closing the database connection: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton easyButton;
    private javax.swing.JButton hardButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField playerName;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel textInterface;
    // End of variables declaration//GEN-END:variables
}
