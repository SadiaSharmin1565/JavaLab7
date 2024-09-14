package com.mycompany.vehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car1 = new Car("Toyota", "Corolla", 25000, "Red", 2024);
        Vehicle car2 = new Car("Honda", "Civic", 28000, "Blue", 2023);

        Vehicle motorcycle1 = new Motorcycle("Harley-Davidson", "Iron 883", 15000, "Black", 250);
        Vehicle motorcycle2 = new Motorcycle("Ducati", "Panigale", 18000, "White", 150);

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(motorcycle1);
        vehicles.add(motorcycle2);

        System.out.println("List of Cars:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                System.out.println(vehicle.toString());
            }
        }

        System.out.println("\nList of Motorcycles:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Motorcycle) {
                System.out.println(vehicle.toString());
            }
        }
    }
}
