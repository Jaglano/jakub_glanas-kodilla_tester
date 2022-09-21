package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double height;
    private double a;
    private double b;
    private double c;

    public Shape(double height, double a, double b, double c) {
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getHeight() {
        return height;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public abstract void calculateField();
    public abstract void calcuateCircuit();
}
