package Homework3;
import java.util.Scanner;
public class CarPerson2 {
    public static void main(String[] args) {

        Car2 c1=new Car2(1990, 2345.45, true, 50, 15, "gas");
        Car2 c2= new Car2(2000, 3000.32, false, 40, 8,"gas");


        System.out.println("Year Dacia: "+c1.year);
        System.out.println("Price Dacia: "+c1.price);
        System.out.println("Is Sport Car Dacia: "+c1.isSportCar);
        System.out.println("Fuel Tank Capacity Dacia: "+c1.fuelTankCapacity);
        System.out.println("Engine Fuel Operation System Dacia: "+c1.engineFuelOperationSystem);
        System.out.println("Free Fuel Dacia: "+c1.freeFuel);


        c2.useFuel(35.00);

        System.out.println();
        System.out.println("Year Renault: "+c2.year);
        System.out.println("Price Renault: "+c2.price);
        System.out.println("Is Sport Car Renault: "+c2.isSportCar);
        System.out.println("Fuel Tank Capacity Renault: "+c2.fuelTankCapacity);
        System.out.println("Engine Fuel Operation System Renault: "+c2.engineFuelOperationSystem);
        System.out.println("Please enter the new Engine Fuel Operation System: ");
        Scanner s=new Scanner(System.in);
        c2.changeЕngineFuelOperationSystem(s.next());
        System.out.println("New ЕngineFuelOperationSystem: "+c2.engineFuelOperationSystem);
        System.out.println("Free Fuel Renault: "+c2.freeFuel);


    }
}
