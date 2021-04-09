package com.nagarro.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
	public boolean departLoc(String deptLoc) {
		if (deptLoc.length() != 3) {
			System.out.println("The depart Location should have 3 characters");
			return false;
		} else if (deptLoc.matches("[A-Z][A-Z][A-Z]")) {
			return true;
		} else {
			System.out.println("Should contain only Alphabets");
			return false;
		}
	}

	public boolean arrivalLoc(String arrivalLoc) {
		if (arrivalLoc.length() != 3) {
			System.out.println("The arrival Location should have 3 characters");
			return false;
		} else if (arrivalLoc.matches("[A-Z][A-Z][A-Z]")) {
			return true;
		} else {
			System.out.println("Should contain only Alphabets");
			return false;
		}
	}

	public boolean flightDate(String date) {
//		if (date.matches("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$")) {
//			return true;
//		} 
//		else if()
//		
//		{
//			System.out.println("DD-MM-YYYY should be the date format");
//			return false;
//		}
		
		SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
	    sdfrmt.setLenient(false);
	    
	    try
	    {
	        Date javaDate = sdfrmt.parse(date); 
	      //  System.out.println(date+" is valid date format");
	        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
	        Date currentdate = new Date();  
	        formatter.format(currentdate);
	     //   if(javaDate.before(currentdate)) {
	        if(javaDate.compareTo(currentdate)<=0) {
	        	System.out.println("please enter the upcomming date");
	        	return false;
	        }
	    }
	   
	    catch (ParseException e)
	    {
	        System.out.println(date+" is Invalid Date format");
	        return false;
	    }
	   
	    return true;
	}
		

	public boolean flightClass(String flightClass) {
		if (flightClass.equals("E") || flightClass.equals("B") || flightClass.equals("EB")) {
			return true;
		} else {
			System.out.println("The flight Class Should be either E or B or EB ");
			return false;
		}

	}

}