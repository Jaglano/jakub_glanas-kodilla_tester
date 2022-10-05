package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal kowalski = new Principal("Kowalski", "II LO");
        Principal taboret = new Principal("Taboret", "IV LO");
        Principal lew = new Principal("Lew", "X LO");
        Principal macierewicz = new Principal("Macierewicz", "IX LO");

        School kowalskiSchool = new School(Arrays.asList(10.0, 12.0, 22.0));
        School taboretSchool = new School(Arrays.asList(7.0, 10.0, 20.0));
        School lewSchool = new School(Arrays.asList(8.0, 13.0, 25.0));
        School macierewiczSchool = new School(Arrays.asList(15.0, 16.0));

        school.put(kowalski, kowalskiSchool);
        school.put(taboret,taboretSchool);
        school.put(lew, lewSchool);
        school.put(macierewicz, macierewiczSchool);

        for (Map.Entry<Principal, School> principalEntry: school.entrySet()) {
            System.out.println(principalEntry.getKey().getLastName() + ", name of school "
                    + principalEntry.getKey().getSchoolName() + ", sum of students "
                    + principalEntry.getValue().getSum());
        }
    }
}
