package Controller;

import View.GameWin;
import View.HardMode;
import javax.swing.JOptionPane;
import Connection.ScoreManager;
import Connection.Connectiondatabase;

public class GameWinHard {
    HardMode hardMode;
    ScoreManager scoreManager;
    Connectiondatabase connectiondatabase;

    public GameWinHard(HardMode hardMode) {
        this.hardMode = hardMode;
        this.connectiondatabase = new Connectiondatabase("bg6cfvuhda9jpnz3solz");
        this.scoreManager = new ScoreManager(connectiondatabase);
    }

    public void GameWin() {
        if (hardMode.cardsFound == 8) {
            // Guardar el puntaje del jugador en la base de datos
            scoreManager.addScore(hardMode.playerId, hardMode.score);
            JOptionPane.showMessageDialog(null, "You win.");
            GameWin Main = new GameWin();
            Main.setVisible(true);
            hardMode.setVisible(false);
        }
    }
}
