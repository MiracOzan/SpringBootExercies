package com.example.bookstore.business.concretes;

import com.example.bookstore.business.abstracts.BookServices;
import com.example.bookstore.dataaccess.abstracts.BookRepository;
import com.example.bookstore.entities.concretes.Book;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookManager implements BookServices {

    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAll() {
        return bookRepository.getAll();
    }

}
