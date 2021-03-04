package cz.jurca.pitestdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(calculator.add(1, 1), 2);
    }

    @Test
    void testSubtract() {
        assertEquals(calculator.subtract(0, 0), 0);
    }

    @Test
    void testMultiply() {
        assertEquals(calculator.multiply(0, 0), 0);
    }

    @Test
    void testDivide() {
        assertEquals(calculator.divide(0, 100), 0);
    }

    @Test
    void testIsPositive() {
        assertTrue(calculator.isPositive(5));
        assertFalse(calculator.isPositive(-5));
    }
}