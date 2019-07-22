package com.plantsguru.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantsguru.db.model.Pincode;

public interface PincodeRepository extends JpaRepository<Pincode, Long> {

}
