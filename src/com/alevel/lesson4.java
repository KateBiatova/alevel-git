package com.alevel;

import java.util.Arrays;

public class lesson4 {

    public static void main(String[] args) {

        int[] array = new int[]{0, 8, 3, 5, 4};

        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;

                    sorted = false;
                }
            }
        }
            System.out.println(Arrays.toString(array));
    }
}




