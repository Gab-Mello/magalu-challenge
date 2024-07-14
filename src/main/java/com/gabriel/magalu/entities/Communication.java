package com.gabriel.magalu.entities;

import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "tb_communications")
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String recipient;

    private String message;

    private LocalDateTime scheduledTime;

    @Enumerated(EnumType.STRING)
    private CommunicationType communicationType;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Communication(Long id, String recipient, String message, LocalDateTime scheduledTime, CommunicationType communicationType, Status status) {
        this.id = id;
        this.recipient = recipient;
        this.message = message;
        this.scheduledTime = scheduledTime;
        this.communicationType = communicationType;
        this.status = status;
    }

    public Communication(){

    }

    public Communication(String recipient, String message, LocalDateTime scheduledTime, CommunicationType communicationType, Status status) {
        this.recipient = recipient;
        this.message = message;
        this.scheduledTime = scheduledTime;
        this.communicationType = communicationType;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDateTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public CommunicationType getCommunicationType() {
        return communicationType;
    }

    public void setCommunicationType(CommunicationType communicationType) {
        this.communicationType = communicationType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
