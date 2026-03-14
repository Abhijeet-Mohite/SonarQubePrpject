package com.example.sonarpractice;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum = calculator.add(10, 20);
        System.out.println("Sum is: " + sum);

        int result = calculator.divide(10, 0);
        System.out.println("Division result: " + result);

    }
}