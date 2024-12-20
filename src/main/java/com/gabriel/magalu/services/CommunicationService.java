package com.gabriel.magalu.services;

import com.gabriel.magalu.dtos.ScheduleDto;
import com.gabriel.magalu.entities.Communication;
import com.gabriel.magalu.entities.Status;
import com.gabriel.magalu.repositories.CommunicationRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
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

    public ScheduleDto cancelNotification(Long id){
        Optional<Communication> communicationOptional = findById(id);
        if (communicationOptional.isPresent()){
            Communication communication = communicationOptional.get();
            communication.setStatus(Status.CANCELED);
            communicationRepository.save(communication);
            return ScheduleDto.toScheduleDto(communication);
        }
        throw new EntityNotFoundException("not found id:" + id);
    }

    public void sendCommunication(LocalDateTime datetime){
        List<Communication> pendingCommunications = communicationRepository.findByScheduledTimeBeforeAndStatus(datetime,
                Status.PENDING);
        for (Communication communication : pendingCommunications){
            //TODO - send the notification
            communication.setStatus(Status.SUCCESS);
            communicationRepository.save(communication);
        }

    }
}
