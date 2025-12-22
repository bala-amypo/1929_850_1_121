package com.example.demo.controller;

import com.example.demo.model.ExamRoom;
import com.example.demo.service.ExamRoomService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
@Tag(name = "Exam Rooms")
public class ExamRoomController {

    @Autowired
    private ExamRoomService examRoomService;

    @GetMapping
    @Operation(summary = "List rooms")
    public String rooms() {
        return "Rooms API";
    }

    @PostMapping
    @Operation(summary = "Create exam room")
    public ExamRoom createRoom(@RequestBody ExamRoom room) {
        return examRoomService.saveRoom(room);
    }
}
