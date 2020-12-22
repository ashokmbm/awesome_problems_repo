package com.practise.datastructure.recursion;

import java.util.Scanner;

/**
 * Take as input N, the size of an integer array. Take one more input, which is a list of N integers separated by a space, and store that in an array. Write a recursive function which prints true if the array is sorted, and false otherwise.
 * <p>
 * Input Format
 * N x y z
 * <p>
 * Constraints
 * 1 < N < 1000
 * -10^9 < i < 10^9, where i is an element of the array
 * <p>
 * Output Format
 * true OR false
 * <p>
 * Sample Input
 * 5
 * 1 2 3 4 5
 * Sample Output
 * true
 */


public class QCheckArraySortedAscending {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           int input = keyboard.nextInt();
           arr[i] = input;
        }
        if(n >1 && n <1000) {
            System.out.println(checkIfArraySorted(arr, 0));
        }
    }

    public static boolean checkIfArraySorted(int[] arr, int index) {
        if (index == arr.length - 2) {
            return arr[index] <= arr[index + 1];
        }
        return arr[index] <= arr[index + 1] && checkIfArraySorted(arr, index + 1);
    }
}
