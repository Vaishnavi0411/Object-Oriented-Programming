package com.niit.vehicle;

public abstract class VehicleManufacturer {
    private String vehicleName;
    private String modelName;
    private String vehicleType;

    public VehicleManufacturer(String vehicleName, String modelName, String vehicleType) {
        this.vehicleName = vehicleName;
        this.modelName = modelName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract String getManufacturerInformation();

}
