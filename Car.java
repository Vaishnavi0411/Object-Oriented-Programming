package com.niit.vehicle;

public class Car extends VehicleManufacturer implements  Vehicle{
    public Car(String vehicleName, String modelName, String vehicleType) {
        super(vehicleName, modelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("sportsCar"))
            return 250;
        else if (vehicleType.equalsIgnoreCase("Sedan"))
            return 170;
        else
            return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return "Car{Manufacturer name: "+getVehicleName()+",Model name: "+getModelName()+",Type: "+getVehicleType()+"}";
    }
}
