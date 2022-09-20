import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculateItSum() {
        double expression = Calculator.calculateIt("2+2");
        double expected = 4;
        assertEquals(expression, expected);
    }

    @Test
    void calculateItMulti() {
        double expression = Calculator.calculateIt("3*3");
        double expected = 9;
        assertEquals(expression, expected);
    }

    @Test
    void calculateItDiv() {
        double expression = Calculator.calculateIt("10/2");
        double expected = 5;
        assertEquals(expression, expected);
    }

    @Test
    void calculateItSub() {
        double expression = Calculator.calculateIt("10-7");
        double expected = 3;
        assertEquals(expression, expected);
    }

    @Test
    void calculateItPow() {
        double expression = Calculator.calculateIt("2^3");
        double expected = 8;
        assertEquals(expression, expected);
    }

    @Test
    void calculateItParenthesis() {
        double expression = Calculator.calculateIt("7*(6-3)");
        double expected = 21;
        assertEquals(expression, expected);
    }

    @Test
    void calculateItUnary() {
        double expression = Calculator.calculateIt("2-(-3)");
        double expected = 5;
        assertEquals(expression, expected);
    }

}