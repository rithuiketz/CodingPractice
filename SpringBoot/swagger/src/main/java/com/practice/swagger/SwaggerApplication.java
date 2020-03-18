package com.practice.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.practice.swagger.config.InternalisationConfig;
import com.practice.swagger.rest.MessageController;

@SpringBootApplication
@ComponentScan(basePackageClasses={InternalisationConfig.class,MessageController.class})
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
