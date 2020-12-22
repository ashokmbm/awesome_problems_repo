package com.practise.datastructure.recursion;

public class PrintTable {
    public static void main(String[] args) {
        PrintTable p = new PrintTable();
        p.print(2, 1, 100);
    }

    public void print(int n, int counter, int steps) {
        if (counter > steps) {
            return;
        }
        System.out.println(n * counter);
        print(n, ++counter, steps);
    }
}