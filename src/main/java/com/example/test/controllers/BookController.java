package com.example.test.controllers;


import com.example.test.models.Book;
import com.example.test.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BooksRepository booksRepository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {

        for(Book book:booksRepository.findAll()){
            System.out.println(book.getTitle());
        }
        return booksRepository.findAll();
    }
}