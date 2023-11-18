package Homework3;

import java.util.Scanner;

public class Car2 {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

public Car2(int year, double price, boolean isSportCar, int fuelTankCapacity, double freeFuel, String engineFuelOperationSystem){
    this.year=year;
    this.price=price;
    this.isSportCar=isSportCar;
    this.fuelTankCapacity=fuelTankCapacity;
    this.freeFuel=freeFuel;
    this.engineFuelOperationSystem=engineFuelOperationSystem;
}
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
