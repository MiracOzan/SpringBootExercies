package com.example.bookstore.webapi.controllers;

import com.example.bookstore.business.abstracts.BookServices;
import com.example.bookstore.business.request.CreateBooksRequest;
import com.example.bookstore.business.response.GetAllBookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<GetAllBookResponse> getAll(){
        return bookServices.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateBooksRequest createBooksRequest){
        this.bookServices.add(createBooksRequest);
    }
}
