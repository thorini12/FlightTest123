package com.example.FlightTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// THIS IS TEST FIXTURE

public class FlightTestApplicationTests{
	FlightController flightController = new FlightController();


	// This is for if the getFlights method fails?!
	@Test
	public void TestForFailure(){
		List<Flugferd> actualValue = flightController.getFlightsController();
		List<Flugferd> expectedValue = new ArrayList<Flugferd>();
		assertNotEquals(expectedValue, actualValue, "search has failed!!");
	}

	//if getFlights works?!
	@Test
	public void TestForSuccess(){
		List<Flugferd> actualValue = flightController.getFlightsController();
		List<Flugferd> expectedValue = new ArrayList<Flugferd>();
		expectedValue.add(new Flugferd(123,"Reykjavik","Akureyri",123));
		expectedValue.add(new Flugferd(133,"Reykjavik","Isafjordur",123));
		expectedValue.add(new Flugferd(113,"Reykjavik","Egilsstadir",123));
		for(int i = 0; i<actualValue.size(); i++){
			assertEquals(actualValue.get(i).getFlugnumer(),expectedValue.get(i).getFlugnumer());
		}
	}

	@Test
	public void search(){
		List<Flugferd> actualValue = flightController.SearchFlight("Akureyri");
		List<Flugferd> expectedValue = new ArrayList<Flugferd>();
		expectedValue.add(new Flugferd(123,"Reykjavik","Akureyri",123));
		for(int i = 0; i<actualValue.size(); i++){
			assertEquals(actualValue.get(i).getFlugnumer(),expectedValue.get(i).getFlugnumer());
		}
	}

	@Test
	public void searchButFail(){
		List<Flugferd> actualValue = flightController.SearchFlight("Reykjavik");
		List<Flugferd> expectedValue = new ArrayList<Flugferd>();
		expectedValue.add(new Flugferd(123,"Reykjavik","Akureyri",123));
		if(actualValue.size() == expectedValue.size()){
			for(int i = 0; i<actualValue.size(); i++){
				assertNotEquals(actualValue.get(i).getFlugnumer(), expectedValue.get(i).getFlugnumer());
			}
		}
	}

}
