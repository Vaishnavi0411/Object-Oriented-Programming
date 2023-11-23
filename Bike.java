package com.niit.vehicle;

public class Bike  extends VehicleManufacturer implements  Vehicle{
    public Bike(String vehicleName, String modelName, String vehicleType) {
        super(vehicleName, modelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("SportsBike"))
            return 300;
        else if (vehicleType.equalsIgnoreCase("cruiser"))
            return 170;
        else
            return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return "Bike{Manufacturer name: "+getVehicleName()+",modelname: "+getModelName()+",Type: "+getVehicleType()+"}";
    }
}
