package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final AuthenticationManager authManager;
    private final JwtTokenProvider jwtProvider;

    // REQUIRED constructor
    public AuthController(UserService userService,
                          AuthenticationManager authManager,
                          JwtTokenProvider jwtProvider) {
        this.userService = userService;
        this.authManager = authManager;
        this.jwtProvider = jwtProvider;
    }

    public AuthController() {
        this.userService = null;
        this.authManager = null;
        this.jwtProvider = null;
    }

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest request) {
        User user = User.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .role("USER")
                .build();
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {
        return jwtProvider.generateToken(1L, request.getEmail(), "USER");
    }
}
