package com.practise.datastructure.array;

public class SeggregateZero {
    public static void main(String[] args) {
        SeggregateZero obj = new SeggregateZero();
        int[] arr = {1,0,3,4,0,5,0,0,0,5};
        obj.seggregateZero(arr);
    }

    public void seggregateZero(int[] arr) {
        int i = 0;
        int j = arr.length -1;
        while ( i < j) {
            while(arr[i] != 0){
                i++;
            }
            while(arr[j] == 0) {
                j--;
            }
            swap(arr, i, j);
            i++;  j--;
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
