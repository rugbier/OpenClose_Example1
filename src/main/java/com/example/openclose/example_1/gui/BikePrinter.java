package com.example.openclose.example_1.gui;

import com.example.openclose.example_1.model.Bike;
import com.example.openclose.example_1.model.Vehicle;

public class BikePrinter implements VehiclePrinter {

    @Override
    public void draw(Vehicle vehicle) {
        Bike bike = (Bike) vehicle;
        System.out.println("Is a Bike with " + bike.getWheelNumber() + " wheels and " + ((bike.getHasSuspension())?" has suspension":"has no suspension"));
    }
}
