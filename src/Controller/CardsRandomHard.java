package Controller;

import java.security.SecureRandom;

public class CardsRandomHard {

    SecureRandom cardsrandom = new SecureRandom();

    public CardsRandomHard() {
    }
    public int cardImagen() {
        int cardcreated = cardsrandom.nextInt(8);

        return cardcreated;
    }
}
