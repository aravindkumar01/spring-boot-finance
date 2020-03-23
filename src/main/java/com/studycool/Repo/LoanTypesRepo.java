package com.studycool.Repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studycool.model.LoanTypes;

@Repository
public interface LoanTypesRepo extends JpaRepository <LoanTypes, Long>{

	@Transactional
	@Query("select l from LoanTypes l where l.type=:type")
	LoanTypes getId(String type);
	
	
	@Transactional
	@Query("select l from LoanTypes l where l.type=:type")
	List<LoanTypes> getList(String type);
	
	
	@Transactional
	@Modifying
	@Query("update LoanTypes s set s.loanFundId=:id where s.type=:type")
	void updateLoanFundId(String id,String type);

	@Transactional
	@Modifying
	@Query("update LoanTypes s set s.status=:status where s.id=:id")
	void changeStatus(long id, boolean status);
}
