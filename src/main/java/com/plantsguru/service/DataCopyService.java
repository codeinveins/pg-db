package com.plantsguru.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.plantsguru.db.model.Order;
import com.plantsguru.db.repo.OrderRepository;
import com.plantsguru.repo.OCOrderRepository;

@Service
public class DataCopyService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OCOrderRepository ocOrderRepository;
	
	public void copyOrderData() {
		long dbOrderCount = orderRepository.count();
		long pgOrderCount = ocOrderRepository.count();
		
		if(dbOrderCount != pgOrderCount) {
			long diff = dbOrderCount - pgOrderCount;
			List<Order> newOrders = orderRepository.findUsingLimits(new PageRequest(3, 5));
			System.out.println(newOrders.size());
		}
		else {
			
		}
		
		System.out.println();
	}
}
