package com.example.test.services;

import com.example.test.entities.Book;
import com.example.test.entities.Category;
import com.example.test.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {
 private final CategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }
    public Category findById(String id){
        return categoryRepository.findById(id).orElse(null);
    }

    public Iterable<Category> findAll(){
        return categoryRepository.findAll();
    }

}
