package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of vehicles: ");
        int limit = sc.nextInt();
        Server apache = new Server(3,limit);
        while (apache.getCurrentCountVehicle() < limit) {
            int numberofvehicle = (int) (Math.random() * 3);
            switch(numberofvehicle) {
                case 0:
                    System.out.println("Enter the brand of the bus: ");
                    String name = sc.next();
                    System.out.println("Enter the weight of the bus: ");
                    double weight = sc.nextDouble();
                    System.out.println("Enter the max speed of the bus: ");
                    double maxSpeed = sc.nextDouble();
                    System.out.println("Enter the quantity of passengers in the bus: ");
                    int numberPass = sc.nextInt();
                    apache.addTransport(0, new Bus(name,weight,maxSpeed,numberPass));break;
                case 1:
                    System.out.println("Enter the brand of the tractor: ");
                    String nametc = sc.next();
                    System.out.println("Enter the weight of the bus tractor: ");
                    double weighttc = sc.nextDouble();
                    System.out.println("Enter the max speed of the tractor: ");
                    double maxSpeedtc = sc.nextDouble();
                    System.out.println("Enter the quantity of passengers in the трактора: ");
                    int numberPasstc = sc.nextInt();
                    apache.addTransport(1, new Tractorcrawler(nametc,weighttc,"Crawler",maxSpeedtc,numberPasstc));
                    break;
                case 2:
                    System.out.println("Enter the brand of the tractor: ");
                    String nametw = sc.next();
                    System.out.println("Enter the weight of the bus tractor: ");
                    double weighttw = sc.nextDouble();
                    System.out.println("Enter the max speed of the tractor: ");
                    double maxSpeedtw = sc.nextDouble();
                    System.out.println("Enter the quantity of passengers in the tractor: ");
                    int numberPasstw = sc.nextInt();
                    apache.addTransport(2, new Tractorwheeled(nametw,weighttw,"Wheeled",maxSpeedtw,numberPasstw));
                    break;
            }
        }
        System.out.println();
        int[] countVehicles = apache.getCountVehicles();
        for(int i = 0; i < countVehicles.length; i++) {
            switch(i) {
                case 0:
                    System.out.println("Buses left - " + countVehicles[i]);
                    break;
                case 1:
                    System.out.println("Crawler tractors left - " + countVehicles[i]);
                    break;
                case 2:
                    System.out.println("Wheeled tractors left - " + countVehicles[i]);
                break;
            }
        }
    }
}