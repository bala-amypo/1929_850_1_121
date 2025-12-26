package com.example.demo.controller;

import com.example.demo.dto.AuthResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public AuthResponse login() {
        return new AuthResponse("dummy-token");
    }
}
