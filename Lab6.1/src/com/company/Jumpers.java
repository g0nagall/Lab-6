package com.company;

public class Jumpers extends Vehicle {
    public Jumpers() { }
    public void move(int id) {
        this.id = id;
        System.out.println("Jumper №" + this.id + " left.");
    }
    private int id;
}