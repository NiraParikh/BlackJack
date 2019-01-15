package io.zipcoder.casino;

import java.util.*;
public class BJPlayer extends Player{

        private Player dealer;
        private Hand hand;
        private Card card;


//        public BJPlayer(Hand hand) {
//            this.hand = hand;
//        }

    public BJPlayer(String name, String id) {
        super();
    }

    public Card hitMe() {
        Card c = dealNext();
        hand.addCard(Rank.FOUR, Suit.SPADE);
        return card;
    }

    private Card dealNext() {
        return card;
    }


    }


