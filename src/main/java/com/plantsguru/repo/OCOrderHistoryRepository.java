package com.plantsguru.repo;

import org.springframework.data.repository.CrudRepository;

import com.plantsguru.model.OC_Order_History;

public interface OCOrderHistoryRepository extends CrudRepository<OC_Order_History, Long> {

}
