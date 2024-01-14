package com.crick.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.crick.apis.repositories")
public class CrickbackendApplication{  /*extends SpringBootServletInitializer*/  
	public static void main(String[] args) {
        SpringApplication.run(CrickbackendApplication.class, args);
    }
	
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { // TODO Auto-generated method
	 * stub return builder.sources(CrickbackendApplication.class); }
	 */

}
