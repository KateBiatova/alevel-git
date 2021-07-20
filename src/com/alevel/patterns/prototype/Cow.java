package com.alevel.patterns.prototype;

public class Cow extends Animal{
    public Cow(){
        classOfAnimal = "Mammal";
    }

    @Override
    void move() {
        System.out.print("Cow can run. ");
    }

    @Override
    void live() {
        System.out.print("Cow lives in the barn on the farm. ");
    }
}
