import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator cal = new Calculator();
    int a = 2;
    int b = 5;
    String StringNumbers = "1, 2, 3";
    int[] IntNumbers = {1, 2, 3};

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

    @Test
    @DisplayName("Addition with String input")
    public void testStringAddition(){
        int expected = 6;
        int actual = cal.add(StringNumbers);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Addition with int array input")
    public void testArrayAddition(){
        int expected = 6;
        int actual = cal.add(IntNumbers);
    }
}
