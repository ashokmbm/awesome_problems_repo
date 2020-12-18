package com.practise.datastructure.array;

import java.util.HashMap;
import java.util.Map;

public class RearrangeArray {
    public static void main(String[] args) {
        RearrangeArray obj = new RearrangeArray();
        int arr1[] = {1,2,5,0,-1,3,6,8,-1};
        obj.rearrangeByMap(arr1);
    }

    public void rearrangeByMap(int arr[]) {
        Map<Integer,Boolean> map = new HashMap<Integer, Boolean>();
        for (int i =0; i < arr.length ; i++) {
            if(arr[i]>=0) {
                map.put(arr[i],true);
            }
            else {
                map.put(arr[i],false);
            }

        }
        for(int i=0; i<arr.length ; i++) {
            if(map.get(i)!= null && map.get(i)){
                System.out.print(" "+i+" ");
            }
            else {
                System.out.print(" "+-1+" ");
            }
        }
    }
}
