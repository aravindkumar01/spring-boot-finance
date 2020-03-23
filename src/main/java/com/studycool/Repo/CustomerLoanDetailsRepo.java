package com.studycool.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studycool.model.CustomerLoanDetails;

@Repository
public interface CustomerLoanDetailsRepo extends JpaRepository<CustomerLoanDetails, Long>{

	@Query("select c from CustomerLoanDetails c where c.customerFundId=:cusFundId")
	CustomerLoanDetails getLoanByCusFundId(String cusFundId);

	@Query("select c from CustomerLoanDetails c where c.customerFundId=:cusFundId")
	List<CustomerLoanDetails> getListByCusFundId(String cusFundId);

}
