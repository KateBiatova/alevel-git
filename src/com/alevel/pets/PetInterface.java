package com.alevel.pets;

public interface PetInterface {

    public static final String SAY = "Ку!";
    String getSay();

    default String defaultSay() {
        return SAY;
    }}
