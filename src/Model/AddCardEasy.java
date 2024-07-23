package Model;

import View.EasyMode;

public class AddCardEasy {

    EasyMode easyMode;

    public AddCardEasy(EasyMode easyMode) {
        this.easyMode = easyMode;
    }

    public final void AddCard() {
        for (int pic = 0; pic < easyMode.piceasy.length; pic++) {
            easyMode.piceasy[pic] = "/imgEasy/" + (pic + 1) + ".jpg";
        }
    }
}
