package com.alevel.HW2;

public class ex2 {
    public static void main(String[] args) {
        long number = 2547413225L;
        String binaryNumber = Long.toBinaryString(number);
//        System.out.println(binaryNumber);
//        System.out.println(binaryNumber.length());

        int count = 0;
        for (int i = 0; i<binaryNumber.length()-1; i++) {
            if (binaryNumber.charAt(i) == '1'){
                count = count +1;
            }
        }
        System.out.println("The number of 1 in the binary string is " + count);
    }
}
