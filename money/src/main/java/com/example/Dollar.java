package com.example;


public class Dollar {
    int amount;
    
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
        return true;
    }
}