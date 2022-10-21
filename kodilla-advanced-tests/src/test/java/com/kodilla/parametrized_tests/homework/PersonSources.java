package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    private static Stream<Arguments> providePersonToCalculateBMI(){
        return Stream.of(
                Arguments.of("Very severely underweight", new Person(1.75,45.0)),
                Arguments.of("Severely underweight", new Person(1.75,47.0)),
                Arguments.of("Underweight", new Person(1.75,50)),
                Arguments.of("Normal (healthy weight)", new Person(1.75, 70.0)),
                Arguments.of("Overweight", new Person(1.75, 90)),
                Arguments.of("Obese Class I (Moderately obese)", new Person(1.75, 105)),
                Arguments.of("Obese Class II (Severely obese)", new Person(1.75, 120)),
                Arguments.of("Obese Class III (Very severely obese)", new Person(1.75, 130)),
                Arguments.of("Obese Class IV (Morbidly Obese)", new Person(1.75, 150)),
                Arguments.of("Obese Class V (Super Obese)", new Person(1.75, 170)),
                Arguments.of("Obese Class VI (Hyper Obese)", new Person(1.75, 185))

        );
    }
}