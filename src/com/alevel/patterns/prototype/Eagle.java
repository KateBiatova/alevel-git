package com.alevel.patterns.prototype;

public class Eagle extends Animal{
    public Eagle(){
        classOfAnimal = "Bird";
    }

    @Override
    void move() {
        System.out.print("Eagle can fly. ");
    }

    @Override
    void live() {
        System.out.print("Eagle lives on trees and mountain rocks. ");
    }
}

