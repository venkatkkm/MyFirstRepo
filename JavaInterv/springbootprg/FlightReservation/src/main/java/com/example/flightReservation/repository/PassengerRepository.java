package com.example.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightReservation.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
