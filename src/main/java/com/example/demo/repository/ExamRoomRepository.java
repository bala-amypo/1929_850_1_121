package com.example.demo.repository;

import com.example.demo.model.ExamRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface ExamRoomRepository extends JpaRepository<ExamRoom, Long> {
    Optional<ExamRoom> findByRoomNumber(String roomNumber);
    List<ExamRoom> findByCapacityGreaterThanEqual(int capacity);
}
