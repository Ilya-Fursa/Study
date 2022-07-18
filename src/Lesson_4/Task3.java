package Lesson_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {

        int[] myArray1 = new int[5];
        int[] myArray2 = new int[5];

        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = 0 + (int) (Math.random() * 100);
        }

        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = 0 + (int) (Math.random() * 100);
        }

        System.out.print("Your array1:");
        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + ", ");
        }

        System.out.print("\nYour array2:");
        for (int i = 0; i < myArray2.length; i++) {
            System.out.print(myArray2[i] + ", ");
        }

        int sum1 = 0, sum2 = 0;
        double average1, average2;

        for (int i = 0; i < myArray1.length; i++) {
            sum1 += myArray1[i];
        }
        average1 = (double) sum1 / myArray1.length;

        for (int i = 0; i < myArray2.length; i++) {
            sum2 += myArray2[i];
        }
        average2 = (double) sum2 / myArray2.length;

        System.out.print("\n");
        System.out.print("\n Average1:" + average1);
        System.out.print("\n");
        System.out.print("\n Average2:" + average2);
        if (average1 == average2) {
            System.out.print("\n Arrays are equals:");
        } else {
            int arr = (average1 > average2) ? 1 : 2;
            System.out.print("\n Average is more from array " + arr);

        }
    }
}