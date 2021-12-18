package com.biz.cards;

public class Main {
    public static void main(String[] args) {

        DeckOfCards deckOfCards = new DeckOfCards();

        System.out.println("Enter the Player Count");

        Player player=new Player();
        int playerCount= player.getPlayerCount();
        System.out.println(playerCount);
        deckOfCards.showAllCards();
    }
}
