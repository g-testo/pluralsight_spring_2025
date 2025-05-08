package com.ps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards; // null

    public Deck(){
        this.cards = new ArrayList<>();
        String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
        String[] values = {"2","3","4","5","6","7","8",
                "9","10","J","Q","K","A"};
        for(String suit: suits){
            for(String value:values){
                Card card = new Card(suit, value);
                cards.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public Card deal(){
        return cards.remove(cards.size() - 1);
    }

    public int getSize(){
        return cards.size();
    }

}
