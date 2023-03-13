package com.example.bookstore.webapi.controllers;

import com.example.bookstore.business.abstracts.BookServices;
import com.example.bookstore.entities.concretes.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {
    private BookServices bookServices;

    @Autowired
    public BooksController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @GetMapping("/getAll")
    public List<Book> getAll(){
        return bookServices.getAll();
    }
}
