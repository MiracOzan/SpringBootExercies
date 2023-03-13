package com.example.bookstore.business.abstracts;

import com.example.bookstore.business.request.CreateBooksRequest;
import com.example.bookstore.business.response.GetAllBookResponse;
import com.example.bookstore.entities.concretes.Book;
import java.util.List;

public interface BookServices {
    List<GetAllBookResponse> getAll();
    void add(CreateBooksRequest createBooksRequest);
}
