package com.plantsguru.db.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cart")
public class Cart {

	public Long getCart_Id() {
		return Cart_Id;
	}
	public void setCart_Id(Long cart_Id) {
		Cart_Id = cart_Id;
	}
	public Integer getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(Integer product_Id) {
		Product_Id = product_Id;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public Float getTotal_Price() {
		return Total_Price;
	}
	public void setTotal_Price(Float total_Price) {
		Total_Price = total_Price;
	}
	public Float getPrice() {
		return Price;
	}
	public void setPrice(Float price) {
		Price = price;
	}
	public Float getDiscount() {
		return Discount;
	}
	public void setDiscount(Float discount) {
		Discount = discount;
	}
	public String getDevice_Id() {
		return Device_Id;
	}
	public void setDevice_Id(String device_Id) {
		Device_Id = device_Id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	@Id
	private Long Cart_Id;
	private Integer Product_Id;
	private Integer Quantity;
	private Float Total_Price;
	private Float Price;
	private Float Discount;
	private String Device_Id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	
}
