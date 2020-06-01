package com.company;

public class Rollerskates extends Vehicle {
    public Rollerskates() { }
    public void move(int id) {
        this.id = id;
        System.out.println("Roller skate №" + this.id + " left.");
    }
    private int id;
}
