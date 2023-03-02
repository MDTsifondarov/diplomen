package com.example.test.models;


import com.example.test.services.PasswordHasher;
import jakarta.persistence.*;
import lombok.ToString;
import java.util.UUID;

@Entity
@Table(name = "Customers")
@ToString
public class Customer {
    @Id
    @Column(name = "Id",columnDefinition = "varchar(36)")
    private String id;
    @Column(name = "first_name",columnDefinition = "nvarchar(20)")
    private String FirstName;
    @Column(name = "last_name",columnDefinition = "nvarchar(20)")
    private String LastName;
    @Column(name = "Email",columnDefinition = "varchar(30)",unique = true)
    private String Email;
    @Column(name = "Password",columnDefinition = "varchar(50)")
    private String Password;
    @Column(name = "is_admin",columnDefinition = "bit")
    private Boolean IsAdmin;

    public Customer() {
        id= UUID.randomUUID().toString();
    }

    public Customer(String id, String firstName, String lastName, String email, String password, Boolean isAdmin) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        IsAdmin = isAdmin;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public Customer setPassword(String password) {
        this.Password = PasswordHasher.hashPassword(password);
        return this;
    }

    public Boolean getAdmin() {
        return IsAdmin;
    }

    public void setAdmin(Boolean admin) {
        IsAdmin = admin;
    }
}
