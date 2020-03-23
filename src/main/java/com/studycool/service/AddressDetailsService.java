package com.studycool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studycool.dao.AddressDao;
import com.studycool.model.AddressDetails;

@Service
public class AddressDetailsService {
	
	
	@Autowired
	AddressDao dao;
	
	
	
	public boolean  save(AddressDetails address) {
		
		try {
			
			return dao.save(address);
					
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}

	
	public AddressDetails getAddress(String cus_fund_id) {
		
		try {
			
			return dao.getAddress(cus_fund_id);
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			return null;
		}
	}
	
}
