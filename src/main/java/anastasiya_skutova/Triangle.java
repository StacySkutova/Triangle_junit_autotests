package anastasiya_skutova;

public class Triangle {
    private static final String NO_NEGATIVE_ZERO_NUMBERS = "Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия.";
    private static final String TRIANGLE_EXISTS = "Треугольник существует.";
    private static final String TRIANGLE_NOT_EXISTS = "Треугольник не существует.";
    private static final String TRIANGLE_ISOSCELES = "Треугольник равнобедренный.";
    private static final String TRIANGLE_EQUILATERAL = "Треугольник равносторонний.";
    private static final String TRIANGLE_OTHER = "Треугольник ни равнобедренный, ни равносторонний.";

    public String TriangleNoNegativeAndZeroNumbers(int firstSide, int secondSide, int thirdSide) {
        if (firstSide < 0 || secondSide < 0 || thirdSide < 0 || firstSide == 0 || secondSide == 0 || thirdSide == 0) {
            return NO_NEGATIVE_ZERO_NUMBERS;
        } else {
            return null;
        }
    }

    public String TriangleExists(int firstSide, int secondSide, int thirdSide) {
        if (firstSide < secondSide + thirdSide && secondSide < firstSide + thirdSide && thirdSide < firstSide + secondSide && firstSide != secondSide + thirdSide && secondSide != firstSide + thirdSide && thirdSide != firstSide + secondSide) {
            return TRIANGLE_EXISTS;
        } else {
            return TRIANGLE_NOT_EXISTS;
        }
    }

    public String TriangleType(int firstSide, int secondSide, int thirdSide) {
        if (firstSide < secondSide + thirdSide && secondSide < firstSide + thirdSide && thirdSide < firstSide + secondSide && firstSide != secondSide + thirdSide && secondSide != firstSide + thirdSide && thirdSide != firstSide + secondSide) {
            if ((firstSide == secondSide && thirdSide != firstSide) || (firstSide == thirdSide && secondSide != firstSide) || (secondSide == thirdSide && firstSide != secondSide)) {
                return TRIANGLE_ISOSCELES;
            } else if (firstSide == secondSide && secondSide == thirdSide && firstSide == thirdSide) {
                return TRIANGLE_EQUILATERAL;
            } else {
                return TRIANGLE_OTHER;
            }
        } else {
            return null;
        }
    }
}
