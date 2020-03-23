package com.studycool.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studycool.DTO.CustomerDTO;
import com.studycool.model.AddressDetails;
import com.studycool.model.Constants;
import com.studycool.model.CustomerAccountDetails;
import com.studycool.model.CustomerDetails;
import com.studycool.model.CustomerLoanDetails;
import com.studycool.model.CustomerOtherDetails;

@Service
public class CustomerDetailsDTOService {

	@Autowired
	CustomerDetailsService service;
	
	@Autowired
	AddressDetailsService addressSer;
	
	@Autowired
	CustomerAccountService account;
	
	
	@Autowired
	CustomerLoanDetailsService loanService;
	
	public Map<String,String> saveCust(CustomerDTO cust) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String, String>();
		try {
			
			CustomerDetails details=new CustomerDetails();
				details.setExistingUser(cust.getExistingUser());
				details.setFirstName(cust.getFirstName());
				details.setDob(cust.getDob());
				details.setLastName(cust.getLastName());
				details.setEducation(cust.getEducation());
				details.setMaritalStatus(cust.getMaritalStatus());
				details.setReligion(cust.getReligion());
				details.setGender(cust.getGender());
				details.setPrimaryId(cust.getPrimaryId());
				details.setPrimaryIdNo(cust.getPrimaryIdNo());
				details.setMobNo(cust.getMobNo());
				details.setHouseType(cust.getHouseType());
				details.setPeriodOfExistence(cust.getPeriodOfExistence());
				details.setPermanentAddrs(cust.getPermanentAddrs());
				details.setResidentAddress(cust.getResidentAddress());
		 CustomerDetails output=service.saveCust(details);
		 
			if(output.getCustomerFundId().isEmpty() || output.getCustomerFundId()==null) {
					
					return map;
				}
			
			AddressDetails address = new AddressDetails();
				
				
				address.setMob_no(cust.getMobNo());
				address.setResidentAddress(cust.getResidentAddress());
				address.setPeriodOfExistence(cust.getPeriodOfExistence());
				address.setHouseType(cust.getHouseType());
				address.setCusFundId(cust.getCustomerFundId());
				address.setResidentAddress(cust.getResidentAddress());
				address.setPeriodOfExistence(cust.getPeriodOfExistence());
				address.setPermanentAddr(cust.getPermanentAddrs());
				address.setPrimaryId(cust.getPrimaryId());
				address.setPrimaryIdNo(cust.getPrimaryIdNo());				
				address.setPrimaryId(cust.getPrimaryId());
				address.setPrimaryIdNo(cust.getPrimaryIdNo());	
				address.setCusFundId(details.getCustomerFundId());
			boolean status=addressSer.save(address);
			if(!status) {
				
				return map;
			}
			
			
		 CustomerAccountDetails acc=new CustomerAccountDetails();
		 			acc.setAccNum(Constants.ACCOUNT_KEY+String.valueOf(details.getId()));
		 			acc.setCustomerFundId(details.getCustomerFundId());
		 		account.save(acc);
		 		
		 CustomerOtherDetails others=new CustomerOtherDetails();
		 			others.setBusinessName(cust.getBusinessName());
		 			others.setCustomerFundId(details.getCustomerFundId());
		 			others.setExperience(cust.getExperience());
		 			others.setIncome(cust.getIncome());
		 			others.setReferenceName(cust.getRefName());
		 			others.setReferenceBusiness(cust.getRefBusiness());
		 			others.setReferenceRelation(cust.getRefRelation());
		 	service.saveOthers(others);
		 	
		 	CustomerLoanDetails loan=new CustomerLoanDetails();
		 			loan.setCustomerFundId(details.getCustomerFundId());
		 			loan.setRequestAmount(cust.getRequestAmount());		 
		 			loan.setLoanFundId(cust.getLoanFundId());
		 	loanService.saveLoanDetails(loan);
		 	
		 	map.put("cus_fund_id", details.getCustomerFundId());
		 	map.put("cus_acc_id", acc.getAccNum());
			
			return map;
		} catch (Exception e) {
			
			// TODO: handle exception
			e.printStackTrace();
			
			return map;
		}
		
	}
}
