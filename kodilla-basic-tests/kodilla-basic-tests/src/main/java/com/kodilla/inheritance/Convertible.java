package com.kodilla.inheritance;

public class Convertible extends Car {
    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public Convertible(int wheels, int seats) {
        super(wheels, seats);
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }
}

