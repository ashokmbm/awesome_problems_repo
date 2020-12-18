package com.practise.datastructure.recursion;

/*
 *   input a,b,c output Abc, aBc, abC, ABc, aBC, ABC
 *  solved using input output recursive tree approach
 */

public class PrintPermutationWithLetterCase {
    public static void main(String[] args) {
        permutationLetterCase("abc", "");
    }

    public static void permutationLetterCase(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        char currentChar = input.charAt(0);
        String op1 = output+currentChar;
        String op2 = output + String.valueOf(currentChar).toUpperCase();
        permutationLetterCase(input.substring(1), op1 );
        permutationLetterCase(input.substring(1), op2 );
    }
}
