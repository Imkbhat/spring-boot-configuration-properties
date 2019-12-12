package com.luv2code.springbootconfigurationproperties.util;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class Book {
	
	@NotBlank
    @Length(min = 3, max = 20)
    private String bookTitle;
	
	@Min(50)
    @Max(2000)
    private Double price;
 
    private String isbn;
    
    public Book() {

    }

	public Book(@NotBlank @Length(min = 3, max = 20) String bookTitle,
			@Min(50) @Max(2000) Double price, String isbn) {
		this.bookTitle = bookTitle;
		this.price = price;
		this.isbn = isbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
