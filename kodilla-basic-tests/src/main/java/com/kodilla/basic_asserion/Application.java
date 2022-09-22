package com.kodilla.basic_asserion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        double c = 5.0;
        double d = 8.0;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double substractResult = calculator.substract(c,d);
        boolean correctSubstract = ResultChecker.assertEquals2(-3.0, substractResult, 0.1);
        if (correctSubstract) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + c + " i " + d);
        }

        double squaredResult = calculator.squared(c,c);
        boolean correctSquared = ResultChecker.assertEquals2(25, squaredResult, 0.1);
        if (correctSquared) {
            System.out.println("Metoda squaredResult działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda squaredResult nie działa poprawnie dla liczby " + c);
        }

    }
}