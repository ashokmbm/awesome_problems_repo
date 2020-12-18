package com.practise.datastructure.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Print all the subsequences of a string in lexicographical order.
 *
 * Input Format
 * First line contains an integer N, the no of strings.
 * Next, N lines follows one string per line.
 *
 * Constraints
 * 1 < len(str) < 20
 *
 * Output Format
 * No of subsequences one per line
 *
 * Sample Input
 * 1
 * ab
 * Sample Output
 *
 * a
 * ab
 * b
 * Explanation
 * 4 subsequences are printed.
 * Empty string is a subsequence.
 */
public class QLexicographicalOrderSubSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<String> inputArray = new ArrayList<String>();
        int n = keyboard.nextInt();
        keyboard.nextLine();
        for(int i = 0; i<n ;i++) {
            String input = keyboard.nextLine();
            inputArray.add(input);
        }

        for(String input : inputArray) {
            Set<String> set = new TreeSet<String>();
            if(input.length() > 1 && input.length() <20) {
                getSubSequence(input, "", 0, set);
                for(String str : set ){
                    System.out.println(str);
                }
            }
        }
    }

    public static void getSubSequence(String input, String result, int index , Set<String> set) {
        if(index == input.length()){
            //System.out.println(result);
            set.add(result);
            return;
        }
        getSubSequence(input, result, index +1, set);
        getSubSequence(input, result+input.charAt(index), index +1, set);
    }
}
