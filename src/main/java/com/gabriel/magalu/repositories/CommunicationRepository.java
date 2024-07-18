package com.gabriel.magalu.repositories;

import com.gabriel.magalu.entities.Communication;
import com.gabriel.magalu.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication, Long> {
    List<Communication> findByScheduledTimeBeforeAndStatus(LocalDateTime dateTime, Status status);
}
