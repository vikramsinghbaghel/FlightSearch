package com.nagarro.entities;

public class FlightDetails {

	private String flightNum;
	private String departLoc;
	private String arrivalLoc;
	private String date;
	private int time;
	private float duration;
	private int fare;
	private String seat;
	private String fClass;

	public FlightDetails() {
	}

	public FlightDetails(String flightNum, String departLoc, String arrivalLoc, String date, int time, float duration,
			int fare, String seat, String fClass) {
		this.flightNum = flightNum;
		this.departLoc = departLoc;
		this.arrivalLoc = arrivalLoc;
		this.date = date;
		this.time = time;
		this.duration = duration;
		this.fare = fare;
		this.seat = seat;
		this.fClass = fClass;

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
		return fClass;
	}

	public void setfClass(String fClass) {
		this.fClass = fClass;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getDepartLoc() {
		return departLoc;
	}

	public void setDepartLoc(String departLoc) {
		this.departLoc = departLoc;
	}

	public String getArrivalLoc() {
		return arrivalLoc;
	}

	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
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
