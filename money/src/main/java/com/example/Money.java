package com.example;

public class Money {
    protected int amount;
    
    // イコール処理
    public boolean equals( Object object )
    {
        Money money = (Money)object;

        return amount == money.amount;
    }
}
