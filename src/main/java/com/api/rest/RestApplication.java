package com.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.api.rest.modelo")
@EnableJpaRepositories(basePackages = "com.api.rest.modelo")
public class RestApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	
	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(RestApplication.class);
	    }
}
