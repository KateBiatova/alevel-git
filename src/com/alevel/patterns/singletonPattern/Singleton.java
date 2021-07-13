package com.alevel.patterns.singletonPattern;

public class Singleton {
    private static Singleton instance = new Singleton();  //создать объект класса
    private Singleton() {               //создать приватный конструктор, чтобы он не возвращал объекты в других классах
    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton(); //создать объект, если он не создан раньше
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("This is Singleton object");
    }
}
