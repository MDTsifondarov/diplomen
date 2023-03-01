package com.example.test.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @Column(name = "Id",columnDefinition = "varchar(36)")
    private String id;
    @Column(name = "Title",columnDefinition = "nvarchar(50)")
    private String Title;
    @Column(name = "ISBN",columnDefinition = "nvarchar(50)")
    private String ISBN;
@ManyToMany
    @JoinTable(name = "BookAuthors",
    joinColumns = @JoinColumn(name ="BookId"),
    inverseJoinColumns = @JoinColumn(name = "AuthorId"))
    private Set<Author> authors;
@ManyToMany
    @JoinTable(name = "BooksCategories",
            joinColumns = @JoinColumn(name ="BookId"),
            inverseJoinColumns = @JoinColumn(name = "CategoryId"))
    private Set<Category> categories;

}









//public String getAuthorNames(){
//    String allNames="";
//    for(Author temp:authors){
//       allNames= allNames.concat(temp.getName());
//       allNames= allNames.concat(";");
//    }
//    return allNames;
//}
