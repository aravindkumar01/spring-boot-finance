package com.studycool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerLoanDetails {
	

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private long id;
	
	@Column
	private String customerFundId;
	
	@Column
	private int requestAmount;

	
	@Column
	private int approveAmount;
	
	
	@Column
	private String loanFundId;
	
	
	
	

	public int getApproveAmount() {
		return approveAmount;
	}

	public void setApproveAmount(int approveAmount) {
		this.approveAmount = approveAmount;
	}

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

	public int getRequestAmount() {
		return requestAmount;
	}

	public void setRequestAmount(int requestAmount) {
		this.requestAmount = requestAmount;
	}

	public String getLoanFundId() {
		return loanFundId;
	}

	public void setLoanFundId(String loanFundId) {
		this.loanFundId = loanFundId;
	}
	
	
	

}
