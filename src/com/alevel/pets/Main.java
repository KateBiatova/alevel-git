package com.alevel.pets;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getSay());

        Dog dog = new Dog();
        System.out.println(dog.getSay());

        Pet[] pets = new Pet[] {new Cat(), new Dog()};

        for (Pet pet : pets) {
            System.out.println(pet.getSayTwice());
        }

        Seasons seasons = Seasons.SPRING; // пока не понятно, что это за enum :(
        System.out.println(seasons.name); // Spring
        System.out.println(seasons.getName()); //SPRING

//        public String getString(Seasons season) {  у меня этот кусок не работает
//            String result;
//            switch (season) {
//                case WINTER: result = "Winter";
//                default: return Null;
//            }
//        }

    }
}
