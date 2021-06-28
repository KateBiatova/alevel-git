package com.alevel.HW3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringArray myArray = new StringArray();
        myArray.createArray(2, 4, 9, 7, 1);
        System.out.println(Arrays.toString(myArray.createArray(2, 4, 9, 7, 1)));


        myArray.toOneSting();
        System.out.println(myArray.toOneSting());

        myArray.insertSorting(myArray.createArray(2, 4, 9, 7, 1));
        System.out.println(Arrays.toString(myArray.insertSorting(myArray.createArray(2, 4, 9, 7, 1))));

        myArray.insertSortingDecrease(myArray.createArray(2, 4, 9, 7, 1));
        System.out.println(Arrays.toString(myArray.insertSortingDecrease(myArray.createArray(2, 4, 9, 7, 1))));
    }
}
