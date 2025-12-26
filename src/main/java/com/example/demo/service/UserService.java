package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    void testService();
    User createUser(String username, String password, String role);
}
