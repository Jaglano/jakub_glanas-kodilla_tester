package com.kodilla.collections.interfaces.homework;

public class Suzuki implements Car {
    int speed;
    double accelerate;
    double brake;

    public Suzuki(int speed, double accelerate, double brake){
        this.speed = speed;
        this.accelerate = accelerate;
        this.brake = brake;
    }

    @Override
    public int getSpeed() {
        System.out.println("Suzuki ma prędkość: ");
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
