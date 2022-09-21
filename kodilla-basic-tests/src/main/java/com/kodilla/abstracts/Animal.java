package com.kodilla.abstracts;

public abstract class Animal {

    private int numerOfLegs;

    public Animal(int numerOfLegs) {
        this.numerOfLegs = numerOfLegs;
    }

    public int getNumerOfLegs(){
        return numerOfLegs;
    }

    public abstract void getVoice();
}
