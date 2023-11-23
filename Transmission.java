package com.niit.worldofvehicles;

public class Transmission {
    private String modelNo;
    private String transmissionType;
    private int forwardGears;
    private double[] gearRatios;

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getForwardGears() {
        return forwardGears;
    }

    public void setForwardGears(int forwardGears) {
        this.forwardGears = forwardGears;
    }

    public double[] getGearRatios() {
        return gearRatios;
    }

    public void setGearRatios(double[] gearRatios) {
        this.gearRatios = gearRatios;
    }

    public Transmission(String model) {
        this.modelNo = model;
    }

}
