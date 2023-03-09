package com.example.test.services;

import com.example.test.entities.Hold;
import com.example.test.repositories.HoldRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HoldService {
    private final HoldRepository holdRepository;

    public Hold saveHold(Hold hold) {
        return holdRepository.save(hold);
    }
    public void deleteHold(Hold hold) {
        holdRepository.delete(hold);
    }
    public Hold findById(String id){
        return holdRepository.findById(id).orElse(null);
    }

    public Iterable<Hold> findAll(){
        return holdRepository.findAll();
    }
}
