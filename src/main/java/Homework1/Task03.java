package Homework1;
import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first number: ");

        int num1 = s.nextInt();
        System.out.println("Enter your second number: ");

        int num2 = s.nextInt();
        System.out.println("Enter your third number: ");
        int num3 = s.nextInt();

        int num1old=0;
        num1old=num1;

        num1 = num2;
        num2 = num3;
        num3 =num1old;
        int sum1=num1+num2;
        System.out.println("The total sum is: "+sum1);
        int sum2=sum1-num1old;
        System.out.println("The difference is: "+ sum2);
    }
}