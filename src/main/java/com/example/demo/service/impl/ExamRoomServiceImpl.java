package com.example.demo.service.impl;

import com.example.demo.model.ExamRoom;
import com.example.demo.repository.ExamRoomRepository;
import com.example.demo.service.ExamRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExamRoomServiceImpl implements ExamRoomService {

    private final ExamRoomRepository repository;

    @Override
    public List<ExamRoom> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ExamRoom> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public ExamRoom save(ExamRoom room) {
        return repository.save(room);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
