package com.example;

abstract class Money {
    protected int amount;

    abstract Money times( int multipier );

    // イコール処理
    public boolean equals( Object object )
    {
        Money money = (Money)object;

        return amount == money.amount
                &&  getClass().equals( money.getClass() );
    }

    static Dollar dollar( int amount )
    {
        return new Dollar( amount );
    }
}
