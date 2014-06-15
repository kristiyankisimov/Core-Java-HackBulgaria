package com.hackbulgaria.corejava;

public class Logger {
    private int level;

    public Logger() {
        setLevel(3);
    }

    public Logger(int level) {
        setLevel(level);
    }

    public void setLevel(int level) {
        if (level > 0) {
            this.level = level;
        } else {
            throw new IncorrectLevelException();
        }
    }

    public int getLevel() {
        return level;
    }

    public void log(int l, String message) {
        if (l <= level) {
            System.out.printf("%d => %s\n", l, message);
        }
    }

    public void log(String message) {
        log(3, message);
    }

}
