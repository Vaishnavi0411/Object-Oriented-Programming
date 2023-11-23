package com.niit.worldofvehicles;

public class Manual extends Transmission implements Service{
    private double[] ratios;

    public Manual(String model) {
        super(model);
        if(model.equalsIgnoreCase("MP4")) {
            setForwardGears(4);
            ratios = new double[]{2.540, 1.920, 1.510, 1.000};
            setGearRatios(ratios);
        }
        else if (model.equalsIgnoreCase("MP5")) {
            setForwardGears(5);
            ratios = new double[]{3.545, 1.904, 1.280, 0.914, 0.757};
            setGearRatios(ratios);
        }
        else if (model.equalsIgnoreCase("MP6")) {
            setForwardGears(6);
            ratios = new double[]{3.010, 2.070, 1.430, 1.000, 0.710, 0.570};
            setGearRatios(ratios);
        }

    }

    @Override
    public void showSpecs(){
        System.out.println("Transmission Type : Manual");
        System.out.println("Transmission Model Number : "+getModelNo());
        System.out.println("Key Specifications : ");
        System.out.println("1. Forward Gears : "+getForwardGears());
        for(int i=0;i<getForwardGears();i++)
        {
            System.out.println((i+2)+". "+(i+1)+"st Gear Ratio : "+ratios[i]);

        }
    }
}
