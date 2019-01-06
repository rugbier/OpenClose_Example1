package com.example.openclose.example_1.gui;

import com.example.openclose.example_1.model.Vehicle;

public class VehiclePrinter {

    private static void drawCar(Vehicle vehicle){
        System.out.println("Is a Car");
    }

    private static void drawTruck(Vehicle vehicle){
        System.out.println("Is a Truck");
    }

    public static void draw(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case CAR:
                drawCar(vehicle);
                break;
            case TRUCK:
                drawTruck(vehicle);
                break;
        }
    }
}
