package com.example.demo.service.impl;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // ✅ THIS CONSTRUCTOR IS REQUIRED
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String testService() {
        return "User service working";
    }
}
