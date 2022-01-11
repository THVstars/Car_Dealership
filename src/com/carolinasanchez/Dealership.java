package com.carolinasanchez;

import java.util.ArrayList;

public class Dealership {
    static public String dealershipName = "Taehyung's Cars";
    static public ArrayList<CarTwo> currentCarsAvailable = new ArrayList<>();
    static public ArrayList<CarTwo> currentCarsBooked = new ArrayList<>();

    static CarTwo Hyundai = new CarTwo("Genesis", "GV80", 1000, 100);
    static CarTwo Buick = new CarTwo("Lacrosse", "GV90", 700, 75);
    static CarTwo Lincoln = new CarTwo("Continental", "GV100", 900, 95);

    public static void main(String[] args) {
        currentCarsAvailable.add(Hyundai);
        currentCarsAvailable.add(Buick);
        currentCarsAvailable.add(Lincoln);
        System.out.println(currentCarsAvailable); // it's impossible to make this print the actual data in the cars because they are objects. since it's a list of objects, it'll always print their location in memory instead.
        System.out.println(Hyundai.getMake() + " " + Hyundai.getModel());
        System.out.println(Buick.getMake() + " " + Buick.getModel());
        System.out.println(Lincoln.getMake() + " " + Lincoln.getModel());
        System.out.println(dealershipName);
    }

}
