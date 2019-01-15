package io.zipcoder.casino;

public class Card {

    private Suit suit; // 4 suits
    private Rank rank; // # of cards



    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){

        return this.suit.toString() + "-" + this.rank.toString();
    }

    public Rank getRank() {
        return this.rank;
    }



}