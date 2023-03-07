package com.example.test.services;

import com.example.test.entities.Author;
import com.example.test.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }
    public void deleteAuthor(Author author){
        authorRepository.delete(author);
    }
    public Author findById(String id){
        return authorRepository.findById(id).orElse(null);
    }
    public Iterable<Author> findAll(){
        return authorRepository.findAll();
    }



}
