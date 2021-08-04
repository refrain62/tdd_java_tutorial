package com.example;

import static org.junit.Assert.assertEquals;

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

        five.times( 2 );

        assertEquals(10, five.amount);
    }
}
