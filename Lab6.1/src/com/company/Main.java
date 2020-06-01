package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of vehicles: ");
        int limit = sc.nextInt();
        Server apache = new Server(4,limit);
        while (apache.getCurrentCountVehicle() < limit) {
            int numberofvehicle = (int) (Math.random() * 4);
            switch(numberofvehicle) {
                case 0:
                    apache.addTransport(0, new Bicycle());
                    break;
                case 1:
                    apache.addTransport(1, new Car());
                    break;
                case 2:
                    apache.addTransport(2, new Jumpers());
                    break;
                case 3:
                    apache.addTransport(3, new Rollerskates());
                    break;
            }
        }
        System.out.println();
        int[] countVehicles = apache.getCountVehicles();
        for(int i = 0; i < countVehicles.length; i++) {
            switch(i) {
                case 0:
                    System.out.println("Bicycles left - " + countVehicles[i]);
                    break;
                case 1:
                    System.out.println("Cars left - " + countVehicles[i]);
                    break;
                case 2:
                    System.out.println("Jumpers left - " + countVehicles[i]);
                    break;
                case 3:
                    System.out.println("Rollers skates left - " + countVehicles[i]);
                    break;
            }
        }
    }
}
