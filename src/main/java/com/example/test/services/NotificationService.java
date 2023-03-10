package com.example.test.services;

import com.example.test.entities.Notification;
import com.example.test.repositories.NotificationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
    public void deleteNotification(Notification notification) {
        notificationRepository.delete(notification);
    }
    public Notification findById(String id){
        return notificationRepository.findById(id).orElse(null);
    }

    public Iterable<Notification> findAll(){
        return notificationRepository.findAll();
    }

}
