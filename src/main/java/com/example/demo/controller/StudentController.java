package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Create a new student
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);  // <-- use saveStudent()
    }

    // Get all students
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
