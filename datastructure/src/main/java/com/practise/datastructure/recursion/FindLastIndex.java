package com.practise.datastructure.recursion;

public class FindLastIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,2,6};
        //System.out.println(findLastIndex(0, arr, 8));
        System.out.println("".substring(1));
    }

    public static int findLastIndex(int current, int[] arr, int data) {
        if(current == arr.length ){
            return -1;
        }
        int rr = findLastIndex(current + 1, arr, data);

        if (rr == -1) {
            if (arr[current] == data) {
                return current;
            }
        }

        return rr;
    }
}
