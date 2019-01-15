package io.zipcoder.casino;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class BJDealerTest {
//    @Test
//    public void test() {
//        Deck deck = new Deck();
//        Hand h1 = new Hand(new ArrayList<Card>());
//       // BJDealer dealer = BJDealer.startGame(h1, deck);
//        Assert.assertEquals(dealer, dealer);
//    }
    @Test
    public void dealCard(){
        BJDealer dealer = new BJDealer(new Deck());
        Card expected = new Card( Rank.FOUR,Suit.DIAMOND);
        Card actual = dealer.dealCard();

        Assert.assertEquals(expected, actual);
    }

}
