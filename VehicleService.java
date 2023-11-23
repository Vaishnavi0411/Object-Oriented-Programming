package com.niit.vehicle;

public class VehicleService {
    public static void main(String[] args) {
        Bike bike = new Bike("TVS cruiser","TVS ronin","cruiser");
        int output1 = bike.maxSpeed("cruiser");
        System.out.println("Bike type is "+ bike.getVehicleType()+" Its speed is "+output1);
        System.out.println(bike.getManufacturerInformation());
        System.out.println("------------------------------");
        Car car = new Car("Santro","Santro123","Sedan");
        int output2 = car.maxSpeed("Sedan");
        System.out.println("Car type is "+ car.getVehicleType()+" Its speed is "+output2);
        System.out.println(car.getManufacturerInformation());
    }
}
