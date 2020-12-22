package com.practise.datastructure.recursion;

/*
   _________________________
   |_13__|_14__|_15__|_16__|
   |_12__|_11__|_10__|_09__|
   |_05__|_06__|_07__|_08__|
00 |_01__|_02__|_03__|_04__|

We are at 0 position (extra 0 added for formatting ignore it) , we have a dice which can give us 1 to 6 , we can move accordingly.
Objective is to reach at position 10 by rolling dice. We need to find all the possible way by which we can reach from 0 to 10

sample way like 22222,145,46,55,244,343 and many more.

Soultuion  -here we have choices of dice it can be 1 to 6 so we actually have 6 subtree. we need to trust of recursion
and assume that recursion is providing all the path from 1 to 10 we just need to append 1 on these paths.
Similarly if dice = 2 then we assume that method is already giving us path from 2 to 10 we just need to append 2 to get all path
from  0 to 10.
*/

import java.util.ArrayList;
import java.util.List;

public class GetBoardPath {
    public static void main(String[] args) {
        System.out.println(getAllBoardPath(0, 20));
        System.out.println(getAllBoardPath(0, 20).size());
    }

    public static List<String> getAllBoardPath(int curr, int end) {
        // negative base case
        if (curr > end) {
            return new ArrayList<String>();
        }
        //positive base case
        if (curr == end) {
            List<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }

        List<String> finalResult = new ArrayList<String>();

        // Below code can be written in one for loop i = 0 to 6, but I written in detail so that it will be easy to understand
        // if dice value is 1 then added 1 to all path from 1 to 10
        List<String> rr1 = getAllBoardPath(curr + 1, end);
        for (String s : rr1) {
            finalResult.add("1" + s);
        }

        // if dice value is 2 then added 2 to all path from 2 to 10
        List<String> rr2 = getAllBoardPath(curr + 2, end);
        for (String s : rr2) {
            finalResult.add("2" + s);
        }

        // if dice value is 3 then added 3 to all path from 3 to 10
        List<String> rr3 = getAllBoardPath(curr + 3, end);
        for (String s : rr3) {
            finalResult.add("3" + s);
        }

        // if dice value is 4 then added 4 to all path from 4 to 10
        List<String> rr4 = getAllBoardPath(curr + 4, end);
        for (String s : rr4) {
            finalResult.add("4" + s);
        }

        // if dice value is 5 then added 5 to all path from 5 to 10
        List<String> rr5 = getAllBoardPath(curr + 5, end);
        for (String s : rr5) {
            finalResult.add("5" + s);
        }

        // if dice value is 6 then added 6 to all path from 6 to 10
        List<String> rr6 = getAllBoardPath(curr + 6, end);
        for (String s : rr6) {
            finalResult.add("6" + s);
        }
        return finalResult;
    }
}
