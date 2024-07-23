package View;

import javax.swing.ImageIcon;

public class ShowLabelsHard {

    HardMode hardMode;

    public ShowLabelsHard(HardMode hardMode) {
        this.hardMode = hardMode;
    }

    public void showImages(int numLabel) {
        if (hardMode.clickCounter != 2) {
            if (numLabel >= 0 && numLabel <= 3) {
                hardMode.comparation[hardMode.clickCounter] = hardMode.hardRoute[0][numLabel];
                hardMode.Labels.get(numLabel).setIcon(new ImageIcon(getClass().getResource(hardMode.hardRoute[0][numLabel])));
            } else if (numLabel >= 4 && numLabel <= 7) {
                hardMode.comparation[hardMode.clickCounter] = hardMode.hardRoute[1][numLabel - 4];
                hardMode.Labels.get(numLabel).setIcon(new ImageIcon(getClass().getResource(hardMode.hardRoute[1][numLabel - 4])));
            } else if (numLabel >= 8 && numLabel <= 11) {
                hardMode.comparation[hardMode.clickCounter] = hardMode.hardRoute[2][numLabel - 8];
                hardMode.Labels.get(numLabel).setIcon(new ImageIcon(getClass().getResource(hardMode.hardRoute[2][numLabel - 8])));
            } else if (numLabel >= 12 && numLabel <= 15) {
                hardMode.comparation[hardMode.clickCounter] = hardMode.hardRoute[3][numLabel - 12];
                hardMode.Labels.get(numLabel).setIcon(new ImageIcon(getClass().getResource(hardMode.hardRoute[3][numLabel - 12])));
            }
            System.out.println("Click " + hardMode.clickCounter + ": " + hardMode.comparation[hardMode.clickCounter]); // Debug print
            hardMode.numCards[hardMode.clickCounter] = numLabel;
            hardMode.clickCounter++;
        } else {
            hardMode.comparationCards.comparationOfCards();
        }

    }
}
