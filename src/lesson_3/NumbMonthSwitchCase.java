package lesson_3;

import java.util.Scanner;

public class NumbMonthSwitchCase {
    public static void main(String[] args) {
        switchCase();
    }
        public static void switchCase() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите номер месяца");
        int numb = scanner.nextInt();

        switch (numb) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Месяц введён неверно!");
        }
    }
}