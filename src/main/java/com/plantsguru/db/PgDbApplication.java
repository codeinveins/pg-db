package com.plantsguru.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.plantsguru")
public class PgDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgDbApplication.class, args);
	}

}
