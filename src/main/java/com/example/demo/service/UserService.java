package com.example.demo.service;

import com.example.demo.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);            // must match exactly
    Optional<User> findByEmail(String email);  // must match exactly
    List<User> getAllUsers();            // must match exactly
}
