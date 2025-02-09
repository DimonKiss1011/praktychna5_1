import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення значень a і b
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        // Введення значення x
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        // Обчислення f(x)
        double result = calculateFunction(a, b, x);

        // Виведення результату
        if (Double.isNaN(result)) {
            System.out.println("f(x) не визначено для цього значення x.");
        } else {
            System.out.println("f(" + x + ") = " + result);
        }

        scanner.close();
    }

    // Метод для обчислення f(x)
    public static double calculateFunction(double a, double b, double x) {
        if (x > -2 && x < 5) {
            return Math.log(a * x + 3); // Натуральний логарифм
        } else if (x == 5) {
            return Math.pow(x, 2) - b * x + 7;
        } else if (x > 5) {
            return Math.cos(x + 1);
        } else {
            return Double.NaN; // Значення не визначено
        }
    }
}
