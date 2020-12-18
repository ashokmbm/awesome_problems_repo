package com.practise.datastructure.array;

import com.practise.datastructure.utility.ArrayUtility;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements
 * eg. 1,2,3,4,5,6,7 -> rotate(arr, 2, 7)
 * Result -> 3,4,5,6,7,1,2
 */
public class ArrayRotation {
    public static void main(String[] args) {
        ArrayRotation obj = new ArrayRotation();
        int[] arr = {1,2,3,4,5,6,7};
        ArrayUtility.printArray(arr);
        obj.rotateArray(arr, 2);
        ArrayUtility.printArray(arr);
    }

    public void rotateArray(int[] arr, int d) {
        // Rotate one by one
        for(int i =0; i<d ; i++) {
         singleRotation(arr);
        }
    }

    public void singleRotation(int[] arr) {
        int temp = arr[0];
        for(int i =0 ; i<arr.length -1;i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
}
