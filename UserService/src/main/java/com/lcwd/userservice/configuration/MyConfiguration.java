package com.lcwd.userservice.configuration;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfiguration {
	
	@Bean

	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}
	


}
