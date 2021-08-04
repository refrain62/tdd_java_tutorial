package com.example;


public class Franc extends Money {
    
    Franc( int amount )
    {
        this.amount = amount;
    }

    Franc times( int multiplier )
    {
        return new Franc( amount * multiplier );
    }

    // イコール処理
    public boolean equals( Object object )
    {
        Franc franc = (Franc)object;

        return amount == franc.amount;
    }
}
