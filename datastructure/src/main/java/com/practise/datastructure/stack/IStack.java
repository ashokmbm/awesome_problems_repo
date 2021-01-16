package com.practise.datastructure.stack;

public interface IStack {
    boolean empty();
    Integer push(Integer item);
    Integer pop();
    Integer peek();
    Integer search(Integer item);
    void display();
}
