package com.gabriel.magalu.dtos;

import com.gabriel.magalu.entities.Communication;
import com.gabriel.magalu.entities.CommunicationType;
import com.gabriel.magalu.entities.Status;

import java.time.LocalDateTime;

public record ScheduleDto(LocalDateTime scheduledTime,
                          String recipient,
                          String message,
                          CommunicationType communicationType,
                          Status status) {

    public Communication toCommunication(){
        return new Communication(
                recipient,
                message,
                scheduledTime,
                communicationType,
                Status.PENDING);
    }

    public static ScheduleDto toScheduleDto(Communication communication){
        return new ScheduleDto(
                communication.getScheduledTime(),
                communication.getRecipient(),
                communication.getMessage(),
                communication.getCommunicationType(),
                communication.getStatus()
        );
    }
}
