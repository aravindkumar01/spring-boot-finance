package com.studycool.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studycool.model.CustomerOtherDetails;

@Repository
public interface CustomerOtherDetailsRepo extends JpaRepository<CustomerOtherDetails, Long>{

	
	@Query("select c from CustomerOtherDetails c where c.customerFundId=:cusFundId")
	Optional<CustomerOtherDetails> getByCusFundId(String cusFundId);

}
