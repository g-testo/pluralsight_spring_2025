package com.ps;

import java.time.Year;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(double originalCost, String makeModel, int year, int odometer) {
        super(originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int vehicleAge = getVehicleAge();
        double vehicleValue;

        if(vehicleAge  <= 3){
            vehicleValue = calculateVehicleValue(.03);
        } else if(vehicleAge <= 6){
            vehicleValue = calculateVehicleValue(.06);
        } else if (vehicleAge <= 10) {
            vehicleValue = calculateVehicleValue(.08);
        } else {
            vehicleValue = 1000;
        }

        boolean isNotHonda = !makeModel.toLowerCase().contains("honda");
        boolean isNotToyota = !makeModel.toLowerCase().contains("toyota");

        if( this.odometer > 100_000 && isNotHonda && isNotToyota){
            vehicleValue *= .75;
        }

        return vehicleValue;
    }

    public int getVehicleAge(){
        return Year.now().getValue() - this.year;
    }

    public double calculateVehicleValue(double reducedValue){
        int vehicleAge = getVehicleAge();
        double depreciationRate = vehicleAge * reducedValue;
        return super.getOriginalCost() * (1-depreciationRate);
    }


    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
