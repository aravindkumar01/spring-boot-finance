package com.studycool.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studycool.model.CustomerDetails;

@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails, Long> {
	
	@Query("select c from CustomerDetails c where c.primaryIdNo=:primaryIdNo")
	CustomerDetails getCustomer(String primaryIdNo);
	
	@Modifying
	@Query("update CustomerDetails set customer_fund_id=:fund_id")
	void updateFundId(String fund_id);
	
	@Query("select id from CustomerDetails where primaryIdNo=:primaryIdNo")
	CustomerDetails getId(String primaryIdNo);

	@Query("select customerFundId from CustomerDetails ")
	List<CustomerDetails> getCustomerList();

}
