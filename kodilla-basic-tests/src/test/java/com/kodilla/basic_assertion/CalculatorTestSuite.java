package com.kodilla.basic_assertion;

import com.kodilla.basic_asserion.Calculator;
import org.junit.jupiter.api.Test;

import java.net.CacheRequest;

import static com.kodilla.basic_asserion.ResultChecker.assertEquals2;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        double a = 50;
        double b = 10;
        double delta = 0.1;
        double substractResult = calculator.substract(a, b);
        assertEquals2(40, substractResult, delta);
    }

    @Test
    public void testSquare(){
        Calculator calculator = new Calculator();
        double a = 50.0;
        double b = 0;
        double delta = 0.1;
        double squaredResult = calculator.squared(a, a);
        assertEquals2(2250, squaredResult, delta);
    }

    @Test
    public void testSquare2(){
        Calculator calculator = new Calculator();
        double a = 0.0;
        double b = 0;
        double delta = 0.1;
        double squaredResult = calculator.squared(a, a);
        assertEquals2(0, squaredResult, delta);
    }

    public void testSquare3(){
        Calculator calculator = new Calculator();
        double a = -50;
        double b = 0;
        double delta = 0.1;
        double squaredResult = calculator.squared(a, a);
        assertEquals2(-2250, squaredResult, delta);
    }
}