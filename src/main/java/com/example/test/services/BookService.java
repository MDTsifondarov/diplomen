package com.example.test.services;

import com.example.test.entities.Book;
import com.example.test.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
    public Book findById(String id){
        return bookRepository.findById(id).orElse(null);
    }

    public Iterable<Book> findAll(){
        return bookRepository.findAll();
    }



}
