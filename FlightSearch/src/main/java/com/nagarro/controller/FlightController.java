package com.nagarro.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.nagarro.display.FlightView;
import com.nagarro.entities.FlightDetails;

public class FlightController {
	ArrayList<FlightDetails> flightList = new ArrayList<>();
	ArrayList<String> array;
	FlightView view = new FlightView();

	public ArrayList<FlightDetails> searchFlight(String filename, String dept_loc, String arrival_loc, String date,
			String fClass) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(filename));

		while (sc.hasNext()) {
			String line = sc.nextLine().toUpperCase().toString();

			if (!line.isEmpty()) {
				StringTokenizer token = new StringTokenizer(line, "|");
				array = new ArrayList<>(line.length());
				while (token.hasMoreTokens()) {

					array.add(token.nextToken());
				}

				if (array.get(1).equals(dept_loc) && array.get(2).equals(arrival_loc) && array.get(3).equals(date)
						&& array.get(8).equals(fClass)) {
					FlightDetails details = new FlightDetails(array.get(0), array.get(1), array.get(2), array.get(3),
							Integer.parseInt(array.get(4)), Float.parseFloat(array.get(5)),
							Integer.parseInt(array.get(6)), array.get(7), array.get(8));

					flightList.add(details);
				}
			}
		}
		return flightList;
	}

	public void updateView(int choiceCode, ArrayList<FlightDetails> flightList) {
		if (choiceCode == 1) {
			Collections.sort(flightList, new Comparator<FlightDetails>() {
				@Override
				public int compare(FlightDetails o1, FlightDetails o2) {
					return o1.getFare() - o2.getFare();
				}
			});
		} else if (choiceCode == 2) {
			Collections.sort(flightList, new Comparator<FlightDetails>() {
				@Override
				public int compare(FlightDetails o1, FlightDetails o2) {
					return (int) (o1.getDuration() - o2.getDuration());
				}
			});
		} else {
			System.out.println("Wrong Choice.");
			return;
		}
		view.viewFlights(flightList);

	}
}