package com.rsi.microservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CurrencyConversionController {

	
	private Logger logger = LoggerFactory.getLogger(CurrencyConversionController.class);
	
	@GetMapping("spring-docker/welcome")
	public String convertCurrency() {
		return "hello world Test CI/CD";
		}
	
	
	
}
