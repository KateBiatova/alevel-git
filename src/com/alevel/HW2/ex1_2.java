package com.alevel.HW2;

public class ex1_2 {
    public static void main(String[] args) {
        int myNumber = 347693485;
        String convertedNumber = Integer.toString(myNumber);
        String reverseNumber = "";
        for (int i = convertedNumber.length()-1; i >=0; i-- ){
            reverseNumber = reverseNumber + convertedNumber.charAt(i);
        }
        int finalConvertedNumber = Integer.parseInt(reverseNumber);

        while (finalConvertedNumber > 0) {
            int i = finalConvertedNumber % 10;
            finalConvertedNumber = finalConvertedNumber / 10;
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