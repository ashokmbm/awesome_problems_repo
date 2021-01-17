package com.practise.datastructure.map;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        // Demonstaration of different methods of hashmap
        Map<Integer,String> map = new HashMap<Integer, String>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");

        System.out.println("keys: "+map.keySet());
        System.out.println("values: "+map.values());

        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println("key: "+entry.getKey() + " value: "+entry.getValue());
        }

    }
}
