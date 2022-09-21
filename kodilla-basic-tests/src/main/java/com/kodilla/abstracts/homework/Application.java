package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.AnimalProcessor;
import com.kodilla.abstracts.Dog;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        Triangle triangle = new Triangle();
        triangle.calculateField();
        triangle.calcuateCircuit();

        Square square = new Square();
        square.calculateField();
        square.calcuateCircuit();

        Rectangular rectangular = new Rectangular();
        rectangular.calculateField();
        rectangular.calcuateCircuit();

    }


}
