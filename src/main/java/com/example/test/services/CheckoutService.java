package com.example.test.services;

import com.example.test.entities.Checkout;
import com.example.test.repositories.CheckoutRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CheckoutService {
    private final CheckoutRepository checkoutRepository;

    public Checkout saveCheckout(Checkout checkout) {
        return checkoutRepository.save(checkout);
    }
    public void deleteCheckout(Checkout checkout) {
        checkoutRepository.delete(checkout);
    }
    public Checkout findById(String id){
        return checkoutRepository.findById(id).orElse(null);
    }

    public Iterable<Checkout> findAll(){
        return checkoutRepository.findAll();
    }
}
