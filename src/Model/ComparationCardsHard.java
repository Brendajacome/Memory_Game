package Model;

import Controller.GameWinHard;
import View.HardMode;
import javax.swing.JOptionPane;

public class ComparationCardsHard {
    public GameWinHard gameWinHard;
    public GameLifesHard gameLifesHard;
    private final HardMode hardMode;
    public FlipCardsHard flipCardsHard;

    public ComparationCardsHard(HardMode hardMode) {
        this.hardMode = hardMode;
        flipCardsHard = new FlipCardsHard(hardMode);
        gameLifesHard = new GameLifesHard(hardMode);
        gameWinHard = new GameWinHard(hardMode);
    }

    public void comparationOfCards() {
        System.out.println("Comparing: " + hardMode.comparation[0] + " and " + hardMode.comparation[1]); // Debug print
        if (hardMode.comparation[1].equals(hardMode.comparation[0])) {
            JOptionPane.showMessageDialog(null, "That´s right.");
            hardMode.Labels.get(hardMode.numCards[0]).setVisible(false);
            hardMode.Labels.get(hardMode.numCards[1]).setVisible(false);
            hardMode.hits++;
            hardMode.numHits.setText("" + hardMode.hits);
            hardMode.score = hardMode.score + 100;
            hardMode.Score.setText("" + hardMode.score);
            hardMode.cardsFound++;
            gameWinHard.GameWin();
        } else {
            flipCardsHard.flipCards();
            hardMode.fail++;
            gameLifesHard.lifes();
            if (hardMode.score >= 50) {
                hardMode.score = hardMode.score - 50;
            }
            hardMode.Score.setText("" + hardMode.score);
        }
        hardMode.clickCounter = 0;
    }
}
