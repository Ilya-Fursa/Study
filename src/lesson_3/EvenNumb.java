package lesson_3;

import java.util.Scanner;

public class EvenNumb {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int Number = scanner.nextInt();
        String resultString = evenNumb(Number);
        System.out.println(resultString);

    }
    public static String evenNumb(int number) {
        int y = number % 2;
        if (y != 0)

        {
            String evenNumb = "нечётное";
            return evenNumb;
        }
        else
        {
            return "чётное";
        }
    }
}

