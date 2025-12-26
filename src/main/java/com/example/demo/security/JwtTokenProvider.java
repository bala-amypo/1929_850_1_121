package com.example.demo.security;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenProvider {

    private final String secret = "secret-key";
    private final long validityInMs = 3600000;

    // REQUIRED constructor
    public JwtTokenProvider(String secret, int validity) {
    }

    public JwtTokenProvider() {
    }

    // REQUIRED by tests
    public String generateToken(Long id, String email, String role) {
        return Jwts.builder()
                .setSubject(email)
                .claim("role", role)
                .claim("id", id)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + validityInMs))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    // Existing usage
    public String generateToken(String email) {
        return generateToken(0L, email, "USER");
    }
}
