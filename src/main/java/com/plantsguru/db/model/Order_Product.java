package com.plantsguru.db.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="order_product")
public class Order_Product {

	public Long getOrder_Product_Id() {
		return Order_Product_Id;
	}
	public void setOrder_Product_Id(Long order_Product_Id) {
		Order_Product_Id = order_Product_Id;
	}
	public Long getOrder_Id() {
		return Order_Id;
	}
	public void setOrder_Id(Long order_Id) {
		Order_Id = order_Id;
	}
	public String getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(String product_Id) {
		Product_Id = product_Id;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public Float getProdcut_Price() {
		return Prodcut_Price;
	}
	public void setProdcut_Price(Float prodcut_Price) {
		Prodcut_Price = prodcut_Price;
	}
	public Float getUnit_Price() {
		return Unit_Price;
	}
	public void setUnit_Price(Float unit_Price) {
		Unit_Price = unit_Price;
	}
	public Float getDiscount() {
		return Discount;
	}
	public void setDiscount(Float discount) {
		Discount = discount;
	}
	public Date getCreatedt_at() {
		return createdt_at;
	}
	public void setCreatedt_at(Date createdt_at) {
		this.createdt_at = createdt_at;
	}
	
	@Id
	private Long Order_Product_Id;
	private Long Order_Id;
	private String Product_Id;
	private Integer Quantity;
	private Float Prodcut_Price;
	private Float Unit_Price;
	private Float Discount;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdt_at;
}
