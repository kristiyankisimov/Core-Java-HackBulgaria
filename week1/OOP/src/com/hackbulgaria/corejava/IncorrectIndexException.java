package com.hackbulgaria.corejava;

@SuppressWarnings("serial")
public class IncorrectIndexException extends RuntimeException {
    public IncorrectIndexException() {
        super("Given index is not correct.");
    }
}
