package com.plantsguru.db.repo.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.plantsguru.db.model.Order_Product;

@Repository
public class OrderProductRepoImpl {

	@PersistenceContext(unitName = "db")
	private EntityManager entityManager;
	
	public List<Order_Product> findAllOrderProductsByLimits(Long startingLimit, Long endLimit) {
		return entityManager.createQuery("SELECT op FROM Order_Product op")
		.setFirstResult(startingLimit.intValue()).setMaxResults(endLimit.intValue())
		.getResultList();
	}
}
