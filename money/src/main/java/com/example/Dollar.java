package com.example;


public class Dollar extends Money {
    
    private String currency;

    Dollar( int amount )
    {
        this.amount = amount;
        this.currency = "USD";
    }

    String currency()
    {
        return this.currency;
    }

    Money times( int multiplier )
    {
        return new Dollar( amount * multiplier );
    }
}
