package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime hour = LocalTime.now();
        if (hour.isAfter(LocalTime.of(6,0)) && hour.isBefore(LocalTime.of(20,0))){
            return false;
        }
        return false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
