package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTest {

    @Test
    public void shouldChooseCarDepensOfSeason(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        //When
        String carType = car.getCarType();
        System.out.println(carType);
        //Then
        List<String> possibleCarTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleCarTypes.contains(carType));
    }

    @Test
    public void shouldCheckLightsOnorOff(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        boolean lights = car.hasHeadlightsTurnedOn();
        Assertions.assertFalse(lights);
    }

}