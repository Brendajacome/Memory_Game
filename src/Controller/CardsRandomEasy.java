package Controller;

import java.security.SecureRandom;

public class CardsRandomEasy extends SecureRandom {

    SecureRandom cardsrandom = new SecureRandom();

    public CardsRandomEasy() {
    }

    public int cardImagen() {
        int cardcreated = cardsrandom.nextInt(6);
        return cardcreated;
    }
}
