package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Piłsudski", "50x50", true));
        stamps.add(new Stamp("Lokietek", "30x30", false));
        stamps.add(new Stamp("Jan Paweł II", "100x100", true));
        stamps.add(new Stamp("Grundwald", "20x20", false));
        stamps.add(new Stamp("Warszawa", "40x40", true));
        stamps.add(new Stamp("Piłsudski", "50x50", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }

    }
}
