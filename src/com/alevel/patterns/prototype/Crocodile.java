package com.alevel.patterns.prototype;

public class Crocodile extends Animal{

    public Crocodile(){
        classOfAnimal = "Amphibian";
    }

    @Override
    public void move() {
        System.out.print("Crocodile can run and swim. ");
    }

    @Override
    public void live() {
        System.out.print("Crocodile lives in rivers and lakes. ");
    }
}
