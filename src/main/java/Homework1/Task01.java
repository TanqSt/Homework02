package Homework1;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter your first number: ");

        int num1 = s.nextInt();

        System.out.println("First number is: " + num1);
        System.out.println("Enter your second number: ");

        int num2 = s.nextInt();

        System.out.println("Second number is: " + num2);
        System.out.println("Enter your third number: ");
        int num3 = s.nextInt();

        if (num1<num3 && num2>num3) {

            System.out.println("Your number is between "+ num1+" and "+num2);
        }

            else if (num2<num3 && num1>num3){

                System.out.println("Your number is between "+ num1+" and "+num2);
            }

            else {
                System.out.println("Your number is NOT between "+ num1+" and "+num2);
            }
        }


    }



