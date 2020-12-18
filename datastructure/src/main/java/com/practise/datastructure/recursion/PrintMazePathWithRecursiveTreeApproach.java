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

public class PrintMazePathWithRecursiveTreeApproach {
    public static void main(String[] args) {
        printMazePath(0, 0, 2, 2, "");
    }

    public static void printMazePath(int cr, int cc, int er, int ec, String output) {
        if(cr == er && cc == ec) {
            System.out.println(output);
            return;
        }

        // -ve base case
        if(cr > er || cc > ec) {
            return ;
        }

        // Here we have only 2 choices either move H or move V so making two recursive calls
        printMazePath(cr, cc+1, er, ec, output+"H");
        printMazePath(cr+1, cc, er, ec, output+"V");
    }
}
