package com.nagarro.compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.nagarro.entities.FlightDetails;

public class DurationCompare {
	
	public void durationCompare(List<FlightDetails> flightList) {
		Collections.sort(flightList, new Comparator<FlightDetails>() {
			@Override
			public int compare(FlightDetails o1, FlightDetails o2) {
				return (int) (o1.getDuration() - o2.getDuration());
			}
		});
	}

}
