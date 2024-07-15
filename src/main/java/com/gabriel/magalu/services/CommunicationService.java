package com.gabriel.magalu.services;

import com.gabriel.magalu.dtos.ScheduleDto;
import com.gabriel.magalu.entities.Communication;
import com.gabriel.magalu.repositories.CommunicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommunicationService {

    @Autowired
    private CommunicationRepository communicationRepository;

    public void scheduleCommunication(ScheduleDto dto){
        communicationRepository.save(dto.toCommunication());
    }

    public Optional<Communication> findById(Long id){
        return communicationRepository.findById(id);
    }
}
