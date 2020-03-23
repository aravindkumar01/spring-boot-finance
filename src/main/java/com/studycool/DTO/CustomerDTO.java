package com.studycool.DTO;

import java.sql.Date;

public class CustomerDTO
{
	// Variable Names.
	private int id;
	private String customerFundId;
	private String existingUser;
	private String firstName;
	private String lastName;
	private Date dob;
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private String education;
	private String maritalStatus;
	private String religion;
	private String mobNo;
	private String residentAddress;
	private String periodOfExistence;
	private String permanentAddrs;
	private String houseType;
	private String primaryId;
	private String primaryIdNo;

	private int familyMembers;
	private int debtRequested;

	private String familyPerson;
	
	// Getters and setters for the private variable.
	
private String businessName;
	
	private int income;
	
	private int requestAmount;
	
	private String loanFundId;
	
	private String refName;
	
	private String refRelation;
	
	private String refBusiness;
	
	private int experience;
	
	
	
	
	
	
	public String getLoanFundId() {
		return loanFundId;
	}
	public void setLoanFundId(String loanFundId) {
		this.loanFundId = loanFundId;
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
	public int getRequestAmount() {
		return requestAmount;
	}
	public void setRequestAmount(int requestAmount) {
		this.requestAmount = requestAmount;
	}

	public String getRefName() {
		return refName;
	}
	public void setRefName(String refName) {
		this.refName = refName;
	}
	public String getRefRelation() {
		return refRelation;
	}
	public void setRefRelation(String refRelation) {
		this.refRelation = refRelation;
	}
	public String getRefBusiness() {
		return refBusiness;
	}
	public void setRefBusiness(String refBusiness) {
		this.refBusiness = refBusiness;
	}
	public int getId() {
		return id;
	}
	public String getFamilyPerson() {
		return familyPerson;
	}
	public void setFamilyPerson(String familyPerson) {
		this.familyPerson = familyPerson;
	}
	public void setId(int id) {
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

	public String getPermanentAddrs() {
		return permanentAddrs;
	}
	public void setPermanentAddrs(String permanentAddrs) {
		this.permanentAddrs = permanentAddrs;
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
	
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(int familyMembers) {
		this.familyMembers = familyMembers;
	}
	public int getDebtRequested() {
		return debtRequested;
	}
	public void setDebtRequested(int debtRequested) {
		this.debtRequested = debtRequested;
	}
	
}
