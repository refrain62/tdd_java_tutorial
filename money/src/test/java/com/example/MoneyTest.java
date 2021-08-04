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
        assertEquals( new Dollar( 10 ), five.times( 2 ));

        // 3で掛けた場合のチェック
        assertEquals( new Dollar( 15 ), five.times( 3 ));
    }

    @Test
    public void testEquality()
    {
        // イコールの確認用
        assertTrue(new Dollar( 5 ).equals( new Dollar( 5 ) ) );
        assertFalse(new Dollar( 5 ).equals( new Dollar( 6 ) ) );

        assertTrue(new Franc( 5 ).equals( new Franc( 5 ) ) );
        assertFalse(new Franc( 5 ).equals( new Franc( 6 ) ) );
        
        assertFalse(new Franc( 5 ).equals( new Dollar( 5 ) ) );
    }
    
    @Test
    public void testFrancMultiplication()
    {
        Franc five = new Franc( 5 );
        
        // 2で掛けた場合のチェック
        assertEquals( new Franc( 10 ), five.times( 2 ));

        // 3で掛けた場合のチェック
        assertEquals( new Franc( 15 ), five.times( 3 ));
    }
}
