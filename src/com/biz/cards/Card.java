package com.biz.cards;

public class Card {
    private int rank;
    private int suit;
    public static final String[] RANKS = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
}
