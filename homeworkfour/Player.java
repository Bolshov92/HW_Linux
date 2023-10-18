package com.telran.org.homeworkfour;

public class Player {

    private Card[] hand = new Card[5];
    private int cardsInHand;

    public void addCard(Card card) {
        if (cardsInHand < 5) {
            hand[cardsInHand] = card;
            cardsInHand++;
        }
    }

    public Card[] getHand() {
        return hand;
    }
}
