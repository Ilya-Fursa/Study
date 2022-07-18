package Lesson_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        System.out.print("Enter size of array \nOr u enter 0, ur array will be random size [1,15]: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int minBound = 1, maxBound = 15;
        if (size == 0) {
            size = minBound + (int) (Math.random() * maxBound);
        }
        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 0 + (int) (Math.random() * 100);
        }

        System.out.print("Your array:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }

        int min = myArray[0], max = myArray[0], sum = 0;
        double average;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            if (min > myArray[i]) min = myArray[i];
            if (max < myArray[i]) max = myArray[i];
        }
        average = (double) sum / myArray.length;
        System.out.print("\n");
        System.out.print("Min:" + min + "\nMax:" + max + "\nAverage:" + average);

        in.close();
    }
}