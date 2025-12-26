package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    public Student add(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping
    public List<Student> list() {
        return service.getAllStudents();
    }
}
