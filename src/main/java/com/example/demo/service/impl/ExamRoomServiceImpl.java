package com.example.demo.service;

import com.example.demo.model.ExamRoom;
import com.example.demo.repository.ExamRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamRoomServiceImpl implements ExamRoomService {

    @Autowired
    private ExamRoomRepository examRoomRepository;

    @Override
    public ExamRoom saveRoom(ExamRoom room) {
        return examRoomRepository.save(room);
    }

    @Override
    public ExamRoom getRoomById(Long id) {
        return examRoomRepository.findById(id).orElse(null);
    }

    @Override
    public List<ExamRoom> getAllRooms() {
        return examRoomRepository.findAll();
    }

    @Override
    public ExamRoom updateRoom(Long id, ExamRoom room) {
        ExamRoom existing = examRoomRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setRoomNumber(room.getRoomNumber());
            existing.setRows(room.getRows());
            existing.setColumns(room.getColumns());
            existing.setCapacity(room.getCapacity());
            return examRoomRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteRoom(Long id) {
        examRoomRepository.deleteById(id);
    }
}
