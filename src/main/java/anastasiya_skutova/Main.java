package anastasiya_skutova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое неотрицательное число для обозначения длины стороны а треугольника: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое неотрицательное число для обозначения длины стороны b треугольника: ");
        int b = scanner.nextInt();
        System.out.println("Введите целое неотрицательное число для обозначения длины стороны c треугольника: ");
        int c = scanner.nextInt();

        Triangle triangle = new Triangle();

        if (a == 0 || b == 0 || c == 0 || a < 0 || b < 0 || c < 0) {
            System.out.println(triangle.TriangleNoNegativeAndZeroNumbers(a, b, c));
        } else if (a < b + c && b < a + c && c < a + b && a != b + c && b != a + c && c != a + b) {
            System.out.println(triangle.TriangleExists(a, b, c));
            System.out.println(triangle.TriangleType(a, b, c));
        } else {
            System.out.println(triangle.TriangleExists(a, b, c));
        }
    }
}
