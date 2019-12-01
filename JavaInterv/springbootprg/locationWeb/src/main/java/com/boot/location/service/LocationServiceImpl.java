package com.boot.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.location.model.Location;
import com.boot.location.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private
	LocationRepository locationRepo;

	@Override
	public Location saveLocation(Location location) {
		
		return getLocationRepo().save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		getLocationRepo().save(location);
		return location;
	}

	@Override
	public void DeleteLocation(Location location) {
		getLocationRepo().delete(location);
	}

	@Override
	public Location getLocationById(long id) {
		Location location = getLocationRepo().findById(1L).get();

		return location;
	}

	@Override
	public List<Location> getAllLocations() {
		return getLocationRepo().findAll();
	}

	public LocationRepository getLocationRepo() {
		return locationRepo;
	}

	public void setLocationRepo(LocationRepository locationRepo) {
		this.locationRepo = locationRepo;
	}

}
