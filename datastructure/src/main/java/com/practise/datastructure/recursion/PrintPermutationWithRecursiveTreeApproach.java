package com.practise.datastructure.recursion;

public class PrintPermutationWithRecursiveTreeApproach {
    public static void main(String[] args) {
        permutation("abc", "");
    }

    public static  void permutation(String input, String output) {
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }

        for(int i =0 ; i < input.length(); i++) {
            // Fetch character which will be include in next recursive call output
            char currentChar = input.charAt(i);

            // Remove currentCharacter from input string because it is already added to output
            // Getting rest of input string
            String smallerInput = input.substring(0,i) + input.substring(i+1,input.length());

            String outputForNextRecusrsiveCall = output+currentChar;
            permutation(smallerInput, outputForNextRecusrsiveCall);
        }
        return;
    }
}
