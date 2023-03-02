package com.example.test.repositories;

import com.example.test.models.Hold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoldRepository extends JpaRepository<Hold, String>{
}
