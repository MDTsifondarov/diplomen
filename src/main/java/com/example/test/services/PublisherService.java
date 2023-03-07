package com.example.test.services;

import com.example.test.entities.Publisher;
import com.example.test.repositories.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PublisherService {
    private final PublisherRepository publisherRepository;

    public Publisher savePublisher(Publisher publisher){
        return publisherRepository.save(publisher);
    }
    public void deleteAddress(Publisher publisher){
        publisherRepository.delete(publisher);
    }
    public Publisher findById(String id){
        return publisherRepository.findById(id).orElse(null);
    }
    public Iterable<Publisher> findAll(){
        return publisherRepository.findAll();
    }
}
