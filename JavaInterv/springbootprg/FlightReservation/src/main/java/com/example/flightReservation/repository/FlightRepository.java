package com.example.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightReservation.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{

}
