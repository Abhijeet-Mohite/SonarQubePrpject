package com.example.sonarpractice;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
        return result;
    }

    public void printMessage() {
        System.out.println("Hello SonarQube");
    }
}