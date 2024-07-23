package Model;

import View.EasyMode;
import View.GameOver;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GameLifesEasy {

    EasyMode easyMode;

    public GameLifesEasy(EasyMode easyMode) {
        this.easyMode = easyMode;
    }

    public void lifes() {
        ImageIcon liveIcon = new ImageIcon(getClass().getResource("/others/life.jpg"));
        if (easyMode.failures == 0) {
            easyMode.live1.setIcon(liveIcon);
            easyMode.live2.setIcon(liveIcon);
            easyMode.live3.setIcon(liveIcon);
        }
        if (easyMode.failures == 1) {
            easyMode.live1.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have 2 lives remaining.");
        }
        if (easyMode.failures == 2) {
            easyMode.live2.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have 1 lives remaining.");
        }
        if (easyMode.failures == 3) {
            easyMode.live3.setVisible(false);
            JOptionPane.showMessageDialog(null, "You have one last try.");
        }
        if (easyMode.failures == 4) {
            JOptionPane.showMessageDialog(null, "You lose.");
            GameOver Main = new GameOver();
            Main.setVisible(true);
            
            easyMode.setVisible(false);
        }
    }

}
