package com.example.reminderbot2.service;

import com.example.reminderbot2.entity.NotificationTask;
import com.example.reminderbot2.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationTaskService {

    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask){
        notificationTaskRepository.save(notificationTask);
    }
}
