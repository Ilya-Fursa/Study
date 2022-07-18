package lesson_2;

public class Main {

    public static void main(String[] args) {
        addInteger();
        remainderOfDivision();
        logicOperatorExample();
        multiplyNumberExample();
        compareOperatorExample();
    }

    private static void addInteger() {
        int a = 10;
        int b = 3;
        System.out.println("Результат сложения чисел 10 и 3: " + (a + b));
    }

    private static void remainderOfDivision() {
        float a = 9.5f;
        float b = 3;
        System.out.println("Результат деления с остатком чисел типа float 9.5 и 3: " + (a % b));
    }

    private static void logicOperatorExample() {
        final boolean a = true;
        final boolean b = false;
        System.out.println("a || b: " + (a || b));
        System.out.println("!(a && b): " + !(a && b));
    }

    private static void multiplyNumberExample () {
        double a = 10.7d;
        double b = 2.1d;
        System.out.println("Результат умножения чисел 10.7 и 2.1: " + (a * b));
    }

    private static void compareOperatorExample() {
        final int a = 10;
        final int b = 3;
        System.out.println("Результат операции сравнения: число 10 больше числа 3: " + (a > b));
    }
}
