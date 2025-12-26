package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void testService() {
        System.out.println("Test Service running");
    }

    @Override
    public User createUser(String username, String password, String role) {
        User user = User.builder().username(username).password(password).role(role).build();
        return repository.save(user);
    }
}
