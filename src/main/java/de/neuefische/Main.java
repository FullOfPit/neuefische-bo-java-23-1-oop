package de.neuefische;

public class Main {

    public static void main(String[] args) {

        Car svenjasCar = new Car();

        //svenjasCar.brand = "BMW";
        //svenjasCar.year = 2012;
        svenjasCar.price = 25000.00;
        //svenjasCar.hasFourWeels = true; hinfällig weil feld ist static

        //System.out.println(svenjasCar.brand);
        //System.out.println(svenjasCar.year);

        //svenjasCar.honks();
        //svenjasCar.printBrand();


        Car christiansCar = new Car();

        //christiansCar.brand = "Seat";
        //christiansCar.year = 2020;
        christiansCar.price = 20000.00;
        //christiansCar.hasFourWeels = true; hinfällig weil feld ist static

        //System.out.println(christiansCar.brand);
        //christiansCar.honks();
        //christiansCar.printBrand();

        //christiansCar.printPrice(17500.00);

        Car dominicsCar = new Car();
        //dominicsCar.brand = "BMW";

        christiansCar.setBrand("Seat");
        System.out.println(christiansCar.getBrand());

    }
}
