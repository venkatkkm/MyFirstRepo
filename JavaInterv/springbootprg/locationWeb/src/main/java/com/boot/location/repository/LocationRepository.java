package com.boot.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.location.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
