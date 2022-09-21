package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square(){
        super(20, 20, 20, 20);
    }

    @Override
    public void calculateField() {
        double field;
        field = Math.pow(getA(),2);
        System.out.println("Square field is: " + field);
    }

    @Override
    public void calcuateCircuit() {
        double circuit;
        circuit = getA() * 4;
        System.out.println("Square circuit is: " + circuit);
    }
}
