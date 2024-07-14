package com.gabriel.magalu.dtos;

import com.gabriel.magalu.entities.Communication;
import com.gabriel.magalu.entities.CommunicationType;
import com.gabriel.magalu.entities.Status;

import java.time.LocalDateTime;

public record ScheduleDto(LocalDateTime scheduledTime,
                          String recipient,
                          String message,
                          CommunicationType communicationType) {

    public Communication toCommunication(){
        return new Communication(
                recipient,
                message,
                scheduledTime,
                communicationType,
                Status.PENDING);
    }
}
