package com.practise.datastructure.array;

import com.practise.datastructure.utility.ArrayUtility;

/**
 * Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is :
 *
 * Reverse A to get ArB, where Ar is reverse of A.
 * Reverse B to get ArBr, where Br is reverse of B.
 * Reverse all to get (ArBr) r = BA.
 *
 */

public class ArrayRotationByReversal {
    public static void main(String[] args) {
        ArrayRotationByReversal obj = new ArrayRotationByReversal();
        int arr[] = {1,2,3,4,5,6,7};
        ArrayUtility.printArray(arr);
        obj.reverseArray(arr, 0, 2);
        ArrayUtility.printArray(arr);
        obj.reverseArray(arr, 3,arr.length-1);
        ArrayUtility.printArray(arr);
        obj.reverseArray(arr, 0, arr.length -1);
        ArrayUtility.printArray(arr);
    }


    public void reverseArray(int[] arr, int startIndex, int lastIndex) {
        while(startIndex < lastIndex) {
            swapArrayElement(arr, startIndex, lastIndex);
            startIndex++;
            lastIndex--;
        }
    }

    public void swapArrayElement(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
