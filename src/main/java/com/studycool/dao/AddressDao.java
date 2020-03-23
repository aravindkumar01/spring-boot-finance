package com.studycool.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studycool.Repo.AddressDetailsRepo;
import com.studycool.model.AddressDetails;

@Component
public class AddressDao {

	
	@Autowired
	AddressDetailsRepo repo;
	
	
	public boolean save(AddressDetails address) {
		try {
			
			repo.save(address);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	
	public AddressDetails getAddress(String cus_fund_id) {
		try {
			
			return repo.getAddress(cus_fund_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
