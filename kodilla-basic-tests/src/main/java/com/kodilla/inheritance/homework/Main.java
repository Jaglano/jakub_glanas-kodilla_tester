package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        Ubuntu ubuntu = new Ubuntu(2004, "Ubuntu");
        ubuntu.turnOn();

        Vista vista = new Vista(2007, "Windows Vista");
        vista.turnOn();
    }
}
