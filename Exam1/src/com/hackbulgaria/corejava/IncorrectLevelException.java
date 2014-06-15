package com.hackbulgaria.corejava;

@SuppressWarnings("serial")
public class IncorrectLevelException extends RuntimeException {
    public IncorrectLevelException() {
        super("Given non-positive level!");
    }
}
