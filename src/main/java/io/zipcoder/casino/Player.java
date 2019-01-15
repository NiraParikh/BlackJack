package io.zipcoder.casino;

import java.util.*;
public class Player{

    private Hand hand;
    private Card card;


    public Player(Hand hand, Card card) {
        this.hand = hand;
        this.card = card;
    }

    public Player() {

    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }


//    public String toString(){
//        return  new StringBuilder()
//                .append("My name is  ").append(Wallet.name);
//    }


}