package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest {



    @Test
    public void testGetCard (){
        Deck deck = new Deck ();
        Card card = new Card (Rank.EIGHT,Suit.DIAMOND);
        deck.addCard(card);
        Card actual = deck.getCard(0);
        Assert.assertTrue(actual instanceof Card);

    }

    @Test
    public void testToString (){
        Deck deck = new Deck();
        deck.createFullDeck();



        //Test for all Suits
        Assert.assertTrue(deck.toString().contains(Suit.DIAMOND.toString()));
        Assert.assertTrue(deck.toString().contains(Suit.CLUB.toString()));
        Assert.assertTrue(deck.toString().contains(Suit.HEART.toString()));
        Assert.assertTrue(deck.toString().contains(Suit.SPADE.toString()));

        //Test for all
        Assert.assertTrue(deck.toString().contains(Rank.KING.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.QUEEN.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.JACK.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.TEN.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.NINE.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.EIGHT.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.SEVEN.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.SIX.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.FIVE.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.FOUR.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.THREE.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.TWO.toString()));
        Assert.assertTrue(deck.toString().contains(Rank.ACE.toString()));
  }

}