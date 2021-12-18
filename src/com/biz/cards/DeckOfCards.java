package com.biz.cards;


import java.util.ArrayList;

public class DeckOfCards {

    ArrayList<Card> arrayList=new ArrayList<>();

    public static void shufflepalyer() {

    }

    public void showAllCards() {
        int index=0;
        for (int i = 0; i < Card.SUITS.length; i++) {
            for (int j = 0; j <Card.RANKS.length; j++) {
                Card card=new Card(j,i);
                arrayList.add(index++,card);
                System.out.println(card);
            }
        }
    }


}
