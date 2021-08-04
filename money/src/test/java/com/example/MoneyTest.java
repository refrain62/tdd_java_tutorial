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
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar( 5 );
        
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
    }
}
