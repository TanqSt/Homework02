package Homework3;

import java.util.Scanner;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;


    public void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem) {

        switch (newЕngineFuelOperationSystem) {
            case "diesel":
            case "gas":
                engineFuelOperationSystem=newЕngineFuelOperationSystem;
                break;
        }
    }


    public void useFuel(double fuel) {

        if (fuel > freeFuel) {
            System.out.println("Not enough free fuel!");
        } else {
            this.freeFuel -= fuel;
        }
    }
}
