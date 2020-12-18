package com.practise.datastructure.recursion;

// We need to count all possible path from given starting point to end point on snack board
public class CountBoardPath {
    public static void main(String[] args) {
        System.out.println(countBoardPath(0, 10));
    }

    public static  int countBoardPath(int cr, int end) {
        if(cr == end) {
            return 1;
        }
        if (cr > end) {
            return 0;
        }
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        // Below code is for understanding we need not to write 6 recursive calls like this just use loop as used in comment
                count1 = count1 + countBoardPath(cr+1, end);
                count2 = count2 + countBoardPath(cr+2, end);
                count3 = count3 + countBoardPath(cr+3, end);
                count4 = count4 + countBoardPath(cr+4, end);
                count5 = count5 + countBoardPath(cr+5, end);
                count6 = count6 + countBoardPath(cr+6, end);

                count = count1 + count2 + count3 + count4 + count5 + count6;


        /*
        for(int dice = 1; dice <=6 ; dice++) {
            count = count + countBoardPath(cr+dice, end);
        }
        */

        return count;
    }
}
