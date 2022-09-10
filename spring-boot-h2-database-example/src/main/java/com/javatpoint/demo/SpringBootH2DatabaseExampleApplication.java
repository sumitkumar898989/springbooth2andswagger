package com.javatpoint.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan(basePackages = "com.javatpoint.*")
@EntityScan("com.javatpoint.*")
@EnableJpaRepositories(basePackages = "com.javatpoint.repository")
public class SpringBootH2DatabaseExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DatabaseExampleApplication.class, args);
	}

}
