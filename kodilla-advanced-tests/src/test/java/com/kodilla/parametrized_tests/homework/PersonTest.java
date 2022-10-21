package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.StringSources;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonToCalculateBMI")
    public void ShouldCalculateBMI(String expected, Person person){
        assertEquals(expected, person.getBMI());
    }

}