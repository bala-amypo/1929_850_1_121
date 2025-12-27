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

    // Add generateToken(), validateToken() methods if used in tests
}
