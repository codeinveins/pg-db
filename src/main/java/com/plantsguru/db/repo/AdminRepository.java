package com.plantsguru.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plantsguru.db.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
