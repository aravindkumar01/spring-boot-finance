package com.studycool.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerDetails {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="cust_id")
	private long id;
	
	@Column
	private String customerFundId;
	
	@Column
	private String existingUser;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private Date dob;
	
	@Column
	private String education;
	
	@Column
	private String maritalStatus;
	
	@Column
	private String religion;
	
	@Column
	private String gender;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column
	private String mobNo;
	
	@Column
	private String residentAddress;
	
	@Column
	private String periodOfExistence;
	
	@Column String permanentAddrs;
	
	public String getPermanentAddrs() {
		return permanentAddrs;
	}

	public void setPermanentAddrs(String permanentAddrs) {
		this.permanentAddrs = permanentAddrs;
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

	public String getExistingUser() {
		return existingUser;
	}

	public void setExistingUser(String existingUser) {
		this.existingUser = existingUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getResidentAddress() {
		return residentAddress;
	}

	public void setResidentAddress(String residentAddress) {
		this.residentAddress = residentAddress;
	}

	public String getPeriodOfExistence() {
		return periodOfExistence;
	}

	public void setPeriodOfExistence(String periodOfExistence) {
		this.periodOfExistence = periodOfExistence;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}

	public String getPrimaryIdNo() {
		return primaryIdNo;
	}

	public void setPrimaryIdNo(String primaryIdNo) {
		this.primaryIdNo = primaryIdNo;
	}

	@Column
	private String houseType;
	
	@Column
	private String primaryId;
	
	@Column
	private String primaryIdNo;
	
}
