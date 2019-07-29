package com.plantsguru.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantsguru.db.model.Order;
import com.plantsguru.db.model.Order_Product;
import com.plantsguru.db.repo.OrderProductRepository;
import com.plantsguru.db.repo.OrderRepository;
import com.plantsguru.db.repo.impl.OrderProductRepoImpl;
import com.plantsguru.db.repo.impl.OrderRepoImpl;
import com.plantsguru.model.OC_Order;
import com.plantsguru.model.OC_Order_Product;
import com.plantsguru.model.OC_Order_Total;
import com.plantsguru.repo.OCOrderHistoryRepository;
import com.plantsguru.repo.OCOrderProductRepository;
import com.plantsguru.repo.OCOrderRepository;
import com.plantsguru.repo.OCOrderTotalRepository;

@Service
public class DataCopyService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OCOrderRepository ocOrderRepository;

	@Autowired
	private OrderRepoImpl orderRepoImpl;

	@Autowired
	private OCOrderTotalRepository ocOrderTotalRepository;

	@Autowired
	private OrderProductRepository orderProductRepository;

	@Autowired
	private OCOrderProductRepository ocOrderProductRepository;

	@Autowired
	private OrderProductRepoImpl orderProductRepoImpl;

	@Autowired
	private OCOrderHistoryRepository ocOrderHistoryRepository;

	public String copyOrderData() {
		StringBuilder messageToReturn = new StringBuilder();
		
		try {
			long dbOrderCount = orderRepository.count();
			long pgOrderCount = ocOrderRepository.count();

			long diff = dbOrderCount - pgOrderCount;
			if(diff > 0) {
				messageToReturn.append("Number of new orders with dainik bhaskar: "+ diff+"<br/><hr/><hr/>");

				List<Order> newOrdersWithDBhaskar = orderRepoImpl.findAllOrderByLimits(pgOrderCount, dbOrderCount);

				//Insert new OC_Orders
				log.debug("Inserting into OC_Orders");
				List<OC_Order> newPgOrders = new ArrayList<>();
				newOrdersWithDBhaskar.forEach(o -> newPgOrders.add(CreatorAndConvertor.convertDbOrderToPgOrder(o, 0)));
				messageToReturn.append("1. Inserting into OC_Orders.<br/>");
				Iterable<OC_Order> savedPgNewOrders = ocOrderRepository.saveAll(newPgOrders);

				//Insert Oc_Order_Total
				log.debug("Inserting into OC_Order_Total");
				messageToReturn.append("Records inserted in Oc_Orders with id: "); 
				savedPgNewOrders.forEach(so -> {
					messageToReturn.append(so.getOrder_id()+",");
					OC_Order_Total subTotal = CreatorAndConvertor.createOcOrderTotal(so.getTotal(), so.getOrder_id(), "sub_total", "Sub-Total", 1);
					OC_Order_Total shipping = CreatorAndConvertor.createOcOrderTotal(0.0000f, so.getOrder_id(), "shipping", "Raccomandata Shipping Rate", 3);
					OC_Order_Total total = CreatorAndConvertor.createOcOrderTotal(so.getTotal(), so.getOrder_id(), "total", "Total", 9);
					ocOrderTotalRepository.save(subTotal);
					ocOrderTotalRepository.save(shipping);
					ocOrderTotalRepository.save(total);
				});
				messageToReturn.append("<br/>2. Inserting into OC_Order_Total.<br/>");

				//Insert Oc_Order_Product
				long dbOrderProductCount =  orderProductRepository.count();
				long pgOrderProductCount =  ocOrderProductRepository.count();
				if(dbOrderProductCount > pgOrderProductCount) {
					log.debug("Inserting into OC_Order_Product");
					messageToReturn.append("3. Inserting into OC_Order_Product.<br/>");
					List<Order_Product> newOrderProductsWithDBhaskar = orderProductRepoImpl.findAllOrderProductsByLimits(pgOrderProductCount, dbOrderProductCount);
					List<OC_Order_Product> newPgOrderProducts = new ArrayList<>();
					newOrderProductsWithDBhaskar.forEach(
							op -> newPgOrderProducts.add(
									CreatorAndConvertor.convertDbOrderProductToPgOrderProduct(
											op,
											ApplicationConstants.PLANT_NAME_MODEL_MAP.keySet().contains(Integer.valueOf(op.getProduct_Id())) 
												? ApplicationConstants.PLANT_NAME_MODEL_MAP.get(Integer.valueOf(op.getProduct_Id())).get(1) 
												: "", 
											ApplicationConstants.PLANT_NAME_MODEL_MAP.keySet().contains(Integer.valueOf(op.getProduct_Id())) 
												? ApplicationConstants.PLANT_NAME_MODEL_MAP.get(Integer.valueOf(op.getProduct_Id())).get(0) 
												: ""
										)));
					
					Iterable<OC_Order_Product> orderProductsInserted = ocOrderProductRepository.saveAll(newPgOrderProducts);
					messageToReturn.append("Records in Oc_Order_Products inserted with ids: ");
					orderProductsInserted.forEach(op -> {
						messageToReturn.append(op.getOrder_product_id()+",");
					});
				}
				
				//Insert Oc_Order_History
				log.debug("Inserting into OC_Order_History");
				messageToReturn.append("<br/>4. Inserting into OC_Order_History.<br/>");
				savedPgNewOrders.forEach(o -> {
					ocOrderHistoryRepository.save(CreatorAndConvertor.createOrderHistory(o.getOrder_id(), o.getOrder_status_id(), new Date()));
				});
			}
			else {
				messageToReturn.append("We have everything. No new orders with dainik bhaskar.");
			}
		}
		catch(Exception e) {
			log.error("Exception occured: "+e);
		}
		return messageToReturn.toString();
	}
}