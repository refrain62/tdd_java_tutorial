package com.example;


public class Dollar {
    int amount;
    
    Dollar( int amount )
    {
        this.amount = amount;
    }

    void times( int multiplier )
    {
        amount = this.amount * multiplier;
    }
}
