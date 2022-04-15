package anastasiya_skutova;

public class Triangle {
    private static final String NO_NEGATIVE_ZERO_NUMBERS = "Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия.";
    private static final String TRIANGLE_EXISTS = "Треугольник существует.";
    private static final String TRIANGLE_NOT_EXISTS = "Треугольник не существует.";
    private static final String TRIANGLE_ISOSCELES = "Треугольник равнобедренный.";
    private static final String TRIANGLE_EQUILATERAL = "Треугольник равносторонний.";
    private static final String TRIANGLE_OTHER = "Треугольник ни равнобедренный, ни равносторонний.";


    public String TriangleNoNegativeAndZeroNumbers(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0 || a == 0 || b == 0 || c == 0) {
            return NO_NEGATIVE_ZERO_NUMBERS;
        } else {
            return null;
        }
    }

    public String TriangleExists(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b && a != b + c && b != a + c && c != a + b) {
            return TRIANGLE_EXISTS;
        } else {
            return TRIANGLE_NOT_EXISTS;
        }
    }

    public String TriangleType(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b && a != b + c && b != a + c && c != a + b) {
            if ((a == b && c != a) || (a == c && b != a) || (b == c && a != b)) {
                return TRIANGLE_ISOSCELES;
            } else if (a == b && b == c && a == c) {
                return TRIANGLE_EQUILATERAL;
            } else {
                return TRIANGLE_OTHER;
            }
        } else {
            return null;
        }
    }
}
