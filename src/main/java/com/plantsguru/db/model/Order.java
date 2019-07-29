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

	@Id
	@Column(name="Order_Id")
	private Long Order_Id;
	private String Invoice_Number;
	private String Name;
	private String Mobile;
	private String Email;
	private String Address;
	private String City;
	private String Pincode;
	private String State;
	private Float Total_Price;
	private String Order_Status;
	private String Payment_Status;
	private String IP_addres;
	private String Payment_Message;
	private String Pay_Id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
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
	public String getPayment_Message() {
		return Payment_Message;
	}
	public void setPayment_Message(String payment_Message) {
		Payment_Message = payment_Message;
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
	@Override
	public String toString() {
		return "Order [Order_Id=" + Order_Id + ", Invoice_Number=" + Invoice_Number + ", Name=" + Name + ", Mobile="
				+ Mobile + ", Email=" + Email + ", Address=" + Address + ", City=" + City + ", Pincode=" + Pincode
				+ ", State=" + State + ", Total_Price=" + Total_Price + ", Order_Status=" + Order_Status
				+ ", Payment_Status=" + Payment_Status + ", IP_addres=" + IP_addres + ", Payment_Message="
				+ Payment_Message + ", Pay_Id=" + Pay_Id + ", created_at=" + created_at + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((City == null) ? 0 : City.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((IP_addres == null) ? 0 : IP_addres.hashCode());
		result = prime * result + ((Invoice_Number == null) ? 0 : Invoice_Number.hashCode());
		result = prime * result + ((Mobile == null) ? 0 : Mobile.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Order_Id == null) ? 0 : Order_Id.hashCode());
		result = prime * result + ((Order_Status == null) ? 0 : Order_Status.hashCode());
		result = prime * result + ((Pay_Id == null) ? 0 : Pay_Id.hashCode());
		result = prime * result + ((Payment_Message == null) ? 0 : Payment_Message.hashCode());
		result = prime * result + ((Payment_Status == null) ? 0 : Payment_Status.hashCode());
		result = prime * result + ((Pincode == null) ? 0 : Pincode.hashCode());
		result = prime * result + ((State == null) ? 0 : State.hashCode());
		result = prime * result + ((Total_Price == null) ? 0 : Total_Price.hashCode());
		result = prime * result + ((created_at == null) ? 0 : created_at.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (City == null) {
			if (other.City != null)
				return false;
		} else if (!City.equals(other.City))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (IP_addres == null) {
			if (other.IP_addres != null)
				return false;
		} else if (!IP_addres.equals(other.IP_addres))
			return false;
		if (Invoice_Number == null) {
			if (other.Invoice_Number != null)
				return false;
		} else if (!Invoice_Number.equals(other.Invoice_Number))
			return false;
		if (Mobile == null) {
			if (other.Mobile != null)
				return false;
		} else if (!Mobile.equals(other.Mobile))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Order_Id == null) {
			if (other.Order_Id != null)
				return false;
		} else if (!Order_Id.equals(other.Order_Id))
			return false;
		if (Order_Status == null) {
			if (other.Order_Status != null)
				return false;
		} else if (!Order_Status.equals(other.Order_Status))
			return false;
		if (Pay_Id == null) {
			if (other.Pay_Id != null)
				return false;
		} else if (!Pay_Id.equals(other.Pay_Id))
			return false;
		if (Payment_Message == null) {
			if (other.Payment_Message != null)
				return false;
		} else if (!Payment_Message.equals(other.Payment_Message))
			return false;
		if (Payment_Status == null) {
			if (other.Payment_Status != null)
				return false;
		} else if (!Payment_Status.equals(other.Payment_Status))
			return false;
		if (Pincode == null) {
			if (other.Pincode != null)
				return false;
		} else if (!Pincode.equals(other.Pincode))
			return false;
		if (State == null) {
			if (other.State != null)
				return false;
		} else if (!State.equals(other.State))
			return false;
		if (Total_Price == null) {
			if (other.Total_Price != null)
				return false;
		} else if (!Total_Price.equals(other.Total_Price))
			return false;
		if (created_at == null) {
			if (other.created_at != null)
				return false;
		} else if (!created_at.equals(other.created_at))
			return false;
		return true;
	}
	
	
}
