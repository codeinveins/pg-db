package com.plantsguru.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="order", catalog="ek_ped_ek_zindagi")
public class Order {

	public Long getOrder_Id() {
		return Order_Id;
	}
	public void setOrder_Id(Long order_Id) {
		Order_Id = order_Id;
	}
	public String getInvoice_Number() {
		return Invoice_Number;
	}
	public void setInvoice_Number(String invoice_Number) {
		Invoice_Number = invoice_Number;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Float getTotal_Price() {
		return Total_Price;
	}
	public void setTotal_Price(Float total_Price) {
		Total_Price = total_Price;
	}
	public String getOrder_Status() {
		return Order_Status;
	}
	public void setOrder_Status(String order_Status) {
		Order_Status = order_Status;
	}
	public String getPayment_Status() {
		return Payment_Status;
	}
	public void setPayment_Status(String payment_Status) {
		Payment_Status = payment_Status;
	}
	public String getIP_addres() {
		return IP_addres;
	}
	public void setIP_addres(String iP_addres) {
		IP_addres = iP_addres;
	}
	public String getPay_Id() {
		return Pay_Id;
	}
	public void setPay_Id(String pay_Id) {
		Pay_Id = pay_Id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	@Id
	@Column(name="Order_Id")
	private Long Order_Id;
	private String Invoice_Number;
	private String Name;
	private String Mobile;
	private String Address;
	private String City;
	private String Pincode;
	private String State;
	private Float Total_Price;
	private String Order_Status;
	private String Payment_Status;
	private String IP_addres;
	private String Pay_Id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	
}
