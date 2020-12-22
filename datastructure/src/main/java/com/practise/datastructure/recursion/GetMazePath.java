package com.practise.datastructure.recursion;

/*
 _0____1____2_____
0 |___|____|___|
1 |___|____|___|
2 |___|____|___|

Question - Start position is 0,0 and end position is 2,2.
User can move one step right or one step down from 0,0.
One step right will be represented as R.
One step down will be represented as L.
get array list of all paths from 0,0 to 2,2 for eg RRDD, DRDR,DDRR etc.
*/

import java.util.ArrayList;
import java.util.List;
/*
    @author - Ashok Singh
 */

public class GetMazePath {
    public static void main(String[] args) {
        List<String> list = getAllMazePath(0, 0, 2, 2);
        System.out.println(list);
    }

    public static List<String> getAllMazePath(int curRow, int curCol, int endRow, int endCol) {
        /*
         This problem can be divide in two smaller problem by thinking about immediate steps which can be taken from 0,0.
         From 0,0 we can take a R move and come to 0,1 or from 0,0 we can take a D move and reach at 1,0
                             (0,0)
                             /    \
                          R /      \ D
                subtree1 (0,1)   (1,0) subtree2

         Now we need to rely on recursion and assume that subtree1 and subtree2 will give all paths from (0,1) to (2,2) and (1,0) to (2,2)
         So from (0,0) to (2,2) will be R + all paths from subtree1
         similarly (0,0) to (2,2) will be D + all paths from subtree2

        */

        // Negative Base case
        if (curCol > endCol || curRow > endRow) {
            return new ArrayList<String>();
        }

        // positive base case

        if (curCol == endCol && curRow == endRow) {
            List baseResult = new ArrayList<String>();
            baseResult.add("");
            return baseResult;
        }

        List myResult = new ArrayList<String>();

        List<String> rightMoveRecResult = getAllMazePath(curRow, curCol + 1, endRow, endRow);
        // Add R to list
        for (String s : rightMoveRecResult) {
            myResult.add("R" + s);
        }

        List<String> downMoveRecResult = getAllMazePath(curRow + 1, curCol, endRow, endRow);
        // Add D to list
        for (String s : downMoveRecResult) {
            myResult.add("D" + s);
        }

        return myResult;
    }
}

