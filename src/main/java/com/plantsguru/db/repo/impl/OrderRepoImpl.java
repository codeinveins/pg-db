package com.plantsguru.db.repo.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.plantsguru.db.model.Order;

@Repository
public class OrderRepoImpl {

	@PersistenceContext(unitName = "db")
	private EntityManager entityManager;
	
	public List<Order> findAllOrderByLimits(Long startingLimit, Long endLimit) {
		return entityManager.createQuery("SELECT o FROM Order o")
		.setFirstResult(startingLimit.intValue()).setMaxResults(endLimit.intValue())
		.getResultList();
	}
}
