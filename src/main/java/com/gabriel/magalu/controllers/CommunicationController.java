package com.gabriel.magalu.controllers;

import com.gabriel.magalu.dtos.ScheduleDto;
import com.gabriel.magalu.services.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class CommunicationController {

    @Autowired
    private CommunicationService communicationService;

    @PostMapping
    public ResponseEntity scheduleNotification(@RequestBody ScheduleDto dto){
        communicationService.scheduleCommunication(dto);

        return ResponseEntity.accepted().build();
    }
}
