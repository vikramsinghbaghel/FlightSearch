package com.nagarro.flightsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.nagarro.controller.FlightController;
import com.nagarro.entities.FlightDetails;

public class CsvReader implements Runnable {
	FlightController flightController;
	private String deptLocation;
	private String arrivalLocation;
	private String date;
	private String flightClass;
	private int choiceCode;
	List<FlightDetails> flightList;

	public CsvReader(String deptLoc, String arrivalLoc, String date, String fClass, int choice) {
		super();

		this.deptLocation = deptLoc;
		this.arrivalLocation = arrivalLoc;
		this.date = date;
		this.flightClass = fClass;
		this.choiceCode = choice;

	}

	public void run()  {

		FlightController fc = new FlightController();
		List <FlightDetails> flightList = new ArrayList<>();

		File folder = new File("Resources");
		for (File file : folder.listFiles()) {

			String filename = "Resources//" + file.getName();

			try {
				flightList = fc.searchFlight(filename, deptLocation, arrivalLocation, date, flightClass);

			} catch (FileNotFoundException e ) {

				e.printStackTrace();
			}
		}

		fc.updateView(choiceCode, flightList);

	}

}
