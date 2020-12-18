package com.practise.datastructure.backtracking;

/**
 * Unlimited coins of 2,3,4,5,6 are given.
 * we need to find the coins arrangements by which sum of N rupees can be made.
 */
public class CoinsPermutationCombination {
    public static void main(String[] args) {
        int[] coins = {2,3,4,5,6};
        //coinPermutation(coins, 10, "");
        coinCombination(coins, 10, "", 0);
    }

    public static void coinPermutation(int[] coins, int amount, String result) {
        if (amount == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            if(amount >= coins[i]) {
                coinPermutation(coins, amount - coins[i], result+coins[i]);
            }
        }
    }

        public static void coinCombination(int[] coins, int amount, String result, int lastIndexUsed) {
            if (amount == 0) {
                System.out.println(result);
                return;
            }

            for (int i = lastIndexUsed; i < coins.length; i++) {
                if(amount >= coins[i]) {
                    coinCombination(coins, amount - coins[i], result+coins[i], i);
                }
            }
        }
    }

