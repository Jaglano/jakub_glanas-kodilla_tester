package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public Triangle() {
        super(15, 10, 5, 2);
    }


    @Override
    public void calculateField() {
        double field;
        field = getA() * getHeight() / 2;

        System.out.println("Triangle field is: " + field);
    }

    @Override
    public void calcuateCircuit() {
        double circuit;
        circuit = getA() + getB() + getC();
        System.out.println("Triangle circuit is: " + circuit);
    }
}
