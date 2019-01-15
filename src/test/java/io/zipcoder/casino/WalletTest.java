package io.zipcoder.casino;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

    public class WalletTest {

        double wallet = 200.0;

        @Test
        public void testSetMoney(){                     //Wallet untouched
            //Given
            double expected = 200;
            Wallet a = new Wallet();

            //When
            a.setBalance(expected);
            double actual = a.getBalance();

            //Then
            Assert.assertEquals(expected,actual, 0);
        }

//        @Test
//        public void testSetMoney1(){                    //Wallet for game1
//            //Given
//            double expected = 200.0;
//            Wallet b = new Wallet();
//
//            //When
//            b.removeMoney(100.0);
//            double actual = b.getBalance();
//            //getBalance = removeMoney - wallet;
//
//            //Then
//            Assert.assertEquals(expected,actual,0.0);
//        }


    }


