package com.nagarro.entities;

public class FlightDetails {

	private String flightNumber;
	private String departLocation;
	private String arrivalLocation;
	private String date;
	private int time;
	private float duration;
	private int fare;
	private String seat;
	private String flightClass;

	public FlightDetails() {
	}

	public FlightDetails(String flightNum, String departLoc, String arrivalLoc, String date, int time, float duration,
			int fare, String seat, String fClass) {
		this.flightNumber = flightNum;
		this.departLocation = departLoc;
		this.arrivalLocation = arrivalLoc;
		this.date = date;
		this.time = time;
		this.duration = duration;
		this.fare = fare;
		this.seat = seat;
		this.flightClass = fClass;

	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getfClass() {
		return flightClass;
	}

	public void setfClass(String fClass) {
		this.flightClass = fClass;
	}

	public String getFlightNum() {
		return flightNumber;
	}

	public void setFlightNum(String flightNum) {
		this.flightNumber = flightNum;
	}

	public String getDepartLoc() {
		return departLocation;
	}

	public void setDepartLoc(String departLoc) {
		this.departLocation = departLoc;
	}

	public String getArrivalLoc() {
		return arrivalLocation;
	}

	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLocation = arrivalLoc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

}
