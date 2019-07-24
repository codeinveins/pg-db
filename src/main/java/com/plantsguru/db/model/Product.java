package com.plantsguru.db.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="product", catalog="ek_ped_ek_zindagi")
public class Product {

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
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
	public String getAvailable() {
		return Available;
	}
	public void setAvailable(String available) {
		Available = available;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getProduct_Info() {
		return Product_Info;
	}
	public void setProduct_Info(String product_Info) {
		Product_Info = product_Info;
	}
	
	@javax.persistence.Id
	private Long Id;
	private String Name;
	private String Product;
	private Float Price;
	private Float Discount;
	private String Available;
	private String Description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_at;
	private String Product_Info;
}
