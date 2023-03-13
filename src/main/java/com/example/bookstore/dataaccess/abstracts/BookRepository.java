package com.example.bookstore.dataaccess.abstracts;

import java.util.List;

import com.example.bookstore.business.response.GetAllBookResponse;
import com.example.bookstore.entities.concretes.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
	List<Book> getAll();
	void add(GetAllBookResponse createBooksResponse);
}
