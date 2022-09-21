package com.kodilla.abstracts.homework;

public class Rectangular extends Shape{

    public Rectangular(){
        super(10, 10, 15, 10);
    }

    @Override
    public void calculateField() {
        double field;
        field = getA() * getB();
        System.out.println("Rectangular field is: " + field);
    }

    @Override
    public void calcuateCircuit() {
        double circuit;
        circuit = getA() * 2 + getB() * 2;
        System.out.println("Rectangular circuit is: " + circuit);
    }
}
