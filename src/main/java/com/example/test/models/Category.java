package com.example.test.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Categories")
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Category {
    @Id
    private String Id;

    @Column(name="Category")
    private String name;
    @ManyToMany(mappedBy = "categories")
    private Set<Books> books;

    public Category() {
        this.Id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }
}
