package com.gabriel.magalu.controllers;

import com.gabriel.magalu.dtos.ScheduleDto;
import com.gabriel.magalu.entities.Communication;
import com.gabriel.magalu.services.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


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

    @GetMapping("/{id}")
    public ResponseEntity<Communication> getNotification(@PathVariable Long id){

        Optional<Communication> communication = communicationService.findById(id);

        if (communication.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(communication.get());
    }
}
