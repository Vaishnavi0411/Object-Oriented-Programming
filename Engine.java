package com.niit.engines;
public abstract class Engine {
    private String modelNo;
    private float displacement;
    private int maxPower;
    private int maxRpm;
    private int noOfCylinders;

    public Engine(String modelNo, float displacement, int maxPower, int maxRpm, int noOfCylinders) {
        this.modelNo = modelNo;
        this.displacement = displacement;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
        this.noOfCylinders = noOfCylinders;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    @Override
    public String toString() {
        return "Engines{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxPower=" + maxPower +
                ", maxRpm=" + maxRpm +
                ", noOfCylinders=" + noOfCylinders +
                '}';
    }
}
