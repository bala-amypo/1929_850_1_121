package com.example.demo.controller;

import com.example.demo.model.ExamRoom;
import com.example.demo.service.ExamRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class ExamRoomController {

    private final ExamRoomService service;

    @PostMapping
    public ExamRoom add(@RequestBody ExamRoom room) {
        return service.addRoom(room);
    }

    @GetMapping
    public List<ExamRoom> list() {
        return service.getAllRooms();
    }
}
