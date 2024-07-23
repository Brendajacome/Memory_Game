package Controller;

import View.EasyMode;
import View.GameWin;
import javax.swing.JOptionPane;
import Connection.ScoreManager;
import Connection.Connectiondatabase;

public class GameWinEasy {
    EasyMode easyMode;
    ScoreManager scoreManager;
    Connectiondatabase connectiondatabase;

    public GameWinEasy(EasyMode easyMode) {
        this.easyMode = easyMode;
        this.connectiondatabase = new Connectiondatabase("scores");
        this.scoreManager = new ScoreManager(connectiondatabase);
    }

    public void GameWin() {
        if (easyMode.cardsFound == 6) {
            // Guardar el puntaje del jugador en la base de datos
            scoreManager.addScore(easyMode.playerId, easyMode.score);
            JOptionPane.showMessageDialog(null, "You win.");
            GameWin Main = new GameWin();
            Main.setVisible(true);
            easyMode.setVisible(false);
        }
    }
}
