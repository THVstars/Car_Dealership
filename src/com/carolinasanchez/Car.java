package com.carolinasanchez;

public class Car {
    private String name; // name is the identifier.
    private int wheels;
    private int miles;
    private boolean electric;
    private String color;
    private String countryOfManufacture;
    private String plateNumber;

    public Car(String name, int wheels, int miles, boolean electric, String color, String countryOfManufacture, String plateNumber) {
        this.name = name;
        this.wheels = wheels;
        this.miles = miles;
        this.electric = electric;
        this.color = color;
        this.countryOfManufacture = countryOfManufacture;
        this.plateNumber = plateNumber;
    } // what is this part for? specific instance object, perhaps. This is the constructor.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    } // allows the user to get wheels

    public void setWheels(int wheels) {
        this.wheels = wheels;
    } // allows the user to set wheels to a new value. setters must be void? confusing... getters and setters were all filled in automatically.

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}