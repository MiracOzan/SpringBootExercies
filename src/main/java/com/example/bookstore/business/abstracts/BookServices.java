package com.example.bookstore.business.abstracts;

import com.example.bookstore.entities.concretes.Book;
import java.util.List;

public interface BookServices {
    List<Book> getAll();
}
