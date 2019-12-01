package com.boot.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.location.model.Location;
import com.boot.location.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService locServ;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping(path="/saveloc", method=RequestMethod.POST)
	public String saveLocation(@ModelAttribute("location") Location location,ModelMap modelMap) {
		Location locSaved=locServ.saveLocation(location);
		String msg="location saved with Id: "+locSaved.getId();
		modelMap.addAttribute("successMsg", msg);
		return "createLocation";
	}
	
	@RequestMapping(path="/displayLocations")
	public String displayLoc(ModelMap modelMap) {
		
		List<Location> locations = locServ.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	}
	
	@RequestMapping(path="/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap) {
		Location location=locServ.getLocationById(id);
		locServ.DeleteLocation(location);
		List<Location> locations = locServ.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	}
	@RequestMapping("/showUpdate")
	public String updateLocationView(@RequestParam("id") int id,ModelMap map) {
		Location loc=locServ.getLocationById(id);
		map.addAttribute("editLocations", loc);
		return "editLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location,ModelMap modelMap) {
		Location locSaved=locServ.updateLocation(location);
		List<Location> locations = locServ.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	} 
}
