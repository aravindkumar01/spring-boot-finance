package com.studycool.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class LoanTypes {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="loan_id")
	private long loanId;
	
    @Column
	private String loanFundId;

	@Column
	private String type;
	
	@Column
	private int loanDuration;
		
	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	@Column
	private String description;
	
	@CreatedBy
	@Column
	private String created_by;
	
	@CreationTimestamp
	@Column
	private Date creation_date;
	
	@LastModifiedDate
	@Column
	private Date updated_date;
	
	@Column
	private boolean status = true;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column
	private Date collectionsDate;

	public String getLoanFundId() {
		return loanFundId;
	}

	public void setLoanFundId(String loanFundId) {
		this.loanFundId = loanFundId;
	}

	public Date getCollectionsDate() {
		return collectionsDate;
	}

	public void setCollectionsDate(Date collectionsDate) {
		this.collectionsDate = collectionsDate;
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
}
