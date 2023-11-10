package Homework2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=5;
        double[] arr = new double[5];

        System.out.println("Enter your numbers: ");

        for (int i = 0; i< arr.length; i++){
            arr[i] =s.nextDouble();

        }
        for (int i = 0; i< arr.length; i++){
            System.out.println("Elements of the array are: "+ arr[i]);
        }
    }

}





