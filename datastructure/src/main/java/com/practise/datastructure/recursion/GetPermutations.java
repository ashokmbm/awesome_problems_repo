package com.practise.datastructure.recursion;

import java.util.ArrayList;
import java.util.List;

public class GetPermutations {
    public static void main(String[] args) {
        System.out.println(getPermutations("abc"));
    }

    public static List<String> getPermutations(String str) {

        if (str.length() == 1) {
            List<String> baseResult = new ArrayList<String>();
            baseResult.add(str);
            return baseResult;
        }

        char ch = str.charAt(0);
        List<String> myResult = new ArrayList<String>();
        List<String> recRes = getPermutations(str.substring(1));

        for (String element : recRes) {
            for (int i = 0; i <= element.length(); i++) {
                String s = element.substring(0, i) + ch + element.substring(i, element.length());
                myResult.add(s);
            }
        }

        return myResult;
    }
}
