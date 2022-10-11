package com.kodilla.collections.adv.maps.extrahomework;

public class Solution {
    public static void main(String[] args) {
        int suma1 = sumaTablicy(new int[]{1, 2, 3, 4, 10, 11});
        int suma2 = sumaTablicy(new int[]{338, 65, 713, 595, 428, 610, 728, 573, 871, 868});

        if(suma1 == 31 && suma2 == 5789) {
            System.out.println("Suma została obliczona poprawnie");
        } else {
            System.out.println("Suma została obliczona błędnie");
        }
        long sumaDuzych1 = sumaDuzychLiczb(new long[]{1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L});
        long sumaDuzych2 = sumaDuzychLiczb(new long[]{10000000000L, 20000000000L, 30000000000L, 1000000004L, 1000000005L});

        if(sumaDuzych1 == 5000000015L && sumaDuzych2 == 62000000009L) {
            System.out.println("Suma dużych liczb została obliczona poprawnie");
        } else {
            System.out.println("Suma dużych liczb została obliczna błędnie");
        }

        int pair1 = numberOfPairs(new int[]{10, 10, 20});
        int pair2 = numberOfPairs(new int[]{10, 20, 30});
        int pair3 = numberOfPairs(new int[]{20, 20, 30, 40, 20});

            System.out.println("Znaleziona liczba par to: " + pair1);
            System.out.println("Znaleziona liczba par to: " + pair2);
            System.out.println("Znaleziona liczba par to: " + pair3);


    }

    private static Integer sumaTablicy(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static Long sumaDuzychLiczb(long[] array) {
        long sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        return sum2;
    }

    private static Integer numberOfPairs(int[] array) {
        //w argumencie metoda przyjmuje tablicę liczb
        //wyświetl/zwróć liczbę par znajduje się w tablicy
        //przykład 1: tablica zawiera: 10, 10, 20, wynik: w tablicy znajduje się jedna para
        //przykład 2: tablica zawiera: 10, 20, 30, wynik: w tablicy nie znajduje się żadna para
        //przykład 3: tablica zawiera: 20, 20, 30, 40, 20, wynik: w tablicy znajduje się jedna para
        int pairs = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}

