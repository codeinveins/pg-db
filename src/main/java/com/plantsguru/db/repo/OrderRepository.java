package com.plantsguru.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantsguru.db.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
