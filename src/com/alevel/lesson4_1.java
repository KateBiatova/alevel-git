package com.alevel;

import java.util.Arrays;

public class lesson4_1 {

    public static void main(String[] args) {

        int[] array = new int[]{25, 8, 11, 5, 4};
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}