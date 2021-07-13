package com.alevel.pets;

public class Dog extends Pet{
    private String say = "Гав-гав!";
    public Dog() {
        super("Гав"); // конструктор класса-родителя должен идти первым
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
