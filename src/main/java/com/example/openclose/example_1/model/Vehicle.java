package com.example.openclose.example_1.model;

import com.example.openclose.example_1.gui.VehiclePrinter;

public abstract class Vehicle {
    private VehiclePrinter printer;
    private Integer wheelNumber;

    public Vehicle(VehiclePrinter printer, Integer wheelNumber){
        this.wheelNumber = wheelNumber;
        this.printer = printer;
    }

    public void draw(){
        printer.draw(this);
    }

    public Integer getWheelNumber() {
        return wheelNumber;
    }

}
