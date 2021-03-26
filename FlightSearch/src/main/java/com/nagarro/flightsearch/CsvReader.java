package com.nagarro.flightsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.nagarro.controller.FlightController;
import com.nagarro.entities.FlightDetails;

public class CsvReader implements Runnable {
	FlightController flightController;
	private String deptLoc;
	private String arrivalLoc;
	private String date;
	private String fClass;
	private int choiceCode;
	ArrayList<FlightDetails> flightList;

	public CsvReader(String deptLoc, String arrivalLoc, String date, String fClass, int choice) {
		super();

		this.deptLoc = deptLoc;
		this.arrivalLoc = arrivalLoc;
		this.date = date;
		this.fClass = fClass;
		this.choiceCode = choice;

	}

	public void run() {

		FlightController fc = new FlightController();
		ArrayList<FlightDetails> flightList = new ArrayList<>();

		File folder = new File("Resources");
		for (File file : folder.listFiles()) {

			String filename = "Resources//" + file.getName();

			try {
				flightList = fc.searchFlight(filename, deptLoc, arrivalLoc, date, fClass);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		}

		fc.updateView(choiceCode, flightList);

	}

}
