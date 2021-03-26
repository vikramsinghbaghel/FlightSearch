package com.nagarro.flightsearch;

import java.util.Scanner;

import com.nagarro.validation.Validate;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String deptLoc;
		String arrivalLoc;
		String date;
		String flightClass;
		int choiceCode;
		Validate validate = new Validate();
		do {
			System.out.print("Enter Departure Location  : ");
			deptLoc = sc.nextLine().toUpperCase();
		} while (!validate.departLoc(deptLoc));

		do {
			System.out.print("Enter Arrival Location  : ");
			arrivalLoc = sc.nextLine().toUpperCase();
		} while (!validate.arrivalLoc(arrivalLoc));

		do {
			System.out.print("Enter Date  (DD-MM-YYYY) : ");
			date = sc.nextLine().toUpperCase();
		} while (!validate.flightDate(date));

		do {
			System.out.print("Enter Class: (E or B or EB) : ");
			flightClass = sc.nextLine().toUpperCase();
		} while (!validate.flightClass(flightClass));

		do {
			System.out.print(
					"Enter Output Preference :   1. Fare \t 2. Flight Duration \nEnter Preference Choice Code : ");
			choiceCode = sc.nextInt();
		} while (choiceCode < 1 || choiceCode > 2);

		CsvReader air = new CsvReader(deptLoc, arrivalLoc, date, flightClass, choiceCode);
		Thread firstThread = new Thread(air);
		FolderWatcherService ws = new FolderWatcherService();

		Thread watcher = new Thread(ws);

		watcher.start();
		firstThread.start();

		sc.close();

	}
}
