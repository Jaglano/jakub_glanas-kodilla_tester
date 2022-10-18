package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private UserValidator validator = new UserValidator();


    //test dla Username poprawnego
    @ParameterizedTest
    @ValueSource (strings = {"mateuszdragonwielki","uszyurbana1989","okon.krol.wod.2022","Kuba","L.Hamilt0n"})
    public void shouldReturnTrueForCorrectUsername(String username){
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    //test dla Username błędny
    @ParameterizedTest
    @ValueSource (strings = {"11", "Oli sadebe*","@@@"})
    public void shouldReturnFalseForIncorrectUsername(String username){
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    //test jeśli Username == Null  + if (null != username) dodane do metody .validateUsername
    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfUsernameNull(String username){
        assertFalse(validator.validateUsername(username));
    }

    //test poprawne mail
    @ParameterizedTest
    @ValueSource (strings = {"kubica.123@gmail.com", "vettel2022@wp.pl", "hamilton7@amorek.pl"})
    public void shouldReturnTrueIfMailIsCorrect(String mail){
        boolean result = validator.validateEmail(mail);
        assertTrue(result);
    }

    //test błędny mail
    @ParameterizedTest
    @ValueSource (strings = {"kubica123gmail.com", "vetterl2022wp.pl","@amorek.plhamilton7"})
    public void shoudReturnFalseIfMailIsIncorect(String mail){
        boolean result = validator.validateEmail(mail);
        assertFalse(result);
    }




}