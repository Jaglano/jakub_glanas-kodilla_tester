package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightReposity {

    public static List<Flight> getFlightsTable(){
        List<Flight> flightRepository = new ArrayList<>();
        flightRepository.add(new Flight("Cracow", "Szczecin"));
        flightRepository.add(new Flight("Cracow", "Berlin"));
        flightRepository.add(new Flight("Cracow", "Paris"));
        return flightRepository;
    }


}
