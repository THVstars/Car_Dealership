package com.carolinasanchez;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Integer input;
    static List<Car> carsAvailable;
    static List<Car> unavailableCars;
    static Car buick;
    static Car hyundai;
    static Car lincoln;
    static List<String> carBrand;

    public static void main(String[] args) {

        buick = new Car("Buick", 4, 35000, false, "gray", "United States", "THV001");

        hyundai = new Car("Hyundai", 4, 42500, true, "green", "South Korea", "THV002");

        lincoln = new Car("Lincoln", 4, 50000, false, "black", "United States", "THV003");

        carsAvailable = new ArrayList<>();
        carsAvailable.add(buick);
        carsAvailable.add(hyundai);
        carsAvailable.add(lincoln);

        // note: for some reason, a car can actually be rented more than once: the unavailableCars array simply includes the same location twice. also, a car can be returned without having been rented because it just puts the location of the car in the carsAvailable array twice. tried using plate numbers instead, but the same problem occurs. FIGURED OUT THE PROBLEM FOR THE UNAVAILABLE CARS: I'M MOVING THE CAR DIRECTLY FROM THE OBJECT TO THE ARRAY, INSTEAD OF FROM THE CARS AVAILABLE ARRAY. THEREFORE, CARS CAN BE RENTED MORE THAN ONCE. THE OPPOSITE IS TRUE IN THE RETURN: THE CARS ARE MOVED FROM THE OBJECT TO THE AVAILABLE CARS ARRAY INSTEAD OF FROM THE UNAVAILABLE CARS ARRAY. SO CARS CAN BE RETURNED MORE THAN ONCE. DON'T KNOW HOW TO FIX THIS THOUGH. Attempted Solutions: indexOf doesn't work because the elements in the array are not strings and using the indexes the elements in the array are currently in doesn't work because the indexes will change order depending on which cars are rented out and returned.

        unavailableCars = new ArrayList<>();

        System.out.println("");
        myRental("Buick");
        System.out.println("");
        myRental("Hyundai");
        System.out.println("");
        myReturn("Hyundai");
        System.out.println("");
        myReturn("Buick");
        // note: task accomplished using method parameters.

        carBrand = List.of(new String[]{buick.getName(), hyundai.getName(), lincoln.getName()}); // created to get the name of the car for the solution using the user input method since the input is an integer and not the car type.

        System.out.println("");
        System.out.println("Which car would you like to rent? Please enter a NUMBER: \n1. Buick \n2. Hyundai \n3. Lincoln");
        System.out.println("");
        input = scanner.nextInt();
        System.out.println("");
        myRental2();

        System.out.println("");
        System.out.println("Which car would you like to return? Please enter a NUMBER: \n1. Buick \n2. Hyundai \n3. Lincoln");
        System.out.println("");
        input = scanner.nextInt();
        System.out.println("");
        myReturn2();
        // note: task accomplished using user input.
    }

    public static void myRental(String carType){
        if (carType == "Buick"){
            unavailableCars.add(buick);
            carsAvailable.remove(buick);
        }else if (carType == "Hyundai"){
            unavailableCars.add(hyundai);
            carsAvailable.remove(hyundai);
        }else if (carType == "Lincoln"){
            unavailableCars.add(lincoln);
            carsAvailable.remove(lincoln);
        } // note: reverse this logic when putting cars back into the available array.
        System.out.println("Cars Available: " + carsAvailable);
        System.out.println("Unavailable Cars: " + unavailableCars);
        System.out.println("");
        System.out.println("You are renting a " + carType + ".");
    }

    public static void myReturn(String carType){
        if (carType == "Buick"){
            unavailableCars.remove(buick);
            carsAvailable.add(buick);
        }else if (carType == "Hyundai"){
            unavailableCars.remove(hyundai);
            carsAvailable.add(hyundai);
        }else if (carType == "Lincoln"){
            unavailableCars.remove(lincoln);
            carsAvailable.add(lincoln);
        }
        System.out.println("Cars Available: " + carsAvailable);
        System.out.println("Unavailable Cars: " + unavailableCars);
        System.out.println("");
        System.out.println("You are returning a " + carType + ".");
    }

    public static void myRental2(){
        if (input == 1){
            unavailableCars.add(buick);
            carsAvailable.remove(buick);
        }else if (input == 2){
            unavailableCars.add(hyundai);
            carsAvailable.remove(hyundai);
        }else if (input == 3){
            unavailableCars.add(lincoln);
            carsAvailable.remove(lincoln);
        }
        System.out.println("Cars Available: " + carsAvailable);
        System.out.println("Unavailable Cars: " + unavailableCars);
        System.out.println("You are renting a " + carBrand.get(input - 1) + ".");
    }

    public static void myReturn2(){
        if (input == 1){
            unavailableCars.remove(buick);
            carsAvailable.add(buick);
        }else if (input == 2){
            unavailableCars.remove(hyundai);
            carsAvailable.add(hyundai);
        }else if (input == 3){
            unavailableCars.remove(lincoln);
            carsAvailable.add(lincoln);
        }
        System.out.println("Cars Available: " + carsAvailable);
        System.out.println("Unavailable Cars: " + unavailableCars);
        System.out.println("You are returning a " + carBrand.get(input - 1) + ".");
}
}