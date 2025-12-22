package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication")
public class AuthController {

    @PostMapping("/login")
    @Operation(summary = "Login (dummy endpoint)")
    public String login() {
        return "Swagger Working";
    }
}
