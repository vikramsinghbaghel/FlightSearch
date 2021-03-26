package com.nagarro.display;

import java.util.ArrayList;

import com.nagarro.entities.FlightDetails;

public class FlightView {

	public void viewFlights(ArrayList<FlightDetails> flightList)

	{
		System.out.println("\n \t\t ***** FLIGHT INFORMATION *****");
		System.out.println("FLIGHT_NO |DEP_LOC|ARR_LOC|VALID_TILL|TIME|FARE|DURATION|SEAT_AVAILABE|CLASS");
		for (FlightDetails f : flightList) {
			System.out.print(f.getFlightNum() + "|");
			System.out.print(f.getDepartLoc() + "|");
			System.out.print(f.getArrivalLoc() + "|");
			System.out.print(f.getDate() + "|");
			System.out.print(f.getTime() + "|");
			System.out.print(f.getFare() + "|");
			System.out.print(f.getDuration() + "|");
			System.out.print(f.getSeat() + "|");
			System.out.println(f.getfClass() + "");
		}
		if (flightList.isEmpty()) {
			System.out.println("Flights Not Available.");
		}
	}
}
