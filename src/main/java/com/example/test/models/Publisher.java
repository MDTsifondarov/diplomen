package com.example.test.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Publishers")
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Publisher {
    @Id
    private String id;
    @Column(name="Name")
    private String name;
    @ManyToMany(mappedBy = "publishers")
    private Set<Book> books;

    public Publisher() {

        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}