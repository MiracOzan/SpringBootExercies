package com.example.bookstore.dataaccess.abstracts;

import java.util.List;
import com.example.bookstore.entities.concretes.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
	List<Book> getAll();
}
