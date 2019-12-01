package com.example.flightReservation.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flightReservation.repository.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from")String from,@RequestParam("to") String to,@RequestParam("dod")@DateTimeFormat(pattern="mm-dd-yyyy") Date dod) {
		
		return "displayFlights";
	}
}
