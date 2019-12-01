package com.example.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightReservation.model.Reservation;

@Repository
public interface ReservRepository extends JpaRepository<Reservation, Long>{

}
