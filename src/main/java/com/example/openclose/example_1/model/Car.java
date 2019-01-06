package com.example.openclose.example_1.model;

import com.example.openclose.example_1.gui.VehiclePrinter;

public class Car extends Vehicle{
    private String color;

    public Car(VehiclePrinter priner, Integer wheelNumber, String color){
        super(priner, wheelNumber);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
