package com.studycool.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studycool.model.CustomerAccountDetails;

@Repository
public interface CustomerAccountRepo extends JpaRepository<CustomerAccountDetails, Long>{

	
	@Query("select c from CustomerAccountDetails c where c.customerFundId=cusFUndId")
	List<CustomerAccountDetails> getCusAcc(String cusFundId);

	@Query("select max(id) from CustomerAccountDetails")
	long getMaxId();

}
