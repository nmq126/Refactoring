package com.demo.Facade;

import com.demo.Entity.Vehicle;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicles;
    public void addVehicle(Vehicle vehicle){
        if (vehicles == null){
            vehicles = new ArrayList<>();
        }
        vehicles.add(vehicle);
        System.out.println("Garage thêm xe mới");
    }
}
