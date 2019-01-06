package com.example.openclose.example_1.model;

import com.example.openclose.example_1.gui.VehiclePrinter;

public class Bike extends Vehicle {
    private Boolean hasSuspension;

    public Bike(VehiclePrinter vehiclePrinter, Integer wheelNumber, Boolean hasSuspension){
        super(vehiclePrinter, wheelNumber);
        this.hasSuspension = hasSuspension;
    }

    public Boolean getHasSuspension() {
        return hasSuspension;
    }
}
