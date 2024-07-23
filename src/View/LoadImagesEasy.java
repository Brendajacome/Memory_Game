package View;

import javax.swing.ImageIcon;
import javax.swing.Timer;
import Model.FlipCardsEasy;

public class LoadImagesEasy {

    public FlipCardsEasy flipCardsEasy;
    EasyMode easyMode;

    public LoadImagesEasy(EasyMode easyMode) {
        this.easyMode = easyMode;
        flipCardsEasy = new FlipCardsEasy(easyMode);
    }

    public void LoadImageslabels() {
        int counter = 0;
        for (int row = 0; row < easyMode.easyroute.length; row++) {
            for (int column = 0; column < easyMode.easyroute[0].length; column++) {
                int temp = easyMode.cardsRandomEasy.cardImagen();
                if (easyMode.cards[temp] == 2) {
                    column--;
                } else {
                    easyMode.easyroute[row][column] = easyMode.piceasy[temp];
                    easyMode.cards[temp]++;
                }
            }
        }

        for (int row = 0; row < easyMode.easyroute.length; row++) {
            for (int column = 0; column < easyMode.easyroute[0].length; column++) {
                easyMode.Labels.get(counter).setOpaque(true);
                easyMode.Labels.get(counter).setIcon(new ImageIcon(getClass().getResource(easyMode.easyroute[row][column])));
                easyMode.Labels.get(counter).setText("" + (counter + 1));
                counter++;
            }

            Timer timer = new Timer(5000, e -> flipCardsEasy.flipcards());
            timer.setRepeats(false);
            timer.start();
        }
    }
}
