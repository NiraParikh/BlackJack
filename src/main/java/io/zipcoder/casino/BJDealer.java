
package io.zipcoder.casino;

public class BJDealer extends Player {
    private Deck deck;
    private Card card;


    public BJDealer(Deck deck) {
        this.deck = deck;
    }

    public Card dealCard() {
        card = deck.removeCard(2);
        return card;
    }

//    public void dealHand(Player player) {
//        for (int i = 0; i < 2; i++) {
//            BJPlayer.hitMe();
//    }
//
//    public Card hitMe() {
//        card = dealCard();
//        //hand.addCard(card);
//        return card;
//    }
//

//    public String toString() {
//        return hand.toString() + "\nDealer Hand Value: " + hand.getHandValue() + "\n";
//        }

}