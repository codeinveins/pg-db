package com.plantsguru.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oc_order_status", catalog="db_pg")
public class OC_Order_Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_status_id;
	private Integer language_id;
	private String name;
	
	public Long getOrder_status_id() {
		return order_status_id;
	}
	public void setOrder_status_id(Long order_status_id) {
		this.order_status_id = order_status_id;
	}
	public Integer getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language_id == null) ? 0 : language_id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((order_status_id == null) ? 0 : order_status_id.hashCode());
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
		OC_Order_Status other = (OC_Order_Status) obj;
		if (language_id == null) {
			if (other.language_id != null)
				return false;
		} else if (!language_id.equals(other.language_id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (order_status_id == null) {
			if (other.order_status_id != null)
				return false;
		} else if (!order_status_id.equals(other.order_status_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OC_Order_Status [order_status_id=" + order_status_id + ", language_id=" + language_id + ", name=" + name
				+ "]";
	}
	
	
}
