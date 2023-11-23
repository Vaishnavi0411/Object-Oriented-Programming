package com.niit.furniture;
public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furniture = new FurnitureItem();
        furniture.setFurnitureCode(101);
        furniture.setFurnitureType("table");
        furniture.setGradeOfFurniture("grade1");
        furniture.setFurnitureUsage("outdoor");
        furniture.setFurniturePrice(10);
        System.out.println(furniture.toString());
        System.out.println("Discounted price is $"+ furniture.calculateDiscount());
    }
}
