package com.hackbulgaria.corejava;

@SuppressWarnings("serial")
public class EmptyLinkedListException extends RuntimeException{
    public EmptyLinkedListException() {
        super("Linked list is empty.");
    }
}
