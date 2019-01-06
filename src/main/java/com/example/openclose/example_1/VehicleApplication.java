package com.example.openclose.example_1;

import com.example.openclose.example_1.gui.VehiclePrinter;
import com.example.openclose.example_1.model.Vehicle;
import com.example.openclose.example_1.model.VehicleType;

public class VehicleApplication {

    public static void main(String [] args) {
        Vehicle car = new Vehicle(VehicleType.CAR);
        Vehicle truck = new Vehicle(VehicleType.TRUCK);

        VehiclePrinter.draw(car);
        VehiclePrinter.draw(truck);
    }
}
