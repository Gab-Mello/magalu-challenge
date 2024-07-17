package com.gabriel.magalu.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class SchedulerService {

    @Scheduled(fixedDelay = 10, timeUnit = TimeUnit.SECONDS)
    public void runTasks(){
        System.out.println("teste");
    }
}
