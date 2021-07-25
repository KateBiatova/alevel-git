package com.alevel.patterns.prototype;

import java.util.Hashtable;

public class AnimalCache {

    private static Hashtable<String, Animal> animalMap  = new Hashtable<String, Animal>();

    public static Animal getAnimal(String classOfAnimal) {
        Animal cachedAnimal = animalMap.get(classOfAnimal);
        return (Animal) cachedAnimal.clone();
    }

    public static void loadCache() {
        Crocodile crocodile = new Crocodile();
        crocodile.setClassOfAnimal("Amphibian");
        animalMap.put(crocodile.getClassOfAnimal(),crocodile);

        Eagle eagle = new Eagle();
        eagle.setClassOfAnimal("Bird");
        animalMap.put(eagle.getClassOfAnimal(),eagle);

        Cow cow = new Cow();
        cow.setClassOfAnimal("Mammal");
        animalMap.put(cow.getClassOfAnimal(), cow);
    }
}