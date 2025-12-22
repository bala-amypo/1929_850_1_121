package com.example.demo.repository;

import com.example.demo.entity.ExamRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRoomRepository extends JpaRepository<ExamRoom, Long> {

    ExamRoom findByRoomNumber(String roomNumber);
}
