package com.practice.swagger;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class SwaggerApplicationBuilder extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		
		return builder.sources(SwaggerApplication.class);
		
	}
}
