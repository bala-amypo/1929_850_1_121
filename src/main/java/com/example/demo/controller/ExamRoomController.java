package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rooms")
@Tag(name = "Exam Rooms", description = "Exam room management APIs")
@SecurityRequirement(name = "bearerAuth")
public class ExamRoomController {

    @Autowired
    private ExamRoomRepository examRoomRepository;

    @PostMapping
    @Operation(summary = "Add a new exam room")
    public ExamRoom addRoom(@RequestBody ExamRoom room) {
        return examRoomRepository.save(room);
    }

    @GetMapping
    @Operation(summary = "List all exam rooms")
    public List<ExamRoom> listRooms() {
        return examRoomRepository.findAll();
    }
}