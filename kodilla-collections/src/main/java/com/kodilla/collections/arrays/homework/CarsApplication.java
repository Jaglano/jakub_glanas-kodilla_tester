package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Suzuki;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int k = 0; k < cars.length; k++ ) {
            cars[k] = drawCar();
        } for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        int a = random.nextInt(200);
        int b = random.nextInt(200);
        int c = random.nextInt(200);
        if (drawCarKind == 0) {
            return new Ford(a, 0, 0);
        } else if (drawCarKind == 1) {
            return new Suzuki(b, 0, 0);
        } else {
            return new Skoda(c, 0 ,0);
        }
    }

}
