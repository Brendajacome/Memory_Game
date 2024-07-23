package Controller;

import View.GameWin;
import View.HardMode;
import javax.swing.JOptionPane;

public class GameWinHard {
    HardMode hardMode;
    public GameWinHard(HardMode hardMode) {
        this.hardMode = hardMode;
    }

    public void GameWin() {
        if (hardMode.cardsFound == 8) {
            JOptionPane.showMessageDialog(null, "You win.");
            GameWin Main = new GameWin();
            Main.setVisible(true);
            hardMode.setVisible(false);
        }
    }
}
