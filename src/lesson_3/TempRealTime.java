package lesson_3;

import java.util.Scanner;

public class TempRealTime {
    public static void main(String[] args) {
        ForecastOfTemperature();
    }

    public static void ForecastOfTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите температуру воздуха");
        int t = scanner.nextInt();


        if (t <= -20) {
            System.out.println("Холодно");
        } else if (t > -20 && t < -5) {
            System.out.println("Нормально");
        } else if (t > -5) {
            System.out.println("Тепло");
        }
    }
}
