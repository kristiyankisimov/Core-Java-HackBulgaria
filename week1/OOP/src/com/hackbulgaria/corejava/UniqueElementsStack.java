package com.hackbulgaria.corejava;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElementsStack<E> implements Stack<E> {

    private ArrayList<E> stack;

    public UniqueElementsStack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(E element) {
        if (!stack.contains(element)) {
            stack.add(element);
        } else {
            System.out.println("Stack contains a given element!!!");
        }
    }

    @Override
    public E pop() {
        return stack.remove(stack.size() - 1);
    }

    @Override
    public E peek() {
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void clear() {
        stack.clear();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }

}
