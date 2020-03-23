package com.studycool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AddressDetails 
{
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="addr_id")
	private long id;
	@Column
	private String cusFundId;
	@Column
	private String mob_no;
	@Column
	private String residentAddress;
	@Column
	private String permanentAddr;
	@Column
	private String periodOfExistence;
	@Column
	private String houseType;
	@Column
	private String primaryId;
	@Column
	private String primaryIdNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
	
	public String getCusFundId() {
		return cusFundId;
	}
	public void setCusFundId(String cusFundId) {
		this.cusFundId = cusFundId;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
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
	public String getPermanentAddr() {
		return permanentAddr;
	}
	public void setPermanentAddr(String permanentAddr) {
		this.permanentAddr = permanentAddr;
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
	
}
