package io.zipcoder.casino;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> hand;
    private Card card;
    private int handValue;

    public Hand(List<Card> hand) {

        this.hand = hand;
    }

    public Card addCard(Rank rank, Suit suit) {

        hand.add(card);
        return card;
    }

    public String toString() {

        return "Hand: " + hand;
    }

}