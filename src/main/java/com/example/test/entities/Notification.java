package com.example.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(name = "Notifications")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Notification {

    @Id
    @Column(name = "Id",columnDefinition = "varchar(36)")
    private String id;
    @Column(name = "sent_at",columnDefinition = "timestamp")
    private String SentAt;
    @Column(name = "Type",columnDefinition = "nvarchar(30)")
    private String Type;
    @OneToOne
    @JoinColumn(name="customer_id",columnDefinition = "varchar(36)")
    private Customer customer;
    public Notification() {
        id = UUID.randomUUID().toString();
    }

    public String getSentAt() {
        return SentAt;
    }

    public void setSentAt(String sentAt) {
        SentAt = sentAt;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
