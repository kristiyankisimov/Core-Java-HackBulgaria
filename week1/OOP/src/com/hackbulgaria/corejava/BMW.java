package com.hackbulgaria.corejava;

public class BMW extends Car {
    public String toString() {
        return String.format("%s@%s", this.getClass().getSimpleName(), this.hashCode());
    }
}
