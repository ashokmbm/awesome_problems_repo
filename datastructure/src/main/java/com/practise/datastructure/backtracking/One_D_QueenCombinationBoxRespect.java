package com.practise.datastructure.backtracking;

/**
 * Here we need to find all possible combination to place N queens in a 1D board of length M
 * for example 2 queens in 4 boxes. But we need to think respect to box.
 * Each box have 2 choices either queen can place in box or queen cannot place in box.
 */
public class One_D_QueenCombinationBoxRespect {
    public static void main(String[] args) {
        queenCombinationWithBoxRespect(new boolean[4], 0, 2, 0, "");
    }

    public static void queenCombinationWithBoxRespect(boolean boxes[], int currentIndex, int totalQueen, int queenPlaced, String result) {
        if (totalQueen == queenPlaced) {
            System.out.println(result);
            return;
        }

        if (currentIndex == boxes.length) {
            return;
        }
        // place the queen in box
        boxes[currentIndex] = true;
        queenCombinationWithBoxRespect(boxes, currentIndex + 1, totalQueen, queenPlaced + 1, result + "B" + currentIndex + "Q" + queenPlaced + " ");
        // explicitly undo changes when this recursive call complete
        boxes[currentIndex] = false;

        // Queen not place in box recursive call
        queenCombinationWithBoxRespect(boxes, currentIndex + 1, totalQueen, queenPlaced, result);
    }
}
