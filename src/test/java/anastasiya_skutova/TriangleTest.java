package anastasiya_skutova;

import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleTest {

    @Test
    public void triangleNoNegativeAndZeroNumbers() {
        Triangle triangle = new Triangle();
        assertEquals("Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия.", triangle.TriangleNoNegativeAndZeroNumbers(0, 1, 1));
        assertEquals("Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия.", triangle.TriangleNoNegativeAndZeroNumbers(1, 0, 1));
        assertEquals("Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия.", triangle.TriangleNoNegativeAndZeroNumbers(1, 1, 0));
        assertEquals("Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия.", triangle.TriangleNoNegativeAndZeroNumbers(-1, 1, 1));
        assertEquals("Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия.", triangle.TriangleNoNegativeAndZeroNumbers(1, -1, 1));
        assertEquals("Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия.", triangle.TriangleNoNegativeAndZeroNumbers(1, 1, -1));
    }

    @Test
    public void triangleExists() {
        Triangle triangle = new Triangle();
        assertEquals("Треугольник существует.", triangle.TriangleExists(8, 5, 4));
        assertEquals("Треугольник существует.", triangle.TriangleExists(10000, 15000, 17000));
        assertEquals("Треугольник существует.", triangle.TriangleExists(999999999, 777777777, 1000000000));
        assertEquals("Треугольник не существует.", triangle.TriangleExists(1, 2, 3));
        assertEquals("Треугольник не существует.", triangle.TriangleExists(10000, 20000, 10000));
        assertEquals("Треугольник не существует.", triangle.TriangleExists(100000000, 999999999, 1));
    }

    @Test
    public void triangleType() {
        Triangle triangle = new Triangle();
        assertEquals("Треугольник равнобедренный.", triangle.TriangleType(2, 2, 3));
        assertEquals("Треугольник равнобедренный.", triangle.TriangleType(10000, 15000, 10000));
        assertEquals("Треугольник равнобедренный.", triangle.TriangleType(999999999, 1000000000, 1000000000));
        assertEquals("Треугольник равносторонний.", triangle.TriangleType(7, 7, 7));
        assertEquals("Треугольник равносторонний.", triangle.TriangleType(20000, 20000, 20000));
        assertEquals("Треугольник равносторонний.", triangle.TriangleType(1000000000, 1000000000, 1000000000));
        assertEquals("Треугольник ни равнобедренный, ни равносторонний.", triangle.TriangleType(3, 5, 7));
        assertEquals("Треугольник ни равнобедренный, ни равносторонний.", triangle.TriangleType(10000, 12000, 20000));
        assertEquals("Треугольник ни равнобедренный, ни равносторонний.", triangle.TriangleType(1000000000, 888888888, 555555555));
    }
}
