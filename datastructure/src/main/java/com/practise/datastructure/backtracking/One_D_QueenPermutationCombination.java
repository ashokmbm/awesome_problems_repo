package com.practise.datastructure.backtracking;

/**
 * There are n boxes can and x number of queens. We need to find all possible arrangements
 * by which x queens can arrange in n boxes.
 * eg. suppose there are 4 boxes (b0,b1,b2,b3) and 2 queens(q0,q1) print arrangements like
 * q0b0-q1b1, q0b0-q1b2, q0b0-q1b3 etc
 * There can be 12 possible arrangements we need to print all
 */
public class One_D_QueenPermutationCombination {
    /**
     * We can take a boolean array for boxes by default each element in array is false
     * We will mark positions true when we place a queen at box and print the positions
     */
    public static int counter = 1;

    public static void main(String[] args) {
        boolean[] boxes = new boolean[4];
        // printQueenPermutaiton(boxes, 2, 0, "");
        printQueenCombination(boxes, 2, 0, "", -1);
    }

    public static void printQueenPermutaiton(boolean[] boxes, int totalQueens, int totalQueensPlacedSoFar, String output) {
        if (totalQueens == totalQueensPlacedSoFar) {
            System.out.println(counter++ + " - " + output);
            return;
        }

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == false) {
                boxes[i] = true;
                printQueenPermutaiton(boxes, totalQueens, totalQueensPlacedSoFar + 1, output + "Q" + totalQueensPlacedSoFar + "B" + i + " ");
                boxes[i] = false;
            }
        }
    }

    public static void printQueenCombination(boolean[] boxes, int totalQueens, int totalQueenPlacedSoFar, String output, int lastBoxIndex) {
        /**
         * In combination we need to eliminate permutaion like q0b0-q1b1  <==> q0b1-q1b0 , we need to keep only one
         */
        if (totalQueens == totalQueenPlacedSoFar) {
            System.out.println(output);
            return;
        }

        for (int i = lastBoxIndex + 1; i < boxes.length; i++) {
            boxes[i] = true;
            printQueenCombination(boxes, totalQueens, totalQueenPlacedSoFar + 1, output + "Q" + totalQueenPlacedSoFar + "B" + i + " ", i);
            boxes[i] = false;
        }
    }
}
