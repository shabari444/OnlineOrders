package com.rest.service.OnlineOrders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OnlineOrdersApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(OnlineOrdersApplication.class);

	public static void main(String[] args) {
		
		System.setProperty("log.name","OnlineOrders" );
		
		LOG.debug("<---------------Starting application------------------->");
		
		SpringApplication.run(OnlineOrdersApplication.class, args);
		
		LOG.debug("<-------------------Application Started----------------->");
	
	}

}
