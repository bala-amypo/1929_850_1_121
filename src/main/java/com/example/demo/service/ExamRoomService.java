package com.example.demo.service;

import com.example.demo.model.ExamRoom;
import java.util.List;

public interface ExamRoomService {

    ExamRoom saveRoom(ExamRoom room);

    ExamRoom getRoomById(Long id);

    List<ExamRoom> getAllRooms();

    ExamRoom updateRoom(Long id, ExamRoom room);

    void deleteRoom(Long id);
}
