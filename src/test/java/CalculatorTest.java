import org.junit.jupiter.api.Test;
import tdd.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator cal = new Calculator();
    int a = 2;
    int b = 5;

    @Test
    public void testAddition() {
        int expected = a + b;
        int actual = cal.add(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction() {
        int expected = a - b;
        int actual = cal.subtract(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplication() {
        int expected = a * b;
        int actual = cal.multiply(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        int expected = a / b;
        int actual = cal.divide(a, b);
        assertEquals(expected, actual);
    }
}
