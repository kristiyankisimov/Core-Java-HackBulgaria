package com.hackbulgaria.corejava;

import java.util.ArrayList;
import java.util.Arrays;

public class StackImpl<E> implements Stack<E> {

    private ArrayList<E> stackArray;

    public StackImpl() {
        stackArray = new ArrayList<>();
    }

    @Override
    public void push(E element) {
        stackArray.add(element);
    }

    @Override
    public E pop() {
        return stackArray.remove(stackArray.size() - 1);
    }

    @Override
    public E peek() {
        return stackArray.get(stackArray.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stackArray.isEmpty();
    }

    @Override
    public void clear() {
        stackArray.clear();
    }

    @Override
    public int size() {
        return stackArray.size();
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray.toArray());
    }

}
