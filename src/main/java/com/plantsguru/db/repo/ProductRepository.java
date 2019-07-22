package com.plantsguru.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.plantsguru.db.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
