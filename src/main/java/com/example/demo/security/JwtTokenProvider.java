package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    private final String secretKey;
    private final int expiration;

    public JwtTokenProvider() {
        this.secretKey = "defaultSecret";
        this.expiration = 3600;
    }

    public JwtTokenProvider(String secretKey, int expiration) {
        this.secretKey = secretKey;
        this.expiration = expiration;
    }

    // Add this method
    public String getUsername(String token) {
        // implement JWT parsing to extract username
        // placeholder implementation
        return "user@example.com";
    }

    // Optional: add generateToken() & validateToken() if needed
}
