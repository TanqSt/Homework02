package Homework1;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your working hours: ");

        int workHours = s.nextInt();
        System.out.println("Enter your cash");

        float cashSum = s.nextFloat();
        System.out.println("Enter is it a holiday ");
        boolean holiday = s.nextBoolean();

        if (workHours>0 && holiday == false)

        {
            System.out.println("I will work");
        }
        else if(holiday==true && cashSum>0)
        {
            System.out.println("I will go to cinema");
        }
        else if(holiday==true && cashSum<0)
        {
            System.out.println("I will go stay at home and watch TV");
        }
        else if(holiday==true){
            System.out.println("I will relax");
        }
        else if(cashSum<10){
            System.out.println("I will buy an ice cream");
        }
    }
}