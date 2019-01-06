package com.example.openclose.example_1;

import com.example.openclose.example_1.gui.BikePrinter;
import com.example.openclose.example_1.gui.CarPrinter;
import com.example.openclose.example_1.gui.TruckPrinter;
import com.example.openclose.example_1.model.Bike;
import com.example.openclose.example_1.model.Truck;
import com.example.openclose.example_1.model.Vehicle;
import com.example.openclose.example_1.model.Car;

public class VehicleApplication {

    public static void main(String [] args) {
        Vehicle car = new Car(new CarPrinter(), 4, "Blue");
        Vehicle truck = new Truck(new TruckPrinter(), 10, 6.79);
        Vehicle bike = new Bike(new BikePrinter(), 2, true);

        car.draw();
        truck.draw();
        bike.draw();
    }
}
