package com.plantsguru.db.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pincode", catalog="ek_ped_ek_zindagi")
public class Pincode {

	public Long getPincode_Id() {
		return Pincode_Id;
	}
	public void setPincode_Id(Long pincode_Id) {
		Pincode_Id = pincode_Id;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getPlace_Name() {
		return Place_Name;
	}
	public void setPlace_Name(String place_Name) {
		Place_Name = place_Name;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	@Id
	private Long Pincode_Id;
	private String Pincode;
	private String Place_Name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
}
