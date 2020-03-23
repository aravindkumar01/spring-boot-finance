package com.studycool.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studycool.Repo.CustomerAccountRepo;
import com.studycool.model.CustomerAccountDetails;

@Component
public class AccountDao {

	@Autowired
	CustomerAccountRepo repo;
	
	public boolean saveAccount(CustomerAccountDetails acc) {
		try {
			
			repo.save(acc);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
			// TODO: handle exception
		}
	}
	
	
	
	public List<CustomerAccountDetails> getAccount(String cusFundId){
		
		try {
			
			return repo.getCusAcc(cusFundId);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}



	public long getMaxId() {

		try {
			
			return repo.getMaxId();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
}
