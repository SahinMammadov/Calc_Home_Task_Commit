package org.abbtech.lesson1;

public class Calculator {
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if(b == 0 ){
           throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

}
