package com.example.bookstore.business.concretes;

import com.example.bookstore.business.abstracts.BookServices;
import com.example.bookstore.business.request.CreateBooksRequest;
import com.example.bookstore.business.response.GetAllBookResponse;
import com.example.bookstore.dataaccess.abstracts.BookRepository;
import com.example.bookstore.entities.concretes.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookManager implements BookServices {

    private BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<GetAllBookResponse> getAll() {

        List<Book> books = bookRepository.findAll();
        List<GetAllBookResponse> booksResponse = new ArrayList<GetAllBookResponse>();

        for (Book book : books ){
            GetAllBookResponse responseItem = new GetAllBookResponse();
            responseItem.setId(book.getId());
            responseItem.setName(book.getName());

            bookRepository.add(responseItem);
        }
        return booksResponse;
    }


    public void add(CreateBooksRequest createBooksRequest){

        Book book = new Book();
        book.setName(createBooksRequest.getName());
        this.bookRepository.save(book);

    }

}
