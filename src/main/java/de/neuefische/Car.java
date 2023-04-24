package de.neuefische;

public class Car {

    private String brand;
    private int year;
    double price;
    static boolean hasFourWeels = true;

    void honks() {
        System.out.println("HONK!");
        System.out.println();
        System.out.println("Honk!Honk!");
    }

    String getBrand() {
        return this.brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    int getYear() {
        return this.year;
    }

    void setYear(int year) {
        this.year = year;
    }

    void printBrand() {
        System.out.println(this.brand);
    }

    void printPrice(double price) {
        System.out.println(this.price);
    }
}
