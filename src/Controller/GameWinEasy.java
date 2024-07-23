package Controller;

import View.EasyMode;
import View.GameWin;
import javax.swing.JOptionPane;

public class GameWinEasy {
    EasyMode easyMode;
    public GameWinEasy(EasyMode easyMode){
        this.easyMode = easyMode;
    }
    public void GameWin() {
        if (easyMode.cardsFound == 6) {
            JOptionPane.showMessageDialog(null, "You win.");
            GameWin Main = new GameWin();
            Main.setVisible(true);
            easyMode.setVisible(false);
        }
    }

}
