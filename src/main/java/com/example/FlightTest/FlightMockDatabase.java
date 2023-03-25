package com.example.FlightTest;

import java.util.ArrayList;
import java.util.List;

public class FlightMockDatabase {

    // MOCK DATABASE

    public static List<Flugferd> getFlights(){
        List<Flugferd> mock_data = new ArrayList<Flugferd>();
        Flugferd mock_flight_1 = new Flugferd(123,"Reykjavik","Akureyri",123);
        Flugferd mock_flight_2 = new Flugferd(133,"Reykjavik","Isafjordur",123);
        Flugferd mock_flight_3 = new Flugferd(113,"Reykjavik","Egilsstadir",123);
        mock_data.add(mock_flight_1);
        mock_data.add(mock_flight_2);
        mock_data.add(mock_flight_3);
        return mock_data;
    }

}
