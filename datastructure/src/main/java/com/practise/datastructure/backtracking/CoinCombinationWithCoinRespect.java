package com.practise.datastructure.backtracking;

import com.sun.corba.se.spi.activation.TCPPortHelper;

public class CoinCombinationWithCoinRespect {
    public static void main(String[] args) {
        int[] coins = {2,3,4,5,6};
        coinCombinationWithCoinRespect(coins,0,10,"" );
    }

    public static void coinCombinationWithCoinRespect(int[] coins, int currentCoinIndex, int amount, String result) {
        // Each coin has two choices either coin can contribute to result to make sum of amount
        // OR coin can not contribute in result
        // Universal truth is recursive calls == number of choices :D

        // +ve base case
        if(amount == 0) {
            System.out.println(result);
            return;
        }

        // -ve base case
        if(currentCoinIndex == coins.length ){
            return;
        }

        // Ignore case similar to -ve base case
        if (coins[currentCoinIndex] > amount ) {
            return;
        }

        // So first recursive call if coin do contribution in result
        coinCombinationWithCoinRespect(coins, currentCoinIndex, amount-coins[currentCoinIndex], result+coins[currentCoinIndex]);

        // Second recursive call if coin do not contribe in result
        coinCombinationWithCoinRespect(coins, currentCoinIndex+1, amount,result );
    }
}
