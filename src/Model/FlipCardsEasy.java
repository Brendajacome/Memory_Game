package Model;

import View.EasyMode;
import javax.swing.ImageIcon;

public class FlipCardsEasy {

    private final EasyMode easyMode;

    public FlipCardsEasy(EasyMode easyMode) {
        this.easyMode = easyMode;
    }

    public void flipcards() {
        ImageIcon backIcon = new ImageIcon(getClass().getResource("/others/pokemon.jpeg"));
        for (int i = 0; i < easyMode.Labels.size(); i++) {
            easyMode.Labels.get(i).setIcon(backIcon);

        }
    }
}
