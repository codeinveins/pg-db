package com.plantsguru.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "oc_order", catalog = "db_pg")
public class OC_Order {

	@Id
	private Long order_id;

	private Integer invoice_no;
	private String invoice_prefix;
	private Integer store_id;
	private String store_name;
	private String store_url;

	private Integer customer_id;
	private Integer customer_group_id;
	private String firstname;
	private String lastname;
	private String email;
	private String telephone;
	private String fax;
	private String payment_firstname;
	private String payment_lastname;
	private String payment_company;
	private String payment_address_1;
	private String payment_address_2;
	private String payment_city;
	private String payment_postcode;
	private String payment_country;
	private Integer payment_country_id;
	private String payment_zone;
	private Integer payment_zone_id;
	private String payment_address_format;
	private String payment_custom_field;
	private String payment_method;
	private String payment_code;
	private String shipping_firstname;
	private String shipping_lastname;
	private String shipping_company;
	private String shipping_address_1;
	private String shipping_address_2;
	private String shipping_city;
	private String shipping_postcode;
	private String shipping_country;
	private Integer shipping_country_id;
	private String shipping_zone;
	private Integer shipping_zone_id;
	private String shipping_address_format;
	private String shipping_custom_field;
	private String shipping_method;
	private String shipping_code;
	private String comment;
	private Float total; // TODO: check decimal(15,4)
	private Integer order_status_id;
	private Integer affiliate_id;
	private Float commission; // TODO: check decimal(15,4)
	private Integer language_id;
	private Integer currency_id;
	private String currency_code;
	private Float currency_value; // TODO: check decimal(15,8)
	private String ip;
	private String forwarded_ip;
	private String user_agent;
	private String accept_language;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date_added;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_modified;

	private String custom_field;
	private Long courier_id;
	private String awbno;
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Integer getInvoice_no() {
		return invoice_no;
	}
	public void setInvoice_no(Integer invoice_no) {
		this.invoice_no = invoice_no;
	}
	public String getInvoice_prefix() {
		return invoice_prefix;
	}
	public void setInvoice_prefix(String invoice_prefix) {
		this.invoice_prefix = invoice_prefix;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getStore_url() {
		return store_url;
	}
	public void setStore_url(String store_url) {
		this.store_url = store_url;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getCustomer_group_id() {
		return customer_group_id;
	}
	public void setCustomer_group_id(Integer customer_group_id) {
		this.customer_group_id = customer_group_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getPayment_firstname() {
		return payment_firstname;
	}
	public void setPayment_firstname(String payment_firstname) {
		this.payment_firstname = payment_firstname;
	}
	public String getPayment_lastname() {
		return payment_lastname;
	}
	public void setPayment_lastname(String payment_lastname) {
		this.payment_lastname = payment_lastname;
	}
	public String getPayment_company() {
		return payment_company;
	}
	public void setPayment_company(String payment_company) {
		this.payment_company = payment_company;
	}
	public String getPayment_address_1() {
		return payment_address_1;
	}
	public void setPayment_address_1(String payment_address_1) {
		this.payment_address_1 = payment_address_1;
	}
	public String getPayment_address_2() {
		return payment_address_2;
	}
	public void setPayment_address_2(String payment_address_2) {
		this.payment_address_2 = payment_address_2;
	}
	public String getPayment_city() {
		return payment_city;
	}
	public void setPayment_city(String payment_city) {
		this.payment_city = payment_city;
	}
	public String getPayment_postcode() {
		return payment_postcode;
	}
	public void setPayment_postcode(String payment_postcode) {
		this.payment_postcode = payment_postcode;
	}
	public String getPayment_country() {
		return payment_country;
	}
	public void setPayment_country(String payment_country) {
		this.payment_country = payment_country;
	}
	public Integer getPayment_country_id() {
		return payment_country_id;
	}
	public void setPayment_country_id(Integer payment_country_id) {
		this.payment_country_id = payment_country_id;
	}
	public String getPayment_zone() {
		return payment_zone;
	}
	public void setPayment_zone(String payment_zone) {
		this.payment_zone = payment_zone;
	}
	public Integer getPayment_zone_id() {
		return payment_zone_id;
	}
	public void setPayment_zone_id(Integer payment_zone_id) {
		this.payment_zone_id = payment_zone_id;
	}
	public String getPayment_address_format() {
		return payment_address_format;
	}
	public void setPayment_address_format(String payment_address_format) {
		this.payment_address_format = payment_address_format;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getPayment_code() {
		return payment_code;
	}
	public void setPayment_code(String payment_code) {
		this.payment_code = payment_code;
	}
	public String getShipping_firstname() {
		return shipping_firstname;
	}
	public void setShipping_firstname(String shipping_firstname) {
		this.shipping_firstname = shipping_firstname;
	}
	public String getShipping_lastname() {
		return shipping_lastname;
	}
	public void setShipping_lastname(String shipping_lastname) {
		this.shipping_lastname = shipping_lastname;
	}
	public String getShipping_company() {
		return shipping_company;
	}
	public void setShipping_company(String shipping_company) {
		this.shipping_company = shipping_company;
	}
	public String getShipping_address_1() {
		return shipping_address_1;
	}
	public void setShipping_address_1(String shipping_address_1) {
		this.shipping_address_1 = shipping_address_1;
	}
	public String getShipping_address_2() {
		return shipping_address_2;
	}
	public void setShipping_address_2(String shipping_address_2) {
		this.shipping_address_2 = shipping_address_2;
	}
	public String getShipping_city() {
		return shipping_city;
	}
	public void setShipping_city(String shipping_city) {
		this.shipping_city = shipping_city;
	}
	public String getShipping_postcode() {
		return shipping_postcode;
	}
	public void setShipping_postcode(String shipping_postcode) {
		this.shipping_postcode = shipping_postcode;
	}
	public String getShipping_country() {
		return shipping_country;
	}
	public void setShipping_country(String shipping_country) {
		this.shipping_country = shipping_country;
	}
	public Integer getShipping_country_id() {
		return shipping_country_id;
	}
	public void setShipping_country_id(Integer shipping_country_id) {
		this.shipping_country_id = shipping_country_id;
	}
	public String getShipping_zone() {
		return shipping_zone;
	}
	public void setShipping_zone(String shipping_zone) {
		this.shipping_zone = shipping_zone;
	}
	public Integer getShipping_zone_id() {
		return shipping_zone_id;
	}
	public void setShipping_zone_id(Integer shipping_zone_id) {
		this.shipping_zone_id = shipping_zone_id;
	}
	public String getShipping_address_format() {
		return shipping_address_format;
	}
	public void setShipping_address_format(String shipping_address_format) {
		this.shipping_address_format = shipping_address_format;
	}
	public String getShipping_method() {
		return shipping_method;
	}
	public void setShipping_method(String shipping_method) {
		this.shipping_method = shipping_method;
	}
	public String getShipping_code() {
		return shipping_code;
	}
	public void setShipping_code(String shipping_code) {
		this.shipping_code = shipping_code;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Integer getOrder_status_id() {
		return order_status_id;
	}
	public void setOrder_status_id(Integer order_status_id) {
		this.order_status_id = order_status_id;
	}
	public Integer getAffiliate_id() {
		return affiliate_id;
	}
	public void setAffiliate_id(Integer affiliate_id) {
		this.affiliate_id = affiliate_id;
	}
	public Float getCommission() {
		return commission;
	}
	public void setCommission(Float commission) {
		this.commission = commission;
	}
	public Integer getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(Integer language_id) {
		this.language_id = language_id;
	}
	public Integer getCurrency_id() {
		return currency_id;
	}
	public void setCurrency_id(Integer currency_id) {
		this.currency_id = currency_id;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	public Float getCurrency_value() {
		return currency_value;
	}
	public void setCurrency_value(Float currency_value) {
		this.currency_value = currency_value;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getForwarded_ip() {
		return forwarded_ip;
	}
	public void setForwarded_ip(String forwarded_ip) {
		this.forwarded_ip = forwarded_ip;
	}
	public String getUser_agent() {
		return user_agent;
	}
	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}
	public String getAccept_language() {
		return accept_language;
	}
	public void setAccept_language(String accept_language) {
		this.accept_language = accept_language;
	}
	public Date getDate_added() {
		return date_added;
	}
	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}
	public Date getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}
	public String getCustom_field() {
		return custom_field;
	}
	public void setCustom_field(String custom_field) {
		this.custom_field = custom_field;
	}
	public Long getCourier_id() {
		return courier_id;
	}
	public void setCourier_id(Long courier_id) {
		this.courier_id = courier_id;
	}
	public String getAwbno() {
		return awbno;
	}
	public void setAwbno(String awbno) {
		this.awbno = awbno;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accept_language == null) ? 0 : accept_language.hashCode());
		result = prime * result + ((affiliate_id == null) ? 0 : affiliate_id.hashCode());
		result = prime * result + ((awbno == null) ? 0 : awbno.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((commission == null) ? 0 : commission.hashCode());
		result = prime * result + ((courier_id == null) ? 0 : courier_id.hashCode());
		result = prime * result + ((currency_code == null) ? 0 : currency_code.hashCode());
		result = prime * result + ((currency_id == null) ? 0 : currency_id.hashCode());
		result = prime * result + ((currency_value == null) ? 0 : currency_value.hashCode());
		result = prime * result + ((custom_field == null) ? 0 : custom_field.hashCode());
		result = prime * result + ((customer_group_id == null) ? 0 : customer_group_id.hashCode());
		result = prime * result + ((customer_id == null) ? 0 : customer_id.hashCode());
		result = prime * result + ((date_added == null) ? 0 : date_added.hashCode());
		result = prime * result + ((date_modified == null) ? 0 : date_modified.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((forwarded_ip == null) ? 0 : forwarded_ip.hashCode());
		result = prime * result + ((invoice_no == null) ? 0 : invoice_no.hashCode());
		result = prime * result + ((invoice_prefix == null) ? 0 : invoice_prefix.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((language_id == null) ? 0 : language_id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((order_status_id == null) ? 0 : order_status_id.hashCode());
		result = prime * result + ((payment_address_1 == null) ? 0 : payment_address_1.hashCode());
		result = prime * result + ((payment_address_2 == null) ? 0 : payment_address_2.hashCode());
		result = prime * result + ((payment_address_format == null) ? 0 : payment_address_format.hashCode());
		result = prime * result + ((payment_city == null) ? 0 : payment_city.hashCode());
		result = prime * result + ((payment_code == null) ? 0 : payment_code.hashCode());
		result = prime * result + ((payment_company == null) ? 0 : payment_company.hashCode());
		result = prime * result + ((payment_country == null) ? 0 : payment_country.hashCode());
		result = prime * result + ((payment_country_id == null) ? 0 : payment_country_id.hashCode());
		result = prime * result + ((payment_firstname == null) ? 0 : payment_firstname.hashCode());
		result = prime * result + ((payment_lastname == null) ? 0 : payment_lastname.hashCode());
		result = prime * result + ((payment_method == null) ? 0 : payment_method.hashCode());
		result = prime * result + ((payment_postcode == null) ? 0 : payment_postcode.hashCode());
		result = prime * result + ((payment_zone == null) ? 0 : payment_zone.hashCode());
		result = prime * result + ((payment_zone_id == null) ? 0 : payment_zone_id.hashCode());
		result = prime * result + ((shipping_address_1 == null) ? 0 : shipping_address_1.hashCode());
		result = prime * result + ((shipping_address_2 == null) ? 0 : shipping_address_2.hashCode());
		result = prime * result + ((shipping_address_format == null) ? 0 : shipping_address_format.hashCode());
		result = prime * result + ((shipping_city == null) ? 0 : shipping_city.hashCode());
		result = prime * result + ((shipping_code == null) ? 0 : shipping_code.hashCode());
		result = prime * result + ((shipping_company == null) ? 0 : shipping_company.hashCode());
		result = prime * result + ((shipping_country == null) ? 0 : shipping_country.hashCode());
		result = prime * result + ((shipping_country_id == null) ? 0 : shipping_country_id.hashCode());
		result = prime * result + ((shipping_firstname == null) ? 0 : shipping_firstname.hashCode());
		result = prime * result + ((shipping_lastname == null) ? 0 : shipping_lastname.hashCode());
		result = prime * result + ((shipping_method == null) ? 0 : shipping_method.hashCode());
		result = prime * result + ((shipping_postcode == null) ? 0 : shipping_postcode.hashCode());
		result = prime * result + ((shipping_zone == null) ? 0 : shipping_zone.hashCode());
		result = prime * result + ((shipping_zone_id == null) ? 0 : shipping_zone_id.hashCode());
		result = prime * result + ((store_id == null) ? 0 : store_id.hashCode());
		result = prime * result + ((store_name == null) ? 0 : store_name.hashCode());
		result = prime * result + ((store_url == null) ? 0 : store_url.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		result = prime * result + ((user_agent == null) ? 0 : user_agent.hashCode());
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
		OC_Order other = (OC_Order) obj;
		if (accept_language == null) {
			if (other.accept_language != null)
				return false;
		} else if (!accept_language.equals(other.accept_language))
			return false;
		if (affiliate_id == null) {
			if (other.affiliate_id != null)
				return false;
		} else if (!affiliate_id.equals(other.affiliate_id))
			return false;
		if (awbno == null) {
			if (other.awbno != null)
				return false;
		} else if (!awbno.equals(other.awbno))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (commission == null) {
			if (other.commission != null)
				return false;
		} else if (!commission.equals(other.commission))
			return false;
		if (courier_id == null) {
			if (other.courier_id != null)
				return false;
		} else if (!courier_id.equals(other.courier_id))
			return false;
		if (currency_code == null) {
			if (other.currency_code != null)
				return false;
		} else if (!currency_code.equals(other.currency_code))
			return false;
		if (currency_id == null) {
			if (other.currency_id != null)
				return false;
		} else if (!currency_id.equals(other.currency_id))
			return false;
		if (currency_value == null) {
			if (other.currency_value != null)
				return false;
		} else if (!currency_value.equals(other.currency_value))
			return false;
		if (custom_field == null) {
			if (other.custom_field != null)
				return false;
		} else if (!custom_field.equals(other.custom_field))
			return false;
		if (customer_group_id == null) {
			if (other.customer_group_id != null)
				return false;
		} else if (!customer_group_id.equals(other.customer_group_id))
			return false;
		if (customer_id == null) {
			if (other.customer_id != null)
				return false;
		} else if (!customer_id.equals(other.customer_id))
			return false;
		if (date_added == null) {
			if (other.date_added != null)
				return false;
		} else if (!date_added.equals(other.date_added))
			return false;
		if (date_modified == null) {
			if (other.date_modified != null)
				return false;
		} else if (!date_modified.equals(other.date_modified))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (forwarded_ip == null) {
			if (other.forwarded_ip != null)
				return false;
		} else if (!forwarded_ip.equals(other.forwarded_ip))
			return false;
		if (invoice_no == null) {
			if (other.invoice_no != null)
				return false;
		} else if (!invoice_no.equals(other.invoice_no))
			return false;
		if (invoice_prefix == null) {
			if (other.invoice_prefix != null)
				return false;
		} else if (!invoice_prefix.equals(other.invoice_prefix))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (language_id == null) {
			if (other.language_id != null)
				return false;
		} else if (!language_id.equals(other.language_id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
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
		if (payment_address_1 == null) {
			if (other.payment_address_1 != null)
				return false;
		} else if (!payment_address_1.equals(other.payment_address_1))
			return false;
		if (payment_address_2 == null) {
			if (other.payment_address_2 != null)
				return false;
		} else if (!payment_address_2.equals(other.payment_address_2))
			return false;
		if (payment_address_format == null) {
			if (other.payment_address_format != null)
				return false;
		} else if (!payment_address_format.equals(other.payment_address_format))
			return false;
		if (payment_city == null) {
			if (other.payment_city != null)
				return false;
		} else if (!payment_city.equals(other.payment_city))
			return false;
		if (payment_code == null) {
			if (other.payment_code != null)
				return false;
		} else if (!payment_code.equals(other.payment_code))
			return false;
		if (payment_company == null) {
			if (other.payment_company != null)
				return false;
		} else if (!payment_company.equals(other.payment_company))
			return false;
		if (payment_country == null) {
			if (other.payment_country != null)
				return false;
		} else if (!payment_country.equals(other.payment_country))
			return false;
		if (payment_country_id == null) {
			if (other.payment_country_id != null)
				return false;
		} else if (!payment_country_id.equals(other.payment_country_id))
			return false;
		if (payment_firstname == null) {
			if (other.payment_firstname != null)
				return false;
		} else if (!payment_firstname.equals(other.payment_firstname))
			return false;
		if (payment_lastname == null) {
			if (other.payment_lastname != null)
				return false;
		} else if (!payment_lastname.equals(other.payment_lastname))
			return false;
		if (payment_method == null) {
			if (other.payment_method != null)
				return false;
		} else if (!payment_method.equals(other.payment_method))
			return false;
		if (payment_postcode == null) {
			if (other.payment_postcode != null)
				return false;
		} else if (!payment_postcode.equals(other.payment_postcode))
			return false;
		if (payment_zone == null) {
			if (other.payment_zone != null)
				return false;
		} else if (!payment_zone.equals(other.payment_zone))
			return false;
		if (payment_zone_id == null) {
			if (other.payment_zone_id != null)
				return false;
		} else if (!payment_zone_id.equals(other.payment_zone_id))
			return false;
		if (shipping_address_1 == null) {
			if (other.shipping_address_1 != null)
				return false;
		} else if (!shipping_address_1.equals(other.shipping_address_1))
			return false;
		if (shipping_address_2 == null) {
			if (other.shipping_address_2 != null)
				return false;
		} else if (!shipping_address_2.equals(other.shipping_address_2))
			return false;
		if (shipping_address_format == null) {
			if (other.shipping_address_format != null)
				return false;
		} else if (!shipping_address_format.equals(other.shipping_address_format))
			return false;
		if (shipping_city == null) {
			if (other.shipping_city != null)
				return false;
		} else if (!shipping_city.equals(other.shipping_city))
			return false;
		if (shipping_code == null) {
			if (other.shipping_code != null)
				return false;
		} else if (!shipping_code.equals(other.shipping_code))
			return false;
		if (shipping_company == null) {
			if (other.shipping_company != null)
				return false;
		} else if (!shipping_company.equals(other.shipping_company))
			return false;
		if (shipping_country == null) {
			if (other.shipping_country != null)
				return false;
		} else if (!shipping_country.equals(other.shipping_country))
			return false;
		if (shipping_country_id == null) {
			if (other.shipping_country_id != null)
				return false;
		} else if (!shipping_country_id.equals(other.shipping_country_id))
			return false;
		if (shipping_firstname == null) {
			if (other.shipping_firstname != null)
				return false;
		} else if (!shipping_firstname.equals(other.shipping_firstname))
			return false;
		if (shipping_lastname == null) {
			if (other.shipping_lastname != null)
				return false;
		} else if (!shipping_lastname.equals(other.shipping_lastname))
			return false;
		if (shipping_method == null) {
			if (other.shipping_method != null)
				return false;
		} else if (!shipping_method.equals(other.shipping_method))
			return false;
		if (shipping_postcode == null) {
			if (other.shipping_postcode != null)
				return false;
		} else if (!shipping_postcode.equals(other.shipping_postcode))
			return false;
		if (shipping_zone == null) {
			if (other.shipping_zone != null)
				return false;
		} else if (!shipping_zone.equals(other.shipping_zone))
			return false;
		if (shipping_zone_id == null) {
			if (other.shipping_zone_id != null)
				return false;
		} else if (!shipping_zone_id.equals(other.shipping_zone_id))
			return false;
		if (store_id == null) {
			if (other.store_id != null)
				return false;
		} else if (!store_id.equals(other.store_id))
			return false;
		if (store_name == null) {
			if (other.store_name != null)
				return false;
		} else if (!store_name.equals(other.store_name))
			return false;
		if (store_url == null) {
			if (other.store_url != null)
				return false;
		} else if (!store_url.equals(other.store_url))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		if (user_agent == null) {
			if (other.user_agent != null)
				return false;
		} else if (!user_agent.equals(other.user_agent))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OC_Order [order_id=" + order_id + ", invoice_no=" + invoice_no + ", invoice_prefix=" + invoice_prefix
				+ ", store_id=" + store_id + ", store_name=" + store_name + ", store_url=" + store_url
				+ ", customer_id=" + customer_id + ", customer_group_id=" + customer_group_id + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + ", telephone=" + telephone + ", fax="
				+ fax + ", payment_firstname=" + payment_firstname + ", payment_lastname=" + payment_lastname
				+ ", payment_company=" + payment_company + ", payment_address_1=" + payment_address_1
				+ ", payment_address_2=" + payment_address_2 + ", payment_city=" + payment_city + ", payment_postcode="
				+ payment_postcode + ", payment_country=" + payment_country + ", payment_country_id="
				+ payment_country_id + ", payment_zone=" + payment_zone + ", payment_zone_id=" + payment_zone_id
				+ ", payment_address_format=" + payment_address_format + ", payment_custom_field="
				+ payment_custom_field + ", payment_method=" + payment_method + ", payment_code=" + payment_code
				+ ", shipping_firstname=" + shipping_firstname + ", shipping_lastname=" + shipping_lastname
				+ ", shipping_company=" + shipping_company + ", shipping_address_1=" + shipping_address_1
				+ ", shipping_address_2=" + shipping_address_2 + ", shipping_city=" + shipping_city
				+ ", shipping_postcode=" + shipping_postcode + ", shipping_country=" + shipping_country
				+ ", shipping_country_id=" + shipping_country_id + ", shipping_zone=" + shipping_zone
				+ ", shipping_zone_id=" + shipping_zone_id + ", shipping_address_format=" + shipping_address_format
				+ ", shipping_custom_field=" + shipping_custom_field + ", shipping_method=" + shipping_method
				+ ", shipping_code=" + shipping_code + ", comment=" + comment + ", total=" + total
				+ ", order_status_id=" + order_status_id + ", affiliate_id=" + affiliate_id + ", commission="
				+ commission + ", language_id=" + language_id + ", currency_id=" + currency_id + ", currency_code="
				+ currency_code + ", currency_value=" + currency_value + ", ip=" + ip + ", forwarded_ip=" + forwarded_ip
				+ ", user_agent=" + user_agent + ", accept_language=" + accept_language + ", date_added=" + date_added
				+ ", date_modified=" + date_modified + ", custom_field=" + custom_field + ", courier_id=" + courier_id
				+ ", awbno=" + awbno + "]";
	}
	public String getPayment_custom_field() {
		return payment_custom_field;
	}
	public void setPayment_custom_field(String payment_custom_field) {
		this.payment_custom_field = payment_custom_field;
	}
	public String getShipping_custom_field() {
		return shipping_custom_field;
	}
	public void setShipping_custom_field(String shipping_custom_field) {
		this.shipping_custom_field = shipping_custom_field;
	}
	
	
}
