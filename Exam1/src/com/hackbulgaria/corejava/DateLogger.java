package com.hackbulgaria.corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLogger extends Logger {

    public DateLogger() {
        super(Integer.MAX_VALUE);
    }

    public DateLogger(int level) {
        super(level);
    }

    @Override
    public void log(int level, String message) {
        if (level <= getLevel()) {
            System.out.printf("|%s| %d => %s\n", getFormattedDate(), level, message);
        }
    }

    @Override
    public void log(String message) {
        if (3 <= getLevel()) {
            System.out.printf("|%s| 3 => %s\n", getFormattedDate(), message);
        }
    }

    private String getFormattedDate() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        return dateFormat.format(new Date());
    }
}
