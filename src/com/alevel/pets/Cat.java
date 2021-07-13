package com.alevel.pets;

public class Cat extends Pet{
    private String say = "Мяу-мяу!";
    public Cat() {
        super("Мяу"); // конструктор класса-родителя должен идти первым
        String superSay = getSay();
        String thisSay = this.say;
    }

    @Override // метод переопределен из родительского классса
    public  String getSay() {
        return say;
    }

    @Override
    public String getSayTwice() {
        return say+say;
    }
}
