package com.biz.cards;

import java.util.Scanner;

public class Player {
    int numberOfPlayer;
    public void Player(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getPlayerCount() {
        this.numberOfPlayer= (new Scanner(System.in).nextInt());
        if (numberOfPlayer >= 2 && numberOfPlayer <= 4) {
            this.numberOfPlayer = numberOfPlayer;
            return this.numberOfPlayer;
        } else {
            System.out.println("Please count must have more than 2 players and Max 4 Players");
            return 0;
        }
    }

    void shufflePlayer(){
        int payers[]=new int[numberOfPlayer];
        for(int i=0;i<numberOfPlayer;i++)
        {
            payers[i]=i;
        }

        DeckOfCards.shufflepalyer();
    }



}
