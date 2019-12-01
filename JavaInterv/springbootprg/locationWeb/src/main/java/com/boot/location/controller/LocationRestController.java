package com.boot.location.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.location.model.Location;
import com.boot.location.repository.LocationRepository;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

	@Autowired
	LocationRepository locationRepo;
	
	@GetMapping
	public List<Location> getAllLocations(){
		return locationRepo.findAll();
	}
	
	@PostMapping
	public Location createLocation(@RequestBody Location loc) {
		return locationRepo.save(loc);
	}
	
	@PutMapping
	public Location updateLocation(@RequestBody Location loc) {
		return locationRepo.save(loc);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		locationRepo.deleteById((long)id);
	}
	
	@GetMapping("/{id}")
	public Optional<Location> getLocation(@PathVariable("id") int id) {
		return locationRepo.findById((long) id);
	}
}
