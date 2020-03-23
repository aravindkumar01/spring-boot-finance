package com.studycool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studycool.DTO.CustomerDTO;
import com.studycool.Repo.CustomerDetailsRepo;
import com.studycool.config.ConstantLoanTypes;
import com.studycool.dao.CustomerDetailsDao;
import com.studycool.model.CustomerDetails;
import com.studycool.model.CustomerOtherDetails;

@Service

public class CustomerDetailsService {

	@Autowired
	CustomerDetailsDao custDao;
	
	public CustomerDetails saveCust(CustomerDetails cust) {
		// TODO Auto-generated method stub
		try {
			
			custDao.save(cust);
			CustomerDetails details=custDao.getCustomer(cust.getPrimaryIdNo());
			return updateCustomerLoan(details);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public CustomerDetails updateCustomerLoan(CustomerDetails details) {
		try {
			
			String fundId = ConstantLoanTypes.CUSTOMER_FUND_ID+details.getId();
			details.setCustomerFundId(fundId);
			custDao.save(details);
			return details;
		} catch (Exception e) {
			// TODO: handle exception
				e.printStackTrace();
			return null;
		}
	}

	public List<CustomerDetails> getCustomerList() {
		
		try {
			return custDao.getCustomerList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	
	/*******************************************other details**********************************************************************/


	public boolean saveOthers(CustomerOtherDetails details) {
		try {
			custDao.saveOthers(details);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			return false;
		}
	}
	
   public 	Optional<CustomerOtherDetails> getOtherById(String cusFundId) {
	   try {
		
		   
		   return custDao.getOtherById(cusFundId);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
   }

public List<CustomerOtherDetails> getCustomerOthers(){
	try {
		
		return custDao.getCustomerOthers();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}





}
