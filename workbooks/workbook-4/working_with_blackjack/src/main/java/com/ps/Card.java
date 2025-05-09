package com.ps;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        if(!this.isFaceUp) return "#";
        return suit;
    }

    public String getValue() {
        if(!this.isFaceUp) return "#";
        return value;
    }

    public int getPointValue(){
        if(!this.isFaceUp) {
            System.out.println("Can't get value, card is face down.");
            return 0;
        }
        // 2,3,4...10 > stays the same
        // J,Q,K > 10
        // A > 11
        switch(this.value){
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 11;
            default:
                return Integer.parseInt(this.value);
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public boolean flip(){
        this.isFaceUp = !this.isFaceUp;
        return this.isFaceUp;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
