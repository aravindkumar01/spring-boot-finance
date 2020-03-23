package com.studycool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studycool.config.ConstantLoanTypes;
import com.studycool.dao.LoanTypesDao;
import com.studycool.model.LoanTypes;

@Service
public class LoanTypesService {

	@Autowired
	LoanTypesDao loanDao;
	public boolean saveColl(LoanTypes loan) {
		// TODO Auto-generated method stub
		try {
			if(loanDao.getLoanTypesList(loan.getType()).size()>0) {
				return false;
			}
			loan.setType(loan.getType().toLowerCase());
			loanDao.save(loan);			
			updateLoanFundId(loan);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateLoanFundId(LoanTypes loan) {	
		try {
			 LoanTypes loanTypee = loanDao.getId(loan);
			 
			return loanDao.updateLoanFundId(ConstantLoanTypes.LOAN_TYPE_FUND_ID+loanTypee.getLoanId(), loanTypee.getType());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return true;
		}
	}
	public boolean updateStatus(LoanTypes loan) {
		try {
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			return true;
		}
	}

	public Boolean deleteEntry(Long id) {
		// TODO Auto-generated method stub
		try {
			return loanDao.deleteEntry(id);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public Boolean changeStatus(long id, boolean status) {
		// TODO Auto-generated method stub
		try {
			return loanDao.changeStatus(id, status);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public List<LoanTypes> getloans() {
		try {
			
			return loanDao.getLoans();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
