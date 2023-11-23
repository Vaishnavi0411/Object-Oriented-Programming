 class FurnitureItem {
    String color;
    int grade;
    String type;
    String furnitureUsage;
    float price;

    void calculateDiscount() {
            if (furnitureUsage.equals("outdoor"))
                price = price - price * 0.05f;
    }

     void displayDetails() {
        System.out.println("Color:\t" + color);
        System.out.println("Grade:\t" + grade);
        System.out.println("Type:\t" + type);
        System.out.println("Furniture Usage : " + furnitureUsage);
        System.out.println("price:\t" + price);
     }
}
