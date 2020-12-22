package com.practise.datastructure.backtracking;

/**
 * We have a box of size M X N. WE need to find all combination-
 * in which x numbers of queens can place in board.
 */

/**
 * Solution is similar to one D board, each box haivng two choices either queen can place in box or not.
 * But here when we move right in row by incrementing colomn at last we will reach out of boundary.
 * That time we need not to return we need to reach at next row.
 * Move from out of boundary to next row can be done in two way
 * First is manually update row and col variable.
 * Second by giving extra recursive call with row+1, col = 0
 */

public class Two_D_QueenCombination {
    public static void main(String[] args) {
        twoDQueenCombination(new boolean[2][2], 0, 0, 2, 0, "");
    }

    public static void twoDQueenCombination(boolean board[][], int row, int col, int totalQueen, int queenPlaced, String result) {
        // Note sequence of +ve base case , -ve base case and other case like out of boundary is very imp.
        // It can define by debugging the issue.

        // +ve base case
        if (totalQueen == queenPlaced) {
            System.out.println(result);
            return;
        }

        // Handle Out of boundary condition by manually updating variables
        /*
        if(col == board[row].length) {
            row = row+1;
            col = 0;
        } */

        // -ve base case sequence can define after debug the program
        if (row == board.length) {
            return;
        }

        // Handle Out of boundary condition by manually updating variables
        if (col == board[row].length) {
            twoDQueenCombination(board, row + 1, 0, totalQueen, queenPlaced, result);
            return;
        }


        // Recursive call for queen can place in box
        board[row][col] = true;
        twoDQueenCombination(board, row, col + 1, totalQueen, queenPlaced + 1, result + "Q" + queenPlaced + " B[" + row + "][" + col + "] ");
        board[row][col] = false;
        // Recursive call for queen can not place in box
        twoDQueenCombination(board, row, col + 1, totalQueen, queenPlaced, result);
    }
}
