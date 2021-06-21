package com.alevel;

public class FeedTheCat {
    public static void main(String[] args) {
        int numberOfFood = 5;
        while (numberOfFood > 0) {
            numberOfFood = numberOfFood - 1;
            System.out.println("Give the food to the cat");

            if (numberOfFood == 0) {
                System.out.println("I don't have what to give you");
            }
        }
    }
}
