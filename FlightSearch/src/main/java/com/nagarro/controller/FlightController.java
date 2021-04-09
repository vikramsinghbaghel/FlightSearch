package com.nagarro.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.nagarro.compare.DurationCompare;
import com.nagarro.compare.FareCompare;
import com.nagarro.display.FlightView;
import com.nagarro.entities.FlightDetails;

public class FlightController {
	private List <FlightDetails> flightList = new ArrayList<>();
	

	public List <FlightDetails> searchFlight(String fileName, String deptLocation, String arrivalLocation, String date,
			String fileClass) throws FileNotFoundException  {
		
		Scanner sc = new Scanner(new File(fileName));
		
		List<String> array;
		
		while (sc.hasNext()) {
			String line = sc.nextLine().toUpperCase();

			if (!line.isEmpty()) {
				StringTokenizer token = new StringTokenizer(line, "|");
				array = new ArrayList<>(line.length());
				while (token.hasMoreTokens()) {
					array.add(token.nextToken());
				}
				Date date1=null;
				Date date2=null;
				try {
				 date1 = new SimpleDateFormat("dd-MM-yyyy").parse(array.get(3));
				 date2 =new SimpleDateFormat("dd-MM-yyyy").parse(date);
				}catch(Exception e) {
					
				}
				//SimpleDateFormat formatter1=new SimpleDateFormat("dd-MM-yyyy");
				if (array.get(1).equals(deptLocation) && array.get(2).equals(arrivalLocation) && (date2.compareTo(date1)<0)
						&& "EB".contains(fileClass)) {
					FlightDetails details = new FlightDetails(array.get(0), array.get(1), array.get(2), array.get(3),
							Integer.parseInt(array.get(4)), Float.parseFloat(array.get(5)),
							Integer.parseInt(array.get(6)), array.get(7), array.get(8));

					flightList.add(details);
				}
			}
		}
		return flightList;
	}

	public void updateView(int choiceCode, List<FlightDetails> flightList) {
		if (choiceCode == 1) {
			FareCompare fc =new FareCompare();
			fc.compareFare(flightList);
			
		} 
		else if (choiceCode == 2) {
			DurationCompare fc =new DurationCompare();
			fc.durationCompare(flightList);
			
		} else {
			System.out.println("Wrong Choice.");
			return;
		}
		
		FlightView view = new FlightView();
		
		view.viewFlights(flightList);

	}
}