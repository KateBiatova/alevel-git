package com.alevel.patterns.singletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singletonObject = Singleton.getInstance();
        singletonObject.showMessage();
    }
}
