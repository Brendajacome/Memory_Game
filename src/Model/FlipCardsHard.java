package Model;

import View.HardMode;
import javax.swing.ImageIcon;

public class FlipCardsHard {

    private final HardMode hardMode;

    public FlipCardsHard(HardMode hardMode) {
        this.hardMode = hardMode;
    }

    public void flipCards() {
        ImageIcon backIcon = new ImageIcon(getClass().getResource("/others/1.jpg"));
        for (int i = 0; i < hardMode.Labels.size(); i++) {
            hardMode.Labels.get(i).setIcon(backIcon);
        }
    }
}
