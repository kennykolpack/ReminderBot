package com.example.reminderbot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReminderBot2Application {

    public static void main(String[] args) {
        SpringApplication.run(ReminderBot2Application.class, args);
    }

}
