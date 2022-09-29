package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Suzuki;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(200, 40, 40));
        cars.add(new Skoda(180, 30, 50));
        cars.add(new Suzuki(160, 40, 40));

        Suzuki suzuki = new Suzuki(160, 40, 40);

        cars.remove(0);
        cars.remove(suzuki);

        System.out.println(cars.size());

        for ( Car car: cars) {
            CarUtils.describeCar(car);
        }
    }
}
