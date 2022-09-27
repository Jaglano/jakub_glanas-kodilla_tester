package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Ford ford = new Ford(220, 20, 30);
        doRace(ford);

        Skoda skoda = new Skoda(180, 20, 40);
        doRace(skoda);

        Suzuki suzuki = new Suzuki(160, 30, 15);
        doRace(suzuki);
    }

    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
