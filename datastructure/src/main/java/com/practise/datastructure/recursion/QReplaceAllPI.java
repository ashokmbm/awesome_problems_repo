package com.practise.datastructure.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Replace all occurrences of pi with 3.14
 *
 * Input Format
 * Integer N, no of lines with one string per line
 *
 * Constraints
 * 0 < N < 1000
 * 0 <= len(str) < 1000
 *
 * Output Format
 * Output result one per line
 *
 * Sample Input
 * 3
 * xpix
 * xabpixx3.15x
 * xpipippixx
 * Sample Output
 * x3.14x
 * xab3.14xx3.15x
 * x3.143.14p3.14xx
 * Explanation
 * All occurrences of pi have been replaced with "3.14".
 *
 */
public class QReplaceAllPI {
    public static void main(String[] args) {
       // Scanner s1 = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        List<String> teamsArray = new ArrayList<String>();
        QReplaceAllPI obj = new QReplaceAllPI();

        int n = keyboard.nextInt();
        if(n<=0 || n>=1000) {
            return;
        }
        keyboard.nextLine();
        for (int i = 0; i< n ; i++){
            String input = keyboard.nextLine();
            teamsArray.add(input);

        }

        for(String input : teamsArray) {
            if(n >0 && n<1000 && input != null && input.length() >=0 && input.length() <1000){
                System.out.println(obj.replacePI(input));
            }
        }
    }

    public String replacePI(String str) {
        if (str.length() <= 1 ) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            return "3.14"+replacePI(str.substring(2));
        }
        return str.charAt(0)+replacePI(str.substring(1));
    }
}
