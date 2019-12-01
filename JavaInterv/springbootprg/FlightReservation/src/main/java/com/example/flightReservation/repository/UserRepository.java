package com.example.flightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flightReservation.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
