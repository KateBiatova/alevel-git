package com.alevel.homeworkOOP.solarSystem;

public class Planet implements GravityAcceleration{
    public static double gravConstant;
    public static double mass;
    public static double radius;
    public static String name;

    public Planet(String name, double gravConstant, double mass, double radius){
        this.name = name;
        this.gravConstant = gravConstant;
        this.mass = mass;
        this.radius = radius;
    }
//
//    public Planet() {
//
//    }

    @Override
    public double acceleration() {
        return Planet.gravConstant * Planet.mass / (Planet.radius * Planet.radius);
    }
}
