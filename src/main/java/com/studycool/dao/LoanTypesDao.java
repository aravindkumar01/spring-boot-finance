package com.studycool.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studycool.Repo.LoanTypesRepo;
import com.studycool.model.LoanTypes;

@Component
public class LoanTypesDao {

	@Autowired
	LoanTypesRepo loanRepo;
	
	public boolean save(LoanTypes col) {
		// TODO Auto-generated method stub
		try {
			loanRepo.save(col);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}	
	}
	public LoanTypes getId(LoanTypes loan) {
		try {
			return loanRepo.getId(loan.getType());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

public boolean updateLoanFundId(String fundId,String type) {
	
	try {
		loanRepo.updateLoanFundId(fundId, type);
	 return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
}
public List<LoanTypes> getLoanTypesList(String type){
	try {
		return loanRepo.getList(type);
	} catch (Exception e) {
		e.printStackTrace();
		return null;
		// TODO: handle exception
	}
}
public Boolean deleteEntry(Long id) {
	// TODO Auto-generated method stub
	try {
		loanRepo.deleteById(id);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}
public Boolean changeStatus(long id, boolean status) {
	// TODO Auto-generated method stub
	try {
		loanRepo.changeStatus(id, status);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}
public List<LoanTypes> getLoans() {
	
	
	try {
		return loanRepo.findAll();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}
}
