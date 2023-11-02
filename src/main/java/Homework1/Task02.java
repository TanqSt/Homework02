package Homework1;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first number: ");

        int num1 = s.nextInt();
        System.out.println("Enter your second number: ");

        int num2 = s.nextInt();
        System.out.println("Enter your third number: ");
        double num3 = s.nextDouble();
        System.out.println("Enter your fifth number: ");
        double num4 = s.nextDouble();

        num1=(int)num3;
        num2=(int)num4;
        num3=(double) num1;
        num4=(double)num2;
        System.out.println("The new value for num1 is: "+num1);
        System.out.println("The new value for num2 is: "+num2);

        System.out.println("The sum of num1 and num2 is: "+(num1+num2));

        System.out.println("The new value for num3 is: "+num3);
        System.out.println("The new value for num4 is: "+num4);
        System.out.println("The sum of num1 and num2 is: "+(num3+num4));







    }
}
