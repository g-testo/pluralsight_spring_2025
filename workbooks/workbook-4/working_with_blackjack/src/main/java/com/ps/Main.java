package com.ps;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand gregDealerHand = new Hand();

        Hand ummeHand = new Hand();
        Hand sebastianHand = new Hand();
        Hand mohammadHand = new Hand();

        for(int i=0;i<2;i++){
            Card dealerCard = deck.deal();
            gregDealerHand.deal(dealerCard);

            Card ummeCard = deck.deal();
            ummeHand.deal(ummeCard);

            Card sebastianCard = deck.deal();
            sebastianHand.deal(sebastianCard);

            Card mohammadCard = deck.deal();
            mohammadHand.deal(mohammadCard);
        }

        int gregPoints = gregDealerHand.getTotalPointsValue();
        int ummePoints = ummeHand.getTotalPointsValue();
        int sebastianPoints = sebastianHand.getTotalPointsValue();
        int mohammadPoints = mohammadHand.getTotalPointsValue();

        System.out.printf("Greg: %d,\n Umme: %d,\n Sebastian: %d,\n Mohammad: %d",
                gregPoints,
                ummePoints,
                sebastianPoints,
                mohammadPoints
        );
    }
}
