package com.plantsguru.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oc_order_total", catalog="db_pg")
public class OC_Order_Total {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_total_id;
	private Long order_id;
	private String code;
	private String title;
	private Float value; //TODO: decimal(15,4)
	private Integer sort_order;
	
	public Long getOrder_total_id() {
		return order_total_id;
	}
	public void setOrder_total_id(Long order_total_id) {
		this.order_total_id = order_total_id;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	public Integer getSort_order() {
		return sort_order;
	}
	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((order_total_id == null) ? 0 : order_total_id.hashCode());
		result = prime * result + ((sort_order == null) ? 0 : sort_order.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		OC_Order_Total other = (OC_Order_Total) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (order_total_id == null) {
			if (other.order_total_id != null)
				return false;
		} else if (!order_total_id.equals(other.order_total_id))
			return false;
		if (sort_order == null) {
			if (other.sort_order != null)
				return false;
		} else if (!sort_order.equals(other.sort_order))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OC_Order_Total [order_total_id=" + order_total_id + ", order_id=" + order_id + ", code=" + code
				+ ", title=" + title + ", value=" + value + ", sort_order=" + sort_order + "]";
	};
	
	
}
