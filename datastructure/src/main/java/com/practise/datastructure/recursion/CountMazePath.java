package com.practise.datastructure.recursion;

public class CountMazePath {
    public static void main(String[] args) {
        System.out.println(countMazePath(0,0,2,2));
    }

    public static  int countMazePath(int cr, int cc, int er, int ec) {
        if (cr == er & cc == ec) {
            return 1;
        }

        if (cr > er || cc > ec) {
            return 0;
        }

        int count1 = countMazePath(cr+1, cc, er, ec);
        int count2 = countMazePath(cr, cc+1, er, ec);
        return count1 + count2;
    }
}
