package com.plantsguru.service;

import java.util.Date;

import com.plantsguru.db.model.Order;
import com.plantsguru.db.model.Order_Product;
import com.plantsguru.model.OC_Order;
import com.plantsguru.model.OC_Order_History;
import com.plantsguru.model.OC_Order_Product;
import com.plantsguru.model.OC_Order_Total;

public class CreatorAndConvertor {

	public static OC_Order convertDbOrderToPgOrder(Order order, Integer customerId) {
		OC_Order ocOrder = new OC_Order();
		ocOrder.setOrder_id(order.getOrder_Id());
		ocOrder.setInvoice_no(Integer.parseInt(order.getInvoice_Number().split("-")[3]));
		ocOrder.setInvoice_prefix("DB-PG-2019");
		ocOrder.setStore_id(0);
		ocOrder.setStore_name("DainikBhaskar_PlantsGuru");
		ocOrder.setStore_url("");
		ocOrder.setCustomer_id(customerId);
		ocOrder.setCustomer_group_id(1);
		ocOrder.setFirstname(order.getName());
		ocOrder.setLastname("");
		ocOrder.setEmail(order.getEmail());
		ocOrder.setTelephone(order.getMobile());
		ocOrder.setFax("");
		ocOrder.setPayment_firstname(order.getName());
		ocOrder.setPayment_lastname("");
		ocOrder.setPayment_company("");
		ocOrder.setPayment_address_1(order.getAddress());
		ocOrder.setPayment_address_2("");
		ocOrder.setPayment_city(order.getCity());
		ocOrder.setPayment_postcode(order.getPincode());
		ocOrder.setPayment_country("India");
		ocOrder.setPayment_country_id(99);
		ocOrder.setPayment_zone(order.getCity());
		ocOrder.setPayment_zone_id(0); //TODO: Check for it
		ocOrder.setPayment_address_format("");
		ocOrder.setPayment_method("PayUMoney");
		ocOrder.setPayment_code("PayUMoney");
		ocOrder.setShipping_firstname(order.getName());
		ocOrder.setShipping_lastname("");
		ocOrder.setShipping_company("");
		ocOrder.setShipping_address_1(order.getAddress());
		ocOrder.setShipping_address_2("");
		ocOrder.setShipping_city(order.getCity());
		ocOrder.setShipping_postcode(order.getPincode());
		ocOrder.setShipping_country("India");
		ocOrder.setShipping_country_id(99);
		ocOrder.setShipping_zone(order.getCity());
		ocOrder.setShipping_zone_id(0);
		ocOrder.setShipping_address_format("");
		ocOrder.setShipping_method("<span class=\"shippingNote\">(Flat free shipping)</span> Shipping");
		ocOrder.setShipping_code("raccomandata.raccomandata");
		ocOrder.setComment("");
		ocOrder.setTotal(order.getTotal_Price());
		if(order.getPayment_Status().equalsIgnoreCase("success") || order.getPayment_Status().contains("ucces"))
			ocOrder.setOrder_status_id(2);
		else if(order.getPayment_Status().equalsIgnoreCase("failure") || order.getPayment_Status().contains("ail"))
			ocOrder.setOrder_status_id(10);
		else if(order.getPayment_Status().equalsIgnoreCase("pending") || order.getPayment_Status().contains("end"))
			ocOrder.setOrder_status_id(1);
		else
			ocOrder.setOrder_status_id(8);
			
		ocOrder.setAffiliate_id(0);
		ocOrder.setCommission(0.0000f);
		ocOrder.setLanguage_id(1);
		ocOrder.setCurrency_id(4);
		ocOrder.setCurrency_code("INR");
		ocOrder.setCurrency_value(1.0f);
		ocOrder.setIp(order.getIP_addres());
		ocOrder.setForwarded_ip("");
		ocOrder.setUser_agent("");
		ocOrder.setAccept_language("en-US");
		ocOrder.setDate_added(order.getCreated_at());
		ocOrder.setDate_modified(order.getCreated_at());
		ocOrder.setCustom_field("");
		ocOrder.setAwbno("");
		ocOrder.setCourier_id(0l);
		ocOrder.setPayment_custom_field("");
		ocOrder.setShipping_custom_field("");
		
		return ocOrder;
	}
	
	public static OC_Order_Product convertDbOrderProductToPgOrderProduct(Order_Product orderProduct, String productName, String productModel) {
		OC_Order_Product ocOrderProduct = new OC_Order_Product();
		ocOrderProduct.setOrder_product_id(orderProduct.getOrder_Product_Id());
		ocOrderProduct.setOrder_id(orderProduct.getOrder_Id());
		ocOrderProduct.setProduct_id(Long.valueOf(orderProduct.getProduct_Id()));
		ocOrderProduct.setName(productName);
		ocOrderProduct.setModel(productModel);
		ocOrderProduct.setQuantity(orderProduct.getQuantity());
		ocOrderProduct.setPrice(orderProduct.getProdcut_Price());
		ocOrderProduct.setTotal(orderProduct.getQuantity() * orderProduct.getProdcut_Price());
		ocOrderProduct.setTax(0.0000f);
		ocOrderProduct.setReward(0);

		return ocOrderProduct;
	}

	public static OC_Order_Total createOcOrderTotal(Float total, Long orderId, String code, String title, int sort_order) {
		OC_Order_Total ocOrderTotal = new OC_Order_Total();
		ocOrderTotal.setOrder_id(orderId);
		ocOrderTotal.setCode(code);
		ocOrderTotal.setTitle(title);
		ocOrderTotal.setValue(total);
		ocOrderTotal.setSort_order(sort_order);
		return ocOrderTotal;
	}
	
	public static OC_Order_History createOrderHistory(Long orderId, Integer orderStatus, Date dateAdded) {
		OC_Order_History history = new OC_Order_History();
		history.setDate_added(dateAdded);
		history.setOrder_id(orderId);
		history.setNotify(true);
		history.setOrder_status_id(orderStatus);
		history.setComment("");
		return history;
		
	}
}
