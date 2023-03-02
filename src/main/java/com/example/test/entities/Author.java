package com.example.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Authors")
@AllArgsConstructor
@EqualsAndHashCode
public class Author {
    @Id
    private String id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="Last_Name")
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Author() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
