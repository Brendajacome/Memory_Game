package View;

import Model.FlipCardsHard;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class LoadImagesHard {

    public FlipCardsHard flipCardsHard;
    HardMode hardMode;

    public LoadImagesHard(HardMode hardMode) {
        flipCardsHard = new FlipCardsHard(hardMode);
        this.hardMode = hardMode;
    }

    public void LoadImageslabels() {
        int counter = 0;
        for (int row = 0; row < hardMode.hardRoute.length; row++) {
            for (int column = 0; column < hardMode.hardRoute[0].length; column++) {
                int temp = hardMode.cardsRandomHard.cardImagen();
                if (hardMode.cards[temp] == 2) {
                    column--;
                } else {
                    hardMode.hardRoute[row][column] = hardMode.picHard[temp];
                    hardMode.cards[temp]++;
                }
            }
        }

        for (int row = 0; row < hardMode.hardRoute.length; row++) {
            for (int column = 0; column < hardMode.hardRoute[0].length; column++) {
                hardMode.Labels.get(counter).setOpaque(true);
                hardMode.Labels.get(counter).setIcon(new ImageIcon(getClass().getResource(hardMode.hardRoute[row][column])));
                hardMode.Labels.get(counter).setText("" + (counter + 1));
                counter++;
            }
        }
        Timer timer = new Timer(3000, e -> flipCardsHard.flipCards());
        timer.setRepeats(false);
        timer.start();
    }
}
