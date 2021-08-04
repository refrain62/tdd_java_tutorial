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
        Dollar product = null;
        Dollar five = new Dollar( 5 );
        
        // 2で掛けた場合のチェック
        product = five.times( 2 );
        assertEquals(10, product.amount);

        // 3で掛けた場合のチェック
        product = five.times( 3 );
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality()
    {
        // イコールの確認用
        assertTrue(new Dollar( 5 ).equals( new Dollar( 5 ) ) );
    }
}
