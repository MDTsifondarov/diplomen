package com.example.test.entities;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @Column(name = "Id", columnDefinition = "varchar(36)")
    private String id;
    @Column(name = "Title", columnDefinition = "nvarchar(50)")
    private String title;
    @Column(name = "ISBN", columnDefinition = "nvarchar(50)")
    private String ISBN;
@ManyToMany
    @JoinTable(name = "books_authors",
    joinColumns = @JoinColumn(name ="book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;
    @ManyToMany
    @JoinTable(name = "Books_Categories", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;
    @ManyToMany
    @JoinTable(name = "books_publishers", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "publisher_id"))
    private Set<Publisher> publishers;

    public Book() {
        id = UUID.randomUUID().toString();
    }

    public Book(String id, String title, String ISBN, List<Author> authors, Set<Category> categories, Set<Publisher> publishers) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.authors = authors;
        this.categories = categories;
        this.publishers = publishers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(Set<Publisher> publishers) {
        this.publishers = publishers;
    }
}









//public String getAuthorNames(){
//    String allNames="";
//    for(Author temp:authors){
//       allNames= allNames.concat(temp.getName());
//       allNames= allNames.concat(";");
//    }
//    return allNames;
//}
