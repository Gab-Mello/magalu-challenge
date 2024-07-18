package com.gabriel.magalu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Service
public class SchedulerService {

    @Autowired
    private CommunicationService communicationService;

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void checkTasks(){
        var dateTime = LocalDateTime.now();
        communicationService.sendCommunication(dateTime);
        System.out.println(dateTime);
    }
}
