package com.company;

public class Car extends Vehicle {
    public Car() { }
    public void move(int id) {
        this.id = id;
        System.out.println("Car №" + this.id + " left.");
    }
    private int id;
}
