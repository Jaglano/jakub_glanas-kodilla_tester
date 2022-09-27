package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {
    int speed;
    double accelerate;
    double brake;

    public Skoda(int speed, double accelerate, double brake){
        this.speed = speed;
        this.accelerate = accelerate;
        this.brake = brake;
    }

    @Override
    public int getSpeed() {
        System.out.println("Skoda ma prędkość: ");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += accelerate;
    }

    @Override
    public void decreaseSpeed() {
        speed -= brake;
    }
}
