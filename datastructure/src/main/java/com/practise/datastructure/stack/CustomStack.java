package com.practise.datastructure.stack;

public class CustomStack implements IStack {
    private Integer[] array;
    private int top;
    private static int DEFAULT_CAPACITY = 5;

    CustomStack() {
        this(DEFAULT_CAPACITY);
    }

    CustomStack(int capacity) {
        this.array = new Integer[capacity];
        this.top = -1;
    }


    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public Integer push(Integer item) {
        if (this.top == this.array.length - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        this.top++;
        array[this.top] = item;
        return item;
    }

    @Override
    public Integer pop() {
        if (this.top == -1) {
            throw new RuntimeException("Stack Empty");
        }
        Integer item = this.array[this.top];
        this.array[this.top] = null;
        this.top--;
        return item;
    }

    @Override
    public Integer peek() {
        if (top == -1) {
            throw new RuntimeException("Stack Empty");
        }
        return this.array[this.top];
    }

    @Override
    public Integer search(Integer item) {
        if (top == -1) {
            throw new RuntimeException("Stack Empty");
        }

        for (int i = 0; i <= top; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        System.out.println("TOP: " + this.top);
        if (top == -1) {
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(" " + array[i] + " ");
        }

        System.out.println();
    }
}

