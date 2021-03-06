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
■ $5 + 10CHF = $10（レートが2:1の場合）
■ $5 + $5 = $10
■ $5 + $5 が Money を返す
■ bank.reduce( Money )
■ Sum.plus
■ Expression.times
■ Money を変換して換算を行う
■ $5 * 2 = $10
■ amount を private にする
■ Dollar の副作用どうする？
□ Money の丸め処理どうする？
■ equals()
□ hashCode()
□ nullとの等価性比較
□ 他のオブジェクトとの等価性比較
■ 5CHF * 2 = 10CHF
■ Dollar と Franc の重複
■ equals の一般化
■ times の一般化
■ Franc と Dollar を比較する
■ 通貨の概念
■ testFrancMultiplication のテストを削除する？
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

