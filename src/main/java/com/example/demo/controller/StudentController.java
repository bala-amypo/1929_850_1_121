package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentServiceImpl service;

    public StudentController(StudentServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.createStudent(student);
    }
}
