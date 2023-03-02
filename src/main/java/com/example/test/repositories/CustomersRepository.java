package com.example.test.repositories;

import com.example.test.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer, String> {
}
