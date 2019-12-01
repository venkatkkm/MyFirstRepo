package com.example.flightReservation.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightReservation.dto.ReservationUpdateRequest;
import com.example.flightReservation.model.Reservation;
import com.example.flightReservation.repository.ReservRepository;

@RestController
@CrossOrigin
public class ReservationRestController {

	@Autowired
	ReservRepository reservRepo;
	
	@RequestMapping("/reservations/{id}")
	public Optional<Reservation> findReservById(@PathParam("id")long id) {
		
		return reservRepo.findById(id);
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		Reservation res=reservRepo.findById(request.getId()).get();
		res.setNoOfBags(request.getNoOfBags());
		res.setCheckedIn(request.isCheckedIn());
		Reservation r = reservRepo.save(res);
		return r;
	}
}
