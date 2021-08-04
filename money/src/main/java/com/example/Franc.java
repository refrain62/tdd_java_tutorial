package com.example;


public class Franc extends Money {
    
    private String currency;

    Franc( int amount )
    {
        this.amount = amount;
        this.currency = "CHF";
    }

    String currency()
    {
        return this.currency;
    }

    Money times( int multiplier )
    {
        return new Franc( amount * multiplier );
    }
}
