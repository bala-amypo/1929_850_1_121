package com.example.demo.service;

import com.example.demo.model.ExamRoom;

import java.util.List;
import java.util.Optional;

public interface ExamRoomService {

    List<ExamRoom> getAll();

    Optional<ExamRoom> get(Long id);

    ExamRoom save(ExamRoom room);

    void delete(Long id);
}
