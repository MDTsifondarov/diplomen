package com.example.test.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(name = "Holds")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Hold {
    @Id
    @Column(name = "Id",columnDefinition = "varchar(36)")
    private String id;
    @Column(name = "start_time",columnDefinition = "timestamp")
    private String StartTime;
    @Column(name = "end_time",columnDefinition = "datetime2(7)")
    private String EndTime;
    @OneToOne
    @JoinColumn(name="book_id",columnDefinition = "varchar(36)")
    private Book book;
    @OneToOne
    @JoinColumn(name="customer_id",columnDefinition = "varchar(36)")
    private Customer customer;
    public Hold() {

        id = UUID.randomUUID().toString();
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
