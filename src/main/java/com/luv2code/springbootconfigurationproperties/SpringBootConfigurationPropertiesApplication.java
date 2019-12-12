package com.luv2code.springbootconfigurationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.luv2code.springbootconfigurationproperties.repo")
@EntityScan("com.luv2code.springbootconfigurationproperties.entity")
@SpringBootApplication
public class SpringBootConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigurationPropertiesApplication.class, args);
	}

}
