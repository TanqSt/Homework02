package Homework2;

public class Task05 {
    public static void main(String[] args) {
        int [] arrayOne = {10,12, 1, 8, 4};
        int [] arrayTwo=arrayOne.clone();

        System.out.println("Contents of arrayOne : ");
        for (int i = 0; i<arrayOne.length; i++) {
            System.out.print(arrayOne[i]+" ");
        }
        System.out.println();
        System.out.println("Contents of arrayTwo :" );
        for (int i=0 ;i<arrayTwo.length;i++){
            System.out.print(arrayTwo[i]+" ");
        }

    }
    }
