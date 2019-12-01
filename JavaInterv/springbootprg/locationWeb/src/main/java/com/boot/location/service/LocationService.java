package com.boot.location.service;

import java.util.List;

import com.boot.location.model.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void DeleteLocation(Location location);

	Location getLocationById(long id);

	List<Location> getAllLocations();
}
