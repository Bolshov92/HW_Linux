package com.telran.org.homeworkfour;

public class Card {
    private final Suits suit;
    private final Rank rank;

    public Card(Suits suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}

