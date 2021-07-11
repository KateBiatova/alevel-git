package com.alevel.homeworkOOP.solarSystem;

public class demo {
    public static void main(String[] args) {
        Earth earth = new Earth();
        System.out.println("Earth: " + earth.acceleration());

        Mars mars = new Mars();
        System.out.println("Mars: " + mars.acceleration());

        Venus venus = new Venus();
        System.out.println("Venus: " + mars.acceleration());

        Saturn saturn = new Saturn();
        System.out.println("Saturn: " + mars.acceleration());
    }
}