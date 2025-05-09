package com.ps;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle> vehiclesByPrice(double min, double max){
        return null;
    }

    public ArrayList<Vehicle> vehiclesByMakeModel(String make, String model){
        return null;
    }

    public ArrayList<Vehicle> vehiclesByYear(int min, int max){
        return null;
    }

    public ArrayList<Vehicle> vehiclesByColor(String color){
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }


// TODO
//    get VehiclesByMileage(min, max) : List<Vehicle>
//    get VehiclesByType(vehicleType) : List<Vehicle>
//    remove Vehicle(vehicle)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
