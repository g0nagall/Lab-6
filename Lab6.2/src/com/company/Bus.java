package com.company;

public class Bus extends Machine {
    public Bus() { }
    public Bus(String name,double weight,double maxSpeed,int numberPass) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.numberPass = numberPass;
    }
    public void showNumberPassengers() {
        System.out.println("Quantity of passengers in the bus:" + this.numberPass);
    }
    @Override
    public void showName() {
        System.out.println("Brand of the bus:" + this.name);
    }
    @Override
    public void showMaxSpeed() {
        System.out.println("Max speed of the bus:" + this.maxSpeed);
    }
    @Override
    public void getWeightTransport() {
        System.out.println("Weight of the bus:" + this.weight);
    }
    @Override
    public void move(int id) {
        this.id = id;
        System.out.println("Bus №" + this.id + " left");
    }
    private int id;
}
