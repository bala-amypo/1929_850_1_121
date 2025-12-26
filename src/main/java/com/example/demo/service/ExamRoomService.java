package com.example.demo.service;

import com.example.demo.model.ExamRoom;

public interface ExamRoomService {

    ExamRoom createExamRoom(ExamRoom room);

    ExamRoom getByRoomNumber(String roomNumber);
}
