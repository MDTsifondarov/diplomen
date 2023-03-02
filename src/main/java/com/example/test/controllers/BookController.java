package com.example.test.controllers;



import com.example.test.entities.Book;
import com.example.test.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping
    public String getAllBooks(Model model) {

        List<Book> result = new ArrayList<>(booksRepository.findAll());
        for (Book book:result){
            System.out.println(book);
        }
       model.addAttribute("books",result);
       return "books/list";
    }
}