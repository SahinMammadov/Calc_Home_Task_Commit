package org.abbtech.lesson1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Calculator!");

        System.out.println("Enter first number! ");
        double number1 = sc.nextDouble();

        System.out.println("Enter second number! ");
        double number2 = sc.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice: ");
        int choise = sc.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Result= " + calculator.addition(number1, number2));
                break;
            case 2:
                System.out.println("Result= " + calculator.subtraction(number1, number2));
                break;
            case 3:
                System.out.println("Result= " + calculator.multiplication(number1, number2));
                break;
            case 4:
                System.out.println("Result= " + calculator.division(number1, number2));
        }
    }
}
