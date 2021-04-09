package com.nagarro.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.nagarro.entities.FlightDetails;

public class FareCompare {
	
	public void compareFare(List<FlightDetails> flightList) {

		Collections.sort(flightList, new Comparator<FlightDetails>() {
			@Override
			public int compare(FlightDetails o1, FlightDetails o2) {
				return o1.getFare() - o2.getFare();
			}
		});
	}
}
