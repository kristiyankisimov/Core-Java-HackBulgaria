package com.hackbulgaria.corejava.TDD;

import java.util.Vector;

public class Problems {
    public int getNumberOfDigits(int n) {
        n = Math.abs(n);
        if (n >= 0 && n <= 9) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public String join(String glue, Object... args) {
        StringBuilder builder = new StringBuilder();
        if (args.length == 0) {
            return "";
        }
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                builder.append(args[i].toString());
            } else {
                builder.append(args[i].toString() + glue);
            }
        }
        return builder.toString();
    }

    public String reduceFilePath(String path) {
        String[] parts = path.split("/", -1);
        Vector<String> vector = new Vector<>();
        for (int i = 0; i < parts.length; i++) {
            if (!parts[i].equals("") && !parts[i].equals(".") && !parts[i].equals("..")) {
                vector.add(parts[i]);
            } else if (parts[i].equals("..") && !vector.isEmpty()) {
                vector.removeElementAt(vector.size() - 1);
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append("/");
        for (int i = 0; i < vector.size(); i++) {
            builder.append(vector.elementAt(i));
            if (i != vector.size() - 1) {
                builder.append("/");
            }
        }
        return builder.toString();
    }

}
