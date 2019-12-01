package com.example.flightCheckIn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flightCheckIn.dto.Reservation;
import com.example.flightCheckIn.dto.ReservationUpdateRequest;
import com.example.flightCheckIn.integration.ReservationRestClient;

@Controller
public class CheckInController {

	@Autowired
	private ReservationRestClient client;
	
	@RequestMapping("/showstartcheckin")
	public String showStartCheckIn() {
		return "startCheckIn";
	}
	
	@RequestMapping("/startcheckin")
	public String startCheckIn(@RequestParam("reservationId") long reservationId,ModelMap map) {
		Reservation res=client.findReservation(reservationId);
		map.addAttribute("reservation", res);
		return "displayReservationDetails";
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") long reservationId,@RequestParam("noOfBags") int noOfBags) {
		ReservationUpdateRequest req = new ReservationUpdateRequest();
		req.setNoOfBags(noOfBags);
		req.setId(reservationId);
		client.updateReservation(req);
		return "checkInConfirm";
	}
}
