package com.kodilla.basic_asserion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substractResult = calculator.substract(a,b);
        boolean correctSubstract = ResultChecker.assertEquals(-3, substractResult);
        if (correctSubstract) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squaredResult = calculator.squared(a,a);
        boolean correctSquared = ResultChecker.assertEquals(25, squaredResult);
        if (correctSquared) {
            System.out.println("Metoda squaredResult działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda squaredResult nie działa poprawnie dla liczby " + a);
        }

    }
}