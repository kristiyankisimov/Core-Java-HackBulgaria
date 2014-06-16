package com.hackbulgaria.corejava;

public interface Stack<E> {
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
    void clear();
    int size();
}
