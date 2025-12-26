package com.example.demo.service.impl;

import com.example.demo.model.ExamRoom;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.service.ExamRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamRoomServiceImpl implements ExamRoomService {

    private final ExamRoomRepository repository;

    @Override
    public ExamRoom addRoom(ExamRoom room) {
        return repository.save(room);
    }

    @Override
    public List<ExamRoom> getAllRooms() {
        return repository.findAll();
    }
}
