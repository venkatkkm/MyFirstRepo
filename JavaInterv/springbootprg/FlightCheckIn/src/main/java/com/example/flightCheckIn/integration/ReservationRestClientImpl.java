package com.example.flightCheckIn.integration;

import org.springframework.web.client.RestTemplate;

import com.example.flightCheckIn.dto.Reservation;
import com.example.flightCheckIn.dto.ReservationUpdateRequest;

public class ReservationRestClientImpl implements ReservationRestClient {

	@Override
	public Reservation findReservation(long id) {
		RestTemplate restTemp = new RestTemplate();
		Reservation res=restTemp.getForObject("localhost:8080/reservations/"+id, Reservation.class);
		return res;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemp = new RestTemplate();
		Reservation res=restTemp.postForObject("localhost:8080/reservations/", request, Reservation.class);
		return res;
	}

}
