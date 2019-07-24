package com.plantsguru.db.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plantsguru.db.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	@Query("select * from order")
	List<Order> findUsingLimits(Pageable pageable);
}
