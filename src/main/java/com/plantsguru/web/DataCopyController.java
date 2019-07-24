package com.plantsguru.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantsguru.service.DataCopyService;

@RestController
public class DataCopyController {

	@Autowired
	private DataCopyService dataCopyService;
	
	@RequestMapping("/")
	public String index() {
		return "Welcome to Spring Logging!";
	}

	@RequestMapping("/copy")
	public String copyDataFromDbToPg() {
		dataCopyService.copyOrderData();
		return "url Called";
	}
}
