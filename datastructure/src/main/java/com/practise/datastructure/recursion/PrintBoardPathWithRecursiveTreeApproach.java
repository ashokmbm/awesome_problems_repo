package com.practise.datastructure.recursion;

/*
        _________________________
        |_13__|_14__|_15__|_16__|
        |_12__|_11__|_10__|_09__|
        |_05__|_06__|_07__|_08__|
     00 |_01__|_02__|_03__|_04__|

        We are at 0 position (extra 0 added for formatting ignore it) , we have a dice which can give us 1 to 6 , we can move accordingly.
        Objective is to reach at position 10 by rolling dice. We need to find all the possible way by which we can reach from 0 to 10

        sample way like 22222,145,46,55,244,343 and many more.

 */

public class PrintBoardPathWithRecursiveTreeApproach {
    public static void main(String[] args) {
        printBoardPath(0, 6, "");
    }

    public static void printBoardPath(int cur, int end, String output) {
        if (cur == end) {
            System.out.println(output);
            return;
        }

        // -ve base case
        if (cur > end) {
            return;
        }
        // Making 6 recursive calls for as we have 6 choices
        // In each call we will add the dice value in result
        for (int dice = 1; dice <= 6; dice++) {
            printBoardPath(cur + dice, end, output + dice);
        }
    }
}
