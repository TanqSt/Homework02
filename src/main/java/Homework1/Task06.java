package Homework1;
import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7");
        int number = s.nextInt();

        switch (number){
            case 1:
                System.out.println("Today is Monday");
            break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is Sunday");
        }
    }
}
