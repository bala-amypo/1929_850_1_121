package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User saveUser(User user);
    User findByEmail(String email); // <-- must be declared
    // Add other method declarations as needed
}
