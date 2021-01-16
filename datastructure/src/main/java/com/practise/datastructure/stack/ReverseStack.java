package com.practise.datastructure.stack;

/**
 *  Reverse a stack using a helper stack , but just pop from main stack and pop into helper and then change the reference is not allowed.
 *  Original stack must be reversed.
 */
public class ReverseStack {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        CustomStack helper = new CustomStack();
        stack.display();
        reverseStack(stack, helper, 0);
        stack.display();

    }

    public static  void reverseStack(CustomStack stack, CustomStack helper, int index) {
        if(stack.empty()){
            return;
        }
        if(stack.empty()){
            return;
        }
        int item = stack.pop();
        reverseStack(stack, helper, index+1);
        helper.push(item);
        if(index == 0) {
            while(!helper.empty()) {
                stack.push(helper.pop());
            }
        }
    }
}
