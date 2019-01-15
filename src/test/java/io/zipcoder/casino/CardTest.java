package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {


    @Test
    public void testGetString() {

        //Given
        Card card = new Card(Rank.FOUR,Suit.DIAMOND);
        String expected = "DIAMOND-FOUR";
        //When
        String actual = card.toString();
        ;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetRank() {

        //Given
        Card card = new Card(Rank.JACK, Suit.DIAMOND);
        Rank expected = Rank.JACK;


        //When
        Rank actual = card.getRank();

        //Then

        Assert.assertEquals(expected, actual);
    }

}