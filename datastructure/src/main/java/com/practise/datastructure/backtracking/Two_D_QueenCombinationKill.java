package com.practise.datastructure.backtracking;

/**
 * Variation of N Queen problem, one queen can kill other queen diagonaly, horizontally, vertically.
 * We need to place queen only if queen is safe to place in box.
 * A queen can have danger at-
 * right upper diagonal, left upper diagonal, vertically up side, horizontally left.
 * We need to check in isSafe method for above 4 sides
 */


public class Two_D_QueenCombinationKill {
    public static void main(String[] args) {
        twoDQueenCombinationKill(new boolean[4][4], 0,0,4,0,"");
    }

    public static void twoDQueenCombinationKill(boolean[][] board, int row, int col, int totalQueen, int queenPlaced, String res) {
        /**
         * Here each box having two choices
         * Either queen can place in box
         * Or queen can not place in box
         * But some before placing box we will check if the position is safe or not
         */

        // +ve base case
        if (totalQueen ==  queenPlaced) {
            System.out.println(res);
            return;
        }

        // Out of boundary case
        if(col == board[row].length) {
            row++;
            col=0;
        }

        // -ve base case
        if(row == board.length){
            return;
        }
        // Place call
        if(isSafe(board, row,col)) {
            board[row][col] = true;
            twoDQueenCombinationKill(board,row,col+1, totalQueen, queenPlaced+1,res+" Q"+queenPlaced+"B["+row+"]["+col+"] ");
            board[row][col] =false;
        }

        twoDQueenCombinationKill(board,row,col+1, totalQueen, queenPlaced,res);
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        int r = row;
        int c = col;
        // check vertically up side
        while (r >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
        }

        // Resetting r and c to actual row and col position after checking at one side
        r = row;
        c = col;

        // Checking at right upper diagnoal

        while (r >= 0 && c < board[row].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        // Again resetting r and c to actual row and col
        r = row;
        c = col;
        // checking left upper diagonal
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // Again resetting r and c to actual row and col
        r = row;
        c = col;
        // checking left horizontal
        while ( c >= 0) {
            if (board[r][c]) {
                return false;
            }
            c--;
        }

        return true;
    }
}
