package com.example.demo.service;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    User register(RegisterRequest request);

    User findByEmail(String email);

    List<User> findAll();

    void delete(Long id);
}
