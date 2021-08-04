package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Money.
 */
public class MoneyTest 
{
    @Test
    public void testMultiplication()
    {
        Money five = Money.dollar( 5 );
        
        // 2で掛けた場合のチェック
        assertEquals( Money.dollar( 10 ), five.times( 2 ));

        // 3で掛けた場合のチェック
        assertEquals( Money.dollar( 15 ), five.times( 3 ));
    }

    @Test
    public void testEquality()
    {
        // イコールの確認用
        assertTrue( Money.dollar( 5 ).equals( Money.dollar( 5 ) ) );
        assertFalse( Money.dollar( 5 ).equals( Money.dollar( 6 ) ) );

//        assertTrue( Money.franc( 5 ).equals( Money.franc( 5 ) ) );
//        assertFalse( Money.franc( 5 ).equals( Money.franc( 6 ) ) );
        
        assertFalse( Money.franc( 5 ).equals( Money.dollar( 5 ) ) );
    }
    
//    @Test
//    public void testFrancMultiplication()
//    {
//        Money five = Money.franc( 5 );
//        
//        // 2で掛けた場合のチェック
//        assertEquals( Money.franc( 10 ), five.times( 2 ));
//
//        // 3で掛けた場合のチェック
//        assertEquals( Money.franc( 15 ), five.times( 3 ));
//    }

    @Test
    public void testCurrency()
    {
        // 通貨テスト
        assertEquals("USD", Money.dollar( 1 ).currency() );
        assertEquals("CHF", Money.franc( 1 ).currency() );
    }

//    @Test
//    public void testDiffrentClassEquality()
//    {
//        assertTrue( new Money( 10 , "CHF").equals( new Franc( 10, "CHF" ) ) );
//    }

    @Test
    public void testSimpleAddition()
    {
        Money five = Money.dollar( 5 );
        Expression sum = five.plus( five );

        Bank bank = new Bank();
        Money reduced = bank.reduce( sum, "USD" );
        assertEquals( Money.dollar( 10 ) , reduced );
    }
}
