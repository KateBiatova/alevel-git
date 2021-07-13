package com.alevel.pets;

public enum Seasons {
    WINTER ("Winter", 90),
    SPRING ("Spring", 91),
    SUMMER ("Summer", 92),
    AUTUMN ("Autumn", 90);

    String name;
    int days;

    Seasons (String name) {
        this.name = name;
    }

    Seasons (String name, int days) {
        this.name = name;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public String getName() {
        return name(); // имя SPRING
    }
}
