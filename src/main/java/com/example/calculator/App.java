package com.example.calculator;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double a = 10;
        double b = 5;

        System.out.println("Simple Calculator Demo");
        System.out.println("Add: " + a + " + " + b + " = " + calculator.add(a, b));
        System.out.println("Subtract: " + a + " - " + b + " = " + calculator.subtract(a, b));
        System.out.println("Multiply: " + a + " * " + b + " = " + calculator.multiply(a, b));
        System.out.println("Divide: " + a + " / " + b + " = " + calculator.divide(a, b));
    }
}