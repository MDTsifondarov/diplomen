package com.example.test.services;

import com.example.test.models.Book;
import com.example.test.repositories.BooksRepository;
import com.example.test.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServices {
    @Autowired
    private BooksRepository bookRepository;

    @Autowired
    private CustomersRepository userRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(String id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()) {
            return book.get();
        }
//        else {
//            throw new ResourceNotFoundException("Book not found with id " + id);
//        }
        return null;
    }
}
