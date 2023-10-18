package com.telran.org.homeworkfour;

import java.util.Random;

public class Deck {
    private Card[] cards;
    private int currentCardIndex;

    public Deck() {
        cards = new Card[Suits.values().length * Rank.values().length];
        int index = 0;
        for (Suits suit : Suits.values()) {
            for (Rank rank : Rank.values()) {
                cards[index] = new Card(suit, rank);
                index++;
            }
        }
        currentCardIndex = 0;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int j = random.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card drawCard() {
        if (currentCardIndex >= cards.length) {
            throw new IllegalStateException("Deck is empty.");
        }
        return cards[currentCardIndex++];
    }
}
