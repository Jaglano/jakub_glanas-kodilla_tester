package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirport(){
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("LasPalmas", false);
        airports.put("Warsaw", true);
        return airports;
    }

    public boolean isAirportInUse(String airport) throws AirportNotFoundExpection {
        if (getListOfAirport().containsKey(airport))
            return getListOfAirport().get(airport);
        throw new AirportNotFoundExpection();
    }
}
