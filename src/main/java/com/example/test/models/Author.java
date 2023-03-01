package com.example.test.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Authors")
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Author {
    @Id
    private String id;
    @Column(name="Name")
    private String name;
    @ManyToMany(mappedBy = "authors")
    private Set<Books> books;

    public Author() {
        this.id = UUID.randomUUID().toString();
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
