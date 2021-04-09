package com.nagarro.display;

import java.util.List;

import com.nagarro.entities.FlightDetails;

public class FlightView {

	public void viewFlights(List <FlightDetails> flightList)

	{
		System.out.println("\n \t\t ***** FLIGHT INFORMATION *****");
		System.out.println("FLIGHT_NO |DEP_LOC|ARR_LOC|VALID_TILL|TIME|FARE|DURATION|SEAT_AVAILABE|CLASS");
		for (FlightDetails flight : flightList) {
			System.out.print(flight.getFlightNum() + "|");
			System.out.print(flight.getDepartLoc() + "|");
			System.out.print(flight.getArrivalLoc() + "|");
			System.out.print(flight.getDate() + "|");
			System.out.print(flight.getTime() + "|");
			System.out.print(flight.getFare() + "|");
			System.out.print(flight.getDuration() + "|");
			System.out.print(flight.getSeat() + "|");
			System.out.println(flight.getfClass() + "");
		}
		if (flightList.isEmpty()) {
			System.out.println("Flights Not Available.");
		}
	}
}
