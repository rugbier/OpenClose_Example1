package com.example.openclose.example_1.model;

public class Vehicle {
    private VehicleType type;

    public Vehicle(VehicleType type){
        this.type = type;
    }

    public VehicleType getType(){
        return type;
    }
}
