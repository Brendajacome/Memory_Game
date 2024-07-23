package Model;

import View.HardMode;

public class AddCardHard {

    HardMode hardMode;

    public AddCardHard(HardMode hardMode) {
        this.hardMode = hardMode;
    }

    public final void AddCard() {
        for (int pic = 0; pic < hardMode.picHard.length; pic++) {
            hardMode.picHard[pic] = "/imgHard/" + (pic + 1) + ".jpg";
        }
    }
}
