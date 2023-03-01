package com.example.test.repositories;

import com.example.test.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, String> {
}
