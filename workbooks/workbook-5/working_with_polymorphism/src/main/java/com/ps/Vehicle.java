package com.ps;

import java.time.Year;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int vehicleAge = Year.now().getValue() - this.year;
        double vehicleValue;

        if(vehicleAge  <= 3){
            vehicleValue = calculateVehicleValue(.03, vehicleAge);
        } else if(vehicleAge <= 6){
            vehicleValue = calculateVehicleValue(.06, vehicleAge);
        } else if (vehicleAge <= 10) {
            vehicleValue = calculateVehicleValue(.08, vehicleAge);
        } else {
            vehicleValue = 1000;
        }

        if(
                this.odometer > 100_000 &&
                !makeModel.toLowerCase().contains("honda") &&
                !makeModel.toLowerCase().contains("toyota")
        ){
            vehicleValue = vehicleValue * .75;
        }

        return vehicleValue;
    }

    public double calculateVehicleValue(double reducedValue, int vehicleAge){
        double depreciation = (1 - (vehicleAge * reducedValue));
        return depreciation * super.getOriginalCost();
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
