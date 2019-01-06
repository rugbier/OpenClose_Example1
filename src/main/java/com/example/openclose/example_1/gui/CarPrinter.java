package com.example.openclose.example_1.gui;

import com.example.openclose.example_1.model.Car;
import com.example.openclose.example_1.model.Vehicle;

public class CarPrinter implements VehiclePrinter{
    public void draw(Vehicle vehicle) {
        Car car = (Car) vehicle;
        System.out.println("Is a Car with " + car.getWheelNumber() + " wheels and is " + car.getColor());
    }
}
