package com.hackbulgaria.corejava;

public class Audi extends Car {
    public String toString() {
        return String.format("%s@%s", this.getClass().getSimpleName(), this.hashCode());
    }
}
