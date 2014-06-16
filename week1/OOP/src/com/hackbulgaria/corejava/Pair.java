package com.hackbulgaria.corejava;

public class Pair {
    private final Object first;
    private final Object second;
    
    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
    
    public Pair(Pair other) {
        this(other.first, other.second);
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", first.toString(), second.toString());
    }
    
    public boolean equals(Pair obj) {
        // TODO Auto-generated method stub
        if(obj == null) {
            return false;
        } else {
            return this.first.equals(obj.first) && this.second.equals(obj.second);
        }
    }
}
