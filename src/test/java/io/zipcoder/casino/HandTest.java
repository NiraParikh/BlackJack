//package io.zipcoder.casino;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import org.junit.Test;
//
//     public class HandTest {
//
//         @Test
//
//        public void testIndividualCardTotals() {     //testing for individual tests
//
//
//        @Test
//
//        /**
//
//         * Test the hard total of a hand with multiple cards.
//
//         */
//
//        public void testHandTotalWithMultipleCards() {
//
////            Hand hand = new Hand();
////
////            hand.add(new Card(Rank.TWO, Suit.CLUBS));
////            hand.add(new Card(Rank.KING, Suit.CLUBS));
////            hand.add(new Card(Rank.QUEEN, Suit.CLUBS));
////            assertEquals(22, hand.calculateTotal().getTotal());
////
////        }
////
////
////
////
////        @Test
////
////        /**
////
////         * Test the soft total of a hand with multiple cards.
////
////         */
////
////        public void testHardHandWithMultipleCards() {
////
////            Hand hand = new Hand();
////            hand.add(new Card(Rank.TWO, Suit.CLUBS));
////            hand.add(new Card(Rank.KING, Suit.CLUBS));
////            hand.add(new Card(Rank.ACE, Suit.CLUBS));
////            HandTotal handTotal = hand.calculateTotal();
////            assertEquals(13, handTotal.getTotal());
////            assertFalse(handTotal.isSoft());
//
//        }
//
//        @Test
//        public void testHandIsPair() {
//            Hand hand = new Hand();
//            hand.addCard(new Card(Rank.TWO, Suit.CLUBS));
//            hand.addCard(new Card(Rank.TWO, Suit.CLUBS));
//            assertTrue(hand.isPair());
//        }
//
//
//
//
//        @Test
//        public void testHandIsPairWithMoreThan2Cards() {
//
//            Hand hand = new Hand();
//            hand.add(new Card(Rank.TWO, Suit.CLUBS));
//            hand.add(new Card(Rank.TWO, Suit.CLUBS));
//            hand.add(new Card(Rank.THREE, Suit.CLUBS));
//            assertFalse(hand.isPair());
//
//        }
//
//        @Test
//        public void testHandNotPair() {
//
//            Hand hand = new Hand();
//            hand.add(new Card(Rank.TWO, Suit.CLUBS));
//            hand.add(new Card(Rank.KING, Suit.CLUBS));
//            assertFalse(hand.isPair());
//
//        }
//       @Test
//        public void testSoftTotal() {
//
//            Hand hand = new Hand();
//            hand.add(new Card(Rank.ACE, Suit.CLUBS));
//            hand.add(new Card(Rank.KING, Suit.CLUBS));
//            HandTotal handTotal = hand.calculateTotal();
//            assertEquals(21, handTotal.getTotal());
//            assertTrue(handTotal.isSoft());
//
//        }
//
//        @Test
//        public void testSoftTotalWithTwoAces() {
//            Hand hand = new Hand();
//            hand.add(new Card(Rank.ACE, Suit.CLUBS));
//            hand.add(new Card(Rank.ACE, Suit.CLUBS));
//            hand.add(new Card(Rank.TWO, Suit.CLUBS));
//            HandTotal handTotal = hand.calculateTotal();
//            assertEquals(14, handTotal.getTotal());
//            assertTrue(handTotal.isSoft());
//
//        }
//    }
//
//
//}
