package com.studycool.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.studycool.model.AddressDetails;

@Repository
public interface AddressDetailsRepo extends JpaRepository<AddressDetails, Long> {

	@Query("select a from AddressDetails a where a.cusFundId=:cus_fund_id")
	AddressDetails getAddress(String cus_fund_id);

}
