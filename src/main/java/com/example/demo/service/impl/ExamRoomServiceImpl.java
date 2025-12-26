package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.ExamRoom;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.service.ExamRoomService;

@Service
public class ExamRoomServiceImpl implements ExamRoomService {

    private final ExamRoomRepository examRoomRepository;

    public ExamRoomServiceImpl(ExamRoomRepository examRoomRepository) {
        this.examRoomRepository = examRoomRepository;
    }

    @Override
    public ExamRoom createExamRoom(ExamRoom room) {
        if (room.getRows() <= 0 || room.getColumns() <= 0) {
            throw new RuntimeException("Invalid rows or columns");
        }
        return examRoomRepository.save(room);
    }

    @Override
    public ExamRoom getByRoomNumber(String roomNumber) {
        return examRoomRepository.findByRoomNumber(roomNumber)
                .orElseThrow(() -> new RuntimeException("Room not found"));
    }
}
