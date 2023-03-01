package com.example.test.models;


import jakarta.persistence.*;
import lombok.ToString;
import java.util.UUID;

@Entity
@Table(name = "Customers")
@ToString
public class Customers {
    @Id
    @Column(name = "Id",columnDefinition = "varchar(36)")
    private String id;
    @Column(name = "FirstName",columnDefinition = "nvarchar(20)")
    private String FirstName;
    @Column(name = "LastName",columnDefinition = "nvarchar(20)")
    private String LastName;
    @Column(name = "Email",columnDefinition = "varchar(30)",unique = true)
    private String Email;
    @Column(name = "Password",columnDefinition = "varchar(50)")
    private String Password;
    @Column(name = "IsAdmin",columnDefinition = "bit")
    private Boolean IsAdmin;

    public Customers(String id, String firstName, String lastName, String email, String password, Boolean isAdmin) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        IsAdmin = isAdmin;
    }


    public Customers() {

    }
}
