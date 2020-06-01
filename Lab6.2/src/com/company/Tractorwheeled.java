package com.company;

public class Tractorwheeled extends Tractor {
    public Tractorwheeled(String name,double weight,String type,double maxSpeed,int numberPass) {
        super(type,weight,type);
        this.maxSpeed = maxSpeed;
        this.numberPass = numberPass;
    }
    @Override
    public void showType() {
        System.out.println("Type of the tractor:" + this.type);
    }
    @Override
    public void showName() {
        System.out.println("Brand of the tractor:" + this.name);
    }
    @Override
    public void showMaxSpeed() {
        System.out.println("Max speed of the tractor:" + this.maxSpeed);
    }
    @Override
    public void getWeightTransport() {
        System.out.println("Weight of the bus tractor:" + this.weight);
    }
    @Override
    public void move(int id) {
        this.id = id;
        System.out.println("Tractor №" + this.id + " left");
    }
    private int id;
}
