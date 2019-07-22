package com.plantsguru.repo;

import org.springframework.data.repository.CrudRepository;

import com.plantsguru.model.OC_Order;

public interface OCOrderRepository extends CrudRepository<OC_Order, Integer> {

}
