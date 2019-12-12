package com.luv2code.springbootconfigurationproperties.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springbootconfigurationproperties.util.Book;

@Configuration
public class BeanConfigProperties {
	
	@Bean
    @ConfigurationProperties(prefix = "book")
    public Book book() {
        return  new Book();
    }
}
