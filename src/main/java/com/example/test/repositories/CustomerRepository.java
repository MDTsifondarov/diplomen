package com.example.test.repositories;

import com.example.test.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
