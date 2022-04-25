package anastasiya_skutova;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class TriangleTest {
    private Type type;
    private int firstSide;
    private int secondSide;
    private int thirdSide;
    private String expectedResult;
    private Triangle triangle;

    public TriangleTest(Type type, int firstSide, int secondSide, int thirdSide, String expectedResult) {
        this.type = type;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() {
        triangle = new Triangle();
    }

    enum Type {NO_NEGATIVE_AND_ZERO, EXISTENCE, TYPE}

    ;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Type.NO_NEGATIVE_AND_ZERO, 0, 1, 1, "Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия."},
                {Type.NO_NEGATIVE_AND_ZERO, 1, 0, 1, "Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия."},
                {Type.NO_NEGATIVE_AND_ZERO, 1, 1, 0, "Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия."},
                {Type.NO_NEGATIVE_AND_ZERO, -1, 1, 1, "Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия."},
                {Type.NO_NEGATIVE_AND_ZERO, 1, -1, 1, "Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия."},
                {Type.NO_NEGATIVE_AND_ZERO, 1, 1, -1, "Ввод отрицательных чисел или 0 для определения значения стороны треугольника запрещен! Попробуйте снова, учитывая условия."},
                {Type.EXISTENCE, 8, 5, 4, "Треугольник существует."},
                {Type.EXISTENCE, 10000, 15000, 17000, "Треугольник существует."},
                {Type.EXISTENCE, 999999999, 777777777, 1000000000, "Треугольник существует."},
                {Type.EXISTENCE, 1, 2, 3, "Треугольник не существует."},
                {Type.EXISTENCE, 10000, 20000, 10000, "Треугольник не существует."},
                {Type.EXISTENCE, 100000000, 999999999, 1, "Треугольник не существует."},
                {Type.TYPE, 2, 2, 3, "Треугольник равнобедренный."},
                {Type.TYPE, 10000, 15000, 10000, "Треугольник равнобедренный."},
                {Type.TYPE, 999999999, 1000000000, 1000000000, "Треугольник равнобедренный."},
                {Type.TYPE, 7, 7, 7, "Треугольник равносторонний."},
                {Type.TYPE, 20000, 20000, 20000, "Треугольник равносторонний."},
                {Type.TYPE, 1000000000, 1000000000, 1000000000, "Треугольник равносторонний."},
                {Type.TYPE, 3, 5, 7, "Треугольник ни равнобедренный, ни равносторонний."},
                {Type.TYPE, 10000, 12000, 20000, "Треугольник ни равнобедренный, ни равносторонний."},
                {Type.TYPE, 1000000000, 888888888, 555555555, "Треугольник ни равнобедренный, ни равносторонний."},
        });
    }


    @Test
    public void triangleNoNegativeAndZeroNumbers() {
        Assume.assumeTrue(type == Type.NO_NEGATIVE_AND_ZERO);
        assertEquals(expectedResult, triangle.TriangleNoNegativeAndZeroNumbers(firstSide, secondSide, thirdSide));
    }

    @Test
    public void triangleExists() {
        Assume.assumeTrue(type == Type.EXISTENCE);
        assertEquals(expectedResult, triangle.TriangleExists(firstSide, secondSide, thirdSide));
    }

    @Test
    public void triangleType() {
        Assume.assumeTrue(type == Type.TYPE);
        assertEquals(expectedResult, triangle.TriangleType(firstSide, secondSide, thirdSide));
    }



    /*@Test
    public void triangleNoNegativeAndZeroNumbers() {
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
    }*/
}
