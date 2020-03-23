package com.studycool.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studycool.Repo.CustomerLoanDetailsRepo;
import com.studycool.model.CustomerLoanDetails;

@Component
public class CustomerLoanDetailsDao {

	
	@Autowired
	CustomerLoanDetailsRepo repo;
	
	
	
	public boolean saveLoanDetails(CustomerLoanDetails loan) {
		
		try {
			
			repo.save(loan);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	

	public CustomerLoanDetails getLoanByCusFundId(String cusFundId) {
		try {
			
			return repo.getLoanByCusFundId(cusFundId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
	public List<CustomerLoanDetails> getListByCusFundId(String cusFundId){
		try {
			
			return repo.getListByCusFundId(cusFundId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	
}
