package com.practise.datastructure.map;

public class MapDriver {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
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
        map.put(11, "Nine");
        map.put(12, "Ten");
        map.put(13, "Ten");
        map.put(14, "Ten");


        //map.display();
        System.out.println(map.get(11));
        map.display();
        //map.put(1, "Onee");

    }
}
