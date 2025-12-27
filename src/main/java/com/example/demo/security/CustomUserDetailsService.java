package com.example.demo.security;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        // Map your User entity to UserDetails
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),                 // username
                user.getPassword(),              // password
                Collections.singletonList(       // authorities
                        new SimpleGrantedAuthority(user.getRole() != null ? user.getRole() : "ROLE_USER")
                )
        );
    }
}
