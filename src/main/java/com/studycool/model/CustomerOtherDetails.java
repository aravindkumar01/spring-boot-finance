package com.studycool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerOtherDetails {

	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private long id;
	
	@Column
	private String customerFundId;
	
	
	@Column
	private String businessName;
	
	@Column
	private int experience;
	
	@Column
	private int income;
	
	
	@Column
	private String referenceName;
	

	@Column
	private String referenceRelation;
	
	

	@Column
	private String referenceBusiness;



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getCustomerFundId() {
		return customerFundId;
	}



	public void setCustomerFundId(String customerFundId) {
		this.customerFundId = customerFundId;
	}



	public String getBusinessName() {
		return businessName;
	}



	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}





	public int getIncome() {
		return income;
	}



	public void setIncome(int income) {
		this.income = income;
	}



	public int getExperience() {
		return experience;
	}



	public void setExperience(int experience) {
		this.experience = experience;
	}






	public String getReferenceName() {
		return referenceName;
	}



	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}



	public String getReferenceRelation() {
		return referenceRelation;
	}



	public void setReferenceRelation(String referenceRelation) {
		this.referenceRelation = referenceRelation;
	}



	public String getReferenceBusiness() {
		return referenceBusiness;
	}



	public void setReferenceBusiness(String referenceBusiness) {
		this.referenceBusiness = referenceBusiness;
	}
	
	
	
	
	
	
	
}
