package com.example;


public class Dollar extends Money {
    
    Dollar( int amount )
    {
        this.amount = amount;
    }

    Dollar times( int multiplier )
    {
        return new Dollar( amount * multiplier );
    }

    // イコール処理
    public boolean equals( Object object )
    {
        Dollar dollar = (Dollar)object;

        return amount == dollar.amount;
    }
}
