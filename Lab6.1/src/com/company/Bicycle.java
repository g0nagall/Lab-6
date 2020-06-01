package com.company;

public class Bicycle extends Vehicle {
    public Bicycle() { }
    public void move(int id) {
        this.id = id;
        System.out.println("Bicycle №" + this.id + " left.");
    }
    private int id;
}
