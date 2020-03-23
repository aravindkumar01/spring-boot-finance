package com.studycool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studycool.dao.AccountDao;
import com.studycool.model.CustomerAccountDetails;

@Service
public class CustomerAccountService {
	
	
	@Autowired
	AccountDao dao;
	
	public boolean save(CustomerAccountDetails acc) {
		
		try {
			
			return dao.saveAccount(acc);
		} catch (Exception e) {
			e.printStackTrace();
			return false;// TODO: handle exception
		}
	}
	
	
	public List<CustomerAccountDetails> getCustomerAcc(String cusFundId){
		
		try {
			
			return dao.getAccount(cusFundId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	
	public long getMaxId() {
		try {
			
			return dao.getMaxId();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;			
			
		}
	}
}
