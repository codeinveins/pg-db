package com.plantsguru.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plantsguru.service.ApplicationConstants;
import com.plantsguru.service.DataCopyService;

@RestController
public class DataCopyController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DataCopyService dataCopyService;
	
	@RequestMapping("/")
	public String index() {
		ApplicationConstants.loadDataOnStartup();
		LOGGER.error("PRODUCT MAP: " + ApplicationConstants.PLANT_NAME_MODEL_MAP);
		return "<h2>Application Ready.<h2>";
	}

	@RequestMapping("/importData")
	public String copyDataFromDbToPg() {
		LOGGER.debug("Processing started" + ApplicationConstants.PLANT_NAME_MODEL_MAP);
		return dataCopyService.copyOrderData();
	}
	
	@RequestMapping("/importStatus")
	public String copyStatusFromDbToPg(@RequestParam("ids") String commaSeparatedIds) {
		System.out.println(commaSeparatedIds);
		return commaSeparatedIds;
	}
}
