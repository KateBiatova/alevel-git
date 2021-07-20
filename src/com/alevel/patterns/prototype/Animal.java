package com.alevel.patterns.prototype;

public abstract class Animal implements Cloneable {
    protected String classOfAnimal;

    abstract void move();

    abstract void live();

    public String getClassOfAnimal() {
        return classOfAnimal;
    }

    public void setClassOfAnimal(String classOfAnimal) {
        this.classOfAnimal = classOfAnimal;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
