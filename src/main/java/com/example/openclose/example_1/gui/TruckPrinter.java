package com.example.openclose.example_1.gui;

import com.example.openclose.example_1.model.Truck;
import com.example.openclose.example_1.model.Vehicle;

public class TruckPrinter implements VehiclePrinter {

    @Override
    public void draw(Vehicle vehicle) {
        Truck car = (Truck) vehicle;
        System.out.println("Is a Truck with " + car.getWheelNumber() + " wheels and is " + car.getLength() + " meters long");
    }

}
