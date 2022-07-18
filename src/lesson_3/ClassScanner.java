package lesson_3;

import java.util.Scanner;
public class ClassScanner {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int numb = scanner.nextInt();

        for(int i = 1; i < numb; i++)
        {
          System.out.println(i);
        }
        }
    }

