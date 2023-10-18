package com.telran.org.homeworkfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DealApp {
    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        int players;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of players: ");
            if (scanner.hasNextInt()) {
                players = scanner.nextInt();
                if (players > 0) {
                    break;
                } else {
                    System.out.println("The number of players cannot be less than 1");
                }
            } else {
                System.out.println("You have not entered a valid number of players!");
                scanner.next(); // Consume the invalid input
            }
        }

        Deck deck = new Deck();
        deck.shuffle();

        Player[] playersList = new Player[players];

        for (int i = 0; i < players; i++) {
            playersList[i] = new Player();
        }

        // Distribute five cards to each player
        for (int i = 0; i < cardsForPlayer; i++) {
            for (Player player : playersList) {
                player.addCard(deck.drawCard());
            }
        }

        // Display each player's cards
        for (int i = 0; i < players; i++) {
            Player player = playersList[i];
            System.out.println("Player " + (i + 1) + "'s hand:");
            for (Card card : player.getHand()) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}