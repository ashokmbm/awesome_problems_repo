package com.practise.datastructure.recursion;

import java.util.Arrays;
import java.util.List;

public class FindAllIndices {
    public static void main(String[] args) {
        // [0,1,2,3,4,5]
        int arr[] = {2,4,2,3};
        int result[] = findAllIndicies(arr, 2, 0, 0);
        List n = Arrays.asList(result);
        System.out.println(n.get(0));
    }

    public static int[] findAllIndicies(int input[], int data, int currentIndex, int matches) {
        // Base case
        if(currentIndex == input.length) {
            // create a blank array of size of matches found
            return new int[matches];
        }

        int[] recursionResult = null;

        if(input[currentIndex] == data){
            recursionResult = findAllIndicies(input, data,currentIndex+1 , ++matches);
        }
        else {
            recursionResult = findAllIndicies(input, data, currentIndex+1, matches);
        }

        if(input[currentIndex] == data) {
            recursionResult[matches-1] = currentIndex;
        }

        return recursionResult;
    }
}
