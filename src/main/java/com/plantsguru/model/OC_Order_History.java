package com.plantsguru.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="oc_order_history")
public class OC_Order_History {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long order_history_id;
	private Long order_id;
	private Integer order_status_id;
	
	@Column(name="notify", columnDefinition="tinyint default 0")
	private boolean notify;
	private String comment;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_added;

	public Long getOrder_history_id() {
		return order_history_id;
	}

	public void setOrder_history_id(Long order_history_id) {
		this.order_history_id = order_history_id;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Integer getOrder_status_id() {
		return order_status_id;
	}

	public void setOrder_status_id(Integer order_status_id) {
		this.order_status_id = order_status_id;
	}

	public boolean isNotify() {
		return notify;
	}

	public void setNotify(boolean notify) {
		this.notify = notify;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((date_added == null) ? 0 : date_added.hashCode());
		result = prime * result + (notify ? 1231 : 1237);
		result = prime * result + ((order_history_id == null) ? 0 : order_history_id.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
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
		OC_Order_History other = (OC_Order_History) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (date_added == null) {
			if (other.date_added != null)
				return false;
		} else if (!date_added.equals(other.date_added))
			return false;
		if (notify != other.notify)
			return false;
		if (order_history_id == null) {
			if (other.order_history_id != null)
				return false;
		} else if (!order_history_id.equals(other.order_history_id))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
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
		return "OC_Order_History [order_history_id=" + order_history_id + ", order_id=" + order_id
				+ ", order_status_id=" + order_status_id + ", notify=" + notify + ", comment=" + comment
				+ ", date_added=" + date_added + "]";
	}

	
}
