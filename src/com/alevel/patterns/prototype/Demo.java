package com.alevel.patterns.prototype;

public class Demo {
    public static void main(String[] args) {
        AnimalCache.loadCache();

        Animal clonedAnimal = (Animal) AnimalCache.getAnimal("Amphibian");
        System.out.print("Animal : " + clonedAnimal.getClassOfAnimal() + " ");
        clonedAnimal.move();
        clonedAnimal.live();
        System.out.println();

        Animal clonedAnimal2 = (Animal) AnimalCache.getAnimal("Bird");
        System.out.print("Animal : " + clonedAnimal2.getClassOfAnimal() + " ");
        clonedAnimal2.move();
        clonedAnimal2.live();
        System.out.println();

        Animal clonedAnimal3 = (Animal) AnimalCache.getAnimal("Mammal");
        System.out.print("Animal : " + clonedAnimal3.getClassOfAnimal() + " ");
        clonedAnimal3.move();
        clonedAnimal3.live();
        System.out.println();
    }
}
