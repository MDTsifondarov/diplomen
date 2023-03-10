package com.example.test.controllers;



import com.example.test.entities.Book;
import com.example.test.repositories.BookRepository;
import com.example.test.repositories.CategoryRepository;
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
    private BookRepository bookRepository;
    private CategoryRepository categoryRepository;
    @GetMapping
    public String getAllBooks(Model model) {

        List<Book> result = new ArrayList<>(bookRepository.findAll());
        for (Book book:result){

            System.out.println(book+" "+book.getCategories());

        }
       model.addAttribute("books",result);
        //System.out.println(result.get(0).getAuthors());
       return "books/list";
    }
}