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

}
