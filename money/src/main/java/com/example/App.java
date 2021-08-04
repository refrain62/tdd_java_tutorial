package com.example;


// Multi-Currency Money 

// レポート
// --------------------------------------------------------------------------------
//  銘柄        株数        価格        合計
// --------------------------------------------------------------------------------
//  IBM         1000        25          25000
//  GE          400         100         40000
// --------------------------------------------------------------------------------
//                          総計        65000
// --------------------------------------------------------------------------------

// レポートを多国通貨対応させるために、通貨の情報を付与
// --------------------------------------------------------------------------------
//  銘柄        株数        価格        合計
// --------------------------------------------------------------------------------
//  IBM         1000        25USD      25000 USD
//  Novartis    400         150CHF     60000 CHF
// --------------------------------------------------------------------------------
//                          総計       65000 USD
// --------------------------------------------------------------------------------

// 為替レート
// --------------------------------------------------------------------------------
//  換算元              換算先              レート
// --------------------------------------------------------------------------------
//  CHF                 USD                 1.5
// --------------------------------------------------------------------------------

// --------------------------------------------------------------------------------
// TODO
// --------------------------------------------------------------------------------
/*
□ $5 + 10CHF = $10（レートが2:1の場合）
■ $5 * 2 = $10
□ amount を private にする
■ Dollar の副作用どうする？
□ Money の丸め処理どうする？
□ equals()
□ hashCode()
*/
// --------------------------------------------------------------------------------


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
