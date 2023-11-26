package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {

Computer comp1=new Computer();
Computer comp2=new Computer(2000, 369.05, "Windows");

comp1.year=2009;
comp1.price=380.00;
comp1.operationSystem="Linux";

        System.out.println("Result is : "+comp2.comparePrice(comp1));
    }
}
