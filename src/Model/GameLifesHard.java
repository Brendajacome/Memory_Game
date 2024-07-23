package Model;

import View.GameOver;
import View.HardMode;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Connection.ScoreManager;
import Connection.Connectiondatabase;

public class GameLifesHard {

    HardMode hardMode;
    ScoreManager scoreManager;

    public GameLifesHard(HardMode hardMode) {
        this.hardMode = hardMode;
        this.scoreManager = new ScoreManager(new Connectiondatabase("scores"));
    }

    public void lifes() {
        ImageIcon liveIcon = new ImageIcon(getClass().getResource("/others/life.jpg"));
        if (hardMode.fail == 0) {
            hardMode.live1.setIcon(liveIcon);
            hardMode.live2.setIcon(liveIcon);
            hardMode.live3.setIcon(liveIcon);
        }
        if (hardMode.fail == 1) {
            hardMode.live1.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have 2 lives remaining.");
        }
        if (hardMode.fail == 2) {
            hardMode.live2.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have 1 life remaining.");
        }
        if (hardMode.fail == 3) {
            hardMode.live3.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have one last try.");
        }
        if (hardMode.fail == 4) {
            // Guardar el puntaje del jugador en la base de datos cuando pierde
            scoreManager.addScore(hardMode.playerId, hardMode.score);
            JOptionPane.showMessageDialog(null, "You lose.");
            GameOver Main = new GameOver();
            Main.setVisible(true);
            hardMode.setVisible(false);
        }
    }
}

