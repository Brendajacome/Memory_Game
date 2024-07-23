package Model;

import Controller.GameWinEasy;
import View.EasyMode;
import javax.swing.JOptionPane;

public class ComparationCardsEasy {
    public GameLifesEasy gameLifesEasy;
    public GameWinEasy gameWinEasy;
    private final EasyMode easyMode;
    public FlipCardsEasy flipCardsEasy;
    public ComparationCardsEasy(EasyMode easyMode) {
        this.easyMode = easyMode;
        flipCardsEasy = new FlipCardsEasy(easyMode);
        gameLifesEasy = new GameLifesEasy(easyMode);
        gameWinEasy = new GameWinEasy(easyMode);
    }

    public void comparationOfCards() {
        System.out.println("Comparing: " + easyMode.Compare[0] + " and " + easyMode.Compare[1]); // Debug print
        if (easyMode.Compare[1].equals(easyMode.Compare[0])) {
            JOptionPane.showMessageDialog(null, "That´s right");
            easyMode.Labels.get(easyMode.Quantitycard[0]).setVisible(false);
            easyMode.Labels.get(easyMode.Quantitycard[1]).setVisible(false);
            easyMode.Hits++;
            easyMode.jlhits.setText("" + easyMode.Hits);
            easyMode.score = easyMode.score + 100;
            easyMode.Score.setText("" + easyMode.score);
            easyMode.cardsFound++;
            gameWinEasy.GameWin();
        } else {
            easyMode.failures++;
            gameLifesEasy.lifes();
            flipCardsEasy.flipcards();

            if (easyMode.score >= 50) {
                easyMode.score = easyMode.score - 50;
            }
            easyMode.Score.setText("" + easyMode.score);
        }
        easyMode.Quantityclick = 0;
    }
}
