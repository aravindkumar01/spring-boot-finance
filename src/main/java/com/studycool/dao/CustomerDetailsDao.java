package com.studycool.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studycool.Repo.CustomerDetailsRepo;
import com.studycool.Repo.CustomerOtherDetailsRepo;
import com.studycool.model.CustomerDetails;
import com.studycool.model.CustomerOtherDetails;

@Component
public class CustomerDetailsDao {
	
	@Autowired
	CustomerDetailsRepo custRepo;
	public void save(CustomerDetails cust) {
		// TODO Auto-generated method stub
		try {
			custRepo.save(cust);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	public CustomerDetails getCustomer(String primaryNo) {
		try {
			return custRepo.getCustomer(primaryNo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public CustomerDetails getId(CustomerDetails details) {
		// TODO Auto-generated method stub
		try {
			return custRepo.getId(details.getPrimaryIdNo());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	public List<CustomerDetails> getCustomerList() {
		try {
			
			return custRepo.getCustomerList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	
/****************************************customer next****************************************************************/

	@Autowired
	CustomerOtherDetailsRepo otherRepo;
	
	
	
	public boolean saveOthers(CustomerOtherDetails details) {
		try {
			otherRepo.save(details);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			return false;
		}
	}
	
   public 	Optional<CustomerOtherDetails> getOtherById(String cusFundId) {
	   try {
		
		   
		   return otherRepo.getByCusFundId(cusFundId);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
   }

public List<CustomerOtherDetails> getCustomerOthers(){
	try {
		
		return otherRepo.findAll();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}
}
