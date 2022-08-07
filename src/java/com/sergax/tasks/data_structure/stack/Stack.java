package com.sergax.tasks.data_structure.stack;

/**
 * @author: sergax
 * @date: 31.07.22
 *
 * push(int value) -> push a new value on top of the steak, if stack is full u'll have to make a bigger one
 * int pop() -> remove and returns the value from the top
 * int peek() -> only returns the value
 * int size() -> size of the stack
 */
public interface Stack {
    void push(int value);
    int pop();
    int peek();
    int sizeOfStack();
}
