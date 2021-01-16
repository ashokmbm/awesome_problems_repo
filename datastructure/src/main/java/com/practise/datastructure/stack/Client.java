package com.practise.datastructure.stack;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        IStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        //stack.display();

        System.out.println(stack.pop());
        //stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // stack.display();

         stack.push(10);
         stack.display();


    }
}
