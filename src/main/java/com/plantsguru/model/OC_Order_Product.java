package com.plantsguru.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oc_order_product", catalog="db_pg")
public class OC_Order_Product {

	@Id
	private Long order_product_id;
	private Long order_id;
	private Long product_id;
	private String name;
	private String model;
	private Integer quantity;
	private Float price; //TODO: decimal(15,4)
	private Float total; //TODO: decimal(15,4)
	private Float tax;	//TODO: decimal(15,4)
	private Integer reward;
	public Long getOrder_product_id() {
		return order_product_id;
	}
	public void setOrder_product_id(Long order_product_id) {
		this.order_product_id = order_product_id;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Float getTax() {
		return tax;
	}
	public void setTax(Float tax) {
		this.tax = tax;
	}
	public Integer getReward() {
		return reward;
	}
	public void setReward(Integer reward) {
		this.reward = reward;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((order_product_id == null) ? 0 : order_product_id.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((product_id == null) ? 0 : product_id.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((reward == null) ? 0 : reward.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		OC_Order_Product other = (OC_Order_Product) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (order_product_id == null) {
			if (other.order_product_id != null)
				return false;
		} else if (!order_product_id.equals(other.order_product_id))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (product_id == null) {
			if (other.product_id != null)
				return false;
		} else if (!product_id.equals(other.product_id))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (reward == null) {
			if (other.reward != null)
				return false;
		} else if (!reward.equals(other.reward))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OC_Order_Product [order_product_id=" + order_product_id + ", order_id=" + order_id + ", product_id="
				+ product_id + ", name=" + name + ", model=" + model + ", quantity=" + quantity + ", price=" + price
				+ ", total=" + total + ", tax=" + tax + ", reward=" + reward + "]";
	}
	
	
}
