package com.example.flightCheckIn.dto;

public class Reservation{

	private long id;
	private boolean checkedIn;
	private int noOfBags;
	
	private Passenger passenger;
	
	private Flight flight;
	
	
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNoOfBags() {
		return noOfBags;
	}
	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
}
