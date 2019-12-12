package com.luv2code.springbootconfigurationproperties.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springbootconfigurationproperties.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
