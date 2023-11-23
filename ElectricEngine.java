package com.niit.engines;
public class ElectricEngine extends Engine {
    private int voltage;

    public ElectricEngine(String modelNo, float displacement, int maxPower, int maxRpm, int noOfCylinders, int voltage) {
        super(modelNo, displacement, maxPower, maxRpm, noOfCylinders);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "voltage=" + voltage +
                '}';
    }
}
