package de.neuefische;

public class Car {

    String brand;
    int year;
    private double price;
    boolean hasFourWeels = true;

    Car() {

    }

    Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    Car(String brand, int year, double price, boolean hasFourWeels) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.hasFourWeels = hasFourWeels;
    }

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

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }
    void ihgr() {
        hasFourWeels = false;
    }
}
