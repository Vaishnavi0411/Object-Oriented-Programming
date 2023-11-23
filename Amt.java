package com.niit.worldofvehicles;

public class Amt extends Transmission implements Service{

    private double[] ratios;


    public Amt(String model) {
        super(model);
        if (model.equalsIgnoreCase("AMTP4")) {
            setForwardGears(4);
            ratios = new double[]{2.540, 1.920, 1.510, 1.000};
            setGearRatios(ratios);
        } else if (model.equalsIgnoreCase("AMTD5")) {
            setForwardGears(5);
            ratios = new double[]{2.950, 1.940, 1.340, 1.000, 0.630};
            setGearRatios(ratios);
        }
    }

        @Override
        public void showSpecs(){
            System.out.println("Transmission Type : Automated Manual");
            System.out.println("Transmission Model Number :"+getModelNo());
            System.out.println("Key Specifications :");
            System.out.println("1. Forward Gears :"+getForwardGears());
            for(int i=0;i<getForwardGears();i++)
            {
                System.out.println((i+2)+". "+(i+1)+"st Gear Ratio:"+ratios[i]);

            }
        }
    }

