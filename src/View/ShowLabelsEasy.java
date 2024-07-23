package View;

import javax.swing.ImageIcon;

public class ShowLabelsEasy {

    EasyMode easyMode;

    public ShowLabelsEasy(EasyMode easyMode) {
        this.easyMode = easyMode;
    }
    public void ShowLabels(int numcards) {
        if (easyMode.Quantityclick != 2) {
            if (numcards >= 0 && numcards <= 2) {
                easyMode.Compare[easyMode.Quantityclick] = easyMode.easyroute[0][numcards];
                easyMode.Labels.get(numcards).setIcon(new ImageIcon(getClass().getResource(easyMode.easyroute[0][numcards])));
            } else if (numcards >= 3 && numcards <= 5) {
                easyMode.Compare[easyMode.Quantityclick] = easyMode.easyroute[1][numcards - 3];
                easyMode.Labels.get(numcards).setIcon(new ImageIcon(getClass().getResource(easyMode.easyroute[1][numcards - 3])));
            } else if (numcards >= 6 && numcards <= 8) {
                easyMode.Compare[easyMode.Quantityclick] = easyMode.easyroute[2][numcards - 6];
                easyMode.Labels.get(numcards).setIcon(new ImageIcon(getClass().getResource(easyMode.easyroute[2][numcards - 6])));
            } else if (numcards >= 9 && numcards <= 11) {
                easyMode.Compare[easyMode.Quantityclick] = easyMode.easyroute[3][numcards - 9];
                easyMode.Labels.get(numcards).setIcon(new ImageIcon(getClass().getResource(easyMode.easyroute[3][numcards - 9])));
            }

            System.out.println("Click " + easyMode.Quantityclick + ": " + easyMode.Compare[easyMode.Quantityclick]);

            easyMode.Quantitycard[easyMode.Quantityclick] = numcards;
            easyMode.Quantityclick++;
        } else {
            easyMode.comparationCards.comparationOfCards();
        }
    }
}
