package com.example.FlightTest;

import java.util.ArrayList;
import java.util.List;

public class FlightController {

    // CONTROLLER

    public static List<Flugferd> getFlightsController(){
        List<Flugferd> flights = FlightMockDatabase.getFlights();
        return flights;
    }

    public static List<Flugferd> SearchFlight(String search){
        List<Flugferd> flights = FlightMockDatabase.getFlights();
        List<Flugferd> matches = new ArrayList<>();
        for(int i = 0; i < flights.size();i++){
            if(flights.get(i).getKomustadur().equals(search) || flights.get(i).getBrottfararstadur().equals(search)){
                matches.add(flights.get(i));
            }
        }
        return matches;
    }
}

