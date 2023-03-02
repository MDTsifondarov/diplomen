package com.example.test.repositories;

import com.example.test.entities.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, String> {
}
