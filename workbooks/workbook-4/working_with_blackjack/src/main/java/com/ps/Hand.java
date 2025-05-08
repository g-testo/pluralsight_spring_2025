package com.ps;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
       return cards.size();
    }

    public int getTotalPointsValue(){
        // Accumulator Pattern
        // 1. Create accumulator variable
        int sum = 0;

        // 2. Loop through the array
        for(Card card: this.cards){
            card.flip();
            // 3. Accumulate
            sum += card.getPointValue();
            card.flip();
        }

        // 4. Return accumulator
        return sum;
    }

}
