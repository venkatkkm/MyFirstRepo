package com.example.flightCheckIn.integration;

import org.springframework.stereotype.Component;

import com.example.flightCheckIn.dto.Reservation;
import com.example.flightCheckIn.dto.ReservationUpdateRequest;

@Component
public interface ReservationRestClient {

	public Reservation findReservation(long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}
