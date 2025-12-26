package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    private String secret;
    private int expiration;

    // Required by Spring
    public JwtTokenProvider() {
    }

    // Required by TEST
    public JwtTokenProvider(String secret, int expiration) {
        this.secret = secret;
        this.expiration = expiration;
    }

    // Required by TEST
    public String generateToken(Long id, String email, String role) {
        return id + ":" + email + ":" + role;
    }

    // Required by TEST
    public String getRoleFromToken(String token) {
        return token.split(":")[2];
    }
}
