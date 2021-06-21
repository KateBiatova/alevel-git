package com.alevel;

public class Fibonacci {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        while (secondNumber < 100) {
            int fibonacci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = fibonacci;
            System.out.println(fibonacci);
        }
    }
}
