package com.hackbulgaria.corejava.exam1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLogger extends Logger {

    @Override
    public void log(int l, String message) {
        // TODO Auto-generated method stub
        super.setLevel(l);
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        Date date = new Date();
        System.out.println(String.format("|%s| %d => %s", dateFormat.format(date), l, message));

    }

    @Override
    public void log(String message) {
        // TODO Auto-generated method stub
        super.setLevel(3);
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        Date date = new Date();
        System.out.println(String.format("|%s| %d => %s", dateFormat.format(date), 3, message));

    }

}
