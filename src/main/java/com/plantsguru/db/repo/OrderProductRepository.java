package com.plantsguru.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantsguru.db.model.Order_Product;

public interface OrderProductRepository extends JpaRepository<Order_Product, Long> {

}
