package com.ecommerce.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.main.model.Location;
import com.ecommerce.main.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;

	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}
	
	public Location getLocationById(Integer id) {
		return locationRepository.findById(id).orElse(null);
	}
	
	public void addNewLocation(Location location) {
		locationRepository.save(location);
	}
	
	public void updateLocation(Location location) {
		locationRepository.save(location);
	}
	
	public void deleteLocation(Integer id) {
		locationRepository.deleteById(id);
	}
}
