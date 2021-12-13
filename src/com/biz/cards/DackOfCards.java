package com.biz.cards;

public class DackOfCards {


    public void showAllCards() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <13; j++) {
                Card card=new Card(j,i);
                System.out.println(card);
            }
        }
    }
}
