package com.ecommerce.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.main.model.Location;
import com.ecommerce.main.service.LocationService;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/locations")
	public List<Location> getAllLocations() {
		return locationService.getAllLocations();
	}

	@GetMapping("/location/{id}")
	public Location getLocationById(@PathVariable Integer id) {
		return locationService.getLocationById(id);
	}

	@PostMapping("/location/addlocation")
	public void addNewLocation(@RequestBody Location location) {
		locationService.addNewLocation(location);
	}

	@PutMapping("/location/update/{id}")
	public void updateLocation(@RequestBody Location location) {
		locationService.updateLocation(location);
	}

	@DeleteMapping("/location/delete/{id}")
	public void deleteLocation(@PathVariable Integer id) {
		locationService.deleteLocation(id);
	}
}
