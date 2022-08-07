package com.sergax.tasks.data_structure.stack;

import java.util.Arrays;

/**
 * @author: sergax
 * @date: 01.08.22
 */
public class StackImpl implements Stack {
    private static final int MAX_SIZE = 10;
    private int[] stack = new int[MAX_SIZE];
    private int index = 0;

    private void doubleSizeofCapacity() {
        int newCapacity = stack.length * 2;
        stack = Arrays.copyOf(stack, newCapacity);
    }

    private void checkIfArrayFull() {
        if (index == stack.length)
            doubleSizeofCapacity();
    }

    private void checkIfArrayEmpty() {
        if (index == 0) throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public void push(int value) {
        checkIfArrayFull();
        stack[index] = value;
        index++;
    }

    @Override
    public int pop() {
        checkIfArrayEmpty();
        int result = stack[index - 1];
        stack[index - 1] = 0;
        index--;
        return result;
    }

    @Override
    public int peek() {
        checkIfArrayEmpty();
        return stack[index - 1];
    }

    @Override
    public int sizeOfStack() {
        return index;
    }

    @Override
    public String toString() {
        return "stack: " + Arrays.toString(stack) +
                "\nsize:" + index;
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(5);
        stack.push(15);
        stack.push(52);
        stack.push(57);
        stack.push(57);
        stack.push(57);
        stack.push(57);
        stack.push(57);
        stack.push(57);
        stack.push(57);
        stack.push(57);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
