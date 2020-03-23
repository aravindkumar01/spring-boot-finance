package com.studycool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studycool.dao.CustomerLoanDetailsDao;
import com.studycool.model.CustomerLoanDetails;

@Service
public class CustomerLoanDetailsService {

	
	
	@Autowired
	CustomerLoanDetailsDao dao;
	
	public boolean saveLoanDetails(CustomerLoanDetails loan) {
		
		try {
			
			dao.saveLoanDetails(loan);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	

	public CustomerLoanDetails getLoanByCusFundId(String cusFundId) {
		try {
			
			return dao.getLoanByCusFundId(cusFundId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	public List<CustomerLoanDetails> getListByCusFundId(String cusFundId){
		try {
			
			return dao.getListByCusFundId(cusFundId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
