package com.example.test.services;

import com.example.test.entities.Customer;
import com.example.test.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public void saveCustomer(Customer customer) {
           customerRepository.save(customer);
    }
    public Customer findByFirstName(String firstName){
        return customerRepository.findById(firstName).orElse(null);
    }
//    public void deleteCustomer(Customer customer) {
//        customerRepository.delete(customer);
//    }
//    public Customer findById(String id){
//        return customerRepository.findById(id).orElse(null);
//    }
//
//    public Iterable<Customer> findAll(){
//        return customerRepository.findAll();
//    }
}
