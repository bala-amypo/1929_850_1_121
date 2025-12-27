package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    String testService();   // ❌ void → ✅ String

    User createUser(String username, String password, String role);
}

