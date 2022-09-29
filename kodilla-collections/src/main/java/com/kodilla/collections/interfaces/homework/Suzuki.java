package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suzuki suzuki = (Suzuki) o;
        return speed == suzuki.speed && Double.compare(suzuki.accelerate, accelerate) == 0 && Double.compare(suzuki.brake, brake) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, accelerate, brake);
    }
}
