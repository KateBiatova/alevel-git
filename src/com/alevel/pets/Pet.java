package com.alevel.pets;

public abstract class Pet implements PetInterface{
    private final String say;
    protected Pet (String say) {  //protected - их можно вызвать только из чилдов
    this.say = say;
    }

    public  String getSay() {
        return say;
    }

    public String getSayTwice(){
        return getSay() + getSay();
    }
}
