package com.example.openclose.example_1.model;

import com.example.openclose.example_1.gui.VehiclePrinter;

public class Truck extends Vehicle{
    private Double length;

    public Truck(VehiclePrinter priner, Integer wheelNumber, Double length){
        super(priner, wheelNumber);
        this.length = length;
    }

    public Double getLength() {
        return length;
    }
}
