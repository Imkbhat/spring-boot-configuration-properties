package com.luv2code.springbootconfigurationproperties.properties;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.luv2code.springbootconfigurationproperties.util.Book;

@Component
@ConfigurationPropertiesBinding
public class BookConverter implements Converter<String, Book>{

	@Override
	public Book convert(String s) {
		String[] data = s.split(",");
        return  new Book(data[0], Double.parseDouble(data[1]), data[2]);
	}

}
