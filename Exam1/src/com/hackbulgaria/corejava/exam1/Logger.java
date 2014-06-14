package com.hackbulgaria.corejava.exam1;

public class Logger {
    private int level;

    public Logger() {
        setLevel(3);
    }

    public Logger(int level) {
        setLevel(level);
    }

    public void setLevel(int level) {
        this.level = (level > 0) ? level : 3;
    }

    public void log(int l, String message) {
        if (l <= level) {
            System.out.println(String.format("%d => %s", l, message));
        }
    }

    public void log(String message) {
        log(3, message);
    }

}
