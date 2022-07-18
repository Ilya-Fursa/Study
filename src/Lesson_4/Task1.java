package Lesson_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {

        int[] myArray = new int[]{1, 2, 2, 3, 4, 7, 4, 5, 6};

        System.out.print("Your array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.print("\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Input number, which u want to delete from array: ");
        int num = in.nextInt();

        int amount = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                ++amount;
            }
        }
        int[] myArray2;
        if (amount > 0) {
            myArray2 = new int[myArray.length - amount];
            int j = 0;
            for (int i = 0; i < myArray.length; ++i) {
                if (num == myArray[i]) {
                    continue;
                }
                myArray2[j] = myArray[i];
                ++j;
            }
        } else {
            myArray2 = myArray;
        }


        System.out.print("Your new array: ");
        for (int i = 0; i < myArray2.length; i++) {
            System.out.print(myArray2[i] + ", ");
        }
        System.out.print("\n");
        in.close();
    }
}