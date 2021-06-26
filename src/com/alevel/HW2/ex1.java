package com.alevel.HW2;

public class ex1 {
    public static void main(String[] args) {
        int myNumber = 347693485;
        while (myNumber > 0) {
            int i = myNumber % 10;
            myNumber = myNumber / 10;
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("fizzbuzz");
            } else {
                if (i % 2 == 0) {
                    System.out.println("fizz");
                } else {
                    if (i % 3 == 0) {
                        System.out.println("buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
