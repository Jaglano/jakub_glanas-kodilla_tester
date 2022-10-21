package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {
    GamblingMachine gamblingMachine = new GamblingMachine();


    //test sprawdza
    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbersPass.csv")
    public void shouldCheckTheNumbersAreCorrect (int num1,int num2,int num3,int num4,int num5,int num6) throws InvalidNumbersException{
        Set<Integer> numbers = new HashSet<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        numbers.add(num6);
        int result = gamblingMachine.howManyWins(numbers);
        assertTrue(result >= 0 & result <= 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbersFail.csv")
    public void shouldThrowExceptionWhenIncorrectNumbers(String numbers){
        String[] numbersArray = numbers.split(",");
        Set<String> numbersInSet = new HashSet<>(Arrays.asList(numbersArray));
        List<Integer>test = numbersInSet
                .stream()
                .map(a->Integer.parseInt(a))
                .collect(Collectors.toList());
        Set<Integer> numToCheck = new HashSet<>(test);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.validateNumbers(numToCheck));
    }
}


