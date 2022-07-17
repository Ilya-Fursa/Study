package lesson_3;

import java.util.Scanner;

public class NumbMonthIfElse {
    public static void main(String[] args) {
        IfElse();

    }

            public static void IfElse() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("введите номер месяца");
            int numb = scanner.nextInt();

            if ((numb >= 1 && numb <= 2) || numb == 12) {
                System.out.println("Winter");
            }
            else if (numb < 6 && numb > 2) {
                System.out.println("Spring");
            }
            else if (numb > 5 && numb < 9) {
                System.out.println("Summer");
            }
            else if (numb < 12 && numb > 8) {
                System.out.println("Autumn");
            } else {
                System.out.println("Номер введён неверно!");
            }
        }
    }
