package org.abbtech.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void additionPositiveTest() {
        double actualResult = calculator.addition(10, 5);
        Assertions.assertEquals(actualResult, 15);
    }
    @Test
    void additionNegativeTest() {
        double actualResult = calculator.addition(-10, -5);
        Assertions.assertEquals(actualResult, -15);
    }

    @Test
    void subtractionPostiveTest() {
        double actualResult = calculator.subtraction(40, 23);
        Assertions.assertEquals(actualResult, 17);
    }
    @Test
    void subtractionNegativeTest() {
        double actualResult = calculator.subtraction(-12, -23);
        Assertions.assertEquals(actualResult, 11);
    }

    @Test
    void multiplicationPozitiveTest() {
        double actualResult = calculator.multiplication(12, 13);
        Assertions.assertEquals(actualResult, 156);
    }
    @Test
    void multiplicationNegativeTest() {
        double actualResult = calculator.multiplication(-4, -3);
        Assertions.assertEquals(actualResult, 12);
    }

    @Test
    void multiplicationByZeroTest() {
        double actualResult = calculator.multiplication(10, 0);
        Assertions.assertEquals(actualResult, 0);
    }


    @Test
    void divisionPositiveTest() {
        double actualResult = calculator.division(20, 10);
        Assertions.assertEquals(actualResult, 2);
    }
    @Test
    void divisionNegativeTest() {
        double actualResult = calculator.division(-20, -10);
        Assertions.assertEquals(actualResult, 2);
    }
    @Test
    public void testDivision_ByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(10, 0);
        });
    }
}
