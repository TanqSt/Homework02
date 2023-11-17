package Homework3;
import java.util.Scanner;
public class CarPerson {
    public static void main(String[] args) {

        Car c1=new  Car();
        Car c2= new Car();
c1.year=1990;
c1.price=2345.45;
c1.isSportCar=true;
c1.fuelTankCapacity=50;
c1.freeFuel=15;
c1.engineFuelOperationSystem="gas";

        System.out.println("Year Dacia: "+c1.year);
        System.out.println("Price Dacia: "+c1.price);
        System.out.println("Is Sport Car Dacia: "+c1.isSportCar);
        System.out.println("Fuel Tank Capacity Dacia: "+c1.fuelTankCapacity);
        System.out.println("Engine Fuel Operation System Dacia: "+c1.engineFuelOperationSystem);
        System.out.println("Free Fuel Dacia: "+c1.freeFuel);

c2.year=2000;
c2.price=3000.32;
c2.isSportCar=false;
c2.fuelTankCapacity=40;
c2.freeFuel=8;
c2.useFuel(35.00);
c2.engineFuelOperationSystem="gas";
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