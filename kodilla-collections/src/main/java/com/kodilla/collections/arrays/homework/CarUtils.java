package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Suzuki;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {
    public static void describeCar (Car car) {
        System.out.println("_______________________");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println(car.getSpeed());
    }

    private static String getCarName(Car car){
        if (car instanceof Ford) {
            return "Ford";
        } else if (car instanceof Suzuki) {
            return "Suzuki";
        } else if (car instanceof Skoda) {
            return "Skoda";
        } else
            return "Unknown car name";
    }
}
