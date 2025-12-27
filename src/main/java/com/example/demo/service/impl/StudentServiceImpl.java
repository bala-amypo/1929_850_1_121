package com.example.demo.service.impl;

import com.example.demo.exception.ApiException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Student addStudent(Student s) {
        repo.findByRollNumber(s.getRollNumber())
                .ifPresent(x -> {
                    throw new ApiException("Student exists");
                });
        return repo.save(s);
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
