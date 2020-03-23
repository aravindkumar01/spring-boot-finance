package com.studycool.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studycool.Repo.LocationRepo;
import com.studycool.model.Location;

@Component
public class LocationDao {
	
	@Autowired
	LocationRepo repo;
	
	public boolean loacationSave(Location location) {
		try {
			repo.save(location);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return  false;
		}
	}
	
	public Optional<Location> getLocation(long id) {
		
		try {
			
			return repo.findById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Location> getLocations(){
		try {
			
			return repo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	public Boolean delete(Long id) {
		try {
			
			repo.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
