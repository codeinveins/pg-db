package com.plantsguru.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantsguru.db.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
