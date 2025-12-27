package com.example.demo.controller;

import com.example.demo.model.ExamRoom;
import com.example.demo.service.ExamRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class ExamRoomController {

    private final ExamRoomService examRoomService;

    public ExamRoomController(ExamRoomService examRoomService) {
        this.examRoomService = examRoomService;
    }

    @PostMapping
    public ExamRoom add(@RequestBody ExamRoom room) {
        return examRoomService.addRoom(room); // ✅ FIXED
    }

    @GetMapping
    public List<ExamRoom> list() {
        return examRoomService.getAllRooms();
    }
}
