package Lesson_4;

import java.util.Scanner;

public class Task0 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number, which u want to find in array: ");
        int num = in.nextInt();

        int[] myArray = new int[]{1, 2, 3, 4, 5, 6};

        boolean isNumInArray = false;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                isNumInArray = true;
                break;
            }
        }

        if (isNumInArray) {
            System.out.println("your number is in the array");
        } else {
            System.out.println(" your number isn't in the array");
        }

        in.close();
    }
}
