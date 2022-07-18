package lesson_3;

import java.util.Scanner;

public class RainbowOfColor {
    public static void main(String[] args) {
        ColorNumb();
    }

    public static void ColorNumb() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите цифру от 1 до 5");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
        }
    }
}

