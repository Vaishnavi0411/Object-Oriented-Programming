package com.niit.engines;
public class FuelEngine extends Engine {
    private String typeOfFuel;

    public FuelEngine(String modelNo, float displacement, int maxPower, int maxRpm, int noOfCylinders, String typeOfFuel) {
        super(modelNo, displacement, maxPower, maxRpm, noOfCylinders);
        this.typeOfFuel = typeOfFuel;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
