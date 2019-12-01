package com.example.flightReservation.model;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{
	
	
	private String flightNum;
	private String airLinesName;
	private String deptCity;
	private String arrivCity;
	private Date dod;
	private Timestamp eDT;
	
	
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public String getAirLinesName() {
		return airLinesName;
	}
	public void setAirLinesName(String airLinesName) {
		this.airLinesName = airLinesName;
	}
	public String getDeptCity() {
		return deptCity;
	}
	public void setDeptCity(String deptCity) {
		this.deptCity = deptCity;
	}
	public String getArrivCity() {
		return arrivCity;
	}
	public void setArrivCity(String arrivCity) {
		this.arrivCity = arrivCity;
	}
	public Date getDod() {
		return dod;
	}
	public void setDod(Date dod) {
		this.dod = dod;
	}
	public Timestamp geteDT() {
		return eDT;
	}
	public void seteDT(Timestamp eDT) {
		this.eDT = eDT;
	}
	
}
