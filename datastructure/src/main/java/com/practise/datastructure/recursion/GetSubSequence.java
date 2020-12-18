package com.practise.datastructure.recursion;

import java.util.ArrayList;
import java.util.List;

public class GetSubSequence {
    public static void main(String[] args) {
        System.out.println(getSubSequences("abc"));
    }

    // subsets and subSequences are same I guess :D
    public static List<String> getSubSequences(String str) {
        // base case
        if(str.length() == 0) {
            List baseResult = new ArrayList<String >();
            baseResult.add("");
            return baseResult;
        }
        char c = str.charAt(0);
        List<String> myResult = new ArrayList<String>();
        List<String> recursionResult = getSubSequences(str.substring(1));

        for (String element: recursionResult) {
            myResult.add(element);
            myResult.add(c+element);
        }

        return myResult;
    }
}
