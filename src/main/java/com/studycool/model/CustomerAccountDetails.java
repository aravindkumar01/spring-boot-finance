package com.studycool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerAccountDetails {

	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="acc_id")
	private long id;
	
	@Column
	private String customerFundId;
	
	
	@Column
	private String accNum;


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


	public String getAccNum() {
		return accNum;
	}


	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	
	
	
}
