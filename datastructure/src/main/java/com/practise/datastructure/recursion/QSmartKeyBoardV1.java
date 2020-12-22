package com.practise.datastructure.recursion;

/**
 * You will be given a numeric string S. Print all the possible codes for S.
 * <p>
 * Following vector contains the codes corresponding to the digits mapped.
 * <p>
 * string table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
 * <p>
 * For example, string corresponding to 0 is " " and 1 is ".+@$"
 * <p>
 * Input Format
 * A single string containing numbers only.
 * <p>
 * Constraints
 * length of string <= 10
 * <p>
 * Output Format
 * All possible codes one per line in the following order.
 * <p>
 * The letter that appears first in the code should come first
 * <p>
 * Sample Input
 * 12
 * Sample Output
 * .a
 * .b
 * .c
 * +a
 * +b
 * +c
 *
 * @a
 * @b
 * @c $a
 * $b
 * $c
 * Explanation
 * For code 1 the corresponding string is .+@$ and abc corresponds to code 2.
 */

/**
 * Solution Hint - Design a input / output tree for choices. for example for input 23, 2 have 3 choices {a,b,c}
 * so three branch from 2 if first character is a then again we have 3 choices for 3 {d,e,f} so three branches for 3.
 * so this way we can draw a recursion tree and find all paths from start to end of tree.
 * <p>
 * Step1. Break problem into smaller problem.( Minimize the input in each step)
 * Step2. Try to create a input output tree or choice tree / recursive tree
 * Step3. If recursive tree generated successfully , F**K the problem smoothly :D :D
 */

public class QSmartKeyBoardV1 {
    public static void main(String[] args) {
        String[] table = {" ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String input = "1";
        int[] inputNumberArray = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            inputNumberArray[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        printCombination(input, table, "");
    }

    public static void printCombination(String input, String[] table, String result) {
        if (input.length() == 0) {
            System.out.println(result);
            return;
        }
        char[] choices = table[Integer.parseInt(String.valueOf(input.charAt(0)))].toCharArray();
        for (char c : choices) {
            printCombination(input.substring(1), table, result + c);
        }
    }
}
