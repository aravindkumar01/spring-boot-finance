package com.studycool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studycool.dao.LocationDao;
import com.studycool.model.Location;

@Service
public class LocationService {
	
	@Autowired
	LocationDao dao;
	
	public boolean saveLocation(Location location) {
		try {
			
			return dao.loacationSave(location);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	
	public Optional<Location> getLocation(long id){
		try {
			
			return dao.getLocation(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}
	
	
	public List<Location> getAll(){
		try {
			
			return dao.getLocations();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}


	public Boolean deleteLocation(Long id) {
	try {
		
		return dao.delete(id);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return false;
	}
	}


	
}
